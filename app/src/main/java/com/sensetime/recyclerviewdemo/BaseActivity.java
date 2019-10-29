package com.sensetime.recyclerviewdemo;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(setLayout());
        initView(savedInstanceState);
    }

    public abstract int setLayout();
    protected abstract void initView(Bundle savedInstanceState);
}
