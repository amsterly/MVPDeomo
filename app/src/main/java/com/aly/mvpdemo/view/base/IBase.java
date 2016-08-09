package com.aly.mvpdemo.view.base;

import android.content.Context;

/**
 * Created by Administrator on 2016/6/23.
 */
public interface IBase {
    //拿到ApplicationContext
    Context getMApplicationContext();

    //拿到当前类的Context
    Context getMContext();

    //判断有无网络
    boolean hasNet();

    //显示一个吐司框
    void showToast(String s);

    void showServerError(String s);

    void showNoNetTextView();

    void showTextView(String s);


    void requestTimeout();


    void showSuccessToast(String s);


    void showProgress(boolean visible);

    void setNowRequest(boolean flag);
}
