package com.qhh.recyclerviewlib.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.qhh.recyclerviewlib.viewholde.BaseViewHolder;

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
public abstract class BaseAdapter<T extends BaseViewHolder> extends RecyclerView.Adapter<T> {

    private int layoutId;

    public BaseAdapter(int layoutId) {
        this.layoutId = layoutId;
    }

    @NonNull
    @Override
    public T onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        T baseViewHolder = null;

        View view = LayoutInflater.from(parent.getContext()).inflate(layoutId, parent, false);


        return baseViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull T holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public abstract void convert(T holder,int position);

}
