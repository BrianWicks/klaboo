package com.wicks.user.klaboo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class changepass extends AppCompatActivity {
Button btnchengepass;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_changepass);


        btnchengepass=(Button)findViewById(R.id.login_button);
        btnchengepass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent a=new Intent(changepass.this,Login.class);
                startActivity(a);
            }
        });
    }
}
