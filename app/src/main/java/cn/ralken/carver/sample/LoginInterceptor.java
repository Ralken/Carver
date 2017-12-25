package cn.ralken.carver.sample;

import cn.ralken.carver.internal.MethodInterceptor;

import static cn.ralken.carver.sample.MainActivity.makeToast;

/**
 * Created by Ralken Liao on 25/12/2017.
 */

public class LoginInterceptor implements MethodInterceptor {

    @Override
    public boolean intercept() {
        makeToast("LoginInterceptor#intercept executing...");
        return true;
    }

    @Override
    public boolean onActionIntercepted() {
        makeToast("LoginInterceptor#onActionIntercepted executing...");
        uploadAnalysis();
        return true;
    }

    private static void uploadAnalysis() {

    }

}
