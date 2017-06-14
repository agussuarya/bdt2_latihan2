package com.agussuarya.latihan2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button login;
    EditText username, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Log.d("a", "onCreate");
        login = (Button)findViewById(R.id.login);
        username=(EditText)findViewById(R.id.username);
        password=(EditText)findViewById(R.id.password);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent dashboard = new Intent(getApplicationContext(), DashboardActivity.class);
                startActivity(dashboard);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();

        Log.d("a", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();

        Log.d("a", "onResume");
    }
}
