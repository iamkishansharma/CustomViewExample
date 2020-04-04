package com.example.customview;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.support.v7.widget.AppCompatEditText;
import android.support.v7.widget.AppCompatTextView;
import android.util.AttributeSet;

public class TextViewCustom extends AppCompatTextView {
    private String title;
    private boolean color;
    public TextViewCustom(Context context) {
        super(context);
    }

    public TextViewCustom(Context context, AttributeSet attrs) {
        super(context, attrs);
        TypedArray tarry =
                context.obtainStyledAttributes(attrs,R.styleable.TextViewCustom);
        try {
            title = tarry.getString(R.styleable.TextViewCustom_settitle);
            if(title == null)
                setText("Custom Message");
            else
                setText("Hello");
            color = tarry.getBoolean(R.styleable.TextViewCustom_setColor,
                    false);
            if(color == true)
                setTextColor(Color.MAGENTA);
        }
        finally {
            tarry.recycle();
        }
    }
    public TextViewCustom(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }
}
