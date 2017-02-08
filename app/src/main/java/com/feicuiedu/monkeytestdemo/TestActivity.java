package com.feicuiedu.monkeytestdemo;

import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class TestActivity extends AppCompatActivity {

    @BindView(R.id.etName)
    EditText mEtName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.btnClear, R.id.btnSay})
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btnClear:
                mEtName.setText("");
                break;
            case R.id.btnSay:

                showSayDialog();

                break;
        }
    }

    private void showSayDialog() {
        new AlertDialog.Builder(this)
                .setTitle("向世界问好")
                .setMessage("你好，"+mEtName.getText().toString())
                .setNeutralButton("确定",null)
                .create().show();
    }
}
