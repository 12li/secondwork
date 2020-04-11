package com.bignerdranch.android.myapplication5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button bt_order;
    TextView tv_result;
    Spinner cinema;
    Spinner sp_time;
    EditText et_count;
    int[] price={45,50,40};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt_order=(Button)findViewById(R.id.bt_order);
        tv_result=(TextView)findViewById(R.id.tv_result);
        cinema=(Spinner)findViewById(R.id.cinema);
        sp_time=(Spinner)findViewById(R.id.sp_time);
        bt_order.setOnClickListener(this);
        et_count=(EditText)findViewById(R.id.et_count);


    }
    @Override
    public void onClick(View v) {
        String[] cinemas=getResources().getStringArray(R.array.cinema);
        String[] times=getResources().getStringArray(R.array.time);
        String num=et_count.getText().toString();
        int n=Integer.parseInt(num);
        int temp= sp_time.getSelectedItemPosition();
        int index=cinema.getSelectedItemPosition();
        tv_result.setText("您选择的是:"+cinemas[index]+times[temp]+n+"张票，共计："+price[temp]*n+"元");

    }
}
