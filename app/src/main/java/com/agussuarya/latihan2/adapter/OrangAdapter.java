package com.agussuarya.latihan2.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.agussuarya.latihan2.R;
import com.agussuarya.latihan2.pojo.Orang;
import com.agussuarya.latihan2.viewHolder.OrangViewHolder;

import java.util.List;

/**
 * Created by root on 19/06/17.
 */

public class OrangAdapter extends RecyclerView.Adapter<OrangViewHolder>{

    List<Orang> list;

    public OrangAdapter(List<Orang> list) {
        this.list = list;
    }

    @Override
    public OrangViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View vh = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_recyclerview, parent, false);
        return new OrangViewHolder(vh);
    }

    @Override
    public void onBindViewHolder(OrangViewHolder holder, int position) {
        holder.bind(list.get(position));
    }

    @Override
    public int getItemCount() {
        return this.list.size();
    }
}
