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
    private RUFASheetData data = new RUFASheetData();

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

        data.updateBottom = (Button) findViewById(R.id.updateBottom);
        data.updateBottom.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                updateButtonPressed();
            }
        });

        data.updateTop = (Button) findViewById(R.id.updateTop);
        data.updateTop.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                updateButtonPressed();
            }
        });

        data.addDominant3B1 = (Button) findViewById(R.id.addDominant3B1);
        data.addDominant3B1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                data.addTreeToDominant3B1 = (TextView) findViewById(R.id.dominant3B1);
                data.modifyAdd3B = data.addTreeToDominant3B1.getText().toString();
                data.addTreeToDominant3B1.setText(data.selected3BDominant1);
            }
        });

        data.addDominant4B1 = (Button) findViewById(R.id.addDominant4B1);
        data.addDominant4B1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                data.addTreeToDominant4B1 = (TextView) findViewById(R.id.dominant4B1);
                data.modifyAdd4B = data.addTreeToDominant4B1.getText().toString();
                data.addTreeToDominant4B1.setText(data.selected4BDominant1);
            }
        });

        data.addDominant3B2 = (Button) findViewById(R.id.addDominant3B2);
        data.addDominant3B2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                data.addTreeToDominant3B2 = (TextView) findViewById(R.id.dominant3B2);
                data.modifyAdd3B = data.addTreeToDominant3B2.getText().toString();
                data.addTreeToDominant3B2.setText(data.selected3BDominant2);
            }
        });

        data.addDominant4B2 = (Button) findViewById(R.id.addDominant4B2);
        data.addDominant4B2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                data.addTreeToDominant4B2 = (TextView) findViewById(R.id.dominant4B2);
                data.modifyAdd4B = data.addTreeToDominant4B2.getText().toString();
                data.addTreeToDominant4B2.setText(data.selected4BDominant2);
            }
        });

        data.add3B = (Button) findViewById(R.id.addTree3B);
        data.add3B.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                data.addTreeToList3B = (TextView) findViewById(R.id.listOfTrees3B);
                data.modifyAdd3B = data.addTreeToList3B.getText().toString();
                data.addTreeToList3B.setText(data.selected3B);
            }
        });

        data.clear3B = (Button) findViewById(R.id.clear3B);
        data.clear3B.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                data.addTreeToList3B = (TextView) findViewById(R.id.listOfTrees3B);
                data.modifyAdd3B = data.addTreeToList3B.getText().toString();
                data.selected3B = "";
                data.sum3B = 0;
                data.addTreeToList3B.setText(data.selected3B);

                data.addTreeToDominant3B1 = (TextView) findViewById(R.id.dominant3B1);
                data.modifyAdd3B = data.addTreeToDominant3B1.getText().toString();
                data.selected3BDominant1 = " ";
                data.addTreeToDominant3B1.setText(data.selected3BDominant1);

                data.addTreeToDominant3B2 = (TextView) findViewById(R.id.dominant3B2);
                data.modifyAdd3B = data.addTreeToDominant3B2.getText().toString();
                data.selected3BDominant2 = " ";
                data.addTreeToDominant3B2.setText(data.selected3BDominant2);

                data.toggle3B1 = (CheckBox) findViewById(R.id.checkBoxDominant3B1);
                data.toggle3B2 = (CheckBox) findViewById(R.id.checkBoxDominant3B2);
                data.toggle3B1.setChecked(false);
                data.toggle3B2.setChecked(false);

                View c = findViewById(R.id.addDominant3B1);
                c.setVisibility(View.INVISIBLE);
                View b = findViewById(R.id.addTree3B);
                b.setVisibility(View.VISIBLE);
                View d = findViewById(R.id.addDominant3B2);
                d.setVisibility(View.INVISIBLE);
            }
        });

        data.tree_types3B = (Spinner) findViewById(R.id.tree_types_spinner3B);
        data.tree_types3B.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                boolean isCheckedDominant3B1 = ((CheckBox) findViewById(R.id.checkBoxDominant3B1)).isChecked();
                boolean isCheckedDominant3B2 = ((CheckBox) findViewById(R.id.checkBoxDominant3B2)).isChecked();
                data.toggle3B1 = (CheckBox) findViewById(R.id.checkBoxDominant3B1);
                data.toggle3B2 = (CheckBox) findViewById(R.id.checkBoxDominant3B2);
                View c = findViewById(R.id.addDominant3B1);
                c.setVisibility(View.INVISIBLE);
                View b = findViewById(R.id.addTree3B);
                b.setVisibility(View.VISIBLE);
                View d = findViewById(R.id.addDominant3B2);
                d.setVisibility(View.INVISIBLE);
                if (data.selected3B == null) {
                    data.selected3B = "";
                    data.sum3B = 0;
                } else if (isCheckedDominant3B1 == false && isCheckedDominant3B2 == false){
                    data.selected3B = adapterView.getSelectedItem().toString() + "  " + data.selected3B;
                    data.sum3B ++;
                    c.setVisibility(View.INVISIBLE);
                    d.setVisibility(View.INVISIBLE);
                    b.setVisibility(View.VISIBLE);
                }
                else if (isCheckedDominant3B1 == true && isCheckedDominant3B2 == false) {
                    data.selected3BDominant1 = adapterView.getSelectedItem().toString();
                    data.toggle3B1.setChecked(false);
                    c.setVisibility(View.VISIBLE);
                    d.setVisibility(View.INVISIBLE);
                    b.setVisibility(View.INVISIBLE);
                }
                else if (isCheckedDominant3B1 == false && isCheckedDominant3B2 == true){
                    data.selected3BDominant2 = adapterView.getSelectedItem().toString();
                    data.toggle3B2.setChecked(false);
                    c.setVisibility(View.INVISIBLE);
                    d.setVisibility(View.VISIBLE);
                    b.setVisibility(View.INVISIBLE);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });

        data.add4B = (Button) findViewById(R.id.addTree4B);
        data.add4B.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                data.addTreeToList4B = (TextView) findViewById(R.id.listOfTrees4B);
                data.modifyAdd4B = data.addTreeToList4B.getText().toString();
                data.addTreeToList4B.setText(data.selected4B);
            }
        });

        data.clear4B = (Button) findViewById(R.id.clear4B);
        data.clear4B.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                data.addTreeToList4B = (TextView) findViewById(R.id.listOfTrees4B);
                data.modifyAdd4B = data.addTreeToList4B.getText().toString();
                data.selected4B = "";
                data.sum4B = 0;
                data.addTreeToList4B.setText(data.selected4B);

                data.addTreeToDominant4B1 = (TextView) findViewById(R.id.dominant4B1);
                data.modifyAdd4B = data.addTreeToDominant4B1.getText().toString();
                data.selected4BDominant1 = " ";
                data.addTreeToDominant4B1.setText(data.selected4BDominant1);

                data.addTreeToDominant4B2 = (TextView) findViewById(R.id.dominant4B2);
                data.modifyAdd4B = data.addTreeToDominant4B2.getText().toString();
                data.selected4BDominant2 = " ";
                data.addTreeToDominant4B2.setText(data.selected4BDominant2);

                data.toggle4B1 = (CheckBox) findViewById(R.id.checkBoxDominant4B1);
                data.toggle4B2 = (CheckBox) findViewById(R.id.checkBoxDominant4B2);
                data.toggle4B1.setChecked(false);
                data.toggle4B2.setChecked(false);

                View c = findViewById(R.id.addDominant4B1);
                c.setVisibility(View.INVISIBLE);
                View b = findViewById(R.id.addTree4B);
                b.setVisibility(View.VISIBLE);
                View d = findViewById(R.id.addDominant4B2);
                d.setVisibility(View.INVISIBLE);
            }
        });

        data.tree_types4B = (Spinner) findViewById(R.id.tree_types_spinner4B);
        data.tree_types4B.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                boolean isCheckedDominant4B1 = ((CheckBox) findViewById(R.id.checkBoxDominant4B1)).isChecked();
                boolean isCheckedDominant4B2 = ((CheckBox) findViewById(R.id.checkBoxDominant4B2)).isChecked();
                data.toggle4B1 = (CheckBox) findViewById(R.id.checkBoxDominant4B1);
                data.toggle4B2 = (CheckBox) findViewById(R.id.checkBoxDominant4B2);
                View c = findViewById(R.id.addDominant4B1);
                c.setVisibility(View.INVISIBLE);
                View b = findViewById(R.id.addTree4B);
                b.setVisibility(View.VISIBLE);
                View d = findViewById(R.id.addDominant4B2);
                d.setVisibility(View.INVISIBLE);
                if (data.selected4B == null) {
                    data.selected4B = "";
                    data.sum4B = 0;
                } else if (isCheckedDominant4B1 == false && isCheckedDominant4B2 == false){
                    data.selected4B = adapterView.getSelectedItem().toString() + "  " + data.selected4B;
                    data.sum4B++;
                    c.setVisibility(View.INVISIBLE);
                    d.setVisibility(View.INVISIBLE);
                    b.setVisibility(View.VISIBLE);
                } else if (isCheckedDominant4B1 == true && isCheckedDominant4B2 == true){
                    data.selected4B = adapterView.getSelectedItem().toString() + "  " + data.selected4B;
                    data.sum4B++;
                    c.setVisibility(View.INVISIBLE);
                    d.setVisibility(View.INVISIBLE);
                    b.setVisibility(View.VISIBLE);
                }
                else if (isCheckedDominant4B1 == true && isCheckedDominant4B2 == false) {
                    data.selected4BDominant1 = adapterView.getSelectedItem().toString();
                    data.toggle4B1.setChecked(false);
                    c.setVisibility(View.VISIBLE);
                    d.setVisibility(View.INVISIBLE);
                    b.setVisibility(View.INVISIBLE);
                }
                else if (isCheckedDominant4B1 == false && isCheckedDominant4B2 == true){
                    data.selected4BDominant2 = adapterView.getSelectedItem().toString();
                    data.toggle4B2.setChecked(false);
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
        data.addPlantCommunity = (Button) findViewById(R.id.select_community_type);
        data.addPlantCommunity.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                data.addTreeToListPlantCommunity = (TextView) findViewById(R.id.community_type_value);
                data.modifyCommunityType = data.addTreeToListPlantCommunity.getText().toString();
                data.addTreeToListPlantCommunity.setText(data.selectedPlantCommunity);
            }
        });

        data.plant_community = (Spinner) findViewById(R.id.community_type_spinner);
        data.plant_community.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if (data.selectedPlantCommunity == null) {
                    data.selectedPlantCommunity = "";
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
                    data.otherInput = (EditText) findViewById(R.id.other_landUse_input);
                    data.otherLandUseEvidence = data.otherInput.getText().toString();
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
                else
                    data.saplingPresent = 0;
            }
        });

        data.smallPole = (CheckBox) findViewById(R.id.checkBoxSmallPole);
        data.smallPole.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                boolean isCheckedsmallPole = ((CheckBox) findViewById(R.id.checkBoxSmallPole)).isChecked();

                if (isCheckedsmallPole == true) {
                    data.smallPolePresent = 1;
                }
                else
                    data.smallPolePresent = 0;
            }
        });

        data.medPole = (CheckBox) findViewById(R.id.checkBoxMedPole);
        data.medPole.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                boolean isCheckedmedPole = ((CheckBox) findViewById(R.id.checkBoxMedPole)).isChecked();

                if (isCheckedmedPole == true) {
                    data.medPolePresent = 1;
                }
                else
                    data.medPolePresent = 0;
            }
        });

        data.standard = (CheckBox) findViewById(R.id.checkBoxStandard);
        data.standard.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                boolean isCheckedstandard = ((CheckBox) findViewById(R.id.checkBoxStandard)).isChecked();

                if (isCheckedstandard == true) {
                    data.standardPresent = 1;
                }
                else
                    data.standardPresent = 0;
            }
        });

        data.veteran = (CheckBox) findViewById(R.id.checkBoxVeteran);
        data.veteran.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                boolean isCheckedveteran = ((CheckBox) findViewById(R.id.checkBoxVeteran)).isChecked();

                if (isCheckedveteran == true) {
                    data.veteranPresent = 1;
                }
                else
                    data.veteranPresent = 0;
            }
        });

        data.addDominantAgeClasses1 = (Button) findViewById(R.id.addDominantAgeClasses1);
        data.addDominantAgeClasses1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                boolean isCheckedDominantSapling1 = ((CheckBox) findViewById(R.id.checkBoxDominantSapling1)).isChecked();
                boolean isCheckedDominantSmallPole1 = ((CheckBox) findViewById(R.id.checkBoxDominantSmallPole1)).isChecked();
                boolean isCheckedDominantMedPole1 = ((CheckBox) findViewById(R.id.checkBoxDominantMedPole1)).isChecked();
                boolean isCheckedDominantStandard1 = ((CheckBox) findViewById(R.id.checkBoxDominantStandard1)).isChecked();
                boolean isCheckedDominantVeteran1 = ((CheckBox) findViewById(R.id.checkBoxDominantVeteran1)).isChecked();
                data.toggleSmallPole1 = (CheckBox) findViewById(R.id.checkBoxDominantSmallPole1);
                data.toggleMedPole1 = (CheckBox) findViewById(R.id.checkBoxDominantMedPole1);
                data.toggleSapling1 = (CheckBox) findViewById(R.id.checkBoxDominantSapling1);
                data.toggleStandard1 = (CheckBox) findViewById(R.id.checkBoxDominantStandard1);
                data.toggleVeteran1 = (CheckBox) findViewById(R.id.checkBoxDominantVeteran1);


                if (isCheckedDominantSapling1 == true) {
                    data.addTreeToDominantSapling1 = (TextView) findViewById(R.id.dominantSapling1);
                    data.dominantSapling1 = data.selectedAgeClass;
                    data.addTreeToDominantSapling1.setText(data.selectedAgeClass);
                    data.toggleSapling1.setChecked(false);
                }else if (isCheckedDominantSmallPole1 == true){
                    data.addTreeToDominantSmallPole1 = (TextView) findViewById(R.id.dominantSmallPole1);
                    data.dominantSmallPole1 = data.selectedAgeClass;
                    data.addTreeToDominantSmallPole1.setText(data.selectedAgeClass);
                    data.toggleSmallPole1.setChecked(false);
                }else if (isCheckedDominantMedPole1 == true){
                    data.addTreeToDominantMedPole1 = (TextView) findViewById(R.id.dominantMedPole1);
                    data.dominantMedPole1 = data.selectedAgeClass;
                    data.addTreeToDominantMedPole1.setText(data.selectedAgeClass);
                    data.toggleMedPole1.setChecked(false);
                }else if (isCheckedDominantStandard1 == true){
                    data.addTreeToDominantStandard1 = (TextView) findViewById(R.id.dominantStandard1);
                    data.dominantStandardPole1 = data.selectedAgeClass;
                    data.addTreeToDominantStandard1.setText(data.selectedAgeClass);
                    data.toggleStandard1.setChecked(false);
                }else if (isCheckedDominantVeteran1 == true){
                    data.addTreeToDominantVeteran1 = (TextView) findViewById(R.id.dominantVeteran1);
                    data.dominantVeteran1 = data.selectedAgeClass;
                    data.addTreeToDominantVeteran1.setText(data.selectedAgeClass);
                    data.toggleVeteran1.setChecked(false);
                }

            }
        });

        data.addDominantAgeClasses2 = (Button) findViewById(R.id.addDominantAgeClasses2);
        data.addDominantAgeClasses2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                boolean isCheckedDominantSapling2 = ((CheckBox) findViewById(R.id.checkBoxDominantSapling2)).isChecked();
                boolean isCheckedDominantSmallPole2 = ((CheckBox) findViewById(R.id.checkBoxDominantSmallPole2)).isChecked();
                boolean isCheckedDominantMedPole2 = ((CheckBox) findViewById(R.id.checkBoxDominantMedPole2)).isChecked();
                boolean isCheckedDominantStandard2 = ((CheckBox) findViewById(R.id.checkBoxDominantStandard2)).isChecked();
                boolean isCheckedDominantVeteran2 = ((CheckBox) findViewById(R.id.checkBoxDominantVeteran2)).isChecked();
                data.toggleSapling2 = (CheckBox) findViewById(R.id.checkBoxDominantSapling2);
                data.toggleSmallPole2 = (CheckBox) findViewById(R.id.checkBoxDominantSmallPole2);
                data.toggleMedPole2 = (CheckBox) findViewById(R.id.checkBoxDominantMedPole2);
                data.toggleStandard2 = (CheckBox) findViewById(R.id.checkBoxDominantStandard2);
                data.toggleVeteran2 = (CheckBox) findViewById(R.id.checkBoxDominantVeteran2);


                if (isCheckedDominantSapling2 == true){
                    data.addTreeToDominantSapling2 = (TextView) findViewById(R.id.dominantSapling2);
                    data.dominantSapling2 = data.selectedAgeClass;
                    data.addTreeToDominantSapling2.setText(data.selectedAgeClass);
                    data.toggleSapling2.setChecked(false);
                }else if (isCheckedDominantSmallPole2 == true){
                    data.addTreeToDominantSmallPole2 = (TextView) findViewById(R.id.dominantSmallPole2);
                    data.dominantSmallPole2 = data.selectedAgeClass;
                    data.addTreeToDominantSmallPole2.setText(data.selectedAgeClass);
                    data.toggleSmallPole2.setChecked(false);
                }else if (isCheckedDominantMedPole2 == true){
                    data.addTreeToDominantMedPole2 = (TextView) findViewById(R.id.dominantMedPole2);
                    data.dominantMedPole2 = data.selectedAgeClass;
                    data.addTreeToDominantMedPole2.setText(data.selectedAgeClass);
                    data.toggleMedPole2.setChecked(false);
                }else if (isCheckedDominantStandard2 == true){
                    data.addTreeToDominantStandard2 = (TextView) findViewById(R.id.dominantStandard2);
                    data.dominantStandardPole2 = data.selectedAgeClass;
                    data.addTreeToDominantStandard2.setText(data.selectedAgeClass);
                    data.toggleStandard2.setChecked(false);
                }else if (isCheckedDominantVeteran2 == true){
                    data.addTreeToDominantVeteran2 = (TextView) findViewById(R.id.dominantVeteran2);
                    data.dominantVeteran2 = data.selectedAgeClass;
                    data.addTreeToDominantVeteran2.setText(data.selectedAgeClass);
                    data.toggleVeteran2.setChecked(false);
                }
            }
        });

        data.age_classes = (Spinner) findViewById(R.id.tree_types_spinnerAgeClasses);
        data.age_classes.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                if (data.selectedAgeClass == null) {
                    data.selectedAgeClass = "";
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
                    data.beechMedium.setChecked(false);
                    data.beechHigh.setChecked(false);
                    data.beech = 1;
                    data.beechAbundance = "Low";
                }
                else if (isCheckedBeechPresent == false && isCheckedBeechLow == true){
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
                    data.beechLow.setChecked(false);
                    data.beechHigh.setChecked(false);
                    data.beech = 1;
                    data.beechAbundance = "Medium";
                }
                else if (isCheckedBeechPresent == false && isCheckedBeechMedium == true){
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
                    data.beechMedium.setChecked(false);
                    data.beechLow.setChecked(false);
                    data.beech = 1;
                    data.beechAbundance = "High";
                }
                else if (isCheckedBeechPresent == false && isCheckedBeechHigh == true){
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
                    data.bldModerate.setChecked(false);
                    data.bldSevere.setChecked(false);
                    data.bld = 1;
                    data.bldSeverity = "Low";
                }
                else if (isCheckedBldPresent == false && isCheckedBldLow == true){
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
                    data.bldLow.setChecked(false);
                    data.bldSevere.setChecked(false);
                    data.bld = 1;
                    data.bldSeverity = "Moderate";
                }
                else if (isCheckedBldPresent == false && isCheckedBldModerate == true){
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
                    data.bldModerate.setChecked(false);
                    data.bldLow.setChecked(false);
                    data.bld = 1;
                    data.bldSeverity = "Severe";
                }
                else if (isCheckedBldPresent == false && isCheckedBldSevere == true){
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
                    data.ashMedium.setChecked(false);
                    data.ashHigh.setChecked(false);
                    data.ash = 1;
                    data.ashAbundance = "Low";
                }
                else if (isCheckedashPresent == false && isCheckedashLow == true){
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
                    data.ashLow.setChecked(false);
                    data.ashHigh.setChecked(false);
                    data.ash = 1;
                    data.ashAbundance = "Medium";
                }
                else if (isCheckedashPresent == false && isCheckedashMedium == true){
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
                    data.ashMedium.setChecked(false);
                    data.ashLow.setChecked(false);
                    data.ash = 1;
                    data.ashAbundance = "High";
                }
                else if (isCheckedashPresent == false && isCheckedashHigh == true){
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
                    data.eabModerate.setChecked(false);
                    data.eabSevere.setChecked(false);
                    data.eab = 1;
                    data.eabSeverity = "Low";
                }
                else if (isCheckedeabPresent == false && isCheckedeabLow == true){
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
                    data.eabLow.setChecked(false);
                    data.eabSevere.setChecked(false);
                    data.eab = 1;
                    data.eabSeverity = "Moderate";
                }
                else if (isCheckedeabPresent == false && isCheckedeabModerate == true){
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
                    data.eabModerate.setChecked(false);
                    data.eabLow.setChecked(false);
                    data.eab = 1;
                    data.eabSeverity = "Severe";
                }
                else if (isCheckedeabPresent == false && isCheckedeabSevere == true){
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
                    data.eaheMedium.setChecked(false);
                    data.eaheHigh.setChecked(false);
                    data.eahe = 1;
                    data.eaheAbundance = "Low";
                }
                else if (isCheckedeahePresent == false && isCheckedeaheLow == true){
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
                    data.eaheLow.setChecked(false);
                    data.eaheHigh.setChecked(false);
                    data.eahe = 1;
                    data.eaheAbundance = "Medium";
                }
                else if (isCheckedeahePresent == false && isCheckedeaheMedium == true){
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
                    data.eaheMedium.setChecked(false);
                    data.eaheLow.setChecked(false);
                    data.eahe = 1;
                    data.eaheAbundance = "High";
                }
                else if (isCheckedeahePresent == false && isCheckedeaheHigh == true){
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
                    data.hwaModerate.setChecked(false);
                    data.hwaSevere.setChecked(false);
                    data.hwa = 1;
                    data.hwaSeverity = "Low";
                }
                else if (isCheckedhwaPresent == false && isCheckedhwaLow == true){
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
                    data.hwaLow.setChecked(false);
                    data.hwaSevere.setChecked(false);
                    data.hwa = 1;
                    data.hwaSeverity = "Moderate";
                }
                else if (isCheckedhwaPresent == false && isCheckedhwaModerate == true){
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
                    data.hwaModerate.setChecked(false);
                    data.hwaLow.setChecked(false);
                    data.hwa = 1;
                    data.hwaSeverity = "Severe";
                }
                else if (isCheckedhwaPresent == false && isCheckedhwaSevere == true){
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
                    data.tenVal = 1;
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
                    data.tenTwentyFiveVal = 1;
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
                    data.twentyFiveFiftyVal = 1;
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
                    data.fiftySeventyFiveVal = 1;
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
                    data.seventyFiveNinetyVal = 1;
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
                    data.ninetyVal = 1;
                }
            }
        });

    }

    public void updateButtonPressed(){
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
        data.modifyTotalPoints = Integer.toString(data.total);
        data.totalPoints.setText(data.modifyTotalPoints);
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
        ArrayList list = new ArrayList(97);
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
        list.add(new Holder<Object>(data.selected3B,0));
        list.add(new Holder<Object>(data.selected3BDominant1,0));
        list.add(new Holder<Object>(data.selected3BDominant2,0));
        list.add(new Holder<Object>(data.sum3B,1));
        list.add(new Holder<Object>(data.point3B,1));
        list.add(new Holder<Object>(data.NW4Anumber,1));
        list.add(new Holder<Object>(data.NE4Anumber,1));
        list.add(new Holder<Object>(data.SE4Anumber,1));
        list.add(new Holder<Object>(data.SW4Anumber,1));
        list.add(new Holder<Object>(data.sum4A,1));
        list.add(new Holder<Object>(data.point4A,1));
        list.add(new Holder<Object>(data.selected4B,0));
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
}