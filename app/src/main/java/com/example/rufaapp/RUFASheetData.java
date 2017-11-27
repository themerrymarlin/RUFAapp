package com.example.rufaapp;

import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

/**
 * Created by twp1996 on 11/10/17.
 */

public class RUFASheetData {
    // define variables
    int threshold;

    //Scorer input
    transient EditText cellValue;
    transient EditText dateValue;
    transient EditText scorersValue;
    String cell;
    String date;
    String scorers;

    // section 1A
    int point1A;
    int sum1A;
    transient EditText NW1A;
    transient EditText NE1A;
    transient EditText SW1A;
    transient EditText SE1A;
    transient TextView sum1AVal;
    transient String modifyTextSum1A;
    transient TextView point1AVal;
    transient String modifyTextPoint1A;
    int NW1Anumber;
    int NE1Anumber;
    int SW1Anumber;
    int SE1Anumber;

    //section 1B
    int point1B;
    int sum1B;
    transient EditText NW1B;
    transient EditText NE1B;
    transient EditText SW1B;
    transient EditText SE1B;
    transient TextView sum1BVal;
    transient String modifyTextSum1B;
    transient TextView point1BVal;
    transient String modifyTextPoint1B;
    int NW1Bnumber;
    int NE1Bnumber;
    int SW1Bnumber;
    int SE1Bnumber;

    //section 2A
    int point2A;
    int sum2A;
    transient EditText NW2A;
    transient EditText NE2A;
    transient EditText SW2A;
    transient EditText SE2A;
    transient TextView sum2AVal;
    transient String modifyTextSum2A;
    transient TextView point2AVal;
    transient String modifyTextPoint2A;
    int NW2Anumber;
    int NE2Anumber;
    int SW2Anumber;
    int SE2Anumber;

    //section 2B
    int point2B;
    int sum2B;
    transient EditText NW2B;
    transient EditText NE2B;
    transient EditText SW2B;
    transient EditText SE2B;
    transient TextView sum2BVal;
    transient String modifyTextSum2B;
    transient TextView point2BVal;
    transient String modifyTextPoint2B;
    int NW2Bnumber;
    int NE2Bnumber;
    int SW2Bnumber;
    int SE2Bnumber;

    //section 3A
    int point3A;
    int sum3A;
    transient EditText NW3A;
    transient EditText NE3A;
    transient EditText SW3A;
    transient EditText SE3A;
    transient TextView sum3AVal;
    transient String modifyTextSum3A;
    transient TextView point3AVal;
    transient String modifyTextPoint3A;
    int NW3Anumber;
    int NE3Anumber;
    int SW3Anumber;
    int SE3Anumber;

    //section 3B
    int point3B;
    int sum3B;
    transient TextView sum3BVal;
    transient String modifyTextSum3B;
    transient TextView point3BVal;
    transient String modifyTextPoint3B;
    transient TextView addTreeToList3B;
    transient TextView addTreeToDominant3B1;
    transient TextView addTreeToDominant3B2;
    transient String modifyAdd3B;
    transient String selected3B;
    String list3B;
    transient Spinner tree_types3B;
    transient Button add3B;
    transient Button clear3B;
    transient Button addDominant3B1;
    transient Button addDominant3B2;
    String dominant3B1;
    String dominant3B2;

    //section 4A
    int point4A;
    int sum4A;
    transient EditText NW4A;
    transient EditText NE4A;
    transient EditText SW4A;
    transient EditText SE4A;
    transient TextView sum4AVal;
    transient String modifyTextSum4A;
    transient TextView point4AVal;
    transient String modifyTextPoint4A;
    int NW4Anumber;
    int NE4Anumber;
    int SW4Anumber;
    int SE4Anumber;

    //section 4B
    int point4B;
    int sum4B;
    transient TextView sum4BVal;
    transient String modifyTextSum4B;
    transient TextView point4BVal;
    transient String modifyTextPoint4B;
    transient TextView addTreeToList4B;
    String list4B;
    transient Spinner tree_types4B;
    transient Button add4B;
    transient Button clear4B;
    transient String modifyAdd4B;
    transient String selected4B;
    transient Button addDominant4B1;
    transient Button addDominant4B2;
    String dominant4B1;
    String dominant4B2;
    transient TextView addTreeToDominant4B1;
    transient TextView addTreeToDominant4B2;

