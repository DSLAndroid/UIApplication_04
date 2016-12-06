package com.dsl.uiapplication_04;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * 功能：用Edittext实现登录输入框
 *
 * 作者：单胜凌
 * 时间：2016.12.06
 */
public class MainActivity extends AppCompatActivity {
    private Button button1;
    private EditText edt1;
    private EditText edt2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edt1 = (EditText)findViewById(R.id.User_Name);
        edt2 = (EditText)findViewById(R.id.User_Password);
        button1 = (Button)findViewById(R.id.button_02);
        MyListener myListener=new MyListener();
        button1.setOnClickListener(myListener);


    }
    class MyListener implements View.OnClickListener
    {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.button_02: {
                    if (check()) {
                        Toast.makeText(MainActivity.this, "登录成功", Toast.LENGTH_LONG).show();
                    }
                }
                break;
            }
        }
    }

    /**
     * 简单正则表达式
     * @return
     */
    public boolean check()
    {
        if(edt1.length()==0)
        {
            Toast.makeText(MainActivity.this, "请输入账号：", Toast.LENGTH_SHORT).show();
            return false;
        }
        if(edt2.length()==0)
        {
            Toast.makeText(MainActivity.this, "请输入密码：", Toast.LENGTH_SHORT).show();
            return false;
        }
        return true;
    }
}
