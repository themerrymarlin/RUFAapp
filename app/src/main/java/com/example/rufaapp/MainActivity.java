package com.example.rufaapp;

import android.content.Context;
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
    private int NW1Anumber;
    private int NE1Anumber;
    private int SW1Anumber;
    private int SE1Anumber;

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
    private int NW1Bnumber;
    private int NE1Bnumber;
    private int SW1Bnumber;
    private int SE1Bnumber;

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
    private int NW2Anumber;
    private int NE2Anumber;
    private int SW2Anumber;
    private int SE2Anumber;

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
    private int NW2Bnumber;
    private int NE2Bnumber;
    private int SW2Bnumber;
    private int SE2Bnumber;

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
    private int NW3Anumber;
    private int NE3Anumber;
    private int SW3Anumber;
    private int SE3Anumber;

    //section 3B
    private int point3B;
    private int sum3B;
    private TextView sum3BVal;
    private String modifyTextSum3B;
    private TextView point3BVal;
    private String modifyTextPoint3B;
    private TextView addTreeToList3B;
    private TextView addTreeToDominant3B1;
    private TextView addTreeToDominant3B2;
    private String modifyAdd3B;
    private String selected3B;
    private Spinner tree_types3B;
    private Button add3B;
    private Button clear3B;
    private Button addDominant3B1;
    private Button addDominant3B2;
    private String selected3BDominant1;
    private String selected3BDominant2;
    private CheckBox toggle3B1;
    private CheckBox toggle3B2;

    //section 4A
    private int point4A;
    private int sum4A;
    private EditText NW4A;
    private EditText NE4A;
    private EditText SW4A;
    private EditText SE4A;
    private TextView sum4AVal;
    private String modifyTextSum4A;
    private TextView point4AVal;
    private String modifyTextPoint4A;
    private int NW4Anumber;
    private int NE4Anumber;
    private int SW4Anumber;
    private int SE4Anumber;

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
    private String modifyAdd4B;
    private Button addDominant4B1;
    private Button addDominant4B2;
    private String selected4BDominant1;
    private String selected4BDominant2;
    private TextView addTreeToDominant4B1;
    private TextView addTreeToDominant4B2;
    private CheckBox toggle4B1;
    private CheckBox toggle4B2;

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
    private int NW5Anumber;
    private int NE5Anumber;
    private int SW5Anumber;
    private int SE5Anumber;

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
    private int NW5Bnumber;
    private int NE5Bnumber;
    private int SW5Bnumber;
    private int SE5Bnumber;

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
    private int NW6Anumber;
    private int NE6Anumber;
    private int SW6Anumber;
    private int SE6Anumber;

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
    private int NW6Bnumber;
    private int NE6Bnumber;
    private int SW6Bnumber;
    private int SE6Bnumber;

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
    private int pointBoxA;
    private int pointBoxB;
    private int pointBoxC;
    private int pointBoxD;
    private int pointBoxE;

    //Total
    private int total;
    private TextView totalPoints;
    private String modifyTotalPoints;
    private String qualityRank;

    //Plant Community
    private TextView addTreeToListPlantCommunity;
    private String modifyCommunityType;
    private String selectedPlantCommunity;
    private Spinner plant_community;
    private Button addPlantCommunity;

    //bearing changes
    private CheckBox yesBearingChanges;
    private CheckBox noBearingChanges;

    //canopy
    private CheckBox canopyOpen;
    private CheckBox canopyClosed;

    //Age Classes
    private Spinner age_classes;
    private Button addDominantAgeClasses1;
    private Button addDominantAgeClasses2;
    private String selectedAgeClass;
    private TextView addTreeToDominantSapling1;
    private TextView addTreeToDominantSapling2;
    private CheckBox toggleSapling1;
    private CheckBox toggleSapling2;
    private TextView addTreeToDominantSmallPole1;
    private TextView addTreeToDominantSmallPole2;
    private CheckBox toggleSmallPole1;
    private CheckBox toggleSmallPole2;
    private TextView addTreeToDominantMedPole1;
    private TextView addTreeToDominantMedPole2;
    private CheckBox toggleMedPole1;
    private CheckBox toggleMedPole2;
    private TextView addTreeToDominantStandard1;
    private TextView addTreeToDominantStandard2;
    private CheckBox toggleStandard1;
    private CheckBox toggleStandard2;
    private TextView addTreeToDominantVeteran1;
    private TextView addTreeToDominantVeteran2;
    private CheckBox toggleVeteran1;
    private CheckBox toggleVeteran2;

    //Pests and Pathogens
    private CheckBox beechPresent;
    private CheckBox beechLow;
    private CheckBox beechMedium;
    private CheckBox beechHigh;
    private CheckBox bldPresent;
    private CheckBox bldLow;
    private CheckBox bldModerate;
    private CheckBox bldSevere;
    private int beech;
    private int bld;
    private String beechAbundance;
    private String bldSeverity;
    private CheckBox ashPresent;
    private CheckBox ashLow;
    private CheckBox ashMedium;
    private CheckBox ashHigh;
    private CheckBox eabPresent;
    private CheckBox eabLow;
    private CheckBox eabModerate;
    private CheckBox eabSevere;
    private int ash;
    private int eab;
    private String ashAbundance;
    private String eabSeverity;

    //seedling cover
    private CheckBox ten;
    private CheckBox tenTwentyFive;
    private CheckBox twentyFiveFifty;
    private CheckBox fiftySeventyFive;
    private CheckBox seventyFiveNinety;
    private CheckBox ninety;

    //Save button
    private Button saveButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        saveButton = (Button) findViewById(R.id.saveData);
        saveButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                //saveData();
            }
        });

        updateBottom = (Button) findViewById(R.id.updateBottom);
        updateBottom.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                updateButtonPressed();
            }
        });

        updateTop = (Button) findViewById(R.id.updateTop);
        updateTop.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                updateButtonPressed();
            }
        });

        addDominant3B1 = (Button) findViewById(R.id.addDominant3B1);
        addDominant3B1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                addTreeToDominant3B1 = (TextView) findViewById(R.id.dominant3B1);
                modifyAdd3B = addTreeToDominant3B1.getText().toString();
                addTreeToDominant3B1.setText(selected3BDominant1);
            }
        });

        addDominant4B1 = (Button) findViewById(R.id.addDominant4B1);
        addDominant4B1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                addTreeToDominant4B1 = (TextView) findViewById(R.id.dominant4B1);
                modifyAdd4B = addTreeToDominant4B1.getText().toString();
                addTreeToDominant4B1.setText(selected4BDominant1);
            }
        });

        addDominant3B2 = (Button) findViewById(R.id.addDominant3B2);
        addDominant3B2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                addTreeToDominant3B2 = (TextView) findViewById(R.id.dominant3B2);
                modifyAdd3B = addTreeToDominant3B2.getText().toString();
                addTreeToDominant3B2.setText(selected3BDominant2);
            }
        });

        addDominant4B2 = (Button) findViewById(R.id.addDominant4B2);
        addDominant4B2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                addTreeToDominant4B2 = (TextView) findViewById(R.id.dominant4B2);
                modifyAdd4B = addTreeToDominant4B2.getText().toString();
                addTreeToDominant4B2.setText(selected4BDominant2);
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

                addTreeToDominant3B1 = (TextView) findViewById(R.id.dominant3B1);
                modifyAdd3B = addTreeToDominant3B1.getText().toString();
                selected3BDominant1 = " ";
                addTreeToDominant3B1.setText(selected3BDominant1);

                addTreeToDominant3B2 = (TextView) findViewById(R.id.dominant3B2);
                modifyAdd3B = addTreeToDominant3B2.getText().toString();
                selected3BDominant2 = " ";
                addTreeToDominant3B2.setText(selected3BDominant2);

                toggle3B1 = (CheckBox) findViewById(R.id.checkBoxDominant3B1);
                toggle3B2 = (CheckBox) findViewById(R.id.checkBoxDominant3B2);
                toggle3B1.setChecked(false);
                toggle3B2.setChecked(false);

                View c = findViewById(R.id.addDominant3B1);
                c.setVisibility(View.INVISIBLE);
                View b = findViewById(R.id.addTree3B);
                b.setVisibility(View.VISIBLE);
                View d = findViewById(R.id.addDominant3B2);
                d.setVisibility(View.INVISIBLE);
            }
        });

        tree_types3B = (Spinner) findViewById(R.id.tree_types_spinner3B);
        tree_types3B.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                boolean isCheckedDominant3B1 = ((CheckBox) findViewById(R.id.checkBoxDominant3B1)).isChecked();
                boolean isCheckedDominant3B2 = ((CheckBox) findViewById(R.id.checkBoxDominant3B2)).isChecked();
                toggle3B1 = (CheckBox) findViewById(R.id.checkBoxDominant3B1);
                toggle3B2 = (CheckBox) findViewById(R.id.checkBoxDominant3B2);
                View c = findViewById(R.id.addDominant3B1);
                c.setVisibility(View.INVISIBLE);
                View b = findViewById(R.id.addTree3B);
                b.setVisibility(View.VISIBLE);
                View d = findViewById(R.id.addDominant3B2);
                d.setVisibility(View.INVISIBLE);
                if (selected3B == null) {
                    selected3B = "";
                    sum3B = 0;
                } else if (isCheckedDominant3B1 == false && isCheckedDominant3B2 == false){
                    selected3B = adapterView.getSelectedItem().toString() + "  " + selected3B;
                    sum3B = sum3B + 1;
                    c.setVisibility(View.INVISIBLE);
                    d.setVisibility(View.INVISIBLE);
                    b.setVisibility(View.VISIBLE);
                }
                else if (isCheckedDominant3B1 == true && isCheckedDominant3B2 == false) {
                    selected3BDominant1 = adapterView.getSelectedItem().toString();
                    toggle3B1.setChecked(false);
                    c.setVisibility(View.VISIBLE);
                    d.setVisibility(View.INVISIBLE);
                    b.setVisibility(View.INVISIBLE);
                }
                else if (isCheckedDominant3B1 == false && isCheckedDominant3B2 == true){
                    selected3BDominant2 = adapterView.getSelectedItem().toString();
                    toggle3B2.setChecked(false);
                    c.setVisibility(View.INVISIBLE);
                    d.setVisibility(View.VISIBLE);
                    b.setVisibility(View.INVISIBLE);
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

                addTreeToDominant4B1 = (TextView) findViewById(R.id.dominant4B1);
                modifyAdd4B = addTreeToDominant4B1.getText().toString();
                selected4BDominant1 = " ";
                addTreeToDominant4B1.setText(selected4BDominant1);

                addTreeToDominant4B2 = (TextView) findViewById(R.id.dominant4B2);
                modifyAdd4B = addTreeToDominant4B2.getText().toString();
                selected4BDominant2 = " ";
                addTreeToDominant4B2.setText(selected4BDominant2);

                toggle4B1 = (CheckBox) findViewById(R.id.checkBoxDominant4B1);
                toggle4B2 = (CheckBox) findViewById(R.id.checkBoxDominant4B2);
                toggle4B1.setChecked(false);
                toggle4B2.setChecked(false);

                View c = findViewById(R.id.addDominant4B1);
                c.setVisibility(View.INVISIBLE);
                View b = findViewById(R.id.addTree4B);
                b.setVisibility(View.VISIBLE);
                View d = findViewById(R.id.addDominant4B2);
                d.setVisibility(View.INVISIBLE);
            }
        });

        tree_types4B = (Spinner) findViewById(R.id.tree_types_spinner4B);
        tree_types4B.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                boolean isCheckedDominant4B1 = ((CheckBox) findViewById(R.id.checkBoxDominant4B1)).isChecked();
                boolean isCheckedDominant4B2 = ((CheckBox) findViewById(R.id.checkBoxDominant4B2)).isChecked();
                toggle4B1 = (CheckBox) findViewById(R.id.checkBoxDominant4B1);
                toggle4B2 = (CheckBox) findViewById(R.id.checkBoxDominant4B2);
                View c = findViewById(R.id.addDominant4B1);
                c.setVisibility(View.INVISIBLE);
                View b = findViewById(R.id.addTree4B);
                b.setVisibility(View.VISIBLE);
                View d = findViewById(R.id.addDominant4B2);
                d.setVisibility(View.INVISIBLE);
                if (selected4B == null) {
                    selected4B = "";
                    sum4B = 0;
                } else if (isCheckedDominant4B1 == false && isCheckedDominant4B2 == false){
                    selected4B = adapterView.getSelectedItem().toString() + "  " + selected4B;
                    sum4B = sum4B + 1;
                    c.setVisibility(View.INVISIBLE);
                    d.setVisibility(View.INVISIBLE);
                    b.setVisibility(View.VISIBLE);
                } else if (isCheckedDominant4B1 == true && isCheckedDominant4B2 == true){
                    selected4B = adapterView.getSelectedItem().toString() + "  " + selected4B;
                    sum4B = sum4B + 1;
                    c.setVisibility(View.INVISIBLE);
                    d.setVisibility(View.INVISIBLE);
                    b.setVisibility(View.VISIBLE);
                }
                else if (isCheckedDominant4B1 == true && isCheckedDominant4B2 == false) {
                    selected4BDominant1 = adapterView.getSelectedItem().toString();
                    toggle4B1.setChecked(false);
                    c.setVisibility(View.VISIBLE);
                    d.setVisibility(View.INVISIBLE);
                    b.setVisibility(View.INVISIBLE);
                }
                else if (isCheckedDominant4B1 == false && isCheckedDominant4B2 == true){
                    selected4BDominant2 = adapterView.getSelectedItem().toString();
                    toggle4B2.setChecked(false);
                    c.setVisibility(View.INVISIBLE);
                    d.setVisibility(View.VISIBLE);
                    b.setVisibility(View.INVISIBLE);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });


        //plant community
        addPlantCommunity = (Button) findViewById(R.id.select_community_type);
        addPlantCommunity.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                addTreeToListPlantCommunity = (TextView) findViewById(R.id.community_type_value);
                modifyCommunityType = addTreeToListPlantCommunity.getText().toString();
                addTreeToListPlantCommunity.setText(selectedPlantCommunity);
            }
        });

        plant_community = (Spinner) findViewById(R.id.community_type_spinner);
        plant_community.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if (selectedPlantCommunity == null) {
                    selectedPlantCommunity = "";
                } else {
                    selectedPlantCommunity = adapterView.getSelectedItem().toString();
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });

        //bearing changes
        yesBearingChanges = (CheckBox) findViewById(R.id.checkBoxYesBearingChanged);
        yesBearingChanges.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                boolean isCheckedYesBearingChanges = ((CheckBox) findViewById(R.id.checkBoxYesBearingChanged)).isChecked();

                if (isCheckedYesBearingChanges == true) {
                    noBearingChanges.setChecked(false);
                }
            }
        });

        noBearingChanges = (CheckBox) findViewById(R.id.checkBoxNoBearingChange);
        noBearingChanges.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                boolean isCheckedNoBearingChanges = ((CheckBox) findViewById(R.id.checkBoxNoBearingChange)).isChecked();

                if (isCheckedNoBearingChanges == true) {
                    yesBearingChanges.setChecked(false);
                }
            }
        });

        //Canopy
        canopyOpen = (CheckBox) findViewById(R.id.canopyOpen);
        canopyOpen.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                boolean isCheckedCanopyOpen = ((CheckBox) findViewById(R.id.canopyOpen)).isChecked();

                if (isCheckedCanopyOpen == true) {
                    canopyClosed.setChecked(false);
                }
            }
        });

        canopyClosed = (CheckBox) findViewById(R.id.canopyClosed);
        canopyClosed.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                boolean isCheckedCanopyClosed = ((CheckBox) findViewById(R.id.canopyClosed)).isChecked();

                if (isCheckedCanopyClosed == true) {
                    canopyOpen.setChecked(false);
                }
            }
        });

        addDominantAgeClasses1 = (Button) findViewById(R.id.addDominantAgeClasses1);
        addDominantAgeClasses1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                boolean isCheckedDominantSapling1 = ((CheckBox) findViewById(R.id.checkBoxDominantSapling1)).isChecked();
                boolean isCheckedDominantSmallPole1 = ((CheckBox) findViewById(R.id.checkBoxDominantSmallPole1)).isChecked();
                boolean isCheckedDominantMedPole1 = ((CheckBox) findViewById(R.id.checkBoxDominantMedPole1)).isChecked();
                boolean isCheckedDominantStandard1 = ((CheckBox) findViewById(R.id.checkBoxDominantStandard1)).isChecked();
                boolean isCheckedDominantVeteran1 = ((CheckBox) findViewById(R.id.checkBoxDominantVeteran1)).isChecked();
                toggleSmallPole1 = (CheckBox) findViewById(R.id.checkBoxDominantSmallPole1);
                toggleMedPole1 = (CheckBox) findViewById(R.id.checkBoxDominantMedPole1);
                toggleSapling1 = (CheckBox) findViewById(R.id.checkBoxDominantSapling1);
                toggleStandard1 = (CheckBox) findViewById(R.id.checkBoxDominantStandard1);
                toggleVeteran1 = (CheckBox) findViewById(R.id.checkBoxDominantVeteran1);


                if (isCheckedDominantSapling1 == true) {
                    addTreeToDominantSapling1 = (TextView) findViewById(R.id.dominantSapling1);
                    modifyAdd4B = addTreeToDominantSapling1.getText().toString();
                    addTreeToDominantSapling1.setText(selectedAgeClass);
                    toggleSapling1.setChecked(false);
                }else if (isCheckedDominantSmallPole1 == true){
                    addTreeToDominantSmallPole1 = (TextView) findViewById(R.id.dominantSmallPole1);
                    modifyAdd4B = addTreeToDominantSmallPole1.getText().toString();
                    addTreeToDominantSmallPole1.setText(selectedAgeClass);
                    toggleSmallPole1.setChecked(false);
                }else if (isCheckedDominantMedPole1 == true){
                    addTreeToDominantMedPole1 = (TextView) findViewById(R.id.dominantMedPole1);
                    modifyAdd4B = addTreeToDominantMedPole1.getText().toString();
                    addTreeToDominantMedPole1.setText(selectedAgeClass);
                    toggleMedPole1.setChecked(false);
                }else if (isCheckedDominantStandard1 == true){
                    addTreeToDominantStandard1 = (TextView) findViewById(R.id.dominantStandard1);
                    modifyAdd4B = addTreeToDominantStandard1.getText().toString();
                    addTreeToDominantStandard1.setText(selectedAgeClass);
                    toggleStandard1.setChecked(false);
                }else if (isCheckedDominantVeteran1 == true){
                    addTreeToDominantVeteran1 = (TextView) findViewById(R.id.dominantVeteran1);
                    modifyAdd4B = addTreeToDominantVeteran1.getText().toString();
                    addTreeToDominantVeteran1.setText(selectedAgeClass);
                    toggleVeteran1.setChecked(false);
                }

            }
        });

        addDominantAgeClasses2 = (Button) findViewById(R.id.addDominantAgeClasses2);
        addDominantAgeClasses2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                boolean isCheckedDominantSapling2 = ((CheckBox) findViewById(R.id.checkBoxDominantSapling2)).isChecked();
                boolean isCheckedDominantSmallPole2 = ((CheckBox) findViewById(R.id.checkBoxDominantSmallPole2)).isChecked();
                boolean isCheckedDominantMedPole2 = ((CheckBox) findViewById(R.id.checkBoxDominantMedPole2)).isChecked();
                boolean isCheckedDominantStandard2 = ((CheckBox) findViewById(R.id.checkBoxDominantStandard2)).isChecked();
                boolean isCheckedDominantVeteran2 = ((CheckBox) findViewById(R.id.checkBoxDominantVeteran2)).isChecked();
                toggleSapling2 = (CheckBox) findViewById(R.id.checkBoxDominantSapling2);
                toggleSmallPole2 = (CheckBox) findViewById(R.id.checkBoxDominantSmallPole2);
                toggleMedPole2 = (CheckBox) findViewById(R.id.checkBoxDominantMedPole2);
                toggleStandard2 = (CheckBox) findViewById(R.id.checkBoxDominantStandard2);
                toggleVeteran2 = (CheckBox) findViewById(R.id.checkBoxDominantVeteran2);


                if (isCheckedDominantSapling2 == true){
                    addTreeToDominantSapling2 = (TextView) findViewById(R.id.dominantSapling2);
                    modifyAdd4B = addTreeToDominantSapling2.getText().toString();
                    addTreeToDominantSapling2.setText(selectedAgeClass);
                    toggleSapling2.setChecked(false);
                }else if (isCheckedDominantSmallPole2 == true){
                    addTreeToDominantSmallPole2 = (TextView) findViewById(R.id.dominantSmallPole2);
                    modifyAdd4B = addTreeToDominantSmallPole2.getText().toString();
                    addTreeToDominantSmallPole2.setText(selectedAgeClass);
                    toggleSmallPole2.setChecked(false);
                }else if (isCheckedDominantMedPole2 == true){
                    addTreeToDominantMedPole2 = (TextView) findViewById(R.id.dominantMedPole2);
                    modifyAdd4B = addTreeToDominantMedPole2.getText().toString();
                    addTreeToDominantMedPole2.setText(selectedAgeClass);
                    toggleMedPole2.setChecked(false);
                }else if (isCheckedDominantStandard2 == true){
                    addTreeToDominantStandard2 = (TextView) findViewById(R.id.dominantStandard2);
                    modifyAdd4B = addTreeToDominantStandard2.getText().toString();
                    addTreeToDominantStandard2.setText(selectedAgeClass);
                    toggleStandard2.setChecked(false);
                }else if (isCheckedDominantVeteran2 == true){
                    addTreeToDominantVeteran2 = (TextView) findViewById(R.id.dominantVeteran2);
                    modifyAdd4B = addTreeToDominantVeteran2.getText().toString();
                    addTreeToDominantVeteran2.setText(selectedAgeClass);
                    toggleVeteran2.setChecked(false);
                }
            }
        });

        age_classes = (Spinner) findViewById(R.id.tree_types_spinnerAgeClasses);
        age_classes.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if (selectedAgeClass == null) {
                    selectedAgeClass = "";
                } else{
                    selectedAgeClass = adapterView.getSelectedItem().toString();
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });


        //Pests and Pathogens
        beechPresent = (CheckBox) findViewById(R.id.beechPresent);
        beechPresent.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                boolean isCheckedBeechPresent = ((CheckBox) findViewById(R.id.beechPresent)).isChecked();

                if (isCheckedBeechPresent == false) {
                    beechLow.setChecked(false);
                    beechMedium.setChecked(false);
                    beechHigh.setChecked(false);
                    beech = 0;
                    beechAbundance = "None";
                }
            }
        });
        beechLow = (CheckBox) findViewById(R.id.beechLow);
        beechLow.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                boolean isCheckedBeechPresent = ((CheckBox) findViewById(R.id.beechPresent)).isChecked();
                boolean isCheckedBeechLow = ((CheckBox) findViewById(R.id.beechLow)).isChecked();

                if (isCheckedBeechPresent == true && isCheckedBeechLow == true) {
                    beechMedium.setChecked(false);
                    beechHigh.setChecked(false);
                    beech = 1;
                    beechAbundance = "Low";
                }
                else if (isCheckedBeechPresent == false && isCheckedBeechLow == true){
                    beechMedium.setChecked(false);
                    beechHigh.setChecked(false);
                    beechPresent.setChecked(true);
                    beech = 1;
                    beechAbundance = "Low";
                }
            }
        });
        beechMedium = (CheckBox) findViewById(R.id.beechMedium);
        beechMedium.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                boolean isCheckedBeechPresent = ((CheckBox) findViewById(R.id.beechPresent)).isChecked();
                boolean isCheckedBeechMedium = ((CheckBox) findViewById(R.id.beechMedium)).isChecked();

                if (isCheckedBeechPresent == true && isCheckedBeechMedium == true) {
                    beechLow.setChecked(false);
                    beechHigh.setChecked(false);
                    beech = 1;
                    beechAbundance = "Medium";
                }
                else if (isCheckedBeechPresent == false && isCheckedBeechMedium == true){
                    beechLow.setChecked(false);
                    beechHigh.setChecked(false);
                    beechPresent.setChecked(true);
                    beech = 1;
                    beechAbundance = "Medium";
                }
            }
        });
        beechHigh = (CheckBox) findViewById(R.id.beechHigh);
        beechHigh.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                boolean isCheckedBeechPresent = ((CheckBox) findViewById(R.id.beechPresent)).isChecked();
                boolean isCheckedBeechHigh = ((CheckBox) findViewById(R.id.beechHigh)).isChecked();

                if (isCheckedBeechPresent == true && isCheckedBeechHigh == true) {
                    beechMedium.setChecked(false);
                    beechLow.setChecked(false);
                    beech = 1;
                    beechAbundance = "High";
                }
                else if (isCheckedBeechPresent == false && isCheckedBeechHigh == true){
                    beechMedium.setChecked(false);
                    beechLow.setChecked(false);
                    beechPresent.setChecked(true);
                    beech = 1;
                    beechAbundance = "High";
                }
            }
        });

        bldPresent = (CheckBox) findViewById(R.id.bldPresent);
        bldPresent.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                boolean isCheckedBldPresent = ((CheckBox) findViewById(R.id.bldPresent)).isChecked();

                if (isCheckedBldPresent == false) {
                    bldLow.setChecked(false);
                    bldModerate.setChecked(false);
                    bldSevere.setChecked(false);
                    bld = 0;
                    bldSeverity = "None";
                }
            }
        });
        bldLow = (CheckBox) findViewById(R.id.bldLow);
        bldLow.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                boolean isCheckedBldPresent = ((CheckBox) findViewById(R.id.bldPresent)).isChecked();
                boolean isCheckedBldLow = ((CheckBox) findViewById(R.id.bldLow)).isChecked();

                if (isCheckedBldPresent == true && isCheckedBldLow == true) {
                    bldModerate.setChecked(false);
                    bldSevere.setChecked(false);
                    bld = 1;
                    bldSeverity = "Low";
                }
                else if (isCheckedBldPresent == false && isCheckedBldLow == true){
                    bldModerate.setChecked(false);
                    bldSevere.setChecked(false);
                    bldPresent.setChecked(true);
                    bld = 1;
                    bldSeverity = "Low";
                }
            }
        });
        bldModerate = (CheckBox) findViewById(R.id.bldModerate);
        bldModerate.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                boolean isCheckedBldPresent = ((CheckBox) findViewById(R.id.bldPresent)).isChecked();
                boolean isCheckedBldModerate = ((CheckBox) findViewById(R.id.bldModerate)).isChecked();

                if (isCheckedBldPresent == true && isCheckedBldModerate == true) {
                    bldLow.setChecked(false);
                    bldSevere.setChecked(false);
                    bld = 1;
                    bldSeverity = "Moderate";
                }
                else if (isCheckedBldPresent == false && isCheckedBldModerate == true){
                    bldLow.setChecked(false);
                    bldSevere.setChecked(false);
                    bldPresent.setChecked(true);
                    bld = 1;
                    bldSeverity = "Moderate";
                }
            }
        });
        bldSevere = (CheckBox) findViewById(R.id.bldSevere);
        bldSevere.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                boolean isCheckedBldPresent = ((CheckBox) findViewById(R.id.bldPresent)).isChecked();
                boolean isCheckedBldSevere= ((CheckBox) findViewById(R.id.bldSevere)).isChecked();

                if (isCheckedBldPresent == true && isCheckedBldSevere == true) {
                    bldModerate.setChecked(false);
                    bldLow.setChecked(false);
                    bld = 1;
                    bldSeverity = "Severe";
                }
                else if (isCheckedBldPresent == false && isCheckedBldSevere == true){
                    bldModerate.setChecked(false);
                    bldLow.setChecked(false);
                    bldPresent.setChecked(true);
                    bld = 1;
                    bldSeverity = "Severe";
                }
            }
        });

        ashPresent = (CheckBox) findViewById(R.id.ashPresent);
        ashPresent.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                boolean isCheckedashPresent = ((CheckBox) findViewById(R.id.ashPresent)).isChecked();

                if (isCheckedashPresent == false) {
                    ashLow.setChecked(false);
                    ashMedium.setChecked(false);
                    ashHigh.setChecked(false);
                    ash = 0;
                    ashAbundance = "None";
                }
            }
        });
        ashLow = (CheckBox) findViewById(R.id.ashLow);
        ashLow.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                boolean isCheckedashPresent = ((CheckBox) findViewById(R.id.ashPresent)).isChecked();
                boolean isCheckedashLow = ((CheckBox) findViewById(R.id.ashLow)).isChecked();

                if (isCheckedashPresent == true && isCheckedashLow == true) {
                    ashMedium.setChecked(false);
                    ashHigh.setChecked(false);
                    ash = 1;
                    ashAbundance = "Low";
                }
                else if (isCheckedashPresent == false && isCheckedashLow == true){
                    ashMedium.setChecked(false);
                    ashHigh.setChecked(false);
                    ashPresent.setChecked(true);
                    ash = 1;
                    ashAbundance = "Low";
                }
            }
        });
        ashMedium = (CheckBox) findViewById(R.id.ashMedium);
        ashMedium.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                boolean isCheckedashPresent = ((CheckBox) findViewById(R.id.ashPresent)).isChecked();
                boolean isCheckedashMedium = ((CheckBox) findViewById(R.id.ashMedium)).isChecked();

                if (isCheckedashPresent == true && isCheckedashMedium == true) {
                    ashLow.setChecked(false);
                    ashHigh.setChecked(false);
                    ash = 1;
                    ashAbundance = "Medium";
                }
                else if (isCheckedashPresent == false && isCheckedashMedium == true){
                    ashLow.setChecked(false);
                    ashHigh.setChecked(false);
                    ashPresent.setChecked(true);
                    ash = 1;
                    ashAbundance = "Medium";
                }
            }
        });
        ashHigh = (CheckBox) findViewById(R.id.ashHigh);
        ashHigh.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                boolean isCheckedashPresent = ((CheckBox) findViewById(R.id.ashPresent)).isChecked();
                boolean isCheckedashHigh = ((CheckBox) findViewById(R.id.ashHigh)).isChecked();

                if (isCheckedashPresent == true && isCheckedashHigh == true) {
                    ashMedium.setChecked(false);
                    ashLow.setChecked(false);
                    ash = 1;
                    ashAbundance = "High";
                }
                else if (isCheckedashPresent == false && isCheckedashHigh == true){
                    ashMedium.setChecked(false);
                    ashLow.setChecked(false);
                    ashPresent.setChecked(true);
                    ash = 1;
                    ashAbundance = "High";
                }
            }
        });

        eabPresent = (CheckBox) findViewById(R.id.eabPresent);
        eabPresent.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                boolean isCheckedeabPresent = ((CheckBox) findViewById(R.id.eabPresent)).isChecked();

                if (isCheckedeabPresent == false) {
                    eabLow.setChecked(false);
                    eabModerate.setChecked(false);
                    eabSevere.setChecked(false);
                    eab = 0;
                    eabSeverity = "None";
                }
            }
        });
        eabLow = (CheckBox) findViewById(R.id.eabLow);
        eabLow.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                boolean isCheckedeabPresent = ((CheckBox) findViewById(R.id.eabPresent)).isChecked();
                boolean isCheckedeabLow = ((CheckBox) findViewById(R.id.eabLow)).isChecked();

                if (isCheckedeabPresent == true && isCheckedeabLow == true) {
                    eabModerate.setChecked(false);
                    eabSevere.setChecked(false);
                    eab = 1;
                    eabSeverity = "Low";
                }
                else if (isCheckedeabPresent == false && isCheckedeabLow == true){
                    eabModerate.setChecked(false);
                    eabSevere.setChecked(false);
                    eabPresent.setChecked(true);
                    eab = 1;
                    eabSeverity = "Low";
                }
            }
        });
        eabModerate = (CheckBox) findViewById(R.id.eabModerate);
        eabModerate.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                boolean isCheckedeabPresent = ((CheckBox) findViewById(R.id.eabPresent)).isChecked();
                boolean isCheckedeabModerate = ((CheckBox) findViewById(R.id.eabModerate)).isChecked();

                if (isCheckedeabPresent == true && isCheckedeabModerate == true) {
                    eabLow.setChecked(false);
                    eabSevere.setChecked(false);
                    eab = 1;
                    eabSeverity = "Moderate";
                }
                else if (isCheckedeabPresent == false && isCheckedeabModerate == true){
                    eabLow.setChecked(false);
                    eabSevere.setChecked(false);
                    eabPresent.setChecked(true);
                    eab = 1;
                    eabSeverity = "Moderate";
                }
            }
        });
        eabSevere = (CheckBox) findViewById(R.id.eabSevere);
        eabSevere.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                boolean isCheckedeabPresent = ((CheckBox) findViewById(R.id.eabPresent)).isChecked();
                boolean isCheckedeabSevere= ((CheckBox) findViewById(R.id.eabSevere)).isChecked();

                if (isCheckedeabPresent == true && isCheckedeabSevere == true) {
                    eabModerate.setChecked(false);
                    eabLow.setChecked(false);
                    eab = 1;
                    eabSeverity = "Severe";
                }
                else if (isCheckedeabPresent == false && isCheckedeabSevere == true){
                    eabModerate.setChecked(false);
                    eabLow.setChecked(false);
                    eabPresent.setChecked(true);
                    eab = 1;
                    eabSeverity = "Severe";
                }
            }
        });

        //seedling Cover
        //Pests and Pathogens
        ten = (CheckBox) findViewById(R.id.checkBoxTen);
        ten.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                boolean isCheckedTen = ((CheckBox) findViewById(R.id.checkBoxTen)).isChecked();

                if (isCheckedTen == true) {
                    tenTwentyFive.setChecked(false);
                    twentyFiveFifty.setChecked(false);
                    fiftySeventyFive.setChecked(false);
                    seventyFiveNinety.setChecked(false);
                    ninety.setChecked(false);
                }
            }
        });

        tenTwentyFive = (CheckBox) findViewById(R.id.checkBoxTenTwentyFive);
        tenTwentyFive.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                boolean isCheckedtenTwentyFive = ((CheckBox) findViewById(R.id.checkBoxTenTwentyFive)).isChecked();

                if (isCheckedtenTwentyFive == true) {
                    ten.setChecked(false);
                    twentyFiveFifty.setChecked(false);
                    fiftySeventyFive.setChecked(false);
                    seventyFiveNinety.setChecked(false);
                    ninety.setChecked(false);
                }
            }
        });

        twentyFiveFifty = (CheckBox) findViewById(R.id.checkBoxTwentyFiveFifty);
        twentyFiveFifty.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                boolean isCheckedtwentyFiveFifty = ((CheckBox) findViewById(R.id.checkBoxTwentyFiveFifty)).isChecked();

                if (isCheckedtwentyFiveFifty == true) {
                    ten.setChecked(false);
                    tenTwentyFive.setChecked(false);
                    fiftySeventyFive.setChecked(false);
                    seventyFiveNinety.setChecked(false);
                    ninety.setChecked(false);
                }
            }
        });

        fiftySeventyFive = (CheckBox) findViewById(R.id.checkBoxFiftySeventyFive);
        fiftySeventyFive.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                boolean isCheckedfiftySeventyFive = ((CheckBox) findViewById(R.id.checkBoxFiftySeventyFive)).isChecked();

                if (isCheckedfiftySeventyFive == true) {
                    ten.setChecked(false);
                    tenTwentyFive.setChecked(false);
                    twentyFiveFifty.setChecked(false);
                    seventyFiveNinety.setChecked(false);
                    ninety.setChecked(false);
                }
            }
        });

        seventyFiveNinety = (CheckBox) findViewById(R.id.checkBoxSeventyFiveNinety);
        seventyFiveNinety.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                boolean isCheckedseventyFiveNinety = ((CheckBox) findViewById(R.id.checkBoxSeventyFiveNinety)).isChecked();

                if (isCheckedseventyFiveNinety == true) {
                    ten.setChecked(false);
                    tenTwentyFive.setChecked(false);
                    twentyFiveFifty.setChecked(false);
                    fiftySeventyFive.setChecked(false);
                    ninety.setChecked(false);
                }
            }
        });

        ninety = (CheckBox) findViewById(R.id.checkBoxNinety);
        ninety.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                boolean isCheckedninety = ((CheckBox) findViewById(R.id.checkBoxNinety)).isChecked();

                if (isCheckedninety == true) {
                    ten.setChecked(false);
                    tenTwentyFive.setChecked(false);
                    twentyFiveFifty.setChecked(false);
                    fiftySeventyFive.setChecked(false);
                    seventyFiveNinety.setChecked(false);
                }
            }
        });

    }

    public void updateButtonPressed(){
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
        boolean isCheckedB = ((CheckBox) findViewById(R.id.checkBox12B)).isChecked();
        boolean isCheckedC = ((CheckBox) findViewById(R.id.checkBox12C)).isChecked();
        boolean isCheckedD = ((CheckBox) findViewById(R.id.checkBox12D)).isChecked();
        boolean isCheckedE = ((CheckBox) findViewById(R.id.checkBox12E)).isChecked();

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

    // total points and quality rank
    public void totalPoints(){
        total = point1A + point1B + point2A + point2B + point3A + point3B + point4A + point4B + point5A + point5B + point6A + point6B + point7 + point8 + point9 + point10 + point11 + point12;
        if(total >= 0 && total <= 4){
            qualityRank = "Low";
        }
        else if (total >= 5 && total <= 9){
            qualityRank = "Medium Low";
        }
        else if (total >= 10 && total <= 13){
            qualityRank = "Medium";
        }
        else if (total >= 14 && total <= 16){
            qualityRank = "Medium High";
        }
        else if (total >= 17 && total <= 18){
            qualityRank = "High";
        }
    }


    //Instance of open helper
    //RUFAdbOpenHelper dbhelp = new RUFAdbOpenHelper(getApplicationContext());

    //instance of modifier
    //RUFAdbModifier modifier = new RUFAdbModifier();
    //boolean ret = modifier.insertRow(getApplicationContext(),dbhelp.getKeyList(),getValues());

    //public boolean saveData(){
        //save extra data to flat file

        //export to csv

        //save to internal

        //return modifier.insertRow(getApplicationContext(),dbhelp.getKeyList(),getValues());

    //}

    // arrayList of data
    public ArrayList<Holder<Object>> getValues(){
        ArrayList list = new ArrayList(97);
        list.add(new Holder<Object>(getCellValue(),0));
        list.add(new Holder<Object>(getDateValue(),0));
        list.add(new Holder<Object>(getScorerValue(),0));
        list.add(new Holder<Object>(NW1Anumber,1));
        list.add(new Holder<Object>(NE1Anumber,1));
        list.add(new Holder<Object>(SE1Anumber,1));
        list.add(new Holder<Object>(SW1Anumber,1));
        list.add(new Holder<Object>(sum1A,1));
        list.add(new Holder<Object>(point1A,1));
        list.add(new Holder<Object>(NW1Bnumber,1));
        list.add(new Holder<Object>(NE1Bnumber,1));
        list.add(new Holder<Object>(SE1Bnumber,1));
        list.add(new Holder<Object>(SW1Bnumber,1));
        list.add(new Holder<Object>(sum1B,1));
        list.add(new Holder<Object>(point1B,1));
        list.add(new Holder<Object>(NW2Anumber,1));
        list.add(new Holder<Object>(NE2Anumber,1));
        list.add(new Holder<Object>(SE2Anumber,1));
        list.add(new Holder<Object>(SW2Anumber,1));
        list.add(new Holder<Object>(sum2A,1));
        list.add(new Holder<Object>(point2A,1));
        list.add(new Holder<Object>(NW2Bnumber,1));
        list.add(new Holder<Object>(NE2Bnumber,1));
        list.add(new Holder<Object>(SE2Bnumber,1));
        list.add(new Holder<Object>(SW2Bnumber,1));
        list.add(new Holder<Object>(sum2B,1));
        list.add(new Holder<Object>(point2B,1));
        list.add(new Holder<Object>(NW3Anumber,1));
        list.add(new Holder<Object>(NE3Anumber,1));
        list.add(new Holder<Object>(SE3Anumber,1));
        list.add(new Holder<Object>(SW3Anumber,1));
        list.add(new Holder<Object>(sum3A,1));
        list.add(new Holder<Object>(point3A,1));
        list.add(new Holder<Object>(selected3B,0));
        list.add(new Holder<Object>(selected3BDominant1,0));
        list.add(new Holder<Object>(selected3BDominant2,0));
        list.add(new Holder<Object>(sum3B,1));
        list.add(new Holder<Object>(point3B,1));
        list.add(new Holder<Object>(NW4Anumber,1));
        list.add(new Holder<Object>(NE4Anumber,1));
        list.add(new Holder<Object>(SE4Anumber,1));
        list.add(new Holder<Object>(SW4Anumber,1));
        list.add(new Holder<Object>(sum4A,1));
        list.add(new Holder<Object>(point4A,1));
        list.add(new Holder<Object>(selected4B,0));
        list.add(new Holder<Object>(sum4B,1));
        list.add(new Holder<Object>(point4B,1));
        list.add(new Holder<Object>(NW5Anumber,1));
        list.add(new Holder<Object>(NE5Anumber,1));
        list.add(new Holder<Object>(SE5Anumber,1));
        list.add(new Holder<Object>(SW5Anumber,1));
        list.add(new Holder<Object>(sum5A,1));
        list.add(new Holder<Object>(point5A,1));
        list.add(new Holder<Object>(NW5Bnumber,1));
        list.add(new Holder<Object>(NE5Bnumber,1));
        list.add(new Holder<Object>(SE5Bnumber,1));
        list.add(new Holder<Object>(SW5Bnumber,1));
        list.add(new Holder<Object>(sum5B,1));
        list.add(new Holder<Object>(point5B,1));
        list.add(new Holder<Object>(NW6Anumber,1));
        list.add(new Holder<Object>(NE6Anumber,1));
        list.add(new Holder<Object>(SE6Anumber,1));
        list.add(new Holder<Object>(SW6Anumber,1));
        list.add(new Holder<Object>(sum6A,1));
        list.add(new Holder<Object>(point6A,1));
        list.add(new Holder<Object>(NW6Bnumber,1));
        list.add(new Holder<Object>(NE6Bnumber,1));
        list.add(new Holder<Object>(SE6Bnumber,1));
        list.add(new Holder<Object>(SW6Bnumber,1));
        list.add(new Holder<Object>(sum6B,1));
        list.add(new Holder<Object>(point6B,1));
        list.add(new Holder<Object>(point7,1));
        list.add(new Holder<Object>(point8,1));
        list.add(new Holder<Object>(point9,1));
        list.add(new Holder<Object>(point10,1));
        list.add(new Holder<Object>(point11,1));
        list.add(new Holder<Object>(pointBoxA,1));
        list.add(new Holder<Object>(pointBoxB,1));
        list.add(new Holder<Object>(pointBoxD,1));
        list.add(new Holder<Object>(pointBoxC,1));
        list.add(new Holder<Object>(pointBoxE,1));
        list.add(new Holder<Object>(total12,1));
        list.add(new Holder<Object>(point12,1));
        list.add(new Holder<Object>(total,1));
        list.add(new Holder<Object>(qualityRank,0));
        list.add(new Holder<Object>(beech,1));
        list.add(new Holder<Object>(bld,1));
        list.add(new Holder<Object>(bldSeverity,0));
        list.add(new Holder<Object>(beechAbundance,0));
        list.add(new Holder<Object>(ash,1));
        list.add(new Holder<Object>(eab,1));
        list.add(new Holder<Object>(eabSeverity,0));
        list.add(new Holder<Object>(ashAbundance,0));
        list.add(null);
        list.add(null);
        list.add(null);
        list.add(null);
        return list;
    }
}
