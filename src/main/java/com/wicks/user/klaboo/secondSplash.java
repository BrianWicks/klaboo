package com.wicks.user.klaboo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.wicks.user.klaboo.R;

public class secondSplash extends AppCompatActivity {

    Button btn_started;
    TextView tv_login;
    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_splash);

        btn_started = (Button) findViewById(R.id.btn_started);
        tv_login = (TextView) findViewById(R.id.tv_login);

        btn_started.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view) {
                Intent intent = new Intent(secondSplash.this ,Signup.class);
                startActivity(intent);

            }
        });

        tv_login.setOnClickListener(new View.OnClickListener() {
            @Override public void onClick(View view) {
                Intent intent = new Intent(secondSplash.this ,Signup.class);
                startActivity(intent);

            }
        });


    }
}

