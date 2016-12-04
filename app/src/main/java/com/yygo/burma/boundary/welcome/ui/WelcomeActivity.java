package com.yygo.burma.boundary.welcome.ui;

import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Window;
import android.view.WindowManager;

import com.yygo.burma.app.AppConfig;
import com.yygo.burma.base.activity.AppBaseCompatActivity;
import com.yygo.burma.helper.UIHelper;
import so.bubu.appointment.record.R;

import com.yygo.lib.helper.DelayTaskHelper;
import com.yygo.lib.wiget.DelayTask;

public class WelcomeActivity extends AppBaseCompatActivity {

    @Override
    protected void onCreateView(Bundle savedInstanceState) {
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_welcome);
    }

    @Override
    protected void initView() {
        super.initView();
    }

    @Override
    protected void initData() {
        super.initData();

        skipActivity();
    }

    /**
     * 跳转
     */
    private void skipActivity() {
        DelayTaskHelper.doDelayTask(AppConfig.APP_STAY, onDelayExecuteListener);
    }

    private DelayTask.OnDelayExecuteListener onDelayExecuteListener = new DelayTask.OnDelayExecuteListener() {
        @Override
        public void onProgressUpdate() {}

        @Override
        public void onPreExecute() {}

        @Override
        public void onPostExecute() {
            if (AppConfig.isFirstOpenApp()) {
                UIHelper.getInstance().goNaigationActivity(WelcomeActivity.this);
            } else {
                UIHelper.getInstance().goMainActivity(WelcomeActivity.this);
            }
        }
    };

    @Override
    protected boolean isSwipeback() {
        return false;
    }

    @Override
    protected boolean isSetStatus() {
        return false;
    }

    @Override
    protected void doBack(int keyCode, KeyEvent event) {
        finish();
    }

}
