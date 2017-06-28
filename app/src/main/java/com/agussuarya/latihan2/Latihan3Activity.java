package com.agussuarya.latihan2;

import android.app.Activity;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
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
import com.agussuarya.latihan2.utilities.PrefManager;

import java.util.ArrayList;
import java.util.List;

public class Latihan3Activity extends AppCompatActivity {

    private RecyclerView rv;
    private OrangAdapter adapter;
    private List<Orang> orangs = new ArrayList<>();
    PrefManager preference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_latihan3);

        preference = new PrefManager();
        String username = preference.getString(this, "username", "");
        getSupportActionBar().setSubtitle(username);

        rv = (RecyclerView)findViewById(R.id.rv);
        createDummy();
        adapter = new OrangAdapter(orangs, this);
        rv.setLayoutManager(new LinearLayoutManager(this));
        rv.setAdapter(adapter);
    }

    private void createDummy() {
        Orang orang1 = new Orang("Agus Suarya", "bos", "http://cdn.tf.rs/2015/12/28/Crnogorac-Nece-ona-nidje-670x447.jpg");
        Orang orang2 = new Orang("Puguh", "nyewek", "http://cdn.tf.rs/2015/12/28/Crnogorac-Nece-ona-nidje-670x447.jpg");
        Orang orang3 = new Orang("dananjaya", "otw", "http://cdn.tf.rs/2015/12/28/Crnogorac-Nece-ona-nidje-670x447.jpg");
        Orang orang4 = new Orang("surya hadi", "dadi gen", "http://cdn.tf.rs/2015/12/28/Crnogorac-Nece-ona-nidje-670x447.jpg");
        Orang orang5 = new Orang("sam", "pemburu makanan", "http://cdn.tf.rs/2015/12/28/Crnogorac-Nece-ona-nidje-670x447.jpg");
        Orang orang6 = new Orang("sentanu", "beli jus", "http://cdn.tf.rs/2015/12/28/Crnogorac-Nece-ona-nidje-670x447.jpg");

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
