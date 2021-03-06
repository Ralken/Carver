package cn.ralken.carver.internal;

/**
 * Default implementation class that does nothing.
 * <p>
 * Created by Ralken Liao
 */

public class VoidMethodInterceptor implements MethodInterceptor {

    @Override
    public boolean intercept() {
        return false;
    }

    @Override
    public boolean onActionIntercepted() {
        return false;
    }

    @Override
    public boolean onThrowing() {
        return false;
    }
}
