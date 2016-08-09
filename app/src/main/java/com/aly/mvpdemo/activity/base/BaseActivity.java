package com.aly.mvpdemo.activity.base;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.aly.mvpdemo.view.base.IBase;
import com.aly.mvpdemo.presenter.base.BasePresenter;


/**
 * Created by fancy on 2016/6/23.
 */
public abstract class BaseActivity<V,T extends BasePresenter<V>> extends AppCompatActivity implements IBase {
    protected T mPresenter;
    protected boolean nowRequest;


    @Override
    protected void onDestroy() {
        super.onDestroy();
        if(mPresenter != null)
            mPresenter.dettachView();
    }


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPresenter = createPresenter();
    }

    protected abstract T createPresenter();

    @Override
    public void showServerError(String s) {
        Toast.makeText(this, "服务器错误:" + s, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showNoNetTextView() {
//        Toast.makeText(this, "无可用网络", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showTextView(String s) {
    }


    @Override
    public void requestTimeout() {
        Toast.makeText(this, "请求超时", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showToast(String s) {
        Toast.makeText(this, s, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showSuccessToast(String s) {
        Toast.makeText(this, "成功", Toast.LENGTH_SHORT).show();
    }

    @Override
    public boolean hasNet() {
        //是否有网络
        return true;
    }

    @Override
    public void showProgress(boolean visible) {
        //显示进度条
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        this.finish();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }


    @Override
    public Context getMApplicationContext() {
        return getApplicationContext();
    }

    @Override
    public Context getMContext() {
        return this;
    }

    @Override
    public void setNowRequest(boolean nowRequest) {
        this.nowRequest = nowRequest;
    }


}
