package com.example.rufaapp;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Entity;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.view.View.OnClickListener;


import com.google.gson.JsonObject;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.jar.Manifest;

public class MainActivity extends AppCompatActivity {
    private RUFASheetData data = new RUFASheetData();

    //Save button
    private Button saveButton;
    //load button
    private Button loadButton;
    //save to csv button
    private Button saveToSDCard;
    //file selection
    private String fileName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        saveButton = (Button) findViewById(R.id.saveData);
        saveButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                updateButtonPressed();
                saveSheetData(data);
            }
        });

        loadButton = (Button) findViewById(R.id.loadData);
        loadButton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                loadSheetData(v);
            }
        });

        saveToSDCard = (Button) findViewById(R.id.SaveCSV);
        saveToSDCard.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v){
                int permCheck = ContextCompat.checkSelfPermission(getApplicationContext(), android.Manifest.permission.WRITE_EXTERNAL_STORAGE);
                int permGranted = PackageManager.PERMISSION_GRANTED;
                if(permCheck != permGranted){
                    ActivityCompat.requestPermissions(getParent(),new String[]{android.Manifest.permission.WRITE_EXTERNAL_STORAGE},5);
                }else{
                    updateButtonPressed();
                    saveToCSV();
                }
            }
        });

        data.NW1A = (EditText) findViewById(R.id.NW1A);
        data.NW1A.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                updateButtonPressed();
            }
        });

        data.SW1A = (EditText) findViewById(R.id.SW1A);
        data.SW1A.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                updateButtonPressed();
            }
        });

        data.NE1A = (EditText) findViewById(R.id.NE1A);
        data.NE1A.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                updateButtonPressed();
            }
        });

        data.SE1A = (EditText) findViewById(R.id.SE1A);
        data.SE1A.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                updateButtonPressed();
            }
        });

        data.NW1B = (EditText) findViewById(R.id.NW1B);
        data.NW1B.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                updateButtonPressed();
            }
        });

        data.SW1B = (EditText) findViewById(R.id.SW1B);
        data.SW1B.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                updateButtonPressed();
            }
        });

        data.NE1B = (EditText) findViewById(R.id.NE1B);
        data.NE1B.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                updateButtonPressed();
            }
        });

        data.SE1B = (EditText) findViewById(R.id.SE1B);
        data.SE1B.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                updateButtonPressed();
            }
        });

        data.NW2A = (EditText) findViewById(R.id.NW2A);
        data.NW2A.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                updateButtonPressed();
            }
        });

        data.SW2A = (EditText) findViewById(R.id.SW2A);
        data.SW2A.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                updateButtonPressed();
            }
        });

        data.NE2A = (EditText) findViewById(R.id.NE2A);
        data.NE2A.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                updateButtonPressed();
            }
        });

        data.SE2A = (EditText) findViewById(R.id.SE2A);
        data.SE2A.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                updateButtonPressed();
            }
        });

        data.NW2B = (EditText) findViewById(R.id.NW2B);
        data.NW2B.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                updateButtonPressed();
            }
        });

        data.SW2B = (EditText) findViewById(R.id.SW2B);
        data.SW2B.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                updateButtonPressed();
            }
        });

        data.NE2B = (EditText) findViewById(R.id.NE2B);
        data.NE2B.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                updateButtonPressed();
            }
        });

        data.SE2B = (EditText) findViewById(R.id.SE2B);
        data.SE2B.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                updateButtonPressed();
            }
        });

        data.NW3A = (EditText) findViewById(R.id.NW3A);
        data.NW3A.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                updateButtonPressed();
            }
        });

        data.SW3A = (EditText) findViewById(R.id.SW3A);
        data.SW3A.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                updateButtonPressed();
            }
        });

        data.NE3A = (EditText) findViewById(R.id.NE3A);
        data.NE3A.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                updateButtonPressed();
            }
        });

        data.SE3A = (EditText) findViewById(R.id.SE3A);
        data.SE3A.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                updateButtonPressed();
            }
        });

        data.addDominant3B1 = (Button) findViewById(R.id.addDominant3B1);
        data.addDominant3B1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                data.addTreeToDominant3B1 = (TextView) findViewById(R.id.dominant3B1);
                data.modifyAdd3B = data.addTreeToDominant3B1.getText().toString();
                data.addTreeToDominant3B1.setText(data.selected3B);
                data.dominant3B1 = data.selected3B;
            }
        });

        data.addDominant3B2 = (Button) findViewById(R.id.addDominant3B2);
        data.addDominant3B2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                data.addTreeToDominant3B2 = (TextView) findViewById(R.id.dominant3B2);
                data.modifyAdd3B = data.addTreeToDominant3B2.getText().toString();
                data.addTreeToDominant3B2.setText(data.selected3B);
                data.dominant3B2 = data.selected3B;
            }
        });

        data.add3B = (Button) findViewById(R.id.addTree3B);
        data.add3B.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                    data.addTreeToList3B = (TextView) findViewById(R.id.listOfTrees3B);
                    data.modifyAdd3B = data.addTreeToList3B.getText().toString();
                    data.addTreeToList3B.setText(data.selected3B + " " + data.modifyAdd3B);
                    data.list3B = data.addTreeToList3B.getText().toString();
                    data.sum3B++;
                    updateButtonPressed();
            }
        });

        data.clear3B = (Button) findViewById(R.id.clear3B);
        data.clear3B.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                data.addTreeToList3B = (TextView) findViewById(R.id.listOfTrees3B);
                data.modifyAdd3B = data.addTreeToList3B.getText().toString();
                data.list3B = "";
                data.sum3B = 0;
                data.addTreeToList3B.setText(data.list3B);

                data.addTreeToDominant3B1 = (TextView) findViewById(R.id.dominant3B1);
                data.modifyAdd3B = data.addTreeToDominant3B1.getText().toString();
                data.dominant3B1 = "";
                data.addTreeToDominant3B1.setText(data.dominant3B1);

                data.addTreeToDominant3B2 = (TextView) findViewById(R.id.dominant3B2);
                data.modifyAdd3B = data.addTreeToDominant3B2.getText().toString();
                data.dominant3B2 = "";
                data.addTreeToDominant3B2.setText(data.dominant3B2);

                updateButtonPressed();
            }
        });

        data.tree_types3B = (Spinner) findViewById(R.id.tree_types_spinner3B);
        data.tree_types3B.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                if (data.selected3B == null) {
                    data.selected3B = "AMBE";
                    data.sum3B = 0;
                } else{
                    data.selected3B = adapterView.getSelectedItem().toString();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        data.NW4A = (EditText) findViewById(R.id.NW4A);
        data.NW4A.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                updateButtonPressed();
            }
        });

        data.SW4A = (EditText) findViewById(R.id.SW4A);
        data.SW4A.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                updateButtonPressed();
            }
        });

        data.NE4A = (EditText) findViewById(R.id.NE4A);
        data.NE4A.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                updateButtonPressed();
            }
        });

        data.SE4A = (EditText) findViewById(R.id.SE4A);
        data.SE4A.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                updateButtonPressed();
            }
        });

        data.addDominant4B1 = (Button) findViewById(R.id.addDominant4B1);
        data.addDominant4B1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                data.addTreeToDominant4B1 = (TextView) findViewById(R.id.dominant4B1);
                data.modifyAdd4B = data.addTreeToDominant4B1.getText().toString();
                data.addTreeToDominant4B1.setText(data.selected4B);
                data.dominant4B1 = data.selected4B;
            }
        });

        data.addDominant4B2 = (Button) findViewById(R.id.addDominant4B2);
        data.addDominant4B2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                data.addTreeToDominant4B2 = (TextView) findViewById(R.id.dominant4B2);
                data.modifyAdd4B = data.addTreeToDominant4B2.getText().toString();
                data.addTreeToDominant4B2.setText(data.selected4B);
                data.dominant4B2 = data.selected4B;

            }
        });

        data.add4B = (Button) findViewById(R.id.addTree4B);
        data.add4B.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                data.addTreeToList4B = (TextView) findViewById(R.id.listOfTrees4B);
                data.modifyAdd4B = data.addTreeToList4B.getText().toString();
                data.addTreeToList4B.setText(data.selected4B + " " + data.modifyAdd4B);
                data.list4B = data.addTreeToList4B.getText().toString();
                data.sum4B++;
                updateButtonPressed();

            }
        });

        data.clear4B = (Button) findViewById(R.id.clear4B);
        data.clear4B.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                data.addTreeToList4B = (TextView) findViewById(R.id.listOfTrees4B);
                data.modifyAdd4B = data.addTreeToList4B.getText().toString();
                data.list4B = "";
                data.sum4B = 0;
                data.addTreeToList4B.setText(data.list4B);

                data.addTreeToDominant4B1 = (TextView) findViewById(R.id.dominant4B1);
                data.modifyAdd4B = data.addTreeToDominant4B1.getText().toString();
                data.dominant4B1 = "";
                data.addTreeToDominant4B1.setText(data.dominant4B1);

                data.addTreeToDominant4B2 = (TextView) findViewById(R.id.dominant4B2);
                data.modifyAdd4B = data.addTreeToDominant4B2.getText().toString();
                data.dominant4B2 = "";
                data.addTreeToDominant4B2.setText(data.dominant4B2);

                updateButtonPressed();
            }
        });

        data.tree_types4B = (Spinner) findViewById(R.id.tree_types_spinner4B);
        data.tree_types4B.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

                if (data.selected4B == null) {
                    data.selected4B = "AMBE";
                    data.sum4B = 0;
                } else{
                    data.selected4B = adapterView.getSelectedItem().toString();
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });

        data.NW5A = (EditText) findViewById(R.id.NW5A);
        data.NW5A.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                updateButtonPressed();
            }
        });

        data.SW5A = (EditText) findViewById(R.id.SW5A);
        data.SW5A.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                updateButtonPressed();
            }
        });

        data.NE5A = (EditText) findViewById(R.id.NE5A);
        data.NE5A.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                updateButtonPressed();
            }
        });

        data.SE5A = (EditText) findViewById(R.id.SE5A);
        data.SE5A.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                updateButtonPressed();
            }
        });

        data.NW5B = (EditText) findViewById(R.id.NW5B);
        data.NW5B.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                updateButtonPressed();
            }
        });

        data.SW5B = (EditText) findViewById(R.id.SW5B);
        data.SW5B.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                updateButtonPressed();
            }
        });

        data.NE5B = (EditText) findViewById(R.id.NE5B);
        data.NE5B.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                updateButtonPressed();
            }
        });

        data.SE5B = (EditText) findViewById(R.id.SE5B);
        data.SE5B.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                updateButtonPressed();
            }
        });

        data.NW6A = (EditText) findViewById(R.id.NW6A);
        data.NW6A.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                updateButtonPressed();
            }
        });

        data.SW6A = (EditText) findViewById(R.id.SW6A);
        data.SW6A.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                updateButtonPressed();
            }
        });

        data.NE6A = (EditText) findViewById(R.id.NE6A);
        data.NE6A.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                updateButtonPressed();
            }
        });

        data.SE6A = (EditText) findViewById(R.id.SE6A);
        data.SE6A.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                updateButtonPressed();
            }
        });

        data.NW6B = (EditText) findViewById(R.id.NW6B);
        data.NW6B.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                updateButtonPressed();
            }
        });

        data.SW6B = (EditText) findViewById(R.id.SW6B);
        data.SW6B.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                updateButtonPressed();
            }
        });

        data.NE6B = (EditText) findViewById(R.id.NE6B);
        data.NE6B.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                updateButtonPressed();
            }
        });

        data.SE6B = (EditText) findViewById(R.id.SE6B);
        data.SE6B.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            @Override
            public void onFocusChange(View view, boolean b) {
                updateButtonPressed();
            }
        });

        //No observed invasive plants
        data.noObservedInvasivePlants = (CheckBox) findViewById(R.id.checkBox7);
        data.noObservedInvasivePlants.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                updateButtonPressed();
            }
        });

        //healthy light gaps
        data.healthyLightGaps = (CheckBox) findViewById(R.id.checkBox8);
        data.healthyLightGaps.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                updateButtonPressed();
            }
        });

        //microtopography
        data.microtopography = (CheckBox) findViewById(R.id.checkBox9);
        data.microtopography.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                updateButtonPressed();
            }
        });

        //absence of human activity
        data.absenceOfHumanActivity = (CheckBox) findViewById(R.id.checkBox10);
        data.absenceOfHumanActivity.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                updateButtonPressed();
            }
        });

        //absence of deer browse line
        data.absenceOfDeerBrowseLine = (CheckBox) findViewById(R.id.checkBox11);
        data.absenceOfDeerBrowseLine.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                updateButtonPressed();
            }
        });

        //section 12
        data.a12 = (CheckBox) findViewById(R.id.checkBox12A);
        data.a12.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                updateButtonPressed();
            }
        });
        data.b12 = (CheckBox) findViewById(R.id.checkBox12B);
        data.b12.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                updateButtonPressed();
            }
        });
        data.c12 = (CheckBox) findViewById(R.id.checkBox12C);
        data.c12.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                updateButtonPressed();
            }
        });
        data.d12 = (CheckBox) findViewById(R.id.checkBox12D);
        data.d12.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                updateButtonPressed();
            }
        });
        data.e12 = (CheckBox) findViewById(R.id.checkBox12E);
        data.e12.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                updateButtonPressed();
            }
        });

        //plant community
        data.addPlantCommunity = (Button) findViewById(R.id.select_community_type);
        data.addPlantCommunity.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                data.otherPlantCommunity = (EditText) findViewById(R.id.otherPlantCommunity);
                data.addTreeToListPlantCommunity = (TextView) findViewById(R.id.community_type_value);

                if (data.selectedPlantCommunity.equals("Other")){
                    data.otherPlantCommunity.setVisibility(View.VISIBLE);
                    data.addTreeToListPlantCommunity.setVisibility(View.INVISIBLE);
                    data.otherPlantCommunityInput = data.otherPlantCommunity.getText().toString();
                }else {
                    data.addTreeToListPlantCommunity.setVisibility(View.VISIBLE);
                    data.otherPlantCommunity.setVisibility(View.INVISIBLE);
                    data.modifyCommunityType = data.addTreeToListPlantCommunity.getText().toString();
                    data.addTreeToListPlantCommunity.setText(data.selectedPlantCommunity);
                }
            }
        });

        data.clearPlantCommunity = (Button) findViewById(R.id.clear_community_type);
        data.clearPlantCommunity.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                data.otherPlantCommunity = (EditText) findViewById(R.id.otherPlantCommunity);
                data.addTreeToListPlantCommunity = (TextView) findViewById(R.id.community_type_value);
                data.otherPlantCommunity.setVisibility(View.INVISIBLE);
                data.addTreeToListPlantCommunity.setVisibility(View.INVISIBLE);
                data.otherPlantCommunity.setText("");
                data.otherPlantCommunityInput = "";
            }
        });

        data.plant_community = (Spinner) findViewById(R.id.community_type_spinner);
        data.plant_community.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                data.otherPlantCommunity = (EditText) findViewById(R.id.otherPlantCommunity);
                data.addTreeToListPlantCommunity = (TextView) findViewById(R.id.community_type_value);

                if (data.selectedPlantCommunity == null) {
                    data.selectedPlantCommunity = "Beech-Maple";
                    data.otherPlantCommunity.setVisibility(View.INVISIBLE);
                    data.addTreeToListPlantCommunity.setVisibility(View.INVISIBLE);
                } else {
                    data.selectedPlantCommunity = adapterView.getSelectedItem().toString();
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });

        data.prevConfirmedType = (CheckBox) findViewById(R.id.checkBoxPreviouslyConfirmed);
        data.prevConfirmedType.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                boolean isCheckedYesPrevConfirmedType = ((CheckBox) findViewById(R.id.checkBoxPreviouslyConfirmed)).isChecked();

                if (isCheckedYesPrevConfirmedType == true) {
                    data.prevConfirmed = 1;
                }
                else{
                    data.prevConfirmed = 0;
                }
            }
        });

        data.groundTruthedType = (CheckBox) findViewById(R.id.checkBoxGroundTruthed);
        data.groundTruthedType.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                boolean isCheckedGroundTruthed = ((CheckBox) findViewById(R.id.checkBoxGroundTruthed)).isChecked();

                if (isCheckedGroundTruthed == true) {
                    data.groundTruthed = 1;
                }
                else{
                    data.groundTruthed = 0;
                }
            }
        });

        //bearing changes
        data.yesBearingChanges = (CheckBox) findViewById(R.id.checkBoxYesBearingChanged);
        data.yesBearingChanges.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                boolean isCheckedYesBearingChanges = ((CheckBox) findViewById(R.id.checkBoxYesBearingChanged)).isChecked();

                if (isCheckedYesBearingChanges == true) {
                    data.noBearingChanges.setChecked(false);
                    data.bearingChange = 1;
                }
            }
        });

        data.noBearingChanges = (CheckBox) findViewById(R.id.checkBoxNoBearingChange);
        data.noBearingChanges.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                boolean isCheckedNoBearingChanges = ((CheckBox) findViewById(R.id.checkBoxNoBearingChange)).isChecked();

                if (isCheckedNoBearingChanges == true) {
                    data.yesBearingChanges.setChecked(false);
                    data.bearingChange = 0;
                }
            }
        });

        //light gaps
        data.diameterA = (EditText) findViewById(R.id.lightGapInputA);
        String diameterANum = data.diameterA.getText().toString();
        if (diameterANum.equals("")) {
            data.diameterAVal = 0;
        } else {
            data.diameterAVal = Integer.parseInt(diameterANum);
        }

        data.diameterB = (EditText) findViewById(R.id.lightGapInputB);
        String diameterBNum = data.diameterB.getText().toString();
        if (diameterBNum.equals("")) {
            data.diameterBVal = 0;
        } else {
            data.diameterBVal = Integer.parseInt(diameterBNum);
        }

        data.diameterC = (EditText) findViewById(R.id.lightGapInputC);
        String diameterCNum = data.diameterC.getText().toString();
        if (diameterCNum.equals("")) {
            data.diameterCVal = 0;
        } else {
            data.diameterCVal = Integer.parseInt(diameterCNum);
        }

        data.diameterD = (EditText) findViewById(R.id.lightGapInputD);
        String diameterDNum = data.diameterD.getText().toString();
        if (diameterDNum.equals("")) {
            data.diameterDVal = 0;
        } else {
            data.diameterDVal = Integer.parseInt(diameterDNum);
        }

        data.invadedA = (CheckBox) findViewById(R.id.checkBoxInvadedA);
        data.invadedA.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                boolean isCheckedInvadedA = ((CheckBox) findViewById(R.id.checkBoxInvadedA)).isChecked();

                if (isCheckedInvadedA == true) {
                    data.invadedAVal = 1;
                }
                else
                    data.invadedAVal = 0;
            }
        });

        data.invadedB = (CheckBox) findViewById(R.id.checkBoxInvadedB);
        data.invadedB.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                boolean isCheckedInvadedB = ((CheckBox) findViewById(R.id.checkBoxInvadedB)).isChecked();

                if (isCheckedInvadedB == true) {
                    data.invadedBVal = 1;
                }
                else
                    data.invadedBVal = 0;
            }
        });

        data.invadedC = (CheckBox) findViewById(R.id.checkBoxInvadedC);
        data.invadedC.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                boolean isCheckedInvadedC = ((CheckBox) findViewById(R.id.checkBoxInvadedC)).isChecked();

                if (isCheckedInvadedC == true) {
                    data.invadedCVal = 1;
                }
                else
                    data.invadedCVal = 0;
            }
        });

        data.invadedD = (CheckBox) findViewById(R.id.checkBoxInvadedD);
        data.invadedD.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                boolean isCheckedInvadedD = ((CheckBox) findViewById(R.id.checkBoxInvadedD)).isChecked();

                if (isCheckedInvadedD == true) {
                    data.invadedDVal = 1;
                }
                else
                    data.invadedDVal = 0;
            }
        });

        data.grapevineA = (CheckBox) findViewById(R.id.checkBoxGrapevineA);
        data.grapevineA.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                boolean isCheckedgrapevineA = ((CheckBox) findViewById(R.id.checkBoxGrapevineA)).isChecked();

                if (isCheckedgrapevineA == true) {
                    data.grapevineAVal = 1;
                }
                else
                    data.grapevineAVal = 0;
            }
        });

        data.grapevineB = (CheckBox) findViewById(R.id.checkBoxGrapevineB);
        data.grapevineB.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                boolean isCheckedgrapevineB = ((CheckBox) findViewById(R.id.checkBoxGrapevineB)).isChecked();

                if (isCheckedgrapevineB == true) {
                    data.grapevineBVal = 1;
                }
                else
                    data.grapevineBVal = 0;
            }
        });

        data.grapevineC = (CheckBox) findViewById(R.id.checkBoxGrapevineC);
        data.grapevineC.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                boolean isCheckedgrapevineC = ((CheckBox) findViewById(R.id.checkBoxGrapevineC)).isChecked();

                if (isCheckedgrapevineC == true) {
                    data.grapevineCVal = 1;
                }
                else
                    data.grapevineCVal = 0;
            }
        });

        data.grapevineD = (CheckBox) findViewById(R.id.checkBoxGrapevineD);
        data.grapevineD.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                boolean isCheckedgrapevineD = ((CheckBox) findViewById(R.id.checkBoxGrapevineD)).isChecked();

                if (isCheckedgrapevineD == true) {
                    data.grapevineDVal = 1;
                }
                else
                    data.grapevineDVal = 0;
            }
        });

        data.regeneratingA = (CheckBox) findViewById(R.id.checkBoxRegeneratingA);
        data.regeneratingA.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                boolean isCheckedregeneratingA = ((CheckBox) findViewById(R.id.checkBoxRegeneratingA)).isChecked();

                if (isCheckedregeneratingA == true) {
                    data.regeneratingAVal = 1;
                }
                else
                    data.regeneratingAVal = 0;
            }
        });

        data.regeneratingB = (CheckBox) findViewById(R.id.checkBoxRegeneratingB);
        data.regeneratingB.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                boolean isCheckedregeneratingB = ((CheckBox) findViewById(R.id.checkBoxRegeneratingB)).isChecked();

                if (isCheckedregeneratingB == true) {
                    data.regeneratingBVal = 1;
                }
                else
                    data.regeneratingBVal = 0;
            }
        });

        data.regeneratingC = (CheckBox) findViewById(R.id.checkBoxRegeneratingC);
        data.regeneratingC.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                boolean isCheckedregeneratingC = ((CheckBox) findViewById(R.id.checkBoxRegeneratingC)).isChecked();

                if (isCheckedregeneratingC == true) {
                    data.regeneratingCVal = 1;
                }
                else
                    data.regeneratingCVal = 0;
            }
        });

        data.regeneratingD = (CheckBox) findViewById(R.id.checkBoxRegeneratingD);
        data.regeneratingD.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                boolean isCheckedregeneratingD = ((CheckBox) findViewById(R.id.checkBoxRegeneratingD)).isChecked();

                if (isCheckedregeneratingD == true) {
                    data.regeneratingDVal = 1;
                }
                else
                    data.regeneratingDVal = 0;
            }
        });

        //Past Land Use Evidence
        data.noneEvident = (CheckBox) findViewById(R.id.checkBoxNone);
        data.noneEvident.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                boolean isCheckedNone = ((CheckBox) findViewById(R.id.checkBoxNone)).isChecked();

                if (isCheckedNone == true) {
                    data.deadFurrows.setChecked(false);
                    data.cutStumps.setChecked(false);
                    data.dumpSite.setChecked(false);
                    data.oldRoad.setChecked(false);
                    data.improvedTrail.setChecked(false);
                    data.other.setChecked(false);
                    data.noneEvidentval = 1;
                    data.deadFurrowsval = 0;
                    data.cutStumpsval = 0;
                    data.dumpSiteval = 0;
                    data.oldRoadval = 0;
                    data.improvedTrailval = 0;
                    data.otherval = 0;
                }
            }
        });

        data.deadFurrows = (CheckBox) findViewById(R.id.checkBoxDeadFurrows);
        data.deadFurrows.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                boolean isCheckedDeadFurrows = ((CheckBox) findViewById(R.id.checkBoxDeadFurrows)).isChecked();

                if (isCheckedDeadFurrows == true) {
                    data.noneEvident.setChecked(false);
                    data.noneEvidentval = 0;
                    data.deadFurrowsval = 1;
                }
            }
        });

        data.cutStumps = (CheckBox) findViewById(R.id.checkBoxCutStumps);
        data.cutStumps.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                boolean isCheckedCutStumps = ((CheckBox) findViewById(R.id.checkBoxCutStumps)).isChecked();

                if (isCheckedCutStumps == true) {
                    data.noneEvident.setChecked(false);
                    data.noneEvidentval = 0;
                    data.cutStumpsval = 1;
                }
            }
        });

        data.dumpSite = (CheckBox) findViewById(R.id.checkBoxDumpSite);
        data.dumpSite.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                boolean isCheckedDumpSite = ((CheckBox) findViewById(R.id.checkBoxDumpSite)).isChecked();

                if (isCheckedDumpSite == true) {
                    data.noneEvident.setChecked(false);
                    data.noneEvidentval = 0;
                    data.dumpSiteval = 1;
                }
            }
        });

        data.oldRoad = (CheckBox) findViewById(R.id.checkBoxoldRoad);
        data.oldRoad.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                boolean isCheckedOldRoad = ((CheckBox) findViewById(R.id.checkBoxoldRoad)).isChecked();

                if (isCheckedOldRoad == true) {
                    data.noneEvident.setChecked(false);
                    data.noneEvidentval = 0;
                    data.oldRoadval = 1;
                }
            }
        });

        data.improvedTrail = (CheckBox) findViewById(R.id.checkBoxImprovedTrail);
        data.improvedTrail.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                boolean isCheckedImprovedTrail = ((CheckBox) findViewById(R.id.checkBoxImprovedTrail)).isChecked();

                if (isCheckedImprovedTrail == true) {
                    data.noneEvident.setChecked(false);
                    data.noneEvidentval = 0;
                    data.improvedTrailval = 1;
                }
            }
        });

        data.other = (CheckBox) findViewById(R.id.checkBoxOther);
        data.other.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                boolean isCheckedOther = ((CheckBox) findViewById(R.id.checkBoxOther)).isChecked();

                if (isCheckedOther == true) {
                    data.noneEvident.setChecked(false);
                    data.noneEvidentval = 0;
                    data.otherval = 1;
                }
            }
        });

        //Canopy
        data.canopyOpen = (CheckBox) findViewById(R.id.canopyOpen);
        data.canopyOpen.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                boolean isCheckedCanopyOpen = ((CheckBox) findViewById(R.id.canopyOpen)).isChecked();

                if (isCheckedCanopyOpen == true) {
                    data.canopyClosed.setChecked(false);
                    data.canopy = 1;
                }
            }
        });

        data.canopyClosed = (CheckBox) findViewById(R.id.canopyClosed);
        data.canopyClosed.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                boolean isCheckedCanopyClosed = ((CheckBox) findViewById(R.id.canopyClosed)).isChecked();

                if (isCheckedCanopyClosed == true) {
                    data.canopyOpen.setChecked(false);
                    data.canopy = 0;
                }
            }
        });

        //Age Classes
        data.sapling = (CheckBox) findViewById(R.id.checkBoxSapling);
        data.sapling.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                boolean isCheckedSapling = ((CheckBox) findViewById(R.id.checkBoxSapling)).isChecked();

                if (isCheckedSapling == true) {
                    data.saplingPresent = 1;
                }
                else {
                    data.saplingPresent = 0;
                    data.addTreeToDominantSapling1 = (TextView) findViewById(R.id.dominantSapling1);
                    data.addTreeToDominantSapling1.setText("");
                    data.addTreeToDominantSapling2 = (TextView) findViewById(R.id.dominantSapling2);
                    data.addTreeToDominantSapling2.setText("");
                }
            }
        });

        data.smallPole = (CheckBox) findViewById(R.id.checkBoxSmallPole);
        data.smallPole.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                boolean isCheckedsmallPole = ((CheckBox) findViewById(R.id.checkBoxSmallPole)).isChecked();

                if (isCheckedsmallPole == true) {
                    data.smallPolePresent = 1;
                }
                else {
                    data.smallPolePresent = 0;
                    data.addTreeToDominantSmallPole1 = (TextView) findViewById(R.id.dominantSmallPole1);
                    data.addTreeToDominantSmallPole1.setText("");
                    data.addTreeToDominantSmallPole2 = (TextView) findViewById(R.id.dominantSmallPole2);
                    data.addTreeToDominantSmallPole2.setText("");
                }
            }
        });

        data.medPole = (CheckBox) findViewById(R.id.checkBoxMedPole);
        data.medPole.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                boolean isCheckedmedPole = ((CheckBox) findViewById(R.id.checkBoxMedPole)).isChecked();

                if (isCheckedmedPole == true) {
                    data.medPolePresent = 1;
                }
                else {
                    data.medPolePresent = 0;
                    data.addTreeToDominantMedPole1 = (TextView) findViewById(R.id.dominantMedPole1);
                    data.addTreeToDominantMedPole1.setText("");
                    data.addTreeToDominantMedPole2 = (TextView) findViewById(R.id.dominantMedPole2);
                    data.addTreeToDominantMedPole2.setText("");
                }
            }
        });

        data.standard = (CheckBox) findViewById(R.id.checkBoxStandard);
        data.standard.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                boolean isCheckedstandard = ((CheckBox) findViewById(R.id.checkBoxStandard)).isChecked();

                if (isCheckedstandard == true) {
                    data.standardPresent = 1;
                }
                else {
                    data.standardPresent = 0;
                    data.addTreeToDominantStandard1 = (TextView) findViewById(R.id.dominantStandard1);
                    data.addTreeToDominantStandard1.setText("");
                    data.addTreeToDominantStandard2 = (TextView) findViewById(R.id.dominantStandard2);
                    data.addTreeToDominantStandard2.setText("");
                }
            }
        });

        data.veteran = (CheckBox) findViewById(R.id.checkBoxVeteran);
        data.veteran.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                boolean isCheckedveteran = ((CheckBox) findViewById(R.id.checkBoxVeteran)).isChecked();

                if (isCheckedveteran == true) {
                    data.veteranPresent = 1;
                }
                else {
                    data.veteranPresent = 0;
                    data.addTreeToDominantVeteran1 = (TextView) findViewById(R.id.dominantVeteran1);
                    data.addTreeToDominantVeteran1.setText("");
                    data.addTreeToDominantVeteran2 = (TextView) findViewById(R.id.dominantVeteran2);
                    data.addTreeToDominantVeteran2.setText("");
                }
            }
        });

        data.clearAgeClassData = (Button) findViewById(R.id.clearAgeClassData);
        data.clearAgeClassData.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                data.sapling.setChecked(false);
                data.smallPole.setChecked(false);
                data.medPole.setChecked(false);
                data.standard.setChecked(false);
                data.veteran.setChecked(false);

                data.saplingPresent = 0;
                data.smallPolePresent = 0;
                data.medPolePresent = 0;
                data.standardPresent = 0;
                data.veteranPresent = 0;

                data.addTreeToDominantSapling1 = (TextView) findViewById(R.id.dominantSapling1);
                data.addTreeToDominantSapling1.setText("");
                data.addTreeToDominantSmallPole1 = (TextView) findViewById(R.id.dominantSmallPole1);
                data.addTreeToDominantSmallPole1.setText("");
                data.addTreeToDominantMedPole1 = (TextView) findViewById(R.id.dominantMedPole1);
                data.addTreeToDominantMedPole1.setText("");
                data.addTreeToDominantStandard1 = (TextView) findViewById(R.id.dominantStandard1);
                data.addTreeToDominantStandard1.setText("");
                data.addTreeToDominantVeteran1 = (TextView) findViewById(R.id.dominantVeteran1);
                data.addTreeToDominantVeteran1.setText("");
                data.addTreeToDominantSapling2 = (TextView) findViewById(R.id.dominantSapling2);
                data.addTreeToDominantSapling2.setText("");
                data.addTreeToDominantSmallPole2 = (TextView) findViewById(R.id.dominantSmallPole2);
                data.addTreeToDominantSmallPole2.setText("");
                data.addTreeToDominantMedPole2 = (TextView) findViewById(R.id.dominantMedPole2);
                data.addTreeToDominantMedPole2.setText("");
                data.addTreeToDominantStandard2 = (TextView) findViewById(R.id.dominantStandard2);
                data.addTreeToDominantStandard2.setText("");
                data.addTreeToDominantVeteran2 = (TextView) findViewById(R.id.dominantVeteran2);
                data.addTreeToDominantVeteran2.setText("");
            }
        });

        data.addDominantSapling1 = (Button) findViewById(R.id.addDominantSapling1);
        data.addDominantSapling1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                data.addTreeToDominantSapling1 = (TextView) findViewById(R.id.dominantSapling1);
                data.dominantSapling1 = data.selectedAgeClass;
                data.addTreeToDominantSapling1.setText(data.selectedAgeClass);
                data.sapling.setChecked(true);
                data.saplingPresent = 1;
            }
        });

        data.addDominantSapling2 = (Button) findViewById(R.id.addDominantSapling2);
        data.addDominantSapling2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                data.addTreeToDominantSapling2 = (TextView) findViewById(R.id.dominantSapling2);
                data.dominantSapling2 = data.selectedAgeClass;
                data.addTreeToDominantSapling2.setText(data.selectedAgeClass);
                data.sapling.setChecked(true);
                data.saplingPresent = 1;
            }
        });

        data.addDominantSmallPole1 = (Button) findViewById(R.id.addDominantSmallPole1);
        data.addDominantSmallPole1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                data.addTreeToDominantSmallPole1 = (TextView) findViewById(R.id.dominantSmallPole1);
                data.dominantSmallPole1 = data.selectedAgeClass;
                data.addTreeToDominantSmallPole1.setText(data.selectedAgeClass);
                data.smallPole.setChecked(true);
                data.smallPolePresent = 1;
            }
        });

        data.addDominantSmallPole2 = (Button) findViewById(R.id.addDominantSmallPole2);
        data.addDominantSmallPole2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                data.addTreeToDominantSmallPole2 = (TextView) findViewById(R.id.dominantSmallPole2);
                data.dominantSmallPole2 = data.selectedAgeClass;
                data.addTreeToDominantSmallPole2.setText(data.selectedAgeClass);
                data.smallPole.setChecked(true);
                data.smallPolePresent = 1;
            }
        });

        data.addDominantMedPole1 = (Button) findViewById(R.id.addDominantMedPole1);
        data.addDominantMedPole1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                data.addTreeToDominantMedPole1 = (TextView) findViewById(R.id.dominantMedPole1);
                data.dominantMedPole1 = data.selectedAgeClass;
                data.addTreeToDominantMedPole1.setText(data.selectedAgeClass);
                data.medPole.setChecked(true);
                data.medPolePresent = 1;
            }
        });

        data.addDominantMedPole2 = (Button) findViewById(R.id.addDominantMedPole2);
        data.addDominantMedPole2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                data.addTreeToDominantMedPole2 = (TextView) findViewById(R.id.dominantMedPole2);
                data.dominantMedPole2 = data.selectedAgeClass;
                data.addTreeToDominantMedPole2.setText(data.selectedAgeClass);
                data.medPole.setChecked(true);
                data.medPolePresent = 1;
            }
        });

        data.addDominantStandard1 = (Button) findViewById(R.id.addDominantStandard1);
        data.addDominantStandard1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                data.addTreeToDominantStandard1 = (TextView) findViewById(R.id.dominantStandard1);
                data.dominantStandardPole1 = data.selectedAgeClass;
                data.addTreeToDominantStandard1.setText(data.selectedAgeClass);
                data.standard.setChecked(true);
                data.standardPresent = 1;
            }
        });

        data.addDominantStandard2 = (Button) findViewById(R.id.addDominantStandard2);
        data.addDominantStandard2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                data.addTreeToDominantStandard2 = (TextView) findViewById(R.id.dominantStandard2);
                data.dominantStandardPole2 = data.selectedAgeClass;
                data.addTreeToDominantStandard2.setText(data.selectedAgeClass);
                data.standard.setChecked(true);
                data.standardPresent = 1;
            }
        });

        data.addDominantVeteran1 = (Button) findViewById(R.id.addDominantVeteran1);
        data.addDominantVeteran1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                data.addTreeToDominantVeteran1 = (TextView) findViewById(R.id.dominantVeteran1);
                data.dominantVeteran1 = data.selectedAgeClass;
                data.addTreeToDominantVeteran1.setText(data.selectedAgeClass);
                data.veteran.setChecked(true);
                data.veteranPresent = 1;
            }
        });

        data.addDominantVeteran2 = (Button) findViewById(R.id.addDominantVeteran2);
        data.addDominantVeteran2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                data.addTreeToDominantVeteran2 = (TextView) findViewById(R.id.dominantVeteran2);
                data.dominantVeteran2 = data.selectedAgeClass;
                data.addTreeToDominantVeteran2.setText(data.selectedAgeClass);
                data.veteran.setChecked(true);
                data.veteranPresent = 1;
            }
        });

        data.age_classes = (Spinner) findViewById(R.id.tree_types_spinnerAgeClasses);
        data.age_classes.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if (data.selectedAgeClass == null) {
                    data.selectedAgeClass = "AMBE";
                } else{
                    data.selectedAgeClass = adapterView.getSelectedItem().toString();
                }
            }
            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });


        //Pests and Pathogens
        data.beechPresent = (CheckBox) findViewById(R.id.beechPresent);
        data.beechPresent.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                boolean isCheckedBeechPresent = ((CheckBox) findViewById(R.id.beechPresent)).isChecked();

                if (isCheckedBeechPresent == false) {
                    data.beechNone.setChecked(true);
                    data.beechLow.setChecked(false);
                    data.beechMedium.setChecked(false);
                    data.beechHigh.setChecked(false);
                    data.beech = 0;
                    data.beechAbundance = "None";
                }
                else{
                    data.beechNone.setChecked(false);
                    data.beechLow.setChecked(true);
                    data.beech = 1;
                    data.beechAbundance = "Low";
                }
            }
        });
        data.beechNone = (CheckBox) findViewById(R.id.beechNone);
        data.beechNone.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                boolean isCheckedBeechNone = ((CheckBox) findViewById(R.id.beechNone)).isChecked();

                if (isCheckedBeechNone == true) {
                    data.beechPresent.setChecked(false);
                    data.beechLow.setChecked(false);
                    data.beechMedium.setChecked(false);
                    data.beechHigh.setChecked(false);
                    data.beech = 0;
                    data.beechAbundance = "None";
                }
            }
        });
        data.beechLow = (CheckBox) findViewById(R.id.beechLow);
        data.beechLow.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                boolean isCheckedBeechPresent = ((CheckBox) findViewById(R.id.beechPresent)).isChecked();
                boolean isCheckedBeechLow = ((CheckBox) findViewById(R.id.beechLow)).isChecked();

                if (isCheckedBeechPresent == true && isCheckedBeechLow == true) {
                    data.beechNone.setChecked(false);
                    data.beechMedium.setChecked(false);
                    data.beechHigh.setChecked(false);
                    data.beech = 1;
                    data.beechAbundance = "Low";
                }
                else if (isCheckedBeechPresent == false && isCheckedBeechLow == true){
                    data.beechNone.setChecked(false);
                    data.beechMedium.setChecked(false);
                    data.beechHigh.setChecked(false);
                    data.beechPresent.setChecked(true);
                    data.beech = 1;
                    data.beechAbundance = "Low";
                }
            }
        });
        data.beechMedium = (CheckBox) findViewById(R.id.beechMedium);
        data.beechMedium.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                boolean isCheckedBeechPresent = ((CheckBox) findViewById(R.id.beechPresent)).isChecked();
                boolean isCheckedBeechMedium = ((CheckBox) findViewById(R.id.beechMedium)).isChecked();

                if (isCheckedBeechPresent == true && isCheckedBeechMedium == true) {
                    data.beechNone.setChecked(false);
                    data.beechLow.setChecked(false);
                    data.beechHigh.setChecked(false);
                    data.beech = 1;
                    data.beechAbundance = "Medium";
                }
                else if (isCheckedBeechPresent == false && isCheckedBeechMedium == true){
                    data.beechNone.setChecked(false);
                    data.beechLow.setChecked(false);
                    data.beechHigh.setChecked(false);
                    data.beechPresent.setChecked(true);
                    data.beech = 1;
                    data.beechAbundance = "Medium";
                }
            }
        });
        data.beechHigh = (CheckBox) findViewById(R.id.beechHigh);
        data.beechHigh.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                boolean isCheckedBeechPresent = ((CheckBox) findViewById(R.id.beechPresent)).isChecked();
                boolean isCheckedBeechHigh = ((CheckBox) findViewById(R.id.beechHigh)).isChecked();

                if (isCheckedBeechPresent == true && isCheckedBeechHigh == true) {
                    data.beechNone.setChecked(false);
                    data.beechMedium.setChecked(false);
                    data.beechLow.setChecked(false);
                    data.beech = 1;
                    data.beechAbundance = "High";
                }
                else if (isCheckedBeechPresent == false && isCheckedBeechHigh == true){
                    data.beechNone.setChecked(false);
                    data.beechMedium.setChecked(false);
                    data.beechLow.setChecked(false);
                    data.beechPresent.setChecked(true);
                    data.beech = 1;
                    data.beechAbundance = "High";
                }
            }
        });

        data.bldPresent = (CheckBox) findViewById(R.id.bldPresent);
        data.bldPresent.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                boolean isCheckedBldPresent = ((CheckBox) findViewById(R.id.bldPresent)).isChecked();

                if (isCheckedBldPresent == false) {
                    data.bldNone.setChecked(true);
                    data.bldLow.setChecked(false);
                    data.bldModerate.setChecked(false);
                    data.bldSevere.setChecked(false);
                    data.bld = 0;
                    data.bldSeverity = "None";
                }
                else{
                    data.bldNone.setChecked(false);
                    data.bldLow.setChecked(true);
                    data.bld = 1;
                    data.bldSeverity = "Low";
                }
            }
        });
        data.bldNone = (CheckBox) findViewById(R.id.bldNone);
        data.bldNone.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                boolean isCheckedBldNone = ((CheckBox) findViewById(R.id.bldNone)).isChecked();

                if (isCheckedBldNone == true) {
                    data.bldPresent.setChecked(false);
                    data.bldLow.setChecked(false);
                    data.bldModerate.setChecked(false);
                    data.bldSevere.setChecked(false);
                    data.bld = 0;
                    data.bldSeverity = "None";
                }
            }
        });
        data.bldLow = (CheckBox) findViewById(R.id.bldLow);
        data.bldLow.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                boolean isCheckedBldPresent = ((CheckBox) findViewById(R.id.bldPresent)).isChecked();
                boolean isCheckedBldLow = ((CheckBox) findViewById(R.id.bldLow)).isChecked();

                if (isCheckedBldPresent == true && isCheckedBldLow == true) {
                    data.bldNone.setChecked(false);
                    data.bldModerate.setChecked(false);
                    data.bldSevere.setChecked(false);
                    data.bld = 1;
                    data.bldSeverity = "Low";
                }
                else if (isCheckedBldPresent == false && isCheckedBldLow == true){
                    data.bldNone.setChecked(false);
                    data.bldModerate.setChecked(false);
                    data.bldSevere.setChecked(false);
                    data.bldPresent.setChecked(true);
                    data.bld = 1;
                    data.bldSeverity = "Low";
                }
            }
        });
        data.bldModerate = (CheckBox) findViewById(R.id.bldModerate);
        data.bldModerate.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                boolean isCheckedBldPresent = ((CheckBox) findViewById(R.id.bldPresent)).isChecked();
                boolean isCheckedBldModerate = ((CheckBox) findViewById(R.id.bldModerate)).isChecked();

                if (isCheckedBldPresent == true && isCheckedBldModerate == true) {
                    data.bldNone.setChecked(false);
                    data.bldLow.setChecked(false);
                    data.bldSevere.setChecked(false);
                    data.bld = 1;
                    data.bldSeverity = "Moderate";
                }
                else if (isCheckedBldPresent == false && isCheckedBldModerate == true){
                    data.bldNone.setChecked(false);
                    data.bldLow.setChecked(false);
                    data.bldSevere.setChecked(false);
                    data.bldPresent.setChecked(true);
                    data.bld = 1;
                    data.bldSeverity = "Moderate";
                }
            }
        });
        data.bldSevere = (CheckBox) findViewById(R.id.bldSevere);
        data.bldSevere.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                boolean isCheckedBldPresent = ((CheckBox) findViewById(R.id.bldPresent)).isChecked();
                boolean isCheckedBldSevere= ((CheckBox) findViewById(R.id.bldSevere)).isChecked();

                if (isCheckedBldPresent == true && isCheckedBldSevere == true) {
                    data.bldNone.setChecked(false);
                    data.bldModerate.setChecked(false);
                    data.bldLow.setChecked(false);
                    data.bld = 1;
                    data.bldSeverity = "Severe";
                }
                else if (isCheckedBldPresent == false && isCheckedBldSevere == true){
                    data.bldNone.setChecked(false);
                    data.bldModerate.setChecked(false);
                    data.bldLow.setChecked(false);
                    data.bldPresent.setChecked(true);
                    data.bld = 1;
                    data.bldSeverity = "Severe";
                }
            }
        });

        data.ashPresent = (CheckBox) findViewById(R.id.ashPresent);
        data.ashPresent.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                boolean isCheckedashPresent = ((CheckBox) findViewById(R.id.ashPresent)).isChecked();

                if (isCheckedashPresent == false) {
                    data.ashNone.setChecked(true);
                    data.ashLow.setChecked(false);
                    data.ashMedium.setChecked(false);
                    data.ashHigh.setChecked(false);
                    data.ash = 0;
                    data.ashAbundance = "None";
                }
                else{
                    data.ashNone.setChecked(false);
                    data.ashLow.setChecked(true);
                    data.ash = 1;
                    data.ashAbundance = "Low";
                }
            }
        });
        data.ashNone = (CheckBox) findViewById(R.id.ashNone);
        data.ashNone.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                boolean isCheckedashNone = ((CheckBox) findViewById(R.id.ashNone)).isChecked();

                if (isCheckedashNone == true) {
                    data.ashPresent.setChecked(false);
                    data.ashLow.setChecked(false);
                    data.ashMedium.setChecked(false);
                    data.ashHigh.setChecked(false);
                    data.ash = 0;
                    data.ashAbundance = "None";
                }
            }
        });
        data.ashLow = (CheckBox) findViewById(R.id.ashLow);
        data.ashLow.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                boolean isCheckedashPresent = ((CheckBox) findViewById(R.id.ashPresent)).isChecked();
                boolean isCheckedashLow = ((CheckBox) findViewById(R.id.ashLow)).isChecked();

                if (isCheckedashPresent == true && isCheckedashLow == true) {
                    data.ashNone.setChecked(false);
                    data.ashMedium.setChecked(false);
                    data.ashHigh.setChecked(false);
                    data.ash = 1;
                    data.ashAbundance = "Low";
                }
                else if (isCheckedashPresent == false && isCheckedashLow == true){
                    data.ashNone.setChecked(false);
                    data.ashMedium.setChecked(false);
                    data.ashHigh.setChecked(false);
                    data.ashPresent.setChecked(true);
                    data.ash = 1;
                    data.ashAbundance = "Low";
                }
            }
        });
        data.ashMedium = (CheckBox) findViewById(R.id.ashMedium);
        data.ashMedium.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                boolean isCheckedashPresent = ((CheckBox) findViewById(R.id.ashPresent)).isChecked();
                boolean isCheckedashMedium = ((CheckBox) findViewById(R.id.ashMedium)).isChecked();

                if (isCheckedashPresent == true && isCheckedashMedium == true) {
                    data.ashNone.setChecked(false);
                    data.ashLow.setChecked(false);
                    data.ashHigh.setChecked(false);
                    data.ash = 1;
                    data.ashAbundance = "Medium";
                }
                else if (isCheckedashPresent == false && isCheckedashMedium == true){
                    data.ashNone.setChecked(false);
                    data.ashLow.setChecked(false);
                    data.ashHigh.setChecked(false);
                    data.ashPresent.setChecked(true);
                    data.ash = 1;
                    data.ashAbundance = "Medium";
                }
            }
        });
        data.ashHigh = (CheckBox) findViewById(R.id.ashHigh);
        data.ashHigh.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                boolean isCheckedashPresent = ((CheckBox) findViewById(R.id.ashPresent)).isChecked();
                boolean isCheckedashHigh = ((CheckBox) findViewById(R.id.ashHigh)).isChecked();

                if (isCheckedashPresent == true && isCheckedashHigh == true) {
                    data.ashNone.setChecked(false);
                    data.ashMedium.setChecked(false);
                    data.ashLow.setChecked(false);
                    data.ash = 1;
                    data.ashAbundance = "High";
                }
                else if (isCheckedashPresent == false && isCheckedashHigh == true){
                    data.ashNone.setChecked(false);
                    data.ashMedium.setChecked(false);
                    data.ashLow.setChecked(false);
                    data.ashPresent.setChecked(true);
                    data.ash = 1;
                    data.ashAbundance = "High";
                }
            }
        });

        data.eabPresent = (CheckBox) findViewById(R.id.eabPresent);
        data.eabPresent.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                boolean isCheckedeabPresent = ((CheckBox) findViewById(R.id.eabPresent)).isChecked();

                if (isCheckedeabPresent == false) {
                    data.eabNone.setChecked(true);
                    data.eabLow.setChecked(false);
                    data.eabModerate.setChecked(false);
                    data.eabSevere.setChecked(false);
                    data.eab = 0;
                    data.eabSeverity = "None";
                }
                else{
                    data.eabNone.setChecked(false);
                    data.eabLow.setChecked(true);
                    data.eab = 1;
                    data.eabSeverity = "Low";
                }
            }
        });
        data.eabNone = (CheckBox) findViewById(R.id.eabNone);
        data.eabNone.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                boolean isCheckedeabNone = ((CheckBox) findViewById(R.id.eabNone)).isChecked();

                if (isCheckedeabNone == true) {
                    data.eabPresent.setChecked(false);
                    data.eabLow.setChecked(false);
                    data.eabModerate.setChecked(false);
                    data.eabSevere.setChecked(false);
                    data.eab = 0;
                    data.eabSeverity = "None";
                }
            }
        });
        data.eabLow = (CheckBox) findViewById(R.id.eabLow);
        data.eabLow.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                boolean isCheckedeabPresent = ((CheckBox) findViewById(R.id.eabPresent)).isChecked();
                boolean isCheckedeabLow = ((CheckBox) findViewById(R.id.eabLow)).isChecked();

                if (isCheckedeabPresent == true && isCheckedeabLow == true) {
                    data.eabNone.setChecked(false);
                    data.eabModerate.setChecked(false);
                    data.eabSevere.setChecked(false);
                    data.eab = 1;
                    data.eabSeverity = "Low";
                }
                else if (isCheckedeabPresent == false && isCheckedeabLow == true){
                    data.eabNone.setChecked(false);
                    data.eabModerate.setChecked(false);
                    data.eabSevere.setChecked(false);
                    data.eabPresent.setChecked(true);
                    data.eab = 1;
                    data.eabSeverity = "Low";
                }
            }
        });
        data.eabModerate = (CheckBox) findViewById(R.id.eabModerate);
        data.eabModerate.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                boolean isCheckedeabPresent = ((CheckBox) findViewById(R.id.eabPresent)).isChecked();
                boolean isCheckedeabModerate = ((CheckBox) findViewById(R.id.eabModerate)).isChecked();

                if (isCheckedeabPresent == true && isCheckedeabModerate == true) {
                    data.eabNone.setChecked(false);
                    data.eabLow.setChecked(false);
                    data.eabSevere.setChecked(false);
                    data.eab = 1;
                    data.eabSeverity = "Moderate";
                }
                else if (isCheckedeabPresent == false && isCheckedeabModerate == true){
                    data.eabNone.setChecked(false);
                    data.eabLow.setChecked(false);
                    data.eabSevere.setChecked(false);
                    data.eabPresent.setChecked(true);
                    data.eab = 1;
                    data.eabSeverity = "Moderate";
                }
            }
        });
        data.eabSevere = (CheckBox) findViewById(R.id.eabSevere);
        data.eabSevere.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                boolean isCheckedeabPresent = ((CheckBox) findViewById(R.id.eabPresent)).isChecked();
                boolean isCheckedeabSevere= ((CheckBox) findViewById(R.id.eabSevere)).isChecked();

                if (isCheckedeabPresent == true && isCheckedeabSevere == true) {
                    data.eabNone.setChecked(false);
                    data.eabModerate.setChecked(false);
                    data.eabLow.setChecked(false);
                    data.eab = 1;
                    data.eabSeverity = "Severe";
                }
                else if (isCheckedeabPresent == false && isCheckedeabSevere == true){
                    data.eabNone.setChecked(false);
                    data.eabModerate.setChecked(false);
                    data.eabLow.setChecked(false);
                    data.eabPresent.setChecked(true);
                    data.eab = 1;
                    data.eabSeverity = "Severe";
                }
            }
        });

        data.eahePresent = (CheckBox) findViewById(R.id.EAHEPresent);
        data.eahePresent.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                boolean isCheckedeahePresent = ((CheckBox) findViewById(R.id.EAHEPresent)).isChecked();

                if (isCheckedeahePresent == false) {
                    data.eaheNone.setChecked(true);
                    data.eaheLow.setChecked(false);
                    data.eaheMedium.setChecked(false);
                    data.eaheHigh.setChecked(false);
                    data.eahe = 0;
                    data.eaheAbundance = "None";
                }
                else{
                    data.eaheNone.setChecked(false);
                    data.eaheLow.setChecked(true);
                    data.eahe = 1;
                    data.eaheAbundance = "Low";
                }
            }
        });
        data.eaheNone = (CheckBox) findViewById(R.id.EAHENone);
        data.eaheNone.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                boolean isCheckedashNone = ((CheckBox) findViewById(R.id.EAHENone)).isChecked();

                if (isCheckedashNone == true) {
                    data.eahePresent.setChecked(false);
                    data.eaheLow.setChecked(false);
                    data.eaheMedium.setChecked(false);
                    data.eaheHigh.setChecked(false);
                    data.eahe = 0;
                    data.eaheAbundance = "None";
                }
            }
        });
        data.eaheLow = (CheckBox) findViewById(R.id.EAHELow);
        data.eaheLow.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                boolean isCheckedeahePresent = ((CheckBox) findViewById(R.id.EAHEPresent)).isChecked();
                boolean isCheckedeaheLow = ((CheckBox) findViewById(R.id.EAHELow)).isChecked();

                if (isCheckedeahePresent == true && isCheckedeaheLow == true) {
                    data.eaheNone.setChecked(false);
                    data.eaheMedium.setChecked(false);
                    data.eaheHigh.setChecked(false);
                    data.eahe = 1;
                    data.eaheAbundance = "Low";
                }
                else if (isCheckedeahePresent == false && isCheckedeaheLow == true){
                    data.eaheNone.setChecked(false);
                    data.eaheMedium.setChecked(false);
                    data.eaheHigh.setChecked(false);
                    data.eahePresent.setChecked(true);
                    data.eahe = 1;
                    data.eaheAbundance = "Low";
                }
            }
        });
        data.eaheMedium = (CheckBox) findViewById(R.id.EAHEMedium);
        data.eaheMedium.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                boolean isCheckedeahePresent = ((CheckBox) findViewById(R.id.EAHEPresent)).isChecked();
                boolean isCheckedeaheMedium = ((CheckBox) findViewById(R.id.EAHEMedium)).isChecked();

                if (isCheckedeahePresent == true && isCheckedeaheMedium == true) {
                    data.eaheNone.setChecked(false);
                    data.eaheLow.setChecked(false);
                    data.eaheHigh.setChecked(false);
                    data.eahe = 1;
                    data.eaheAbundance = "Medium";
                }
                else if (isCheckedeahePresent == false && isCheckedeaheMedium == true){
                    data.eaheNone.setChecked(false);
                    data.eaheLow.setChecked(false);
                    data.eaheHigh.setChecked(false);
                    data.eahePresent.setChecked(true);
                    data.eahe = 1;
                    data.eaheAbundance = "Medium";
                }
            }
        });
        data.eaheHigh = (CheckBox) findViewById(R.id.EAHEHigh);
        data.eaheHigh.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                boolean isCheckedeahePresent = ((CheckBox) findViewById(R.id.EAHEPresent)).isChecked();
                boolean isCheckedeaheHigh = ((CheckBox) findViewById(R.id.EAHEHigh)).isChecked();

                if (isCheckedeahePresent == true && isCheckedeaheHigh == true) {
                    data.eaheNone.setChecked(false);
                    data.eaheMedium.setChecked(false);
                    data.eaheLow.setChecked(false);
                    data.eahe = 1;
                    data.eaheAbundance = "High";
                }
                else if (isCheckedeahePresent == false && isCheckedeaheHigh == true){
                    data.eaheNone.setChecked(false);
                    data.eaheMedium.setChecked(false);
                    data.eaheLow.setChecked(false);
                    data.eahePresent.setChecked(true);
                    data.eahe = 1;
                    data.eaheAbundance = "High";
                }
            }
        });

        data.hwaPresent = (CheckBox) findViewById(R.id.HWAPresent);
        data.hwaPresent.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                boolean isCheckedhwaPresent = ((CheckBox) findViewById(R.id.HWAPresent)).isChecked();

                if (isCheckedhwaPresent == false) {
                    data.hwaNone.setChecked(true);
                    data.hwaLow.setChecked(false);
                    data.hwaModerate.setChecked(false);
                    data.hwaSevere.setChecked(false);
                    data.hwa = 0;
                    data.hwaSeverity = "None";
                }
                else{
                    data.hwaNone.setChecked(false);
                    data.hwaLow.setChecked(true);
                    data.hwa = 1;
                    data.hwaSeverity = "Low";
                }
            }
        });
        data.hwaNone = (CheckBox) findViewById(R.id.HWANone);
        data.hwaNone.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                boolean isCheckedeabNone = ((CheckBox) findViewById(R.id.HWANone)).isChecked();

                if (isCheckedeabNone == true) {
                    data.hwaPresent.setChecked(false);
                    data.hwaLow.setChecked(false);
                    data.hwaModerate.setChecked(false);
                    data.hwaSevere.setChecked(false);
                    data.hwa = 0;
                    data.hwaSeverity = "None";
                }
            }
        });
        data.hwaLow = (CheckBox) findViewById(R.id.HWALow);
        data.hwaLow.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                boolean isCheckedhwaPresent = ((CheckBox) findViewById(R.id.HWAPresent)).isChecked();
                boolean isCheckedhwaLow = ((CheckBox) findViewById(R.id.HWALow)).isChecked();

                if (isCheckedhwaPresent == true && isCheckedhwaLow == true) {
                    data.hwaNone.setChecked(false);
                    data.hwaModerate.setChecked(false);
                    data.hwaSevere.setChecked(false);
                    data.hwa = 1;
                    data.hwaSeverity = "Low";
                }
                else if (isCheckedhwaPresent == false && isCheckedhwaLow == true){
                    data.hwaNone.setChecked(false);
                    data.hwaModerate.setChecked(false);
                    data.hwaSevere.setChecked(false);
                    data.hwaPresent.setChecked(true);
                    data.hwa = 1;
                    data.hwaSeverity = "Low";
                }
            }
        });
        data.hwaModerate = (CheckBox) findViewById(R.id.HWAModerate);
        data.hwaModerate.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                boolean isCheckedhwaPresent = ((CheckBox) findViewById(R.id.HWAPresent)).isChecked();
                boolean isCheckedhwaModerate = ((CheckBox) findViewById(R.id.HWAModerate)).isChecked();

                if (isCheckedhwaPresent == true && isCheckedhwaModerate == true) {
                    data.hwaNone.setChecked(false);
                    data.hwaLow.setChecked(false);
                    data.hwaSevere.setChecked(false);
                    data.hwa = 1;
                    data.hwaSeverity = "Moderate";
                }
                else if (isCheckedhwaPresent == false && isCheckedhwaModerate == true){
                    data.hwaNone.setChecked(false);
                    data.hwaLow.setChecked(false);
                    data.hwaSevere.setChecked(false);
                    data.hwaPresent.setChecked(true);
                    data.hwa = 1;
                    data.hwaSeverity = "Moderate";
                }
            }
        });
        data.hwaSevere = (CheckBox) findViewById(R.id.HWASevere);
        data.hwaSevere.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                boolean isCheckedhwaPresent = ((CheckBox) findViewById(R.id.HWAPresent)).isChecked();
                boolean isCheckedhwaSevere= ((CheckBox) findViewById(R.id.HWASevere)).isChecked();

                if (isCheckedhwaPresent == true && isCheckedhwaSevere == true) {
                    data.hwaNone.setChecked(false);
                    data.hwaModerate.setChecked(false);
                    data.hwaLow.setChecked(false);
                    data.hwa = 1;
                    data.hwaSeverity = "Severe";
                }
                else if (isCheckedhwaPresent == false && isCheckedhwaSevere == true){
                    data.hwaNone.setChecked(false);
                    data.hwaModerate.setChecked(false);
                    data.hwaLow.setChecked(false);
                    data.hwaPresent.setChecked(true);
                    data.hwa = 1;
                    data.hwaSeverity = "Severe";
                }
            }
        });

        //seedling Cover
        data.ten = (CheckBox) findViewById(R.id.checkBoxTen);
        data.ten.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                boolean isCheckedTen = ((CheckBox) findViewById(R.id.checkBoxTen)).isChecked();

                if (isCheckedTen == true) {
                    data.tenTwentyFive.setChecked(false);
                    data.twentyFiveFifty.setChecked(false);
                    data.fiftySeventyFive.setChecked(false);
                    data.seventyFiveNinety.setChecked(false);
                    data.ninety.setChecked(false);
                    data.seedlingCover = "<10%";
                }
            }
        });

        data.tenTwentyFive = (CheckBox) findViewById(R.id.checkBoxTenTwentyFive);
        data.tenTwentyFive.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                boolean isCheckedtenTwentyFive = ((CheckBox) findViewById(R.id.checkBoxTenTwentyFive)).isChecked();

                if (isCheckedtenTwentyFive == true) {
                    data.ten.setChecked(false);
                    data.twentyFiveFifty.setChecked(false);
                    data.fiftySeventyFive.setChecked(false);
                    data.seventyFiveNinety.setChecked(false);
                    data.ninety.setChecked(false);
                    data.seedlingCover = "10-25%";
                }
            }
        });

        data.twentyFiveFifty = (CheckBox) findViewById(R.id.checkBoxTwentyFiveFifty);
        data.twentyFiveFifty.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                boolean isCheckedtwentyFiveFifty = ((CheckBox) findViewById(R.id.checkBoxTwentyFiveFifty)).isChecked();

                if (isCheckedtwentyFiveFifty == true) {
                    data.ten.setChecked(false);
                    data.tenTwentyFive.setChecked(false);
                    data.fiftySeventyFive.setChecked(false);
                    data.seventyFiveNinety.setChecked(false);
                    data.ninety.setChecked(false);
                    data.seedlingCover = "25-50%";
                }
            }
        });

        data.fiftySeventyFive = (CheckBox) findViewById(R.id.checkBoxFiftySeventyFive);
        data.fiftySeventyFive.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                boolean isCheckedfiftySeventyFive = ((CheckBox) findViewById(R.id.checkBoxFiftySeventyFive)).isChecked();

                if (isCheckedfiftySeventyFive == true) {
                    data.ten.setChecked(false);
                    data.tenTwentyFive.setChecked(false);
                    data.twentyFiveFifty.setChecked(false);
                    data.seventyFiveNinety.setChecked(false);
                    data.ninety.setChecked(false);
                    data.seedlingCover = "50-75%";
                }
            }
        });

        data.seventyFiveNinety = (CheckBox) findViewById(R.id.checkBoxSeventyFiveNinety);
        data.seventyFiveNinety.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                boolean isCheckedseventyFiveNinety = ((CheckBox) findViewById(R.id.checkBoxSeventyFiveNinety)).isChecked();

                if (isCheckedseventyFiveNinety == true) {
                    data.ten.setChecked(false);
                    data.tenTwentyFive.setChecked(false);
                    data.twentyFiveFifty.setChecked(false);
                    data.fiftySeventyFive.setChecked(false);
                    data.ninety.setChecked(false);
                    data.seedlingCover = "75-90%";
                }
            }
        });

        data.ninety = (CheckBox) findViewById(R.id.checkBoxNinety);
        data.ninety.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                boolean isCheckedninety = ((CheckBox) findViewById(R.id.checkBoxNinety)).isChecked();

                if (isCheckedninety == true) {
                    data.ten.setChecked(false);
                    data.tenTwentyFive.setChecked(false);
                    data.twentyFiveFifty.setChecked(false);
                    data.fiftySeventyFive.setChecked(false);
                    data.seventyFiveNinety.setChecked(false);
                    data.seedlingCover = ">90%";
                }
            }
        });

    }

    public void updateButtonPressed(){
        //cell
        data.cell = getCellValue();

        //date
        data.date = getDateValue();

        //scorers
        data.scorers = getScorerValue();

        // section 1A called with button
        herbaceousPlantScore();
        data.sum1AVal = (TextView) findViewById(R.id.sum1AVal);
        data.modifyTextSum1A = data.sum1AVal.getText().toString();
        data.modifyTextSum1A = Integer.toString(data.sum1A);
        data.sum1AVal.setText(data.modifyTextSum1A);

        data.point1AVal = (TextView) findViewById(R.id.point1AVal);
        data.modifyTextPoint1A = data.point1AVal.getText().toString();
        data.modifyTextPoint1A = Integer.toString(data.point1A);
        data.point1AVal.setText(data.modifyTextPoint1A);

        // section 1B called with button
        treeSeedlingScore();
        data.sum1BVal = (TextView) findViewById(R.id.sum1BVal); // sum1BVal
        data.modifyTextSum1B = data.sum1BVal.getText().toString();
        data.modifyTextSum1B = Integer.toString(data.sum1B);
        data.sum1BVal.setText(data.modifyTextSum1B);

        data.point1BVal = (TextView) findViewById(R.id.point1BVal); // point1BVal
        data.modifyTextPoint1B = data.point1BVal.getText().toString();
        data.modifyTextPoint1B = Integer.toString(data.point1B);
        data.point1BVal.setText(data.modifyTextPoint1B);

        // section 2A called with button
        shrubSaplingScore();
        data.sum2AVal = (TextView) findViewById(R.id.sum2AVal);
        data.modifyTextSum2A = data.sum2AVal.getText().toString();
        data.modifyTextSum2A = Integer.toString(data.sum2A);
        data.sum2AVal.setText(data.modifyTextSum2A);

        data.point2AVal = (TextView) findViewById(R.id.point2AVal);
        data.modifyTextPoint2A = data.point2AVal.getText().toString();
        data.modifyTextPoint2A = Integer.toString(data.point2A);
        data.point2AVal.setText(data.modifyTextPoint2A);

        // section 2B called with button
        comboShrubSaplingScore();
        data.sum2BVal = (TextView) findViewById(R.id.sum2BVal); // sum2BVal
        data.modifyTextSum2B = data.sum2BVal.getText().toString();
        data.modifyTextSum2B = Integer.toString(data.sum2B);
        data.sum2BVal.setText(data.modifyTextSum2B);

        data.point2BVal = (TextView) findViewById(R.id.point2BVal); // point2BVal
        data.modifyTextPoint2B = data.point2BVal.getText().toString();
        data.modifyTextPoint2B = Integer.toString(data.point2B);
        data.point2BVal.setText(data.modifyTextPoint2B);

        // section 3A called with button
        matureTreesScore();
        data.sum3AVal = (TextView) findViewById(R.id.sum3AVal);
        data.modifyTextSum3A = data.sum3AVal.getText().toString();
        data.modifyTextSum3A = Integer.toString(data.sum3A);
        data.sum3AVal.setText(data.modifyTextSum3A);

        data.point3AVal = (TextView) findViewById(R.id.point3AVal);
        data.modifyTextPoint3A = data.point3AVal.getText().toString();
        data.modifyTextPoint3A = Integer.toString(data.point3A);
        data.point3AVal.setText(data.modifyTextPoint3A);

        // section 3B called with button
        matureTreeSpeciesScore();
        data.sum3BVal = (TextView) findViewById(R.id.sum3BVal); // sum3BVal
        data.modifyTextSum3B = data.sum3BVal.getText().toString();
        data.modifyTextSum3B = Integer.toString(data.sum3B);
        data.sum3BVal.setText(data.modifyTextSum3B);

        data.point3BVal = (TextView) findViewById(R.id.point3BVal); // point3BVal
        data.modifyTextPoint3B = data.point3BVal.getText().toString();
        data.modifyTextPoint3B = Integer.toString(data.point3B);
        data.point3BVal.setText(data.modifyTextPoint3B);

        // section 4A called with button
        legacyTreesScore();
        data.sum4AVal = (TextView) findViewById(R.id.sum4AVal);
        data.modifyTextSum4A = data.sum4AVal.getText().toString();
        data.modifyTextSum4A = Integer.toString(data.sum4A);
        data.sum4AVal.setText(data.modifyTextSum4A);

        data.point4AVal = (TextView) findViewById(R.id.point4AVal);
        data.modifyTextPoint4A = data.point4AVal.getText().toString();
        data.modifyTextPoint4A = Integer.toString(data.point4A);
        data.point4AVal.setText(data.modifyTextPoint4A);

        //section 4B called with button
        legacyTreeSpeciesScore();
        data.sum4BVal = (TextView) findViewById(R.id.sum4BVal); // sum4BVal
        data.modifyTextSum4B = data.sum4BVal.getText().toString();
        data.modifyTextSum4B = Integer.toString(data.sum4B);
        data.sum4BVal.setText(data.modifyTextSum4B);

        data.point4BVal = (TextView) findViewById(R.id.point4BVal); // point4BVal
        data.modifyTextPoint4B = data.point4BVal.getText().toString();
        data.modifyTextPoint4B = Integer.toString(data.point4B);
        data.point4BVal.setText(data.modifyTextPoint4B);

        // section 5A called with button
        snagsScore();
        data.sum5AVal = (TextView) findViewById(R.id.sum5AVal);
        data.modifyTextSum5A = data.sum5AVal.getText().toString();
        data.modifyTextSum5A = Integer.toString(data.sum5A);
        data.sum5AVal.setText(data.modifyTextSum5A);

        data.point5AVal = (TextView) findViewById(R.id.point5AVal);
        data.modifyTextPoint5A = data.point5AVal.getText().toString();
        data.modifyTextPoint5A = Integer.toString(data.point5A);
        data.point5AVal.setText(data.modifyTextPoint5A);

        // section 5B called with button
        woodyDebrisScore();
        data.sum5BVal = (TextView) findViewById(R.id.sum5BVal); // sum5BVal
        data.modifyTextSum5B = data.sum5BVal.getText().toString();
        data.modifyTextSum5B = Integer.toString(data.sum5B);
        data.sum5BVal.setText(data.modifyTextSum5B);

        data.point5BVal = (TextView) findViewById(R.id.point5BVal); // point5BVal
        data.modifyTextPoint5B = data.point5BVal.getText().toString();
        data.modifyTextPoint5B = Integer.toString(data.point5B);
        data.point5BVal.setText(data.modifyTextPoint5B);

        // section 6A called with button
        invasiveShrubsScore();
        data.sum6AVal = (TextView) findViewById(R.id.sum6AVal);
        data.modifyTextSum6A = data.sum6AVal.getText().toString();
        data.modifyTextSum6A = Integer.toString(data.sum6A);
        data.sum6AVal.setText(data.modifyTextSum6A);

        data.point6AVal = (TextView) findViewById(R.id.point6AVal);
        data.modifyTextPoint6A = data.point6AVal.getText().toString();
        data.modifyTextPoint6A = Integer.toString(data.point6A);
        data.point6AVal.setText(data.modifyTextPoint6A);

        // section 6B called with button
        invasiveHerbaceousScore();
        data.sum6BVal = (TextView) findViewById(R.id.sum6BVal); // sum6BVal
        data.modifyTextSum6B = data.sum6BVal.getText().toString();
        data.modifyTextSum6B = Integer.toString(data.sum6B);
        data.sum6BVal.setText(data.modifyTextSum6B);

        data.point6BVal = (TextView) findViewById(R.id.point6BVal); // point6BVal
        data.modifyTextPoint6B = data.point6BVal.getText().toString();
        data.modifyTextPoint6B = Integer.toString(data.point6B);
        data.point6BVal.setText(data.modifyTextPoint6B);

        //section 7 called with button
        noObservedInvasivePlants();
        data.point7Val = (TextView) findViewById(R.id.point7Val);
        data.modifyTextPoint7 = data.point7Val.getText().toString();
        data.modifyTextPoint7 = Integer.toString(data.point7);
        data.point7Val.setText(data.modifyTextPoint7);

        //section 8 called with button
        healthyLightGaps();
        data.point8Val = (TextView) findViewById(R.id.point8Val);
        data.modifyTextPoint8 = data.point8Val.getText().toString();
        data.modifyTextPoint8 = Integer.toString(data.point8);
        data.point8Val.setText(data.modifyTextPoint8);

        //section 9 called with button
        microtopography();
        data.point9Val = (TextView) findViewById(R.id.point9Val);
        data.modifyTextPoint9 = data.point9Val.getText().toString();
        data.modifyTextPoint9 = Integer.toString(data.point9);
        data.point9Val.setText(data.modifyTextPoint9);

        //section 10 called with button
        absenceOfHumanActivity();
        data.point10Val = (TextView) findViewById(R.id.point10Val);
        data.modifyTextPoint10 = data.point10Val.getText().toString();
        data.modifyTextPoint10 = Integer.toString(data.point10);
        data.point10Val.setText(data.modifyTextPoint10);

        //section 11 called with button
        absenceOfDeer();
        data.point11Val = (TextView) findViewById(R.id.point11Val);
        data.modifyTextPoint11 = data.point11Val.getText().toString();
        data.modifyTextPoint11 = Integer.toString(data.point11);
        data.point11Val.setText(data.modifyTextPoint11);

        //section 12 called with button
        leafFragmentCover();
        data.total12Val = (TextView) findViewById(R.id.total12Val);
        data.modifyTextSum12 = data.total12Val.getText().toString();
        data.modifyTextSum12 = Integer.toString(data.total12);
        data.total12Val.setText(data.modifyTextSum12);

        data.point12Val = (TextView) findViewById(R.id.point12Val);
        data.modifyTextPoint12 = data.point12Val.getText().toString();
        data.modifyTextPoint12 = Integer.toString(data.point12);
        data.point12Val.setText(data.modifyTextPoint12);

        //total called with button
        totalPoints();
        data.totalPoints = (TextView) findViewById(R.id.totalPoints);
        data.modifyTotalPoints = data.totalPoints.getText().toString();
        data.modifyTotalPoints = "Points:" + " " + Integer.toString(data.total) +  "   " + "Integrity Rank:" + " " + data.qualityRank;
        data.totalPoints.setText(data.modifyTotalPoints);

        //bearing changes saved
        data.bearingChangeAndRationale = (EditText) findViewById(R.id.bearings_rationale_input);
        data.changeAndRationale = data.bearingChangeAndRationale.getText().toString();

        //other past land use evidence saved
        data.otherInput = (EditText) findViewById(R.id.other_landUse_input);
        data.otherLandUseEvidence = data.otherInput.getText().toString();

        //notes saved
        data.notes1 = (EditText) findViewById(R.id.notesInput1);
        data.notes2 = (EditText) findViewById(R.id.notesInput2);
        data.notes3 = (EditText) findViewById(R.id.notesInput3);
        data.notes = data.notes1.getText().toString() + " " + data.notes2.getText().toString() + " " + data.notes3.getText().toString();
    }

    //get Cell value
    public String getCellValue(){
        data.cellValue = (EditText) findViewById(R.id.cell_input);
        String cell = data.cellValue.getText().toString();
        return cell;
    }

    //get Date
    public String getDateValue(){
        data.dateValue = (EditText) findViewById(R.id.date_input);
        String date = data.dateValue.getText().toString();
        return date;
    }

    //get Scorers value
    public String getScorerValue(){
        data.scorersValue = (EditText) findViewById(R.id.scorer_input);
        String scorers = data.scorersValue.getText().toString();
        return scorers;
    }

    // SECTION 1A
    public void herbaceousPlantScore() {
        data.threshold = 20; // threshold for 1A


        data.NW1A = (EditText) findViewById(R.id.NW1A);
        String NW1Anum = data.NW1A.getText().toString();
        if (NW1Anum.equals("")) {
            data.NW1Anumber = 0;
        } else {
            data.NW1Anumber = Integer.parseInt(NW1Anum);
        }

        data.NE1A = (EditText) findViewById(R.id.NE1A);
        String NE1Anum = data.NE1A.getText().toString();
        if (NE1Anum.equals("")) {
            data.NE1Anumber = 0;
        } else {
            data.NE1Anumber = Integer.parseInt(NE1Anum);
        }

        data.SW1A = (EditText) findViewById(R.id.SW1A);
        String SW1Anum = data.SW1A.getText().toString();
        if (SW1Anum.equals("")) {
            data.SW1Anumber = 0;
        } else {
            data.SW1Anumber = Integer.parseInt(SW1Anum);
        }

        data.SE1A = (EditText) findViewById(R.id.SE1A);
        String SE1Anum = data.SE1A.getText().toString();
        if (SE1Anum.equals("")) {
            data.SE1Anumber = 0;
        } else {
            data.SE1Anumber = Integer.parseInt(SE1Anum);
        }

        data.sum1A = data.NW1Anumber + data.NE1Anumber + data.SW1Anumber + data.SE1Anumber;

        if (data.sum1A >= data.threshold) {
            data.point1A = 1;
        } else {
            data.point1A = 0;
        }
    }

    // SECTION 1B
    public void treeSeedlingScore() {
        data.threshold = 16; // threshold for 1B

        data.NW1B = (EditText) findViewById(R.id.NW1B);
        String NW1Bnum = data.NW1B.getText().toString();
        if (NW1Bnum.equals("")) {
            data.NW1Bnumber = 0;
        } else {
            data.NW1Bnumber = Integer.parseInt(NW1Bnum);
        }

        data.NE1B = (EditText) findViewById(R.id.NE1B);
        String NE1Bnum = data.NE1B.getText().toString();
        if (NE1Bnum.equals("")) {
            data.NE1Bnumber = 0;
        } else {
            data.NE1Bnumber = Integer.parseInt(NE1Bnum);
        }

        data.SW1B = (EditText) findViewById(R.id.SW1B);
        String SW1Bnum = data.SW1B.getText().toString();
        if (SW1Bnum.equals("")) {
            data.SW1Bnumber = 0;
        } else {
            data.SW1Bnumber = Integer.parseInt(SW1Bnum);
        }

        data.SE1B = (EditText) findViewById(R.id.SE1B);
        String SE1Bnum = data.SE1B.getText().toString();
        if (SE1Bnum.equals("")) {
            data.SE1Bnumber = 0;
        } else {
            data.SE1Bnumber = Integer.parseInt(SE1Bnum);
        }

        data.sum1B = data.NW1Bnumber + data.NE1Bnumber + data.SW1Bnumber + data.SE1Bnumber;

        if (data.sum1B >= data.threshold) {
            data.point1B = 1;
        } else {
            data.point1B = 0;
        }
    }

    // SECTION 2A
    public void shrubSaplingScore() {
        data.threshold = 120; // threshold for 2A

        data.NW2A = (EditText) findViewById(R.id.NW2A);
        String NW2Anum = data.NW2A.getText().toString();
        if (NW2Anum.equals("")) {
            data.NW2Anumber = 0;
        } else {
            data.NW2Anumber = Integer.parseInt(NW2Anum);
        }

        data.NE2A = (EditText) findViewById(R.id.NE2A);
        String NE2Anum = data.NE2A.getText().toString();
        if (NE2Anum.equals("")) {
            data.NE2Anumber = 0;
        } else {
            data.NE2Anumber = Integer.parseInt(NE2Anum);
        }

        data.SW2A = (EditText) findViewById(R.id.SW2A);
        String SW2Anum = data.SW2A.getText().toString();
        if (SW2Anum.equals("")) {
            data.SW2Anumber = 0;
        } else {
            data.SW2Anumber = Integer.parseInt(SW2Anum);
        }

        data.SE2A = (EditText) findViewById(R.id.SE2A);
        String SE2Anum = data.SE2A.getText().toString();
        if (SE2Anum.equals("")) {
            data.SE2Anumber = 0;
        } else {
            data.SE2Anumber = Integer.parseInt(SE2Anum);
        }

        data.sum2A = data.NW2Anumber + data.NE2Anumber + data.SW2Anumber + data.SE2Anumber;

        if (data.sum2A >= data.threshold) {
            data.point2A = 1;
        } else {
            data.point2A = 0;
        }
    }

    // SECTION 2B
    public void comboShrubSaplingScore() {
        data.threshold = 16; // threshold for 2B

        data.NW2B = (EditText) findViewById(R.id.NW2B);
        String NW2Bnum = data.NW2B.getText().toString();
        if (NW2Bnum.equals("")) {
            data.NW2Bnumber = 0;
        } else {
            data.NW2Bnumber = Integer.parseInt(NW2Bnum);
        }

        data.NE2B = (EditText) findViewById(R.id.NE2B);
        String NE2Bnum = data.NE2B.getText().toString();
        if (NE2Bnum.equals("")) {
            data.NE2Bnumber = 0;
        } else {
            data.NE2Bnumber = Integer.parseInt(NE2Bnum);
        }

        data.SW2B = (EditText) findViewById(R.id.SW2B);
        String SW2Bnum = data.SW2B.getText().toString();
        if (SW2Bnum.equals("")) {
            data.SW2Bnumber = 0;
        } else {
            data.SW2Bnumber = Integer.parseInt(SW2Bnum);
        }

        data.SE2B = (EditText) findViewById(R.id.SE2B);
        String SE2Bnum = data.SE2B.getText().toString();
        if (SE2Bnum.equals("")) {
            data.SE2Bnumber = 0;
        } else {
            data.SE2Bnumber = Integer.parseInt(SE2Bnum);
        }

        data.sum2B = data.NW2Bnumber + data.NE2Bnumber + data.SW2Bnumber + data.SE2Bnumber;

        if (data.sum2B >= data.threshold) {
            data.point2B = 1;
        } else {
            data.point2B = 0;
        }
    }

    // SECTION 3A
    public void matureTreesScore() {
        data.threshold = 24; // threshold for 1A

        data.NW3A = (EditText) findViewById(R.id.NW3A);
        String NW3Anum = data.NW3A.getText().toString();
        if (NW3Anum.equals("")) {
            data.NW3Anumber = 0;
        } else {
            data.NW3Anumber = Integer.parseInt(NW3Anum);
        }

        data.NE3A = (EditText) findViewById(R.id.NE3A);
        String NE3Anum = data.NE3A.getText().toString();
        if (NE3Anum.equals("")) {
            data.NE3Anumber = 0;
        } else {
            data.NE3Anumber = Integer.parseInt(NE3Anum);
        }

        data.SW3A = (EditText) findViewById(R.id.SW3A);
        String SW3Anum = data.SW3A.getText().toString();
        if (SW3Anum.equals("")) {
            data.SW3Anumber = 0;
        } else {
            data.SW3Anumber = Integer.parseInt(SW3Anum);
        }

        data.SE3A = (EditText) findViewById(R.id.SE3A);
        String SE3Anum = data.SE3A.getText().toString();
        if (SE3Anum.equals("")) {
            data.SE3Anumber = 0;
        } else {
            data.SE3Anumber = Integer.parseInt(SE3Anum);
        }

        data.sum3A = data.NW3Anumber + data.NE3Anumber + data.SW3Anumber + data.SE3Anumber;

        if (data.sum3A >= data.threshold) {
            data.point3A = 1;
        } else {
            data.point3A = 0;
        }
    }

    // SECTION 3B
    public void matureTreeSpeciesScore() {
        data.threshold = 3;
        if (data.sum3B >= data.threshold) {
            data.point3B = 1;
        } else {
            data.point3B = 0;
        }
    }

    // SECTION 4A
    public void legacyTreesScore() {
        data.threshold = 7; // threshold for 1A

        data.NW4A = (EditText) findViewById(R.id.NW4A);
        String NW4Anum = data.NW4A.getText().toString();
        if (NW4Anum.equals("")) {
            data.NW4Anumber = 0;
        } else {
            data.NW4Anumber = Integer.parseInt(NW4Anum);
        }

        data.NE4A = (EditText) findViewById(R.id.NE4A);
        String NE4Anum = data.NE4A.getText().toString();
        if (NE4Anum.equals("")) {
            data.NE4Anumber = 0;
        } else {
            data.NE4Anumber = Integer.parseInt(NE4Anum);
        }

        data.SW4A = (EditText) findViewById(R.id.SW4A);
        String SW4Anum = data.SW4A.getText().toString();
        if (SW4Anum.equals("")) {
            data.SW4Anumber = 0;
        } else {
            data.SW4Anumber = Integer.parseInt(SW4Anum);
        }

        data.SE4A = (EditText) findViewById(R.id.SE4A);
        String SE4Anum = data.SE4A.getText().toString();
        if (SE4Anum.equals("")) {
            data.SE4Anumber = 0;
        } else {
            data.SE4Anumber = Integer.parseInt(SE4Anum);
        }

        data.sum4A = data.NW4Anumber + data.NE4Anumber + data.SW4Anumber + data.SE4Anumber;

        if (data.sum4A >= data.threshold) {
            data.point4A = 1;
        } else {
            data.point4A = 0;
        }
    }
    // SECTION 4B
    public void legacyTreeSpeciesScore() {
        data.threshold = 2;
        if (data.sum4B >= data.threshold) {
            data.point4B = 1;
        } else {
            data.point4B = 0;
        }
    }

    // SECTION 5A
    public void snagsScore() {
        // range for 5A
        int minThreshold = 5;
        int maxThreshold = 12;

        data.NW5A = (EditText) findViewById(R.id.NW5A);
        String NW5Anum = data.NW5A.getText().toString();
        if (NW5Anum.equals("")) {
            data.NW5Anumber = 0;
        } else {
            data.NW5Anumber = Integer.parseInt(NW5Anum);
        }

        data.NE5A = (EditText) findViewById(R.id.NE5A);
        String NE5Anum = data.NE5A.getText().toString();
        if (NE5Anum.equals("")) {
            data.NE5Anumber = 0;
        } else {
            data.NE5Anumber = Integer.parseInt(NE5Anum);
        }

        data.SW5A = (EditText) findViewById(R.id.SW5A);
        String SW5Anum = data.SW5A.getText().toString();
        if (SW5Anum.equals("")) {
            data.SW5Anumber = 0;
        } else {
            data.SW5Anumber = Integer.parseInt(SW5Anum);
        }

        data.SE5A = (EditText) findViewById(R.id.SE5A);
        String SE5Anum = data.SE5A.getText().toString();
        if (SE5Anum.equals("")) {
            data.SE5Anumber = 0;
        } else {
            data.SE5Anumber = Integer.parseInt(SE5Anum);
        }

        data.sum5A = data.NW5Anumber + data.NE5Anumber + data.SW5Anumber + data.SE5Anumber;

        // gets point if within range
        if (data.sum5A >= minThreshold && data.sum5A<= maxThreshold) {
            data.point5A = 1;
        } else {
            data.point5A = 0;
        }
    }

    // SECTION 5B
    public void woodyDebrisScore() {
        data.threshold = 12; // threshold for 5B

        data.NW5B = (EditText) findViewById(R.id.NW5B);
        String NW5Bnum = data.NW5B.getText().toString();
        if (NW5Bnum.equals("")) {
            data.NW5Bnumber = 0;
        } else {
            data.NW5Bnumber = Integer.parseInt(NW5Bnum);
        }

        data.NE5B = (EditText) findViewById(R.id.NE5B);
        String NE5Bnum = data.NE5B.getText().toString();
        if (NE5Bnum.equals("")) {
            data.NE5Bnumber = 0;
        } else {
            data.NE5Bnumber = Integer.parseInt(NE5Bnum);
        }

        data.SW5B = (EditText) findViewById(R.id.SW5B);
        String SW5Bnum = data.SW5B.getText().toString();
        if (SW5Bnum.equals("")) {
            data.SW5Bnumber = 0;
        } else {
            data.SW5Bnumber = Integer.parseInt(SW5Bnum);
        }

        data.SE5B = (EditText) findViewById(R.id.SE5B);
        String SE5Bnum = data.SE5B.getText().toString();
        if (SE5Bnum.equals("")) {
            data.SE5Bnumber = 0;
        } else {
            data.SE5Bnumber = Integer.parseInt(SE5Bnum);
        }

        data.sum5B = data.NW5Bnumber + data.NE5Bnumber + data.SW5Bnumber + data.SE5Bnumber;

        if (data.sum5B >= data.threshold) {
            data.point5B = 1;
        } else {
            data.point5B = 0;
        }
    }

    // SECTION 6A
    public void invasiveShrubsScore() {
        data.threshold = 80; // threshold for 6A < 80

        data.NW6A = (EditText) findViewById(R.id.NW6A);
        String NW6Anum = data.NW6A.getText().toString();
        if (NW6Anum.equals("")) {
            data.NW6Anumber = 0;
        } else {
            data.NW6Anumber = Integer.parseInt(NW6Anum);
        }

        data.NE6A = (EditText) findViewById(R.id.NE6A);
        String NE6Anum = data.NE6A.getText().toString();
        if (NE6Anum.equals("")) {
            data.NE6Anumber = 0;
        } else {
            data.NE6Anumber = Integer.parseInt(NE6Anum);
        }

        data.SW6A = (EditText) findViewById(R.id.SW6A);
        String SW6Anum = data.SW6A.getText().toString();
        if (SW6Anum.equals("")) {
            data.SW6Anumber = 0;
        } else {
            data.SW6Anumber = Integer.parseInt(SW6Anum);
        }

        data.SE6A = (EditText) findViewById(R.id.SE6A);
        String SE6Anum = data.SE6A.getText().toString();
        if (SE6Anum.equals("")) {
            data.SE6Anumber = 0;
        } else {
            data.SE6Anumber = Integer.parseInt(SE6Anum);
        }

        data.sum6A = data.NW6Anumber + data.NE6Anumber + data.SW6Anumber + data.SE6Anumber;

        if (data.sum6A < data.threshold) {
            data.point6A = 1;
        } else {
            data.point6A = 0;
        }
    }

    // SECTION 6B
    public void invasiveHerbaceousScore() {
        data.threshold = 200; // threshold for 6B < 200

        data.NW6B = (EditText) findViewById(R.id.NW6B);
        String NW6Bnum = data.NW6B.getText().toString();
        if (NW6Bnum.equals("")) {
            data.NW6Bnumber = 0;
        } else {
            data.NW6Bnumber = Integer.parseInt(NW6Bnum);
        }

        data.NE6B = (EditText) findViewById(R.id.NE6B);
        String NE6Bnum = data.NE6B.getText().toString();
        if (NE6Bnum.equals("")) {
            data.NE6Bnumber = 0;
        } else {
            data.NE6Bnumber = Integer.parseInt(NE6Bnum);
        }

        data.SW6B = (EditText) findViewById(R.id.SW6B);
        String SW6Bnum = data.SW6B.getText().toString();
        if (SW6Bnum.equals("")) {
            data.SW6Bnumber = 0;
        } else {
            data.SW6Bnumber = Integer.parseInt(SW6Bnum);
        }

        data.SE6B = (EditText) findViewById(R.id.SE6B);
        String SE6Bnum = data.SE6B.getText().toString();
        if (SE6Bnum.equals("")) {
            data.SE6Bnumber = 0;
        } else {
            data.SE6Bnumber = Integer.parseInt(SE6Bnum);
        }

        data.sum6B = data.NW6Bnumber + data.NE6Bnumber + data.SW6Bnumber + data.SE6Bnumber;

        if (data.sum6B < data.threshold) {
            data.point6B = 1;
        } else {
            data.point6B = 0;
        }
    }

    //section 7
    public void noObservedInvasivePlants(){
        boolean isChecked = ((CheckBox) findViewById(R.id.checkBox7)).isChecked();
        if (isChecked == true){
            data.point7 = 1;
        }
        else{
            data.point7 = 0;
        }
    }

    //section 8
    public void healthyLightGaps(){
        boolean isChecked = ((CheckBox) findViewById(R.id.checkBox8)).isChecked();
        if (isChecked == true){
            data.point8 = 1;
        }
        else{
            data.point8 = 0;
        }
    }

    //section 9
    public void microtopography(){
        boolean isChecked = ((CheckBox) findViewById(R.id.checkBox9)).isChecked();
        if (isChecked == true){
            data.point9 = 1;
        }
        else{
            data.point9 = 0;
        }
    }

    //section 10
    public void absenceOfHumanActivity(){
        boolean isChecked = ((CheckBox) findViewById(R.id.checkBox10)).isChecked();
        if (isChecked == true){
            data.point10 = 1;
        }
        else{
            data.point10 = 0;
        }
    }

    //section 11
    public void absenceOfDeer(){
        boolean isChecked = ((CheckBox) findViewById(R.id.checkBox11)).isChecked();
        if (isChecked == true){
            data.point11 = 1;
        }
        else{
            data.point11 = 0;
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
            data.pointBoxA = 1;
        }
        else{
            data.pointBoxA = 0;
        }
        if (isCheckedB == true){
            data.pointBoxB = 1;
        }
        else{
            data.pointBoxB = 0;
        }
        if (isCheckedC == true){
            data.pointBoxC = 1;
        }
        else{
            data.pointBoxC = 0;
        }
        if (isCheckedD == true){
            data.pointBoxD = 1;
        }
        else{
            data.pointBoxD = 0;
        }
        if (isCheckedE == true){
            data.pointBoxE = 1;
        }
        else{
            data.pointBoxE = 0;
        }
        data.total12 = data.pointBoxA + data.pointBoxB + data.pointBoxC + data.pointBoxD + data.pointBoxE;

        if(data.total12 >= 4){
            data.point12 = 1;
        }
        else{
            data.point12 = 0;
        }
    }

    // total points and quality rank
    public void totalPoints(){
        data.total = data.point1A + data.point1B + data.point2A + data.point2B + data.point3A + data.point3B + data.point4A + data.point4B + data.point5A + data.point5B + data.point6A + data.point6B + data.point7 + data.point8 + data.point9 + data.point10 + data.point11 + data.point12;
        if(data.total >= 0 && data.total <= 4){
            data.qualityRank = "Low";
        }
        else if (data.total >= 5 && data.total <= 9){
            data.qualityRank = "Medium Low";
        }
        else if (data.total >= 10 && data.total <= 13){
            data.qualityRank = "Medium";
        }
        else if (data.total >= 14 && data.total <= 16){
            data.qualityRank = "Medium High";
        }
        else if (data.total >= 17 && data.total <= 18){
            data.qualityRank = "High";
        }
    }

    // arrayList of data
    public ArrayList<Holder<Object>> getValues(){
        ArrayList<Holder<Object>> list = new ArrayList<>(97);
        list.add(new Holder<Object>(getCellValue(),0));
        list.add(new Holder<Object>(getDateValue(),0));
        list.add(new Holder<Object>(getScorerValue(),0));
        list.add(new Holder<Object>(data.NW1Anumber,1));
        list.add(new Holder<Object>(data.NE1Anumber,1));
        list.add(new Holder<Object>(data.SE1Anumber,1));
        list.add(new Holder<Object>(data.SW1Anumber,1));
        list.add(new Holder<Object>(data.sum1A,1));
        list.add(new Holder<Object>(data.point1A,1));
        list.add(new Holder<Object>(data.NW1Bnumber,1));
        list.add(new Holder<Object>(data.NE1Bnumber,1));
        list.add(new Holder<Object>(data.SE1Bnumber,1));
        list.add(new Holder<Object>(data.SW1Bnumber,1));
        list.add(new Holder<Object>(data.sum1B,1));
        list.add(new Holder<Object>(data.point1B,1));
        list.add(new Holder<Object>(data.NE2Anumber,1));
        list.add(new Holder<Object>(data.SE2Anumber,1));
        list.add(new Holder<Object>(data.NW2Anumber,1));
        list.add(new Holder<Object>(data.SW2Anumber,1));
        list.add(new Holder<Object>(data.sum2A,1));
        list.add(new Holder<Object>(data.point2A,1));
        list.add(new Holder<Object>(data.NW2Bnumber,1));
        list.add(new Holder<Object>(data.NE2Bnumber,1));
        list.add(new Holder<Object>(data.SE2Bnumber,1));
        list.add(new Holder<Object>(data.SW2Bnumber,1));
        list.add(new Holder<Object>(data.sum2B,1));
        list.add(new Holder<Object>(data.point2B,1));
        list.add(new Holder<Object>(data.NW3Anumber,1));
        list.add(new Holder<Object>(data.NE3Anumber,1));
        list.add(new Holder<Object>(data.SE3Anumber,1));
        list.add(new Holder<Object>(data.SW3Anumber,1));
        list.add(new Holder<Object>(data.sum3A,1));
        list.add(new Holder<Object>(data.point3A,1));
        list.add(new Holder<Object>(data.list3B,0));
        list.add(new Holder<Object>(data.dominant3B1,0));
        list.add(new Holder<Object>(data.dominant3B2,0));
        list.add(new Holder<Object>(data.sum3B,1));
        list.add(new Holder<Object>(data.point3B,1));
        list.add(new Holder<Object>(data.NW4Anumber,1));
        list.add(new Holder<Object>(data.NE4Anumber,1));
        list.add(new Holder<Object>(data.SE4Anumber,1));
        list.add(new Holder<Object>(data.SW4Anumber,1));
        list.add(new Holder<Object>(data.sum4A,1));
        list.add(new Holder<Object>(data.point4A,1));
        list.add(new Holder<Object>(data.list4B,0));
        list.add(new Holder<Object>(data.sum4B,1));
        list.add(new Holder<Object>(data.point4B,1));
        list.add(new Holder<Object>(data.NW5Anumber,1));
        list.add(new Holder<Object>(data.NE5Anumber,1));
        list.add(new Holder<Object>(data.SE5Anumber,1));
        list.add(new Holder<Object>(data.SW5Anumber,1));
        list.add(new Holder<Object>(data.sum5A,1));
        list.add(new Holder<Object>(data.point5A,1));
        list.add(new Holder<Object>(data.NW5Bnumber,1));
        list.add(new Holder<Object>(data.NE5Bnumber,1));
        list.add(new Holder<Object>(data.SE5Bnumber,1));
        list.add(new Holder<Object>(data.SW5Bnumber,1));
        list.add(new Holder<Object>(data.sum5B,1));
        list.add(new Holder<Object>(data.point5B,1));
        list.add(new Holder<Object>(data.NW6Anumber,1));
        list.add(new Holder<Object>(data.NE6Anumber,1));
        list.add(new Holder<Object>(data.SE6Anumber,1));
        list.add(new Holder<Object>(data.SW6Anumber,1));
        list.add(new Holder<Object>(data.sum6A,1));
        list.add(new Holder<Object>(data.point6A,1));
        list.add(new Holder<Object>(data.NW6Bnumber,1));
        list.add(new Holder<Object>(data.NE6Bnumber,1));
        list.add(new Holder<Object>(data.SE6Bnumber,1));
        list.add(new Holder<Object>(data.SW6Bnumber,1));
        list.add(new Holder<Object>(data.sum6B,1));
        list.add(new Holder<Object>(data.point6B,1));
        list.add(new Holder<Object>(data.point7,1));
        list.add(new Holder<Object>(data.point8,1));
        list.add(new Holder<Object>(data.point9,1));
        list.add(new Holder<Object>(data.point10,1));
        list.add(new Holder<Object>(data.point11,1));
        list.add(new Holder<Object>(data.pointBoxA,1));
        list.add(new Holder<Object>(data.pointBoxB,1));
        list.add(new Holder<Object>(data.pointBoxD,1));
        list.add(new Holder<Object>(data.pointBoxC,1));
        list.add(new Holder<Object>(data.pointBoxE,1));
        list.add(new Holder<Object>(data.total12,1));
        list.add(new Holder<Object>(data.point12,1));
        list.add(new Holder<Object>(data.total,1));
        list.add(new Holder<Object>(data.qualityRank,0));
        list.add(new Holder<Object>(data.beech,1));
        list.add(new Holder<Object>(data.bld,1));
        list.add(new Holder<Object>(data.bldSeverity,0));
        list.add(new Holder<Object>(data.beechAbundance,0));
        list.add(new Holder<Object>(data.ash,1));
        list.add(new Holder<Object>(data.eab,1));
        list.add(new Holder<Object>(data.eabSeverity,0));
        list.add(new Holder<Object>(data.ashAbundance,0));
        list.add(new Holder<Object>(data.eahe,1));
        list.add(new Holder<Object>(data.hwa,1));
        list.add(new Holder<Object>(data.hwaSeverity,0));
        list.add(new Holder<Object>(data.eaheAbundance,0));
        return list;
    }

    public boolean saveSheetData(RUFASheetData sheetData){
        JsonObject obj = JsonSerializer.serialize(data);
        String jsonString = obj.toString();
        String name = sheetData.cell + ":" + sheetData.date;
        Log.i("int",jsonString);
        Log.i("int",name);
        try {
            InternalStorageAccessor.writeToFile(getApplicationContext(), name, jsonString);
            return true;
        }catch(IOException e){

            return false;
        }
    }

    public void loadSheetData(View v){
        String cell = data.cell;
        String date = data.date;
        //get list of files and select
        File[] files = InternalStorageAccessor.getFileList(getApplicationContext());
        final String[] fileNames = new String[files.length];
        for(int i = 0; i < files.length; i ++){
            fileNames[i] = files[i].getName();
        }

        AlertDialog diag = new AlertDialog.Builder(MainActivity.this).setTitle("Choose a file").setItems(fileNames, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialogInterface, int i) {
                fileName = fileNames[i];
                Log.i("load","file name acquired");
                Log.i("load",fileName);
                try {
                    //load file data
                    JsonObject obj = InternalStorageAccessor.readFromFile(getApplicationContext(),fileName);
                    RUFASheetData loadData = JsonSerializer.deserialize(obj);
                    MainActivity.this.data = loadData;
                    Log.i("load",obj.toString());
                    Log.i("load","data loaded");
                    //TODO checkboxes and the like
                    updateSheet(loadData);
                } catch (IOException e){
                    e.printStackTrace();
                    Log.e("load","io exception",e);
                }
            }
        }).create();
        diag.show();
        Log.i("load","dialog shown");
    }

    public void updateSheet(RUFASheetData d){
        ((EditText)findViewById(R.id.cell_input)).setText(d.cell);
        ((EditText)findViewById(R.id.date_input)).setText(d.date);
        ((EditText)findViewById(R.id.scorer_input)).setText(d.scorers);
        //SECTION 1
        ((EditText)findViewById(R.id.NW1A)).setText(d.NW1Anumber);
        ((EditText)findViewById(R.id.NE1A)).setText(d.NE1Anumber);
        ((TextView)findViewById(R.id.sum1AVal)).setText(d.sum1A);
        ((EditText)findViewById(R.id.SW1A)).setText(d.SW1Anumber);
        ((EditText)findViewById(R.id.SE1A)).setText(d.SE1Anumber);
        ((TextView)findViewById(R.id.point1AVal)).setText(d.point1A);
        //1B
        ((EditText)findViewById(R.id.NW1B)).setText(d.NW1Bnumber);
        ((EditText)findViewById(R.id.NE1B)).setText(d.NE1Bnumber);
        ((TextView)findViewById(R.id.sum1BVal)).setText(d.sum1B);
        ((EditText)findViewById(R.id.SW1B)).setText(d.SW1Bnumber);
        ((EditText)findViewById(R.id.SE1B)).setText(d.SE1Bnumber);
        ((TextView)findViewById(R.id.point2BVal)).setText(d.point1B);
        //SECTION 2
        ((EditText)findViewById(R.id.NW2A)).setText(d.NW2Anumber);
        ((EditText)findViewById(R.id.NE2A)).setText(d.NE2Anumber);
        ((TextView)findViewById(R.id.sum2AVal)).setText(d.sum2A);
        ((EditText)findViewById(R.id.SW2A)).setText(d.SW2Anumber);
        ((EditText)findViewById(R.id.SE2A)).setText(d.SE2Anumber);
        ((TextView)findViewById(R.id.point2AVal)).setText(d.point2A);
        //2B
        ((EditText)findViewById(R.id.NW2B)).setText(d.NW2Bnumber);
        ((EditText)findViewById(R.id.NE2B)).setText(d.NE2Bnumber);
        ((TextView)findViewById(R.id.sum2BVal)).setText(d.sum2B);
        ((EditText)findViewById(R.id.SW2B)).setText(d.SW2Bnumber);
        ((EditText)findViewById(R.id.SE2B)).setText(d.SE2Bnumber);
        ((TextView)findViewById(R.id.point2BVal)).setText(d.point2B);
        //SECTION 3A
        ((EditText)findViewById(R.id.NW3A)).setText(d.NW3Anumber);
        ((EditText)findViewById(R.id.NE3A)).setText(d.NE3Anumber);
        ((TextView)findViewById(R.id.sum3AVal)).setText(d.sum3A);
        ((EditText)findViewById(R.id.SW3A)).setText(d.SW3Anumber);
        ((EditText)findViewById(R.id.SE3A)).setText(d.SE3Anumber);
        ((TextView)findViewById(R.id.point3AVal)).setText(d.point3A);
        //3B
        ((TextView)findViewById(R.id.dominant3B1)).setText(d.dominant3B1);
        ((TextView)findViewById(R.id.dominant3B2)).setText(d.dominant3B2);
        ((TextView)findViewById(R.id.listOfTrees3B)).setText(d.list3B);
        //SECTION 3A
        ((EditText)findViewById(R.id.NW3A)).setText(d.NW3Anumber);
        ((EditText)findViewById(R.id.NE3A)).setText(d.NE3Anumber);
        ((TextView)findViewById(R.id.sum3AVal)).setText(d.sum3A);
        ((EditText)findViewById(R.id.SW3A)).setText(d.SW3Anumber);
        ((EditText)findViewById(R.id.SE3A)).setText(d.SE3Anumber);
        ((TextView)findViewById(R.id.point3AVal)).setText(d.point3A);
        //3B
        ((TextView)findViewById(R.id.dominant3B1)).setText(d.dominant3B1);
        ((TextView)findViewById(R.id.dominant3B2)).setText(d.dominant3B2);
        ((TextView)findViewById(R.id.listOfTrees3B)).setText(d.list3B);
        ((TextView)findViewById(R.id.point3BVal)).setText(d.point3B);
        ((TextView)findViewById(R.id.sum3BVal)).setText(d.sum3B);
        //SECTION 4A
        ((EditText)findViewById(R.id.NW4A)).setText(d.NW4Anumber);
        ((EditText)findViewById(R.id.NE4A)).setText(d.NE4Anumber);
        ((TextView)findViewById(R.id.sum4AVal)).setText(d.sum4A);
        ((EditText)findViewById(R.id.SW4A)).setText(d.SW4Anumber);
        ((EditText)findViewById(R.id.SE4A)).setText(d.SE4Anumber);
        ((TextView)findViewById(R.id.point4AVal)).setText(d.point4A);
        //4B
        ((TextView)findViewById(R.id.dominant4B1)).setText(d.dominant4B1);
        ((TextView)findViewById(R.id.dominant4B2)).setText(d.dominant4B2);
        ((TextView)findViewById(R.id.listOfTrees4B)).setText(d.list4B);
        ((TextView)findViewById(R.id.point4BVal)).setText(d.point4B);
        ((TextView)findViewById(R.id.sum4BVal)).setText(d.sum4B);
        //SECTION 5
        ((EditText)findViewById(R.id.NW5A)).setText(d.NW5Anumber);
        ((EditText)findViewById(R.id.NE5A)).setText(d.NE5Anumber);
        ((TextView)findViewById(R.id.sum5AVal)).setText(d.sum5A);
        ((EditText)findViewById(R.id.SW5A)).setText(d.SW5Anumber);
        ((EditText)findViewById(R.id.SE5A)).setText(d.SE5Anumber);
        ((TextView)findViewById(R.id.point5AVal)).setText(d.point5A);
        //5B
        ((EditText)findViewById(R.id.NW5B)).setText(d.NW5Bnumber);
        ((EditText)findViewById(R.id.NE5B)).setText(d.NE5Bnumber);
        ((TextView)findViewById(R.id.sum5BVal)).setText(d.sum5B);
        ((EditText)findViewById(R.id.SW5B)).setText(d.SW5Bnumber);
        ((EditText)findViewById(R.id.SE5B)).setText(d.SE5Bnumber);
        ((TextView)findViewById(R.id.point5BVal)).setText(d.point5B);
        //SECTION 6
        ((EditText)findViewById(R.id.NW6A)).setText(d.NW6Anumber);
        ((EditText)findViewById(R.id.NE6A)).setText(d.NE6Anumber);
        ((TextView)findViewById(R.id.sum6AVal)).setText(d.sum6A);
        ((EditText)findViewById(R.id.SW6A)).setText(d.SW6Anumber);
        ((EditText)findViewById(R.id.SE6A)).setText(d.SE6Anumber);
        ((TextView)findViewById(R.id.point6AVal)).setText(d.point6A);
        //6B
        ((EditText)findViewById(R.id.NW5B)).setText(d.NW5Bnumber);
        ((EditText)findViewById(R.id.NE5B)).setText(d.NE5Bnumber);
        ((TextView)findViewById(R.id.sum5BVal)).setText(d.sum5B);
        ((EditText)findViewById(R.id.SW5B)).setText(d.SW5Bnumber);
        ((EditText)findViewById(R.id.SE5B)).setText(d.SE5Bnumber);
        ((TextView)findViewById(R.id.point5BVal)).setText(d.point5B);
        //section 7
        ((CheckBox)findViewById(R.id.checkBox7)).setChecked(d.point7 == 1);
        ((TextView)findViewById(R.id.point7Val)).setText(d.point7);
        //section 8
        ((CheckBox)findViewById(R.id.checkBox8)).setChecked(d.point8 == 1);
        ((TextView)findViewById(R.id.point8Val)).setText(d.point8);
        //section 9
        ((CheckBox)findViewById(R.id.checkBox9)).setChecked(d.point9 == 1);
        ((TextView)findViewById(R.id.point9Val)).setText(d.point9);
        //section 10
        ((CheckBox)findViewById(R.id.checkBox10)).setChecked(d.point10 == 1);
        ((TextView)findViewById(R.id.point10Val)).setText(d.point10);
        //section 11
        ((CheckBox)findViewById(R.id.checkBox11)).setChecked(d.point11 == 1);
        ((TextView)findViewById(R.id.point11Val)).setText(d.point11);
        //section 12
        ((CheckBox)findViewById(R.id.checkBox12A)).setChecked(d.pointBoxA == 1);
        ((CheckBox)findViewById(R.id.checkBox12B)).setChecked(d.pointBoxB == 1);
        ((CheckBox)findViewById(R.id.checkBox12C)).setChecked(d.pointBoxC == 1);
        ((CheckBox)findViewById(R.id.checkBox12D)).setChecked(d.pointBoxD == 1);
        ((CheckBox)findViewById(R.id.checkBox12E)).setChecked(d.pointBoxE == 1);
        ((TextView)findViewById(R.id.total12Val)).setText(d.total12);
        ((TextView)findViewById(R.id.point12Val)).setText(d.point12);
        //Total and Rank
    }

    public boolean saveToCSV(){
        //TODO move permission to button
        ExternalStorageAccessor ea = new ExternalStorageAccessor();
        if(ea.isStorageWriteable()){
            try {
                ea.writeToCsv(getApplicationContext(), RUFAdbOpenHelper.getKeyList(), getValues());
                return true;
            }catch (IOException e){
                return false;
            }
        }else {
            return false;
        }
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        switch(requestCode){
            case 5: {
                if(grantResults.length > 0 && grantResults[0] == PackageManager.PERMISSION_GRANTED){
                    saveToCSV();
                }else{
                    //TODO show dialog, need permission to save
                }
                return;
            }
        }
    }
}