package cn.ralken.carver.weave;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;

import java.util.WeakHashMap;

import cn.ralken.carver.annotation.ThrottlePeriod;

/**
 * Annotation that prevent from invoking a method too frequently, the default available internal is 600 million seconds.
 * <br>
 * Created by Ralken Liao
 */

@Aspect
public class ThrottlePeriodAspect {
    private static final String POINTCUT_METHOD =
            "execution(@cn.ralken.carver.annotation.ThrottlePeriod * *(..))";

    @Pointcut(POINTCUT_METHOD)
    public void methodAnnotatedWithMethodThrottle() {
    }

    @Around("methodAnnotatedWithMethodThrottle()")
    public Object weaveJoinPoint(ProceedingJoinPoint joinPoint) throws Throwable {
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        String methodName = methodSignature.getName();

        ThrottlePeriod attachPoint = methodSignature.getMethod().getAnnotation(ThrottlePeriod.class);
        long interval = attachPoint.interval();

        long lengthMillis = System.currentTimeMillis() - getPrevious(methodName);

        if (interval > 0 && lengthMillis - interval < 0) {
            return null;    // do interception
        }

        updatePrevious(methodName, System.currentTimeMillis());

        return joinPoint.proceed();
    }

    private static void updatePrevious(String tag, long time) {
        cache.put(tag, time);
    }

    private static long getPrevious(String tag) {
        Long value = cache.get(tag);
        return value != null ? value : 0L;
    }

    private static WeakHashMap<String, Long> cache = new WeakHashMap<>();
}
