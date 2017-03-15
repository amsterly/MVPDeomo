
package  ${applicationPackage}.activity.${modular};


import android.os.Bundle;

import ${applicationPackage}.R;
import ${applicationPackage}.view.${modular}.I${activityName};
import ${applicationPackage}.presenter.${modular}.${activityName}Presenter;
import ${applicationPackage}.ui.activity.base.BaseActivity;

/**
 * create by lvwenbo
 */
public class ${activityClass} extends BaseActivity<I${activityName},${activityName}Presenter> implements I${activityName}{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.${activityLayoutName});
		
	
    }

    @Override
    protected ${activityName}Presenter createPresenter() {
        return new ${activityName}Presenter(this);
    }
}
