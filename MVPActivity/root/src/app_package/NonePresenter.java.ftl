
package  ${applicationPackage}.presenter.${modular};


import ${applicationPackage}.view.${modular}.I${activityName};
import ${applicationPackage}.presenter.base.BasePresenter;

import rx.Observable;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * create by lvwenbo
 */
public class ${activityName}Presenter extends BasePresenter<I${activityName}> {
    private I${activityName} iview;

    public ${activityName}Presenter(I${activityName} main) {
        this.attachView(main);
        iview = getView();
    }
}
