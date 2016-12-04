package com.yygo.burma.wiget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.yygo.burma.R;


/**
 * @author linhuan on 2016/10/20 下午1:13
 */
public class EnterMessageView extends RelativeLayout {

    private ImageView ivIcon, ivback;
    private TextView tvHint, tvContent;
    private EditText etContent;
    private View vwLine;

    public EnterMessageView(Context context) {
        this(context, null);
    }

    public EnterMessageView(Context context, AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public EnterMessageView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        initView(context);
        initData(context, attrs);
    }

    private void initView(Context context) {
        View.inflate(context, R.layout.custom_enter_message, this);
        ivIcon = (ImageView) findViewById(R.id.iv_icon);
        tvHint = (TextView) findViewById(R.id.tv_hint);
        tvContent = (TextView) findViewById(R.id.tv_content);
        etContent = (EditText) findViewById(R.id.et_content);
        vwLine = findViewById(R.id.vw_line);
        ivback = (ImageView) findViewById(R.id.iv_back);
    }

    private void initData(Context context, AttributeSet attrs) {
//        if (Helper.isNotNull(attrs)) {
//            TypedArray typedArray = context.obtainStyledAttributes(attrs, R.styleable.custom_enter_message);
//
//            // 设置内容
//            String hintStr = typedArray.getString(R.styleable.custom_enter_message_hint);
//            if (Helper.isNotNull(hintStr)) {
//                tvHint.setText(hintStr);
//            }
//
//            String contentStr = typedArray.getString(R.styleable.custom_enter_message_text);
//            if (Helper.isNotNull(contentStr)) {
//                tvContent.setText(contentStr);
//            }
//
//            boolean isShowContent = typedArray.getBoolean(R.styleable.custom_enter_message_is_show_content, true);
//            if (isShowContent) {
//                showContentVisibility(View.VISIBLE, View.GONE);
//            } else {
//                showContentVisibility(View.GONE, View.VISIBLE);
//            }
//
//            boolean isHasBottom = typedArray.getBoolean(R.styleable.custom_enter_message_is_has_bottom, true);
//            vwLine.setVisibility(isHasBottom ? View.VISIBLE : View.GONE);
//
//        }
    }

}
