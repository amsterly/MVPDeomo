package  ${applicationPackage}.presenter.${modular};

import ${applicationPackage}.view.${modular}.I${pageName};
import ${applicationPackage}.presenter.base.BasePresenter;

import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by lvwenbo
 */
public class ${pageName}Presenter extends BasePresenter<I${pageName}> {
    private I${pageName} iview;

    public ${pageName}Presenter(I${pageName} main) {
        this.attachView(main);
        iview = getView();
    }
}
