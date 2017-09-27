package com.example.rufaapp;

import android.support.v7.app.AppCompatActivity;
import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.view.View.OnClickListener;

public class MainActivity extends AppCompatActivity {
    // define variables
    private int threshold;
    private Button update;

    // section 1A
    private int point1A;
    private int sum1A;
    private EditText NW1A;
    private EditText NE1A;
    private EditText SW1A;
    private EditText SE1A;
    private TextView sum1AVal;
    private String modifyTextSum1A;
    private TextView point1AVal;
    private String modifyTextPoint1A;

    //section 1B
    private int point1B;
    private int sum1B;
    private EditText NW1B;
    private EditText NE1B;
    private EditText SW1B;
    private EditText SE1B;
    private TextView sum1BVal;
    private String modifyTextSum1B;
    private TextView point1BVal;
    private String modifyTextPoint1B;

    private TextView addTreeToList;
    private String modifyAddTest;
    private String selected;
    private Spinner tree_types;
    private Button add;
    private Button remove;


    private String selectedTree;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        update = (Button) findViewById(R.id.update1A);
        update.setOnClickListener(new View.OnClickListener(){
           public void onClick(View v) {
               // section 1A called with button
               herbaceousPlantScore();
               sum1AVal = (TextView) findViewById(R.id.sum1AVal);
               modifyTextSum1A = sum1AVal.getText().toString();
               modifyTextSum1A = Integer.toString(sum1A);
               sum1AVal.setText(modifyTextSum1A);

               point1AVal = (TextView) findViewById(R.id.point1AVal);
               modifyTextPoint1A = point1AVal.getText().toString();
               modifyTextPoint1A = Integer.toString(point1A);
               point1AVal.setText(modifyTextPoint1A);

               // section 1B called with button
               treeSeedlingScore();
               sum1BVal = (TextView) findViewById(R.id.sum1B); // sum1BVal
               modifyTextSum1B = sum1BVal.getText().toString();
               modifyTextSum1B = Integer.toString(sum1B);
               sum1BVal.setText(modifyTextSum1B);

               point1BVal = (TextView) findViewById(R.id.point1B); // point1BVal
               modifyTextPoint1B = point1BVal.getText().toString();
               modifyTextPoint1B = Integer.toString(point1B);
               point1BVal.setText(modifyTextPoint1B);
           }
        });

        add = (Button) findViewById(R.id.addTree);
        add.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                addTreeToList = (TextView) findViewById(R.id.listOfTrees);
                modifyAddTest = addTreeToList.getText().toString();
                addTreeToList.setText(selected);
            }
        });

        remove = (Button) findViewById(R.id.removeTreeFromList);
        remove.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                addTreeToList = (TextView) findViewById(R.id.listOfTrees);
                modifyAddTest = addTreeToList.getText().toString();
                addTreeToList.setText(selected);
            }
        });

        tree_types = (Spinner) findViewById(R.id.tree_types_spinner);
        tree_types.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if (selected == null) {
                    selected = "";
                }
                else {
                    selected = adapterView.getSelectedItem().toString() + "  " + selected;
                }

                selectedTree = adapterView.getSelectedItem().toString();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
    }

    public void herbaceousPlantScore() {
        threshold = 20; // threshold for 1A
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

    public void treeSeedlingScore() {
        threshold = 16; // threshold for 1B
        int NW1Bnumber;
        int NE1Bnumber;
        int SW1Bnumber;
        int SE1Bnumber;

        NW1B = (EditText) findViewById(R.id.NW1B);
        String NW1Bnum = NW1B.getText().toString();
        if(NW1Bnum.equals("")){
            NW1Bnumber = 0;
        }
        else {
            NW1Bnumber = Integer.parseInt(NW1Bnum);
        }

        NE1B = (EditText) findViewById(R.id.NE1B);
        String NE1Bnum = NE1B.getText().toString();
        if(NE1Bnum.equals("")){
            NE1Bnumber = 0;
        }
        else {
            NE1Bnumber = Integer.parseInt(NE1Bnum);
        }

        SW1B = (EditText) findViewById(R.id.SW1B);
        String SW1Bnum = SW1B.getText().toString();
        if(SW1Bnum.equals("")){
            SW1Bnumber = 0;
        }
        else {
            SW1Bnumber = Integer.parseInt(SW1Bnum);
        }

        SE1B = (EditText) findViewById(R.id.SE1B);
        String SE1Bnum = SE1B.getText().toString();
        if(SE1Bnum.equals("")){
            SE1Bnumber = 0;
        }
        else {
            SE1Bnumber = Integer.parseInt(SE1Bnum);
        }

        sum1B = NW1Bnumber + NE1Bnumber + SW1Bnumber + SE1Bnumber;

        if (sum1B >= threshold) {
            point1B = 1;
        }
        else {
            point1B = 0;
        }
    }
}
