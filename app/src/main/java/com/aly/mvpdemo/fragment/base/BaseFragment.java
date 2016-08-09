package com.aly.mvpdemo.fragment.base;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.widget.Toast;

import com.aly.mvpdemo.view.base.IBase;
import com.aly.mvpdemo.presenter.base.BasePresenter;


/**
 * Created by fancy on 2016/6/23.
 */
public abstract class BaseFragment<V, T extends BasePresenter<V>> extends Fragment implements IBase {
    protected T mPresenter;
    protected boolean nowRequest = false;

    protected abstract T createPresenter();

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (mPresenter != null)
            mPresenter.dettachView();
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mPresenter = createPresenter();
    }
    
    @Override
    public void requestTimeout() {
        if (this.getContext() != null)
            Toast.makeText(this.getContext(), "请求超时", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showToast(String s) {
        if (this.getContext() != null)
            Toast.makeText(this.getContext(), s, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showSuccessToast(String s) {
        //
        Toast.makeText(getMContext(), "success", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void showServerError(String s) {

    }

    @Override
    public void showNoNetTextView() {

    }

    @Override
    public void showTextView(String s) {

    }

    @Override
    public boolean hasNet() {
        return true;
    }

    @Override
    public void showProgress(boolean visible) {

    }

    @Override
    public Context getMApplicationContext() {
        return getContext().getApplicationContext();
    }

    @Override
    public Context getMContext() {
        return getContext();
    }

    @Override
    public void setNowRequest(boolean nowRequest) {
        this.nowRequest = nowRequest;
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mPresenter.dettachView();
    }

}