    //section 5A
    int point5A;
    int sum5A;
    transient EditText NW5A;
    transient EditText NE5A;
    transient EditText SW5A;
    transient EditText SE5A;
    transient TextView sum5AVal;
    transient String modifyTextSum5A;
    transient TextView point5AVal;
    transient String modifyTextPoint5A;
    int NW5Anumber;
    int NE5Anumber;
    int SW5Anumber;
    int SE5Anumber;

    //section 5B
    int point5B;
    int sum5B;
    transient EditText NW5B;
    transient EditText NE5B;
    transient EditText SW5B;
    transient EditText SE5B;
    transient TextView sum5BVal;
    transient String modifyTextSum5B;
    transient TextView point5BVal;
    transient String modifyTextPoint5B;
    int NW5Bnumber;
    int NE5Bnumber;
    int SW5Bnumber;
    int SE5Bnumber;

    //section 6A
    int point6A;
    int sum6A;
    transient EditText NW6A;
    transient EditText NE6A;
    transient EditText SW6A;
    transient EditText SE6A;
    transient TextView sum6AVal;
    transient String modifyTextSum6A;
    transient TextView point6AVal;
    transient String modifyTextPoint6A;
    int NW6Anumber;
    int NE6Anumber;
    int SW6Anumber;
    int SE6Anumber;

    //section 6B
    int point6B;
    int sum6B;
    transient EditText NW6B;
    transient EditText NE6B;
    transient EditText SW6B;
    transient EditText SE6B;
    transient TextView sum6BVal;
    transient String modifyTextSum6B;
    transient TextView point6BVal;
    transient String modifyTextPoint6B;
    int NW6Bnumber;
    int NE6Bnumber;
    int SW6Bnumber;
    int SE6Bnumber;

    //section7
    int point7;
    transient TextView point7Val;
    transient String modifyTextPoint7;
    transient CheckBox noObservedInvasivePlants;

    //section8
    int point8;
    transient TextView point8Val;
    transient String modifyTextPoint8;
    transient CheckBox healthyLightGaps;

    //section9
    int point9;
    transient TextView point9Val;
    transient String modifyTextPoint9;
    transient CheckBox microtopography;

    //section10
    int point10;
    transient TextView point10Val;
    transient String modifyTextPoint10;
    transient CheckBox absenceOfHumanActivity;

    //section11
    int point11;
    transient TextView point11Val;
    transient String modifyTextPoint11;
    transient CheckBox absenceOfDeerBrowseLine;

    //section 12
    int point12;
    int total12;
    transient TextView total12Val;
    transient String modifyTextSum12;
    transient TextView point12Val;
    transient String modifyTextPoint12;
    int pointBoxA;
    int pointBoxB;
    int pointBoxC;
    int pointBoxD;
    int pointBoxE;
    transient CheckBox a12;
    transient CheckBox b12;
    transient CheckBox c12;
    transient CheckBox d12;
    transient CheckBox e12;

    //Total
    int total;
    transient TextView totalPoints;
    transient String modifyTotalPoints;
    String qualityRank;

    //Plant Community
    transient TextView addTreeToListPlantCommunity;
    transient String modifyCommunityType;
    String selectedPlantCommunity;
    transient Spinner plant_community;
    transient Button addPlantCommunity;
    transient Button clearPlantCommunity;
    transient CheckBox prevConfirmedType;
    transient CheckBox groundTruthedType;
    transient EditText otherPlantCommunity;
    int prevConfirmed;
    int groundTruthed;

    //bearing changes
    transient CheckBox yesBearingChanges;
    transient CheckBox noBearingChanges;
    int bearingChange;
    transient EditText bearingChangeAndRationale;
    String changeAndRationale;

    //light gaps
    int diameterAVal;
    int diameterBVal;
    int diameterCVal;
    int diameterDVal;
    int invadedAVal;
    int invadedBVal;
    int invadedCVal;
    int invadedDVal;
    int grapevineAVal;
    int grapevineBVal;
    int grapevineCVal;
    int grapevineDVal;
    int regeneratingAVal;
    int regeneratingBVal;
    int regeneratingCVal;
    int regeneratingDVal;
    transient EditText diameterA;
    transient EditText diameterB;
    transient EditText diameterC;
    transient EditText diameterD;
    transient CheckBox invadedA;
    transient CheckBox invadedB;
    transient CheckBox invadedC;
    transient CheckBox invadedD;
    transient CheckBox grapevineA;
    transient CheckBox grapevineB;
    transient CheckBox grapevineC;
    transient CheckBox grapevineD;
    transient CheckBox regeneratingA;
    transient CheckBox regeneratingB;
    transient CheckBox regeneratingC;
    transient CheckBox regeneratingD;

