package com.aly.mvpdemo.presenter.home;


import com.aly.mvpdemo.view.home.IGoodbye;
import com.aly.mvpdemo.presenter.base.BasePresenter;

import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * create by lwb.
 */
public class GoodbyePresenter extends BasePresenter<IGoodbye> {
    private IGoodbye iview;

    public GoodbyePresenter(IGoodbye main) {
        this.attachView(main);
        iview = getView();
    }
}
