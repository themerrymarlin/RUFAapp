package com.example.rufaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private int sum1A;

    private EditText NW1A;

    private EditText NE1A;

    private EditText SW1A;

    private EditText SE1A;

    public void herbaceousPlantScore(){
        NW1A = (EditText) findViewById(R.id.NW1A);
        String NW1Anum=NW1A.getText().toString();
        int NW1Anumber = Integer.parseInt(NW1Anum);

        NE1A = (EditText) findViewById(R.id.NE1A);
        String NE1Anum=NE1A.getText().toString();
        int NE1Anumber = Integer.parseInt(NE1Anum);

        SW1A = (EditText) findViewById(R.id.SW1A);
        String SW1Anum=SW1A.getText().toString();
        int SW1Anumber = Integer.parseInt(SW1Anum);

        SE1A = (EditText) findViewById(R.id.SE1A);
        String SE1Anum=SE1A.getText().toString();
        int SE1Anumber = Integer.parseInt(SE1Anum);

        sum1A = NW1Anumber + NE1Anumber + SW1Anumber + SE1Anumber;
    }
}
