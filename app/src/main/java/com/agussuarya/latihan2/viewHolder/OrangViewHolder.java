package com.agussuarya.latihan2.viewHolder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.agussuarya.latihan2.R;
import com.agussuarya.latihan2.pojo.Orang;

import org.w3c.dom.Text;

/**
 * Created by root on 19/06/17.
 */

public class OrangViewHolder extends RecyclerView.ViewHolder{

    private TextView nama;
    private TextView pekerjaan;

    public OrangViewHolder(View itemView) {
        super(itemView);

        nama=(TextView)itemView.findViewById(R.id.nama);
        pekerjaan=(TextView)itemView.findViewById(R.id.pekerjaan);
    }

    public void bind(Orang data) {
        nama.setText(data.getNama());
        pekerjaan.setText(data.getPekerjaan());
    }
}
