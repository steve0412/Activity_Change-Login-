package com.pakaking.sojun_0914;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

/**
 * Created by tlstk on 2017-09-14.
 */

public class signup extends AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    void onSignUpCilcked(View v) {
        Intent intent = new Intent(signup.this, signup.class);
        startActivity(intent);
    }
}
