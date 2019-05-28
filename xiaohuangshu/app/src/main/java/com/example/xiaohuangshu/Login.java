package com.example.xiaohuangshu;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        Button b = findViewById(R.id.button);
        //b.setOnClickListener(this);
    }
//    @Override
//    public void onClick(View view) {
//        switch (view.getId()){
//            case R.id.button:
//                Intent intent = new Intent(Login.this,Index.class);
//                startActivity(intent);
//                break;
//        }
//
//    }
}
