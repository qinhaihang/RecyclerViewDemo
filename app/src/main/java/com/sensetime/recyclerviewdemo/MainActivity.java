package com.sensetime.recyclerviewdemo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.sensetime.recyclerviewdemo.view.NormalActivity;

public class MainActivity extends BaseActivity {

    @Override
    public int setLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView(Bundle savedInstanceState) {

    }

    public void click(View view) {

        switch(view.getId()){
            case R.id.btn_normal_demo:
                startActivity(new Intent(MainActivity.this, NormalActivity.class));
                break;
            default:
                break;
        }

    }
}
