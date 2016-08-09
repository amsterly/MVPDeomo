package com.aly.mvpdemo.presenter.home;

import com.aly.mvpdemo.view.home.IHello;
import com.aly.mvpdemo.presenter.base.BasePresenter;

import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by lwb.
 */
public class HelloPresenter extends BasePresenter<IHello> {
    private IHello iview;

    public HelloPresenter(IHello main) {
        this.attachView(main);
        iview = getView();
    }
}
