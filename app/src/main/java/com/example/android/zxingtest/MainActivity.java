package com.example.android.zxingtest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import me.dm7.barcodescanner.zxing.ZXingScannerView;

public class MainActivity extends AppCompatActivity {

    private ZXingScannerView scannerView;
    private TextView txtResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //init
        scannerView = (ZXingScannerView) findViewById(R.id.zxscan);
        txtResult = (TextView) findViewById(R.id.txt_result);
    }
}
