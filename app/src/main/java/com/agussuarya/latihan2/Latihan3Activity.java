package com.agussuarya.latihan2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.agussuarya.latihan2.adapter.OrangAdapter;
import com.agussuarya.latihan2.pojo.Orang;

import java.util.ArrayList;
import java.util.List;

public class Latihan3Activity extends AppCompatActivity {

    private RecyclerView rv;
    private OrangAdapter adapter;
    private List<Orang> orangs = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latihan3);


        rv = (RecyclerView)findViewById(R.id.rv);
        createDummy();
        adapter = new OrangAdapter(orangs);
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(adapter);
    }

    private void createDummy() {
        Orang orang1 = new Orang("Agus Suarya", "bos");
        Orang orang2 = new Orang("Puguh", "nyewek");
        Orang orang3 = new Orang("dananjaya", "otw");
        Orang orang4 = new Orang("surya hadi", "dadi gen");
        Orang orang5 = new Orang("sam", "pemburu makanan");
        Orang orang6 = new Orang("sentanu", "beli jus");

        orangs.add(orang1);
        orangs.add(orang2);
        orangs.add(orang3);
        orangs.add(orang4);
        orangs.add(orang5);
        orangs.add(orang6);
        orangs.add(orang2);
        orangs.add(orang3);
        orangs.add(orang4);
        orangs.add(orang5);
        orangs.add(orang6);
    }
}
