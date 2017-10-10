package com.example.rufaapp;

import android.support.v7.app.AppCompatActivity;
import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.view.View.OnClickListener;

import java.util.ArrayList;
import java.util.Objects;

public class MainActivity extends AppCompatActivity {
    // define variables
    private int threshold;
    private Button updateTop;
    private Button updateBottom;

    //initial input
    private EditText cellValue;
    private EditText dateValue;
    private EditText scorersValue;

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

    //section 2A
    private int point2A;
    private int sum2A;
    private EditText NW2A;
    private EditText NE2A;
    private EditText SW2A;
    private EditText SE2A;
    private TextView sum2AVal;
    private String modifyTextSum2A;
    private TextView point2AVal;
    private String modifyTextPoint2A;

    //section 2B
    private int point2B;
    private int sum2B;
    private EditText NW2B;
    private EditText NE2B;
    private EditText SW2B;
    private EditText SE2B;
    private TextView sum2BVal;
    private String modifyTextSum2B;
    private TextView point2BVal;
    private String modifyTextPoint2B;

    //section 3A
    private int point3A;
    private int sum3A;
    private EditText NW3A;
    private EditText NE3A;
    private EditText SW3A;
    private EditText SE3A;
    private TextView sum3AVal;
    private String modifyTextSum3A;
    private TextView point3AVal;
    private String modifyTextPoint3A;

    //section 3B
    private int point3B;
    private int sum3B;
    private TextView sum3BVal;
    private String modifyTextSum3B;
    private TextView point3BVal;
    private String modifyTextPoint3B;
    private TextView addTreeToList3B;
    private String modifyAdd3B;
    private String selected3B;
    private Spinner tree_types3B;
    private Button add3B;
    private Button clear3B;

    //section 4A
    private int point4A;
    private int sum4A;
    private EditText NW4A;
    private EditText NE4A;
    private EditText SW4A;
    private EditText SE4A;
    private String modifyAdd4B;
    private TextView sum4AVal;
    private String modifyTextSum4A;
    private TextView point4AVal;
    private String modifyTextPoint4A;

    //section 4B
    private int point4B;
    private int sum4B;
    private TextView sum4BVal;
    private String modifyTextSum4B;
    private TextView point4BVal;
    private String modifyTextPoint4B;
    private TextView addTreeToList4B;
    private String selected4B;
    private Spinner tree_types4B;
    private Button add4B;
    private Button clear4B;



    //section 5A
    private int point5A;
    private int sum5A;
    private EditText NW5A;
    private EditText NE5A;
    private EditText SW5A;
    private EditText SE5A;
    private TextView sum5AVal;
    private String modifyTextSum5A;
    private TextView point5AVal;
    private String modifyTextPoint5A;

    //section 5B
    private int point5B;
    private int sum5B;
    private EditText NW5B;
    private EditText NE5B;
    private EditText SW5B;
    private EditText SE5B;
    private TextView sum5BVal;
    private String modifyTextSum5B;
    private TextView point5BVal;
    private String modifyTextPoint5B;

    //section 6A
    private int point6A;
    private int sum6A;
    private EditText NW6A;
    private EditText NE6A;
    private EditText SW6A;
    private EditText SE6A;
    private TextView sum6AVal;
    private String modifyTextSum6A;
    private TextView point6AVal;
    private String modifyTextPoint6A;

    //section 6B
    private int point6B;
    private int sum6B;
    private EditText NW6B;
    private EditText NE6B;
    private EditText SW6B;
    private EditText SE6B;
    private TextView sum6BVal;
    private String modifyTextSum6B;
    private TextView point6BVal;
    private String modifyTextPoint6B;

    //section7
    private int point7;
    private TextView point7Val;
    private String modifyTextPoint7;

    //section8
    private int point8;
    private TextView point8Val;
    private String modifyTextPoint8;

    //section9
    private int point9;
    private TextView point9Val;
    private String modifyTextPoint9;

    //section10
    private int point10;
    private TextView point10Val;
    private String modifyTextPoint10;

    //section11
    private int point11;
    private TextView point11Val;
    private String modifyTextPoint11;

    //section 12
    private int point12;
    private int total12;
    private TextView total12Val;
    private String modifyTextSum12;
    private TextView point12Val;
    private String modifyTextPoint12;

    //Total
    private int total;
    private TextView totalPoints;
    private String modifyTotalPoints;

