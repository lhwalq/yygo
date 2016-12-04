package com.yygo.burma.app;

import com.yygo.lib.helper.PreferencesHelper;

/**
 * @author linhuan on 2016/10/19 上午10:20
 */
public class AppConfig {

    /**
     * 基础数据
     */
    public static class BASIC_DATA {
        public static final String IS_FIRST_OPEN = "isFirstOpen";
    }

    /**
     * 基础数据库名
     */
    public static class FOUNDATION_DATABASE {
        public static final String DATABASE_NAME = "APP_DATABASE";
    }

    public static boolean isFirstOpenApp() {
        boolean isFirstOpenApp = PreferencesHelper.getInstance(FOUNDATION_DATABASE.DATABASE_NAME).getBoolean(BASIC_DATA.IS_FIRST_OPEN, true);
        PreferencesHelper.getInstance(FOUNDATION_DATABASE.DATABASE_NAME).putBoolean(BASIC_DATA.IS_FIRST_OPEN, false);
        return isFirstOpenApp;
    }

}
