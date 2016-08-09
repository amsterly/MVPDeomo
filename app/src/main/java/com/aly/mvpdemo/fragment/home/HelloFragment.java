package com.aly.mvpdemo.fragment.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.aly.mvpdemo.R;
import com.aly.mvpdemo.view.home.IHello;
import com.aly.mvpdemo.presenter.home.HelloPresenter;
import com.aly.mvpdemo.fragment.base.BaseFragment;

/**
 * create by lwb.
 */
public class HelloFragment extends BaseFragment<IHello, HelloPresenter> implements IHello {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_hello, null);//注意不要指定父视图


        return view;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }


    @Override
    protected HelloPresenter createPresenter() {
        return new HelloPresenter(this);
    }
}
