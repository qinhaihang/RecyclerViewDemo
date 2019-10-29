package com.qhh.recyclerviewlib.viewholde;

import android.util.SparseArray;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.IdRes;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/**
 * @author qinhaihang_vendor
 * @time 2019/10/24 15:37
 * @des
 * @packgename com.qhh.recyclerviewlib.viewholde
 */
public class BaseViewHolder extends RecyclerView.ViewHolder {

    private SparseArray<View> views;

    public BaseViewHolder(@NonNull View itemView) {
        super(itemView);
        this.views = new SparseArray<>();
    }

    public BaseViewHolder setText(@IdRes int viewId, CharSequence value){
        TextView textView = getView(viewId);
        textView.setText(value);
        return this;
    }

    public <T extends View> T getView(@IdRes int viewId){
        View view = views.get(viewId);
        if(view == null){
            view = itemView.findViewById(viewId);
            views.put(viewId,view);
        }
        return (T) view;
    }
}
