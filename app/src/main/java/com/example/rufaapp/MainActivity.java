package com.example.rufaapp;

import android.support.v7.app.AppCompatActivity;
import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {

    private int threshold;

    private int point1A;

    private Button update;

    private int sum1A;

    private EditText NW1A;

    private EditText NE1A;

    private EditText SW1A;

    private EditText SE1A;

    private TextView sum1AVal;

    private String modifyTextSum1A;

    private TextView point1AVal;

    private String modifyTextPoint1A;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        update = (Button) findViewById(R.id.update1A);
        update.setOnClickListener(new View.OnClickListener(){
           public void onClick(View v) {
               herbaceousPlantScore();
               sum1AVal = (TextView) findViewById(R.id.sum1AVal);
               modifyTextSum1A = sum1AVal.getText().toString();
               modifyTextSum1A = Integer.toString(sum1A);
               sum1AVal.setText(modifyTextSum1A);

               point1AVal = (TextView) findViewById(R.id.point1AVal);
               modifyTextPoint1A = point1AVal.getText().toString();
               modifyTextPoint1A = Integer.toString(point1A);
               point1AVal.setText(modifyTextPoint1A);
           }
        });

    }


    public void herbaceousPlantScore() {
        threshold = 20;
        int NW1Anumber;
        int NE1Anumber;
        int SW1Anumber;
        int SE1Anumber;

        NW1A = (EditText) findViewById(R.id.NW1A);
        String NW1Anum = NW1A.getText().toString();
        if(NW1Anum.equals("")){
            NW1Anumber = 0;
        }
        else {
            NW1Anumber = Integer.parseInt(NW1Anum);
        }

        NE1A = (EditText) findViewById(R.id.NE1A);
        String NE1Anum = NE1A.getText().toString();
        if(NE1Anum.equals("")){
            NE1Anumber = 0;
        }
        else {
            NE1Anumber = Integer.parseInt(NE1Anum);
        }

        SW1A = (EditText) findViewById(R.id.SW1A);
        String SW1Anum = SW1A.getText().toString();
        if(SW1Anum.equals("")){
            SW1Anumber = 0;
        }
        else {
            SW1Anumber = Integer.parseInt(SW1Anum);
        }

        SE1A = (EditText) findViewById(R.id.SE1A);
        String SE1Anum = SE1A.getText().toString();
        if(SE1Anum.equals("")){
            SE1Anumber = 0;
        }
        else {
            SE1Anumber = Integer.parseInt(SE1Anum);
        }

        sum1A = NW1Anumber + NE1Anumber + SW1Anumber + SE1Anumber;

        if (sum1A >= threshold) {
            point1A = 1;
        }
        else {
            point1A = 0;
        }

    }
}
