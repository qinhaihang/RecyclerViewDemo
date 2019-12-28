package com.sensetime.recyclerviewdemo.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/**
 * @author qinhaihang
 * @time 2019/12/28 16:56
 * @des
 * @packgename com.sensetime.recyclerviewdemo.widget
 */
public class PostionRecyclerView extends RecyclerView {

    private static final String TAG = PostionRecyclerView.class.getSimpleName();

    public PostionRecyclerView(@NonNull Context context) {
        super(context);
        init(context,null,0);
    }

    public PostionRecyclerView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context,attrs,0);
    }

    public PostionRecyclerView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init(context,attrs,defStyle);
    }

    private void init(@NonNull Context context, @Nullable AttributeSet attrs, int defStyle){
        scrollListener();
    }

    private void scrollListener() {
        addOnScrollListener(new RecyclerView.OnScrollListener() {
            @Override
            public void onScrollStateChanged(@NonNull RecyclerView recyclerView, int newState) {
                super.onScrollStateChanged(recyclerView, newState);
                if(newState == RecyclerView.SCROLL_STATE_IDLE){
                    actionUp();
                }
            }

            @Override
            public void onScrolled(@NonNull RecyclerView recyclerView, int dx, int dy) {
                super.onScrolled(recyclerView, dx, dy);
            }
        });
    }

    /*@Override
    public boolean onTouchEvent(MotionEvent e) {

        switch(e.getAction()){
            case MotionEvent.ACTION_UP:
                //actionUp();
                break;
        }

        return super.onTouchEvent(e);
    }*/

    private void actionUp() {
        int childCount = getChildCount();
        Log.d(TAG,"visible child count is " + childCount);
        LinearLayoutManager layoutManager = (LinearLayoutManager) getLayoutManager();
        int firstVisibleItemPosition = layoutManager.findFirstCompletelyVisibleItemPosition();
        //int firstVisibleItemPosition = layoutManager.findFirstVisibleItemPosition();
        Log.d(TAG,"first visible item position is " + firstVisibleItemPosition);
        layoutManager.scrollToPositionWithOffset(firstVisibleItemPosition,0);
    }

}



















