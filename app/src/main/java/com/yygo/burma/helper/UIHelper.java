package com.yygo.burma.helper;

import com.yygo.lib.helper.Helper;

/**
 * @author linhuan on 2016/10/20 上午9:40
 */
public class UIHelper {

    private static UIHelper instance;

    public static UIHelper getInstance() {
        if (Helper.isNull(instance)) {
            instance = new UIHelper();
        }
        return instance;
    }

}
