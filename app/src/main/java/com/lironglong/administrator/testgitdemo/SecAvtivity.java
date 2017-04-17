package com.lironglong.administrator.testgitdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class SecAvtivity extends AppCompatActivity {

    private TextView mTt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sec);
        initView();

    }


    private void initView() {
        mTt = (TextView) findViewById(R.id.sec_tv);
    }



}