    // selecting trees to add


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        updateBottom = (Button) findViewById(R.id.updateBottom);
        updateBottom.setOnClickListener(new View.OnClickListener() {
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
                sum1BVal = (TextView) findViewById(R.id.sum1BVal); // sum1BVal
                modifyTextSum1B = sum1BVal.getText().toString();
                modifyTextSum1B = Integer.toString(sum1B);
                sum1BVal.setText(modifyTextSum1B);

                point1BVal = (TextView) findViewById(R.id.point1BVal); // point1BVal
                modifyTextPoint1B = point1BVal.getText().toString();
                modifyTextPoint1B = Integer.toString(point1B);
                point1BVal.setText(modifyTextPoint1B);

                // section 2A called with button
                shrubSaplingScore();
                sum2AVal = (TextView) findViewById(R.id.sum2AVal);
                modifyTextSum2A = sum2AVal.getText().toString();
                modifyTextSum2A = Integer.toString(sum2A);
                sum2AVal.setText(modifyTextSum2A);

                point2AVal = (TextView) findViewById(R.id.point2AVal);
                modifyTextPoint2A = point2AVal.getText().toString();
                modifyTextPoint2A = Integer.toString(point2A);
                point2AVal.setText(modifyTextPoint2A);

                // section 2B called with button
                comboShrubSaplingScore();
                sum2BVal = (TextView) findViewById(R.id.sum2BVal); // sum2BVal
                modifyTextSum2B = sum2BVal.getText().toString();
                modifyTextSum2B = Integer.toString(sum2B);
                sum2BVal.setText(modifyTextSum2B);

                point2BVal = (TextView) findViewById(R.id.point2BVal); // point2BVal
                modifyTextPoint2B = point2BVal.getText().toString();
                modifyTextPoint2B = Integer.toString(point2B);
                point2BVal.setText(modifyTextPoint2B);

                // section 3A called with button
                matureTreesScore();
                sum3AVal = (TextView) findViewById(R.id.sum3AVal);
                modifyTextSum3A = sum3AVal.getText().toString();
                modifyTextSum3A = Integer.toString(sum3A);
                sum3AVal.setText(modifyTextSum3A);

                point3AVal = (TextView) findViewById(R.id.point3AVal);
                modifyTextPoint3A = point3AVal.getText().toString();
                modifyTextPoint3A = Integer.toString(point3A);
                point3AVal.setText(modifyTextPoint3A);

                // section 3B called with button
                matureTreeSpeciesScore();
                sum3BVal = (TextView) findViewById(R.id.sum3BVal); // sum3BVal
                modifyTextSum3B = sum3BVal.getText().toString();
                modifyTextSum3B = Integer.toString(sum3B);
                sum3BVal.setText(modifyTextSum3B);

                point3BVal = (TextView) findViewById(R.id.point3BVal); // point3BVal
                modifyTextPoint3B = point3BVal.getText().toString();
                modifyTextPoint3B = Integer.toString(point3B);
                point3BVal.setText(modifyTextPoint3B);

                // section 4A called with button
                legacyTreesScore();
                sum4AVal = (TextView) findViewById(R.id.sum4AVal);
                modifyTextSum4A = sum4AVal.getText().toString();
                modifyTextSum4A = Integer.toString(sum4A);
                sum4AVal.setText(modifyTextSum4A);

                point4AVal = (TextView) findViewById(R.id.point4AVal);
                modifyTextPoint4A = point4AVal.getText().toString();
                modifyTextPoint4A = Integer.toString(point4A);
                point4AVal.setText(modifyTextPoint4A);

               //section 4B called with button
               legacyTreeSpeciesScore();
               sum4BVal = (TextView) findViewById(R.id.sum4BVal); // sum4BVal
               modifyTextSum4B = sum4BVal.getText().toString();
               modifyTextSum4B = Integer.toString(sum4B);
               sum4BVal.setText(modifyTextSum4B);

               point4BVal = (TextView) findViewById(R.id.point4BVal); // point4BVal
               modifyTextPoint4B = point4BVal.getText().toString();
               modifyTextPoint4B = Integer.toString(point4B);
               point4BVal.setText(modifyTextPoint4B);

                // section 5A called with button
                snagsScore();
                sum5AVal = (TextView) findViewById(R.id.sum5AVal);
                modifyTextSum5A = sum5AVal.getText().toString();
                modifyTextSum5A = Integer.toString(sum5A);
                sum5AVal.setText(modifyTextSum5A);

                point5AVal = (TextView) findViewById(R.id.point5AVal);
                modifyTextPoint5A = point5AVal.getText().toString();
                modifyTextPoint5A = Integer.toString(point5A);
                point5AVal.setText(modifyTextPoint5A);

                // section 5B called with button
                woodyDebrisScore();
                sum5BVal = (TextView) findViewById(R.id.sum5BVal); // sum5BVal
                modifyTextSum5B = sum5BVal.getText().toString();
                modifyTextSum5B = Integer.toString(sum5B);
                sum5BVal.setText(modifyTextSum5B);

                point5BVal = (TextView) findViewById(R.id.point5BVal); // point5BVal
                modifyTextPoint5B = point5BVal.getText().toString();
                modifyTextPoint5B = Integer.toString(point5B);
                point5BVal.setText(modifyTextPoint5B);

                // section 6A called with button
                invasiveShrubsScore();
                sum6AVal = (TextView) findViewById(R.id.sum6AVal);
                modifyTextSum6A = sum6AVal.getText().toString();
                modifyTextSum6A = Integer.toString(sum6A);
                sum6AVal.setText(modifyTextSum6A);

                point6AVal = (TextView) findViewById(R.id.point6AVal);
                modifyTextPoint6A = point6AVal.getText().toString();
                modifyTextPoint6A = Integer.toString(point6A);
                point6AVal.setText(modifyTextPoint6A);

                // section 6B called with button
                invasiveHerbaceousScore();
                sum6BVal = (TextView) findViewById(R.id.sum6BVal); // sum6BVal
                modifyTextSum6B = sum6BVal.getText().toString();
                modifyTextSum6B = Integer.toString(sum6B);
                sum6BVal.setText(modifyTextSum6B);

                point6BVal = (TextView) findViewById(R.id.point6BVal); // point6BVal
                modifyTextPoint6B = point6BVal.getText().toString();
                modifyTextPoint6B = Integer.toString(point6B);
                point6BVal.setText(modifyTextPoint6B);

                //section 7 called with button
                noObservedInvasivePlants();
                point7Val = (TextView) findViewById(R.id.point7Val);
                modifyTextPoint7 = point7Val.getText().toString();
                modifyTextPoint7 = Integer.toString(point7);
                point7Val.setText(modifyTextPoint7);

                //section 8 called with button
                healthyLightGaps();
                point8Val = (TextView) findViewById(R.id.point8Val);
                modifyTextPoint8 = point8Val.getText().toString();
                modifyTextPoint8 = Integer.toString(point8);
                point8Val.setText(modifyTextPoint8);

                //section 9 called with button
                microtopography();
                point9Val = (TextView) findViewById(R.id.point9Val);
                modifyTextPoint9 = point9Val.getText().toString();
                modifyTextPoint9 = Integer.toString(point9);
                point9Val.setText(modifyTextPoint9);

                //section 10 called with button
                absenceOfHumanActivity();
                point10Val = (TextView) findViewById(R.id.point10Val);
                modifyTextPoint10 = point10Val.getText().toString();
                modifyTextPoint10 = Integer.toString(point10);
                point10Val.setText(modifyTextPoint10);

                //section 11 called with button
                absenceOfDeer();
                point11Val = (TextView) findViewById(R.id.point11Val);
                modifyTextPoint11 = point11Val.getText().toString();
                modifyTextPoint11 = Integer.toString(point11);
                point11Val.setText(modifyTextPoint11);

                //section 12 called with button
                leafFragmentCover();
                total12Val = (TextView) findViewById(R.id.total12Val);
                modifyTextSum12 = total12Val.getText().toString();
                modifyTextSum12 = Integer.toString(total12);
                total12Val.setText(modifyTextSum12);

                point12Val = (TextView) findViewById(R.id.point12Val);
                modifyTextPoint12 = point12Val.getText().toString();
                modifyTextPoint12 = Integer.toString(point12);
                point12Val.setText(modifyTextPoint12);

                //total called with button
                totalPoints();
                totalPoints = (TextView) findViewById(R.id.totalPoints);
                modifyTotalPoints = totalPoints.getText().toString();
                modifyTotalPoints = Integer.toString(total);
                totalPoints.setText(modifyTotalPoints);
            }
        });

        add3B = (Button) findViewById(R.id.addTree3B);
        add3B.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                addTreeToList3B = (TextView) findViewById(R.id.listOfTrees3B);
                modifyAdd3B = addTreeToList3B.getText().toString();
                addTreeToList3B.setText(selected3B);
            }
        });

        clear3B = (Button) findViewById(R.id.clear3B);
        clear3B.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                addTreeToList3B = (TextView) findViewById(R.id.listOfTrees3B);
                modifyAdd3B = addTreeToList3B.getText().toString();
                selected3B = "";
                sum3B = 0;
                addTreeToList3B.setText(selected3B);
            }
        });

        tree_types3B = (Spinner) findViewById(R.id.tree_types_spinner3B);
        tree_types3B.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if (selected3B == null) {
                    selected3B = "";
                    sum3B = 0;
                } else {
                    selected3B = adapterView.getSelectedItem().toString() + "  " + selected3B;
                    sum3B = sum3B + 1;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });

        add4B = (Button) findViewById(R.id.addTree4B);
        add4B.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                addTreeToList4B = (TextView) findViewById(R.id.listOfTrees4B);
                modifyAdd4B = addTreeToList4B.getText().toString();
                addTreeToList4B.setText(selected4B);
            }
        });

        clear4B = (Button) findViewById(R.id.clear4B);
        clear4B.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                addTreeToList4B = (TextView) findViewById(R.id.listOfTrees4B);
                modifyAdd4B = addTreeToList4B.getText().toString();
                selected4B = "";
                sum4B = 0;
                addTreeToList4B.setText(selected4B);
            }
        });

        tree_types4B = (Spinner) findViewById(R.id.tree_types_spinner4B);
        tree_types4B.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if (selected4B == null) {
                    selected4B = "";
                    sum4B = 0;
                } else {
                    selected4B = adapterView.getSelectedItem().toString() + "  " + selected4B;
                    sum4B = sum4B + 1;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });
    }

    //get Cell value
    public String getCellValue(){
        cellValue = (EditText) findViewById(R.id.cell_input);
        String cell = cellValue.getText().toString();
        return cell;
    }

    //get Date
    public String getDateValue(){
        dateValue = (EditText) findViewById(R.id.date_input);
        String date = dateValue.getText().toString();
        return date;
    }

    //get Scorers value
    public String getScorerValue(){
        scorersValue = (EditText) findViewById(R.id.scorer_input);
        String scorers = scorersValue.getText().toString();
        return scorers;
    }

    // SECTION 1A
    public void herbaceousPlantScore() {
        threshold = 20; // threshold for 1A
        int NW1Anumber;
        int NE1Anumber;
        int SW1Anumber;
        int SE1Anumber;

        NW1A = (EditText) findViewById(R.id.NW1A);
        String NW1Anum = NW1A.getText().toString();
        if (NW1Anum.equals("")) {
            NW1Anumber = 0;
        } else {
            NW1Anumber = Integer.parseInt(NW1Anum);
        }

        NE1A = (EditText) findViewById(R.id.NE1A);
        String NE1Anum = NE1A.getText().toString();
        if (NE1Anum.equals("")) {
            NE1Anumber = 0;
        } else {
            NE1Anumber = Integer.parseInt(NE1Anum);
        }

        SW1A = (EditText) findViewById(R.id.SW1A);
        String SW1Anum = SW1A.getText().toString();
        if (SW1Anum.equals("")) {
            SW1Anumber = 0;
        } else {
            SW1Anumber = Integer.parseInt(SW1Anum);
        }

        SE1A = (EditText) findViewById(R.id.SE1A);
        String SE1Anum = SE1A.getText().toString();
        if (SE1Anum.equals("")) {
            SE1Anumber = 0;
        } else {
            SE1Anumber = Integer.parseInt(SE1Anum);
        }

        sum1A = NW1Anumber + NE1Anumber + SW1Anumber + SE1Anumber;

        if (sum1A >= threshold) {
            point1A = 1;
        } else {
            point1A = 0;
        }
    }

    // SECTION 1B
    public void treeSeedlingScore() {
        threshold = 16; // threshold for 1B
        int NW1Bnumber;
        int NE1Bnumber;
        int SW1Bnumber;
        int SE1Bnumber;

        NW1B = (EditText) findViewById(R.id.NW1B);
        String NW1Bnum = NW1B.getText().toString();
        if (NW1Bnum.equals("")) {
            NW1Bnumber = 0;
        } else {
            NW1Bnumber = Integer.parseInt(NW1Bnum);
        }

        NE1B = (EditText) findViewById(R.id.NE1B);
        String NE1Bnum = NE1B.getText().toString();
        if (NE1Bnum.equals("")) {
            NE1Bnumber = 0;
        } else {
            NE1Bnumber = Integer.parseInt(NE1Bnum);
        }

        SW1B = (EditText) findViewById(R.id.SW1B);
        String SW1Bnum = SW1B.getText().toString();
        if (SW1Bnum.equals("")) {
            SW1Bnumber = 0;
        } else {
            SW1Bnumber = Integer.parseInt(SW1Bnum);
        }

        SE1B = (EditText) findViewById(R.id.SE1B);
        String SE1Bnum = SE1B.getText().toString();
        if (SE1Bnum.equals("")) {
            SE1Bnumber = 0;
        } else {
            SE1Bnumber = Integer.parseInt(SE1Bnum);
        }

        sum1B = NW1Bnumber + NE1Bnumber + SW1Bnumber + SE1Bnumber;

        if (sum1B >= threshold) {
            point1B = 1;
        } else {
            point1B = 0;
        }
    }

    // SECTION 2A
    public void shrubSaplingScore() {
        threshold = 120; // threshold for 2A
        int NW2Anumber;
        int NE2Anumber;
        int SW2Anumber;
        int SE2Anumber;

        NW2A = (EditText) findViewById(R.id.NW2A);
        String NW2Anum = NW2A.getText().toString();
        if (NW2Anum.equals("")) {
            NW2Anumber = 0;
        } else {
            NW2Anumber = Integer.parseInt(NW2Anum);
        }

        NE2A = (EditText) findViewById(R.id.NE2A);
        String NE2Anum = NE2A.getText().toString();
        if (NE2Anum.equals("")) {
            NE2Anumber = 0;
        } else {
            NE2Anumber = Integer.parseInt(NE2Anum);
        }

        SW2A = (EditText) findViewById(R.id.SW2A);
        String SW2Anum = SW2A.getText().toString();
        if (SW2Anum.equals("")) {
            SW2Anumber = 0;
        } else {
            SW2Anumber = Integer.parseInt(SW2Anum);
        }

        SE2A = (EditText) findViewById(R.id.SE2A);
        String SE2Anum = SE2A.getText().toString();
        if (SE2Anum.equals("")) {
            SE2Anumber = 0;
        } else {
            SE2Anumber = Integer.parseInt(SE2Anum);
        }

        sum2A = NW2Anumber + NE2Anumber + SW2Anumber + SE2Anumber;

        if (sum2A >= threshold) {
            point2A = 1;
        } else {
            point2A = 0;
        }
    }

    // SECTION 2B
    public void comboShrubSaplingScore() {
        threshold = 16; // threshold for 2B
        int NW2Bnumber;
        int NE2Bnumber;
        int SW2Bnumber;
        int SE2Bnumber;

        NW2B = (EditText) findViewById(R.id.NW2B);
        String NW2Bnum = NW2B.getText().toString();
        if (NW2Bnum.equals("")) {
            NW2Bnumber = 0;
        } else {
            NW2Bnumber = Integer.parseInt(NW2Bnum);
        }

        NE2B = (EditText) findViewById(R.id.NE2B);
        String NE2Bnum = NE2B.getText().toString();
        if (NE2Bnum.equals("")) {
            NE2Bnumber = 0;
        } else {
            NE2Bnumber = Integer.parseInt(NE2Bnum);
        }

        SW2B = (EditText) findViewById(R.id.SW2B);
        String SW2Bnum = SW2B.getText().toString();
        if (SW2Bnum.equals("")) {
            SW2Bnumber = 0;
        } else {
            SW2Bnumber = Integer.parseInt(SW2Bnum);
        }

        SE2B = (EditText) findViewById(R.id.SE2B);
        String SE2Bnum = SE2B.getText().toString();
        if (SE2Bnum.equals("")) {
            SE2Bnumber = 0;
        } else {
            SE2Bnumber = Integer.parseInt(SE2Bnum);
        }

        sum2B = NW2Bnumber + NE2Bnumber + SW2Bnumber + SE2Bnumber;

        if (sum2B >= threshold) {
            point2B = 1;
        } else {
            point2B = 0;
        }
    }

    // SECTION 3A
    public void matureTreesScore() {
        threshold = 24; // threshold for 1A
        int NW3Anumber;
        int NE3Anumber;
        int SW3Anumber;
        int SE3Anumber;

        NW3A = (EditText) findViewById(R.id.NW3A);
        String NW3Anum = NW3A.getText().toString();
        if (NW3Anum.equals("")) {
            NW3Anumber = 0;
        } else {
            NW3Anumber = Integer.parseInt(NW3Anum);
        }

        NE3A = (EditText) findViewById(R.id.NE3A);
        String NE3Anum = NE3A.getText().toString();
        if (NE3Anum.equals("")) {
            NE3Anumber = 0;
        } else {
            NE3Anumber = Integer.parseInt(NE3Anum);
        }

        SW3A = (EditText) findViewById(R.id.SW3A);
        String SW3Anum = SW3A.getText().toString();
        if (SW3Anum.equals("")) {
            SW3Anumber = 0;
        } else {
            SW3Anumber = Integer.parseInt(SW3Anum);
        }

        SE3A = (EditText) findViewById(R.id.SE3A);
        String SE3Anum = SE3A.getText().toString();
        if (SE3Anum.equals("")) {
            SE3Anumber = 0;
        } else {
            SE3Anumber = Integer.parseInt(SE3Anum);
        }

        sum3A = NW3Anumber + NE3Anumber + SW3Anumber + SE3Anumber;

        if (sum3A >= threshold) {
            point3A = 1;
        } else {
            point3A = 0;
        }
    }

    // SECTION 3B
    public void matureTreeSpeciesScore() {
        threshold = 3;
        if (sum3B >= threshold) {
            point3B = 1;
        } else {
            point3B = 0;
        }
    }

    // SECTION 4A
    public void legacyTreesScore() {
        threshold = 7; // threshold for 1A
        int NW4Anumber;
        int NE4Anumber;
        int SW4Anumber;
        int SE4Anumber;

        NW4A = (EditText) findViewById(R.id.NW4A);
        String NW4Anum = NW4A.getText().toString();
        if (NW4Anum.equals("")) {
            NW4Anumber = 0;
        } else {
            NW4Anumber = Integer.parseInt(NW4Anum);
        }

        NE4A = (EditText) findViewById(R.id.NE4A);
        String NE4Anum = NE4A.getText().toString();
        if (NE4Anum.equals("")) {
            NE4Anumber = 0;
        } else {
            NE4Anumber = Integer.parseInt(NE4Anum);
        }

        SW4A = (EditText) findViewById(R.id.SW4A);
        String SW4Anum = SW4A.getText().toString();
        if (SW4Anum.equals("")) {
            SW4Anumber = 0;
        } else {
            SW4Anumber = Integer.parseInt(SW4Anum);
        }

        SE4A = (EditText) findViewById(R.id.SE4A);
        String SE4Anum = SE4A.getText().toString();
        if (SE4Anum.equals("")) {
            SE4Anumber = 0;
        } else {
            SE4Anumber = Integer.parseInt(SE4Anum);
        }

        sum4A = NW4Anumber + NE4Anumber + SW4Anumber + SE4Anumber;

        if (sum4A >= threshold) {
            point4A = 1;
        } else {
            point4A = 0;
        }
    }
    // SECTION 4B
    public void legacyTreeSpeciesScore() {
        threshold = 2;
        if (sum4B >= threshold) {
            point4B = 1;
        } else {
            point4B = 0;
        }
    }

    // SECTION 5A
    public void snagsScore() {
        // range for 5A
        int minThreshold = 5;
        int maxThreshold = 12;
        int NW5Anumber;
        int NE5Anumber;
        int SW5Anumber;
        int SE5Anumber;

        NW5A = (EditText) findViewById(R.id.NW5A);
        String NW5Anum = NW5A.getText().toString();
        if (NW5Anum.equals("")) {
            NW5Anumber = 0;
        } else {
            NW5Anumber = Integer.parseInt(NW5Anum);
        }

        NE5A = (EditText) findViewById(R.id.NE5A);
        String NE5Anum = NE5A.getText().toString();
        if (NE5Anum.equals("")) {
            NE5Anumber = 0;
        } else {
            NE5Anumber = Integer.parseInt(NE5Anum);
        }

        SW5A = (EditText) findViewById(R.id.SW5A);
        String SW5Anum = SW5A.getText().toString();
        if (SW5Anum.equals("")) {
            SW5Anumber = 0;
        } else {
            SW5Anumber = Integer.parseInt(SW5Anum);
        }

        SE5A = (EditText) findViewById(R.id.SE5A);
        String SE5Anum = SE5A.getText().toString();
        if (SE5Anum.equals("")) {
            SE5Anumber = 0;
        } else {
            SE5Anumber = Integer.parseInt(SE5Anum);
        }

        sum5A = NW5Anumber + NE5Anumber + SW5Anumber + SE5Anumber;

        // gets point if within range
        if (sum5A >= minThreshold && sum5A<= maxThreshold) {
            point5A = 1;
        } else {
            point5A = 0;
        }
    }

    // SECTION 5B
    public void woodyDebrisScore() {
        threshold = 12; // threshold for 5B
        int NW5Bnumber;
        int NE5Bnumber;
        int SW5Bnumber;
        int SE5Bnumber;

        NW5B = (EditText) findViewById(R.id.NW5B);
        String NW5Bnum = NW5B.getText().toString();
        if (NW5Bnum.equals("")) {
            NW5Bnumber = 0;
        } else {
            NW5Bnumber = Integer.parseInt(NW5Bnum);
        }

        NE5B = (EditText) findViewById(R.id.NE5B);
        String NE5Bnum = NE5B.getText().toString();
        if (NE5Bnum.equals("")) {
            NE5Bnumber = 0;
        } else {
            NE5Bnumber = Integer.parseInt(NE5Bnum);
        }

        SW5B = (EditText) findViewById(R.id.SW5B);
        String SW5Bnum = SW5B.getText().toString();
        if (SW5Bnum.equals("")) {
            SW5Bnumber = 0;
        } else {
            SW5Bnumber = Integer.parseInt(SW5Bnum);
        }

        SE5B = (EditText) findViewById(R.id.SE5B);
        String SE5Bnum = SE5B.getText().toString();
        if (SE5Bnum.equals("")) {
            SE5Bnumber = 0;
        } else {
            SE5Bnumber = Integer.parseInt(SE5Bnum);
        }

        sum5B = NW5Bnumber + NE5Bnumber + SW5Bnumber + SE5Bnumber;

        if (sum5B >= threshold) {
            point5B = 1;
        } else {
            point5B = 0;
        }
    }

    // SECTION 6A
    public void invasiveShrubsScore() {
        threshold = 80; // threshold for 6A < 80
        int NW6Anumber;
        int NE6Anumber;
        int SW6Anumber;
        int SE6Anumber;

        NW6A = (EditText) findViewById(R.id.NW6A);
        String NW6Anum = NW6A.getText().toString();
        if (NW6Anum.equals("")) {
            NW6Anumber = 0;
        } else {
            NW6Anumber = Integer.parseInt(NW6Anum);
        }

        NE6A = (EditText) findViewById(R.id.NE6A);
        String NE6Anum = NE6A.getText().toString();
        if (NE6Anum.equals("")) {
            NE6Anumber = 0;
        } else {
            NE6Anumber = Integer.parseInt(NE6Anum);
        }

        SW6A = (EditText) findViewById(R.id.SW6A);
        String SW6Anum = SW6A.getText().toString();
        if (SW6Anum.equals("")) {
            SW6Anumber = 0;
        } else {
            SW6Anumber = Integer.parseInt(SW6Anum);
        }

        SE6A = (EditText) findViewById(R.id.SE6A);
        String SE6Anum = SE6A.getText().toString();
        if (SE6Anum.equals("")) {
            SE6Anumber = 0;
        } else {
            SE6Anumber = Integer.parseInt(SE6Anum);
        }

        sum6A = NW6Anumber + NE6Anumber + SW6Anumber + SE6Anumber;

        if (sum6A < threshold) {
            point6A = 1;
        } else {
            point6A = 0;
        }
    }

    // SECTION 6B
    public void invasiveHerbaceousScore() {
        threshold = 200; // threshold for 6B < 200
        int NW6Bnumber;
        int NE6Bnumber;
        int SW6Bnumber;
        int SE6Bnumber;

        NW6B = (EditText) findViewById(R.id.NW6B);
        String NW6Bnum = NW6B.getText().toString();
        if (NW6Bnum.equals("")) {
            NW6Bnumber = 0;
        } else {
            NW6Bnumber = Integer.parseInt(NW6Bnum);
        }

        NE6B = (EditText) findViewById(R.id.NE6B);
        String NE6Bnum = NE6B.getText().toString();
        if (NE6Bnum.equals("")) {
            NE6Bnumber = 0;
        } else {
            NE6Bnumber = Integer.parseInt(NE6Bnum);
        }

        SW6B = (EditText) findViewById(R.id.SW6B);
        String SW6Bnum = SW6B.getText().toString();
        if (SW6Bnum.equals("")) {
            SW6Bnumber = 0;
        } else {
            SW6Bnumber = Integer.parseInt(SW6Bnum);
        }

        SE6B = (EditText) findViewById(R.id.SE6B);
        String SE6Bnum = SE6B.getText().toString();
        if (SE6Bnum.equals("")) {
            SE6Bnumber = 0;
        } else {
            SE6Bnumber = Integer.parseInt(SE6Bnum);
        }

        sum6B = NW6Bnumber + NE6Bnumber + SW6Bnumber + SE6Bnumber;

        if (sum6B < threshold) {
            point6B = 1;
        } else {
            point6B = 0;
        }
    }

    //section 7
    public void noObservedInvasivePlants(){
        boolean isChecked = ((CheckBox) findViewById(R.id.checkBox7)).isChecked();
        if (isChecked == true){
            point7 = 1;
        }
        else{
            point7 = 0;
        }
    }

    //section 8
    public void healthyLightGaps(){
        boolean isChecked = ((CheckBox) findViewById(R.id.checkBox8)).isChecked();
        if (isChecked == true){
            point8 = 1;
        }
        else{
            point8 = 0;
        }
    }

    //section 9
    public void microtopography(){
        boolean isChecked = ((CheckBox) findViewById(R.id.checkBox9)).isChecked();
        if (isChecked == true){
            point9 = 1;
        }
        else{
            point9 = 0;
        }
    }

    //section 10
    public void absenceOfHumanActivity(){
        boolean isChecked = ((CheckBox) findViewById(R.id.checkBox10)).isChecked();
        if (isChecked == true){
            point10 = 1;
        }
        else{
            point10 = 0;
        }
    }

    //section 11
    public void absenceOfDeer(){
        boolean isChecked = ((CheckBox) findViewById(R.id.checkBox11)).isChecked();
        if (isChecked == true){
            point11 = 1;
        }
        else{
            point11 = 0;
        }
    }

    //section 12
    public void leafFragmentCover(){
        boolean isCheckedA = ((CheckBox) findViewById(R.id.checkBox12A)).isChecked();
        int pointBoxA;
        boolean isCheckedB = ((CheckBox) findViewById(R.id.checkBox12B)).isChecked();
        int pointBoxB;
        boolean isCheckedC = ((CheckBox) findViewById(R.id.checkBox12C)).isChecked();
        int pointBoxC;
        boolean isCheckedD = ((CheckBox) findViewById(R.id.checkBox12D)).isChecked();
        int pointBoxD;
        boolean isCheckedE = ((CheckBox) findViewById(R.id.checkBox12E)).isChecked();
        int pointBoxE;

        if (isCheckedA == true){
            pointBoxA = 1;
        }
        else{
            pointBoxA = 0;
        }

        if (isCheckedB == true){
            pointBoxB = 1;
        }
        else{
            pointBoxB = 0;
        }

        if (isCheckedC == true){
            pointBoxC = 1;
        }
        else{
            pointBoxC = 0;
        }

        if (isCheckedD == true){
            pointBoxD = 1;
        }
        else{
            pointBoxD = 0;
        }

        if (isCheckedE == true){
            pointBoxE = 1;
        }
        else{
            pointBoxE = 0;
        }

        total12 = pointBoxA + pointBoxB + pointBoxC + pointBoxD + pointBoxE;

        if(total12 >= 4){
            point12 = 1;
        }
        else{
            point12 = 0;
        }
    }

    //total points
    public void totalPoints(){
        total = point1A + point1B + point2A + point2B + point3A + point3B + point4A + point4B + point5A + point5B + point6A + point6B + point7 + point8 + point9 + point10 + point11 + point12;
    }

    //arrayList of data
    public ArrayList<Holder<Object>> getValues(){
        ArrayList list = new ArrayList(97);
        list.add(new Holder<Object>(getCellValue(),0));
        list.add(new Holder<Object>(getDateValue(),0));
        return null;
    }
}
