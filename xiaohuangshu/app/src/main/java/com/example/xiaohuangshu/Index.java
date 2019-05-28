package com.example.xiaohuangshu;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Index extends Activity implements View.OnClickListener{
    Button bu1;
    EditText et1,et2,et3,et4;
    final String zh = "admin";
    final String mm = "1234";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.index);
        Button login = (Button) findViewById(R.id.denglu);
        login.setOnClickListener(this);
        Button register = (Button) findViewById(R.id.zhuce);
        register.setOnClickListener(this);

    }
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.zhuce:
                Intent i1 = new Intent(Index.this,Login.class);
                startActivity(i1);
                break;
            case R.id.denglu:
                String zhanghao = " ";
                EditText editText1 = (EditText) findViewById(R.id.zhanghao);
                zhanghao = editText1.getText().toString();
                String mima = " ";
                EditText editText2 = (EditText) findViewById(R.id.mima);
                mima = editText2.getText().toString();
                if (zhanghao.equals(zh) & mima.equals(mm)) {
                    Intent i2 = new Intent(Index.this, Third.class);
                    startActivity(i2);
                } else {
                    new AlertDialog.Builder(Index.this).setTitle("错误").setMessage("账号或密码错误！！！")
                            .setNegativeButton("确认", null)
                            .show();
                }
                break;

        }
    }
}
