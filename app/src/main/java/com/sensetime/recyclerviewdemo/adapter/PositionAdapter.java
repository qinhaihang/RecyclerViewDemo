package com.sensetime.recyclerviewdemo.adapter;

import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;

import com.qhh.recyclerviewlib.adapter.BaseAdapter;
import com.qhh.recyclerviewlib.viewholde.BaseViewHolder;
import com.sensetime.recyclerviewdemo.R;
import com.sensetime.recyclerviewdemo.bean.PositionBean;

import java.util.List;

/**
 * @author qinhaihang
 * @time 2019/12/28 15:26
 * @des
 * @packgename com.sensetime.recyclerviewdemo.adapter
 */
public class PositionAdapter extends BaseAdapter<PositionBean,BaseViewHolder> {

    private static final String TAG = PositionAdapter.class.getSimpleName();

    public PositionAdapter(List<PositionBean> datas) {
        super(R.layout.layout_item_position_demo, datas);
    }

    @Override
    public void convert(BaseViewHolder holder, int position) {

        DisplayMetrics metrics = mContext.getResources().getDisplayMetrics();
        int widthPixels = metrics.widthPixels;

        ViewGroup.LayoutParams layoutParams = holder.itemView.getLayoutParams();
        layoutParams.width = widthPixels / 5;

        PositionBean postionBean = getDatas().get(position);
        if(postionBean.getId() == 0){
            holder.itemView.setVisibility(View.INVISIBLE);
        }else{
            holder.itemView.setVisibility(View.VISIBLE);
        }
        holder.setText(R.id.tv_content,String.valueOf(postionBean.getId()));

    }

}