    //Past Land Use Evidence
    transient CheckBox noneEvident;
    transient CheckBox deadFurrows;
    transient CheckBox cutStumps;
    transient CheckBox dumpSite;
    transient CheckBox oldRoad;
    transient CheckBox improvedTrail;
    transient CheckBox other;
    int noneEvidentval;
    int deadFurrowsval;
    int cutStumpsval;
    int dumpSiteval;
    int oldRoadval;
    int improvedTrailval;
    int otherval;
    transient EditText otherInput;
    String otherLandUseEvidence;


    //canopy
    transient CheckBox canopyOpen;
    transient CheckBox canopyClosed;
    int canopy;

    //Age Classes
    transient Spinner age_classes;
    transient Button clearAgeClassData;
    transient Button addDominantSapling1;
    transient Button addDominantSapling2;
    transient Button addDominantSmallPole1;
    transient Button addDominantSmallPole2;
    transient Button addDominantMedPole1;
    transient Button addDominantMedPole2;
    transient Button addDominantStandard1;
    transient Button addDominantStandard2;
    transient Button addDominantVeteran1;
    transient Button addDominantVeteran2;
    transient String selectedAgeClass;
    transient TextView addTreeToDominantSapling1;
    transient TextView addTreeToDominantSapling2;
    transient TextView addTreeToDominantSmallPole1;
    transient TextView addTreeToDominantSmallPole2;
    transient TextView addTreeToDominantMedPole1;
    transient TextView addTreeToDominantMedPole2;
    transient TextView addTreeToDominantStandard1;
    transient TextView addTreeToDominantStandard2;
    transient TextView addTreeToDominantVeteran1;
    transient TextView addTreeToDominantVeteran2;
    String dominantSapling1;
    String dominantSapling2;
    String dominantSmallPole1;
    String dominantSmallPole2;
    String dominantMedPole1;
    String dominantMedPole2;
    String dominantStandardPole1;
    String dominantStandardPole2;
    String dominantVeteran1;
    String dominantVeteran2;
    transient CheckBox sapling;
    transient CheckBox smallPole;
    transient CheckBox medPole;
    transient CheckBox standard;
    transient CheckBox veteran;
    int saplingPresent;
    int smallPolePresent;
    int medPolePresent;
    int standardPresent;
    int veteranPresent;

    //Pests and Pathogens
    transient CheckBox beechPresent;
    transient CheckBox beechNone;
    transient CheckBox beechLow;
    transient CheckBox beechMedium;
    transient CheckBox beechHigh;
    transient CheckBox bldPresent;
    transient CheckBox bldNone;
    transient CheckBox bldLow;
    transient CheckBox bldModerate;
    transient CheckBox bldSevere;
    int beech;
    int bld;
    String beechAbundance;
    String bldSeverity;
    transient CheckBox ashPresent;
    transient CheckBox ashNone;
    transient CheckBox ashLow;
    transient CheckBox ashMedium;
    transient CheckBox ashHigh;
    transient CheckBox eabPresent;
    transient CheckBox eabNone;
    transient CheckBox eabLow;
    transient CheckBox eabModerate;
    transient CheckBox eabSevere;
    int ash;
    int eab;
    String ashAbundance;
    String eabSeverity;
    transient CheckBox eahePresent;
    transient CheckBox eaheNone;
    transient CheckBox eaheLow;
    transient CheckBox eaheMedium;
    transient CheckBox eaheHigh;
    transient CheckBox hwaPresent;
    transient CheckBox hwaNone;
    transient CheckBox hwaLow;
    transient CheckBox hwaModerate;
    transient CheckBox hwaSevere;
    int eahe;
    int hwa;
    String eaheAbundance;
    String hwaSeverity;

    //seedling cover
    transient CheckBox ten;
    transient CheckBox tenTwentyFive;
    transient CheckBox twentyFiveFifty;
    transient CheckBox fiftySeventyFive;
    transient CheckBox seventyFiveNinety;
    transient CheckBox ninety;
    String seedlingCover = "";

    //notes section
    transient EditText notes1;
    transient EditText notes2;
    transient EditText notes3;
    String notes;
}
