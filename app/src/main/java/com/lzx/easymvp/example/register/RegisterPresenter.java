package com.lzx.easymvp.example.register;


import com.lzx.easymvp.mvp.BasePresenter;

/**
 * create by lzx
 * time:2018/7/26
 */
public class RegisterPresenter extends BasePresenter<RegisterContract.View> implements RegisterContract.Presenter<RegisterContract.View> {
    @Override
    public void register() {
        mView.registerSuccess();
    }
}