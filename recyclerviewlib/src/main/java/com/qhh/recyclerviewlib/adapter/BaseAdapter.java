package com.qhh.recyclerviewlib.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.qhh.recyclerviewlib.viewholde.BaseViewHolder;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/**
 * @author qinhaihang_vendor
 * @version $Rev$
 * @time 2019/10/17 16:26
 * @des
 * @packgename com.qhh.recyclerviewlib.adapter
 * @updateAuthor $Author$
 * @updateDate $Date$
 * @updateDes
 */
public abstract class BaseAdapter<K,T extends BaseViewHolder> extends RecyclerView.Adapter<T> {

    private int layoutId;

    private List<K> datas;

    public BaseAdapter(int layoutId) {
        this.layoutId = layoutId;
    }

    public BaseAdapter(int layoutId, List<K> datas) {
        this.layoutId = layoutId;
        this.datas = datas;
    }

    @NonNull
    @Override
    public T onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        T baseViewHolder = null;

        View view = LayoutInflater.from(parent.getContext()).inflate(layoutId, parent, false);

        baseViewHolder = (T) new BaseViewHolder(view);

        return baseViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull T holder, int position) {
        convert(holder,position);
    }

    @Override
    public int getItemCount() {
        return datas != null ? datas.size() : 0;
    }

    public List<K> getDatas() {
        return datas;
    }

    public void setDatas(List<K> datas) {
        this.datas = datas;
    }

    public abstract void convert(T holder, int position);

}
