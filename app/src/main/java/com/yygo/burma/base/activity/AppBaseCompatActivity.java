package com.yygo.burma.base.activity;

import android.support.annotation.NonNull;

import com.yygo.burma.R;
import com.yygo.burma.helper.MobclickHelp;
import com.yygo.lib.base.BaseCompatActivity;

import org.greenrobot.eventbus.EventBus;


/**
 * Created by Administrator on 2016/3/22.
 */
public abstract class AppBaseCompatActivity extends BaseCompatActivity {

    @Override
    protected void initView() {
        super.initView();

        if (isSetStatus()) {
            setStatusBar(R.color.colorPrimary);
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
//        MPermissions.onRequestPermissionsResult(this, requestCode, permissions, grantResults);
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }

    @Override
    protected void onStart() {
        super.onStart();

        if (isOpenEventBus()) {
            EventBus.getDefault().register(this);
        }
    }

    @Override
    protected void onStop() {
        super.onStop();

        if (isOpenEventBus()) {
            EventBus.getDefault().unregister(this);
        }
    }

    @Override
    protected void onResume() {
        super.onResume();

        if (isOpenMobclick()) {
            // 友盟
            MobclickHelp.onResume(getClass().getSimpleName(), this);
        }
    }

    @Override
    protected void onPause() {
        super.onPause();

        if (isOpenMobclick()) {
            // 友盟
            MobclickHelp.onPause(getClass().getSimpleName(), this);
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

    protected boolean isSetStatus() {
        return true;
    }

}
