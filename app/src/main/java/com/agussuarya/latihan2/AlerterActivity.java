package com.agussuarya.latihan2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.tapadoo.alerter.Alerter;

public class AlerterActivity extends AppCompatActivity {

    Button b1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alerter);

        b1 = (Button)findViewById(R.id.button1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Alerter.create(AlerterActivity.this)
                        .setTitle("Alert Title")
                        .setText("Alert text...")
                        .setBackgroundColor(R.color.colorAccent) // or setBackgroundColorInt(Color.CYAN)
                        .show();
            }
        });
    }
}
