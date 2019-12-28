package com.sensetime.recyclerviewdemo.view;

import android.os.Bundle;

import com.sensetime.recyclerviewdemo.R;
import com.sensetime.recyclerviewdemo.adapter.PositionAdapter;
import com.sensetime.recyclerviewdemo.bean.PositionBean;
import com.sensetime.recyclerviewdemo.widget.PostionRecyclerView;

import java.util.ArrayList;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class PositionActivity extends AppCompatActivity {

    private static final String TAG = PositionActivity.class.getSimpleName();
    private PostionRecyclerView mRv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_position);

        mRv = findViewById(R.id.rv);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        mRv.setLayoutManager(layoutManager);

        ArrayList<PositionBean> positionBeans = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            PositionBean positionBean = new PositionBean();
            if(i == 0 || i == 1){
                positionBean.setId(0);
            }else{
                positionBean.setId(i);
            }
            positionBeans.add(positionBean);
        }

        PositionAdapter positionAdapter = new PositionAdapter(positionBeans);
        mRv.setAdapter(positionAdapter);

    }
}
