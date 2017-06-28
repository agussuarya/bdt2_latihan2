package com.agussuarya.latihan2;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.agussuarya.latihan2.pojo.Orang;
import com.squareup.picasso.Picasso;

/**
 * Created by root on 21/06/17.
 */

public class Detail extends AppCompatActivity {

    private ImageView img;
    private TextView nama;
    private TextView pekerjaan;
    private Orang orang;



    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_detail);

        img = (ImageView)findViewById(R.id.imgPhoto);
        nama = (TextView)findViewById(R.id.nama);
        pekerjaan = (TextView)findViewById(R.id.pekerjaan);

        if(getIntent() != null) {
            orang = (Orang)getIntent().getSerializableExtra("orang");

            nama.setText(orang.getNama());
            pekerjaan.setText(orang.getPekerjaan());
            Picasso.with(Detail.this).load(orang.getLinkImg()).into(img);
        }
    }
}
