package com.agussuarya.latihan2;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.Preference;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.agussuarya.latihan2.utilities.PrefManager;
import com.tapadoo.alerter.Alerter;

public class MainActivity extends AppCompatActivity {

    Button login;
    EditText username, password;
    private PrefManager preferences;
    String validUsername = "a";
    String validPassword = "1";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Log.d("a", "onCreate");
        preferences = new PrefManager();
        login = (Button)findViewById(R.id.login);
        username=(EditText)findViewById(R.id.username);
        password=(EditText)findViewById(R.id.password);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                validate();
            }
        });

        if(preferences.getBoolean(this, "isLoggedIn", false)){
            Intent dashboard = new Intent(getApplicationContext(), Latihan3Activity.class);
            startActivity(dashboard);
            MainActivity.this.finish();
        }
    }

    private void validate(){
        String inputedUsername = username.getText().toString();
        String inputedPassword = password.getText().toString();

        if(inputedUsername.equals(validUsername) && inputedPassword.equals(validPassword)){
            preferences.saveBoolean(this, "isLoggedIn", true);
            preferences.saveString(this, "username", inputedUsername);
            Intent dashboard = new Intent(getApplicationContext(), Latihan3Activity.class);
            startActivity(dashboard);
            MainActivity.this.finish();
            /*Toast.makeText(this, "login sukses", Toast.LENGTH_SHORT).show();*/
        }else{
            Alerter.create(this)
                    .setTitle("Login Failure")
                    .setText("Wrong Credentials")
                    .show();
        }
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
