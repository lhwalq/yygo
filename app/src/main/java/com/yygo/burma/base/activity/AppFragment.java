package com.yygo.burma.base.activity;

import com.yygo.burma.helper.MobclickHelp;
import com.yygo.lib.base.BaseFragment;

import org.greenrobot.eventbus.EventBus;

/**
 * AppFragment:项目基类
 * 
 * @author linhuan 2015年7月21日上午9:17:51
 */
public abstract class AppFragment extends BaseFragment {

    @Override
    public void onStart() {
        super.onStart();

        if (isOpenEventBus()) {
            EventBus.getDefault().register(this);
        }
    }

    @Override
    public void onStop() {
        super.onStop();

        if (isOpenEventBus()) {
            EventBus.getDefault().unregister(this);
        }
    }

    @Override
    public void onResume() {
        super.onResume();

        if (isOpenMobclick()) {
            // 友盟
            MobclickHelp.onResume(getClass().getSimpleName(), getActivity());
        }
    }

    @Override
    public void onPause() {
        super.onPause();

        if (isOpenMobclick()) {
            // 友盟
            MobclickHelp.onPause(getClass().getSimpleName(), getActivity());
        }
    }

    /**
     * 是否开启友盟统计
     *
     * @return
     */
    protected boolean isOpenMobclick() {
        return true;
    }

    /**
     * 是否开启eventbus
     */
    protected boolean isOpenEventBus() {
        return false;
    }
}
