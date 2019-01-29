package com.example.arnold.vizsga_tavalyi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnLogin;
    EditText editTextName;
    EditText editTextPassword;
    TextView tvError;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnLogin = (Button)findViewById(R.id.button4);
        editTextName = (EditText)findViewById(R.id.editText8);
        editTextPassword = (EditText)findViewById(R.id.editText9);
        tvError = (TextView)findViewById(R.id.textView13);


    }


    public void login(View view){
        if(editTextName.getText().toString().equals("student") && editTextPassword.getText().toString().equals("android")){
            Intent intent = new Intent(MainActivity.this,PhoneListActivity.class);
            startActivity(intent);
        }else{
            tvError.setText("Login Error");

        }
    }
}
