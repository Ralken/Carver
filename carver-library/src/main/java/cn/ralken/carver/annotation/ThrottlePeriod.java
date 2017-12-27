package cn.ralken.carver.annotation;

/**
 * Created by Ralken Liao on 27/12/2017.
 */

public @interface ThrottlePeriod {
    int DEFAULT_INTERNAL = 600;

    /**
     * The interval time in million seconds between each valid execution.
     *
     * @return
     */
    long interval()
            default DEFAULT_INTERNAL;

}
