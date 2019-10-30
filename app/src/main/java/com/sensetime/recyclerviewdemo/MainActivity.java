package com.sensetime.recyclerviewdemo;

import android.os.Bundle;
import android.widget.Toast;

import com.sensetime.recyclerviewdemo.adapter.BaseTestAdapter;
import com.sensetime.recyclerviewdemo.bean.BaseTestBean;

import java.util.ArrayList;
import java.util.List;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends BaseActivity {

    @Override
    public int setLayout() {
        return R.layout.activity_main;
    }

    @Override
    protected void initView(Bundle savedInstanceState) {
        RecyclerView rv = findViewById(R.id.rv);

        List<BaseTestBean> items = new ArrayList<>();

        for (int i = 0; i < 20; i++) {
            BaseTestBean baseTestBean = new BaseTestBean();
            i++;
            baseTestBean.setItemContent("第 " + i + " 条目");
            items.add(baseTestBean);
        }

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        rv.setLayoutManager(layoutManager);

        BaseTestAdapter baseTestAdapter = new BaseTestAdapter(items);
        rv.setAdapter(baseTestAdapter);

        baseTestAdapter.setOnItermClickLitener((adapter, view, position)
                -> Toast.makeText(this, "click item position is "+ position, Toast.LENGTH_SHORT).show());

        /*baseTestAdapter.setOnItermLongClickListener((adapter,view,position) -> {
            Toast.makeText(this, "long click item position is "+ position, Toast.LENGTH_SHORT).show();
            return false;
        });*/
    }
}
