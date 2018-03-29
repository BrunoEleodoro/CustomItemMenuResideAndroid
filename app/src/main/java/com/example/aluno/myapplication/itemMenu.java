package com.example.aluno.myapplication;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.widget.LinearLayout;

import com.special.ResideMenu.ResideMenuItem;

public class itemMenu extends LinearLayout{
    Context context;
    public itemMenu(Context context) {
        super(context);
    }

    public itemMenu(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public itemMenu(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

}
