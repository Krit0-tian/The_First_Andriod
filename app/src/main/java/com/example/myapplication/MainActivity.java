package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button_SignIn;
    private Button button_register;
    private TextView textView;
    private TextView textView2;
    private TextView textView3;
    private TextView textView4;
    private TextView textView7;
    private ImageView imageView2;
    private ImageView imageView3;
    private EditText editTextTextPersonName;
    private EditText editTextTextPassword2;
    private ImageButton imageButton;
    private ImageButton imageButton2;
    private RadioButton radioButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button_SignIn = findViewById(R.id.button2);
        button_register = findViewById(R.id.button3);
        textView = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);
        textView3 = findViewById(R.id.textView3);
        textView4 = findViewById(R.id.textView4);
        textView7 = findViewById(R.id.textView7);
        imageView2 = findViewById(R.id.imageView2);
        imageView3 = findViewById(R.id.imageView3);
        editTextTextPersonName = findViewById(R.id.editTextTextPersonName);
        editTextTextPassword2 = findViewById(R.id.editTextTextPassword2);
        radioButton = findViewById(R.id.radioButton);
        button_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this,register.class);
                startActivity(intent);
            }//跳转到注册界面
        });
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "失败", Toast.LENGTH_SHORT).show();//实例，内容
                finish();//退出
            }
        });
        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                        Toast.makeText(MainActivity.this, "失败", Toast.LENGTH_SHORT).show();//实例，内容
                        finish();//退出
            }
        });
    }
}
