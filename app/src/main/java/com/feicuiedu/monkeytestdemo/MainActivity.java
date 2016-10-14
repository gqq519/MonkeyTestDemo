package com.feicuiedu.monkeytestdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import butterknife.Bind;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @Bind(R.id.textview)
    TextView textview;
    private int i = 0;
    private String[] str;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.button)
    public void onClick() {

//        模拟ANR错误
//        try {
//            Thread.sleep(10*1000);
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }
        textview.setText("测试的数据" + i++);
    }


//    模拟CRASH错误
//    @OnClick(R.id.button1)
//    public void onClick1() {
//        textview.setText(str[0]);
//    }
}
