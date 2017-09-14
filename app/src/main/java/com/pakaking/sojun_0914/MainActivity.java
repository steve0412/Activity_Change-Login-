package com.pakaking.sojun_0914;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    User[] user = new User[200];
    int user_num = 0;
    EditText username;
    EditText password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        user[0] = new User("asdf", "asdf");

        username = (EditText) findViewById(R.id.username);
        password = (EditText) findViewById(R.id.password);
    }

    void onLoginCilcked(View v) {
        for (int i = 0; i < user_num; i++) {
            if (user[i].id.equals(username.getText().toString()) &&
                    user[i].password == password.getText().toString()) {
                Intent intent = new Intent(MainActivity.this, LoginedActivity.class);
                startActivity(intent);
            } else {
                Toast.makeText(this, "다시 로그인", Toast.LENGTH_SHORT).show();
            }
        }
    }
}