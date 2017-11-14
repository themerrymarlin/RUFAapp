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
    Button updateTop;
    Button updateBottom;

    //Scorer input
    EditText cellValue;
    EditText dateValue;
    EditText scorersValue;

    // section 1A
    int point1A;
    int sum1A;
    EditText NW1A;
    EditText NE1A;
    EditText SW1A;
    EditText SE1A;
    TextView sum1AVal;
    String modifyTextSum1A;
    TextView point1AVal;
    String modifyTextPoint1A;
    int NW1Anumber;
    int NE1Anumber;
    int SW1Anumber;
    int SE1Anumber;

    //section 1B
    int point1B;
    int sum1B;
    EditText NW1B;
    EditText NE1B;
    EditText SW1B;
    EditText SE1B;
    TextView sum1BVal;
    String modifyTextSum1B;
    TextView point1BVal;
    String modifyTextPoint1B;
    int NW1Bnumber;
    int NE1Bnumber;
    int SW1Bnumber;
    int SE1Bnumber;

    //section 2A
    int point2A;
    int sum2A;
    EditText NW2A;
    EditText NE2A;
    EditText SW2A;
    EditText SE2A;
    TextView sum2AVal;
    String modifyTextSum2A;
    TextView point2AVal;
    String modifyTextPoint2A;
    int NW2Anumber;
    int NE2Anumber;
    int SW2Anumber;
    int SE2Anumber;

    //section 2B
    int point2B;
    int sum2B;
    EditText NW2B;
    EditText NE2B;
    EditText SW2B;
    EditText SE2B;
    TextView sum2BVal;
    String modifyTextSum2B;
    TextView point2BVal;
    String modifyTextPoint2B;
    int NW2Bnumber;
    int NE2Bnumber;
    int SW2Bnumber;
    int SE2Bnumber;

    //section 3A
    int point3A;
    int sum3A;
    EditText NW3A;
    EditText NE3A;
    EditText SW3A;
    EditText SE3A;
    TextView sum3AVal;
    String modifyTextSum3A;
    TextView point3AVal;
    String modifyTextPoint3A;
    int NW3Anumber;
    int NE3Anumber;
    int SW3Anumber;
    int SE3Anumber;

    //section 3B
    int point3B;
    int sum3B;
    TextView sum3BVal;
    String modifyTextSum3B;
    TextView point3BVal;
    String modifyTextPoint3B;
    TextView addTreeToList3B;
    TextView addTreeToDominant3B1;
    TextView addTreeToDominant3B2;
    String modifyAdd3B;
    String selected3B;
    Spinner tree_types3B;
    Button add3B;
    Button clear3B;
    Button addDominant3B1;
    Button addDominant3B2;
    String selected3BDominant1;
    String selected3BDominant2;
    CheckBox toggle3B1;
    CheckBox toggle3B2;

    //section 4A
    int point4A;
    int sum4A;
    EditText NW4A;
    EditText NE4A;
    EditText SW4A;
    EditText SE4A;
    TextView sum4AVal;
    String modifyTextSum4A;
    TextView point4AVal;
    String modifyTextPoint4A;
    int NW4Anumber;
    int NE4Anumber;
    int SW4Anumber;
    int SE4Anumber;

    //section 4B
    int point4B;
    int sum4B;
    TextView sum4BVal;
    String modifyTextSum4B;
    TextView point4BVal;
    String modifyTextPoint4B;
    TextView addTreeToList4B;
    String selected4B;
    Spinner tree_types4B;
    Button add4B;
    Button clear4B;
    String modifyAdd4B;
    Button addDominant4B1;
    Button addDominant4B2;
    String selected4BDominant1;
    String selected4BDominant2;
    TextView addTreeToDominant4B1;
    TextView addTreeToDominant4B2;
    CheckBox toggle4B1;
    CheckBox toggle4B2;

    //section 5A
    int point5A;
    int sum5A;
    EditText NW5A;
    EditText NE5A;
    EditText SW5A;
    EditText SE5A;
    TextView sum5AVal;
    String modifyTextSum5A;
    TextView point5AVal;
    String modifyTextPoint5A;
    int NW5Anumber;
    int NE5Anumber;
    int SW5Anumber;
    int SE5Anumber;

    //section 5B
    int point5B;
    int sum5B;
    EditText NW5B;
    EditText NE5B;
    EditText SW5B;
    EditText SE5B;
    TextView sum5BVal;
    String modifyTextSum5B;
    TextView point5BVal;
    String modifyTextPoint5B;
    int NW5Bnumber;
    int NE5Bnumber;
    int SW5Bnumber;
    int SE5Bnumber;

    //section 6A
    int point6A;
    int sum6A;
    EditText NW6A;
    EditText NE6A;
    EditText SW6A;
    EditText SE6A;
    TextView sum6AVal;
    String modifyTextSum6A;
    TextView point6AVal;
    String modifyTextPoint6A;
    int NW6Anumber;
    int NE6Anumber;
    int SW6Anumber;
    int SE6Anumber;

    //section 6B
    int point6B;
    int sum6B;
    EditText NW6B;
    EditText NE6B;
    EditText SW6B;
    EditText SE6B;
    TextView sum6BVal;
    String modifyTextSum6B;
    TextView point6BVal;
    String modifyTextPoint6B;
    int NW6Bnumber;
    int NE6Bnumber;
    int SW6Bnumber;
    int SE6Bnumber;

    //section7
    int point7;
    TextView point7Val;
    String modifyTextPoint7;

    //section8
    int point8;
    TextView point8Val;
    String modifyTextPoint8;

    //section9
    int point9;
    TextView point9Val;
    String modifyTextPoint9;

    //section10
    int point10;
    TextView point10Val;
    String modifyTextPoint10;

    //section11
    int point11;
    TextView point11Val;
    String modifyTextPoint11;

    //section 12
    int point12;
    int total12;
    TextView total12Val;
    String modifyTextSum12;
    TextView point12Val;
    String modifyTextPoint12;
    int pointBoxA;
    int pointBoxB;
    int pointBoxC;
    int pointBoxD;
    int pointBoxE;

    //Total
    int total;
    TextView totalPoints;
    String modifyTotalPoints;
    String qualityRank;

    //Plant Community
    TextView addTreeToListPlantCommunity;
    String modifyCommunityType;
    String selectedPlantCommunity;
    Spinner plant_community;
    Button addPlantCommunity;
    CheckBox prevConfirmedType;
    CheckBox groundTruthedType;
    int prevConfirmed;
    int groundTruthed;

    //bearing changes
    CheckBox yesBearingChanges;
    CheckBox noBearingChanges;
    int bearingChange;

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
    EditText diameterA;
    EditText diameterB;
    EditText diameterC;
    EditText diameterD;
    CheckBox invadedA;
    CheckBox invadedB;
    CheckBox invadedC;
    CheckBox invadedD;
    CheckBox grapevineA;
    CheckBox grapevineB;
    CheckBox grapevineC;
    CheckBox grapevineD;
    CheckBox regeneratingA;
    CheckBox regeneratingB;
    CheckBox regeneratingC;
    CheckBox regeneratingD;

    //Past Land Use Evidence
    CheckBox noneEvident;
    CheckBox deadFurrows;
    CheckBox cutStumps;
    CheckBox dumpSite;
    CheckBox oldRoad;
    CheckBox improvedTrail;
    CheckBox other;
    int noneEvidentval;
    int deadFurrowsval;
    int cutStumpsval;
    int dumpSiteval;
    int oldRoadval;
    int improvedTrailval;
    int otherval;
    EditText otherInput;
    String otherLandUseEvidence;


    //canopy
    CheckBox canopyOpen;
    CheckBox canopyClosed;
    int canopy;

    //Age Classes
    Spinner age_classes;
    Button addDominantAgeClasses1;
    Button addDominantAgeClasses2;
    String selectedAgeClass;
    TextView addTreeToDominantSapling1;
    TextView addTreeToDominantSapling2;
    CheckBox toggleSapling1;
    CheckBox toggleSapling2;
    TextView addTreeToDominantSmallPole1;
    TextView addTreeToDominantSmallPole2;
    CheckBox toggleSmallPole1;
    CheckBox toggleSmallPole2;
    TextView addTreeToDominantMedPole1;
    TextView addTreeToDominantMedPole2;
    CheckBox toggleMedPole1;
    CheckBox toggleMedPole2;
    TextView addTreeToDominantStandard1;
    TextView addTreeToDominantStandard2;
    CheckBox toggleStandard1;
    CheckBox toggleStandard2;
    TextView addTreeToDominantVeteran1;
    TextView addTreeToDominantVeteran2;
    CheckBox toggleVeteran1;
    CheckBox toggleVeteran2;
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
    CheckBox sapling;
    CheckBox smallPole;
    CheckBox medPole;
    CheckBox standard;
    CheckBox veteran;
    int saplingPresent;
    int smallPolePresent;
    int medPolePresent;
    int standardPresent;
    int veteranPresent;

    //Pests and Pathogens
    CheckBox beechPresent;
    CheckBox beechLow;
    CheckBox beechMedium;
    CheckBox beechHigh;
    CheckBox bldPresent;
    CheckBox bldLow;
    CheckBox bldModerate;
    CheckBox bldSevere;
    int beech;
    int bld;
    String beechAbundance;
    String bldSeverity;
    CheckBox ashPresent;
    CheckBox ashLow;
    CheckBox ashMedium;
    CheckBox ashHigh;
    CheckBox eabPresent;
    CheckBox eabLow;
    CheckBox eabModerate;
    CheckBox eabSevere;
    int ash;
    int eab;
    String ashAbundance;
    String eabSeverity;
    CheckBox eahePresent;
    CheckBox eaheLow;
    CheckBox eaheMedium;
    CheckBox eaheHigh;
    CheckBox hwaPresent;
    CheckBox hwaLow;
    CheckBox hwaModerate;
    CheckBox hwaSevere;
    int eahe;
    int hwa;
    String eaheAbundance;
    String hwaSeverity;

    //seedling cover
    CheckBox ten;
    CheckBox tenTwentyFive;
    CheckBox twentyFiveFifty;
    CheckBox fiftySeventyFive;
    CheckBox seventyFiveNinety;
    CheckBox ninety;
    int tenVal;
    int tenTwentyFiveVal;
    int twentyFiveFiftyVal;
    int fiftySeventyFiveVal;
    int seventyFiveNinetyVal;
    int ninetyVal;
}
