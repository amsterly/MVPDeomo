package com.aly.mvpdemo.activity.home;


import android.os.Bundle;

import com.aly.mvpdemo.R;
import com.aly.mvpdemo.view.home.IGoodbye;
import com.aly.mvpdemo.presenter.home.GoodbyePresenter;
import com.aly.mvpdemo.activity.base.BaseActivity;

/**
 * create by lwb.
 */
public class GoodbyeActivity extends BaseActivity<IGoodbye, GoodbyePresenter> implements IGoodbye {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_goodbye);


    }

    @Override
    protected GoodbyePresenter createPresenter() {
        return new GoodbyePresenter(this);
    }
}
