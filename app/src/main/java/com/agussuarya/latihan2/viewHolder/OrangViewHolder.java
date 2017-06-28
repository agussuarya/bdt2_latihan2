package com.agussuarya.latihan2.viewHolder;

import android.app.Activity;
import android.app.IntentService;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.agussuarya.latihan2.AlerterActivity;
import com.agussuarya.latihan2.Detail;
import com.agussuarya.latihan2.R;
import com.agussuarya.latihan2.pojo.Orang;
import com.squareup.picasso.Picasso;
import com.tapadoo.alerter.Alerter;

import org.w3c.dom.Text;

import java.io.Serializable;

/**
 * Created by root on 19/06/17.
 */

public class OrangViewHolder extends RecyclerView.ViewHolder{

    private TextView nama;
    private TextView pekerjaan;
    private ImageView img;

    public OrangViewHolder(View itemView) {
        super(itemView);

        nama=(TextView)itemView.findViewById(R.id.nama);
        pekerjaan=(TextView)itemView.findViewById(R.id.pekerjaan);
        img = (ImageView)itemView.findViewById(R.id.gambar);

    }

    public void bind(final Orang data, final Activity activity) {
        nama.setText(data.getNama());
        pekerjaan.setText(data.getPekerjaan());
        Picasso.with(itemView.getContext()).load(data.getLinkImg()).into(img);

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent a = new Intent(itemView.getContext(), Detail.class);
                a.putExtra("orang", data);
                itemView.getContext().startActivity(a);
            }
        });

    }
}
