package com.sensetime.recyclerviewdemo.adapter;

import com.qhh.recyclerviewlib.adapter.BaseAdapter;
import com.qhh.recyclerviewlib.viewholde.BaseViewHolder;
import com.sensetime.recyclerviewdemo.R;
import com.sensetime.recyclerviewdemo.bean.BaseTestBean;

import java.util.List;

/**
 * @author qinhaihang_vendor
 * @time 2019/10/29 17:15
 * @des
 * @packgename com.sensetime.recyclerviewdemo.adapter
 */
public class BaseTestAdapter extends BaseAdapter<BaseTestBean, BaseViewHolder> {

    public BaseTestAdapter(List<BaseTestBean> datas) {
        super(R.layout.layout_item_base_test,datas);
    }

    @Override
    public void convert(BaseViewHolder holder, int position) {

        BaseTestBean baseTestBean = getDatas().get(position);

        holder.setText(R.id.tv_content,baseTestBean.getItemContent());

    }

}
