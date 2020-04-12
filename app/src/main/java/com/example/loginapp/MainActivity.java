package com.example.loginapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;
    private Button button;
    private EditText email, password;

    private final static String correctEmail = "123";
    private final static String correctPassword= "123";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        login();
    }

    public void login () {
        imageView = (ImageView)findViewById(R.id.imageView2);
        button = (Button)findViewById(R.id.button);
        email = (EditText)findViewById(R.id.editText2);
        password = (EditText)findViewById(R.id.editText3);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (correctEmail.equals(email.getText().toString()) && correctPassword.equals(password.getText().toString())){
                    imageView.setImageResource(R.drawable.right);
                } else {
                    imageView.setImageResource(R.drawable.wrong);
                }
            }
        });
    }
}
