package com.example.rufaapp;

import android.content.Context;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by David Merriman on 10/02/2017.
 * Helper class to initialize DB inside android internal memory
 */

class RUFAdbOpenHelper extends SQLiteOpenHelper {

    private static final String TABLE_NAME = "RUFA_DB";
    private static final int VERSION = 1;
    private static final String CREATE_STRING = "CREATE TABLE "+TABLE_NAME+" (" +
            "Cell TEXT, " +
            "Date TEXT, " +
            "Assessor TEXT," +
            "NW _Herb INTEGER," +
            "NE_Herb INTEGER, " +
            "SE_Herb INTEGER," +
            "SW_Herb INTEGER," +
            "Herb_Total INTEGER," +
            "Herb_Point INTEGER" +
            "NW_Seedl INTEGER," +
            "NE_Seedl INTEGER," +
            "SW_Seedl INTEGER," +
            "SE_Seedl INTEGER," +
            "Seedl_Total INTEGER," +
            "Seedl_Point INTEGER," +
            "NW_SS_Ind INTEGER," +
            "NE_SS_Ind INTEGER," +
            "SW_SS_Ind INTEGER," +
            "SE_SS_Ind INTEGER," +
            "SS_Ind_Total INTEGER," +
            "SS_Ind_Point INTEGER," +
            "NW_SS_Spc INTEGER," +
            "NE_SS_Spc INTEGER," +
            "SW_SS_Spc INTEGER," +
            "SE_SS_Spc INTEGER," +
            "SS_Spc_Total INTEGER," +
            "SS_Spc_Point INTEGER," +
            "NW_M_Tree_Ind INTEGER," +
            "NE_M_Tree_Ind INTEGER," +
            "SW_M_Tree_Ind INTEGER," +
            "SE_M_Tree_Ind INTEGER," +
            "M_Tree_Ind_Total INTEGER," +
            "M_Tree_Ind_Point INTEGER," +
            "M_Tree_Spc TEXT," +
            "Dom_Tree_1 TEXT," +
            "Dom_Tree_2 TEXT," +
            "M_Tree_Spc_Total INTEGER," +
            "M_Tree_Spc_Point INTEGER," +
            "NW_L_Tree_Ind INTEGER," +
            "NE_L_Tree_Ind INTEGER," +
            "SE_L_Tree_Ind INTEGER," +
            "SW_L_Tree_Ind INTEGER," +
            "L_Tree_Ind_Total INTEGER," +
            "L_Tree_Ind_Point INTEGER," +
            "L_Tree_Spc TEXT," +
            "L_Tree_Spc_Total INTEGER," +
            "L_Tree_Spc_Point INTEGER," +
            "NW_Snags INTEGER," +
            "NE_Snags INTEGER," +
            "SE_Snags INTEGER," +
            "SW_Snags INTEGER," +
            "Snags_Total INTEGER," +
            "Snags_Point INTEGER," +
            "NW_W_Debris INTEGER," +
            "NE_W_Debris INTEGER," +
            "SE_W_Debris INTEGER," +
            "SW_W_Debris INTEGER," +
            "W_Debris_Total INTEGER," +
            "W_Debris_Point INTEGER," +
            "NW_Inv_SV INTEGER," +
            "NE_Inv_SV INTEGER," +
            "SE_Inv_SV INTEGER," +
            "SW_Inv_SV INTEGER," +
            "Inv_SV_Total INTEGER," +
            "Inv_SV _Point INTEGER," +
            "NW_Inv_Herb INTEGER," +
            "NE_Inv_Herb INTEGER," +
            "SE_Inv_Herb INTEGER," +
            "SW_Inv_Herb INTEGER," +
            "Inv_Herb_Total INTEGER," +
            "Inv_Herb_Point INTEGER," +
            "Obs_inv_Plant INTEGER," +
            "H_Light_Gap INTEGER," +
            "Pit_Mound INTEGER," +
            "Abs_Human_Activity INTEGER," +
            "Abs_Deer_Browse INTEGER," +
            "NW_Leaf_Frg INTEGER," +
            "NE_Leaf_Frg INTEGER," +
            "SE_Leaf_Frg INTEGER," +
            "SW_Leaf_Frg INTEGER," +
            "C_Leaf_Frg INTEGER," +
            "Leaf_Frg_Total INTEGER," +
            "Leaf_Frg_Point INTEGER," +
            "Total INTEGER," +
            "Quality_Rank TEXT," +
            "AMBE INTEGER," +
            "BLD INTEGER," +
            "BLD_Sever TEXT," +
            "AMBE_abun TEXT," +
            "Ash INTEGER," +
            "EAB INTEGER," +
            "EAB_Sever TEXT," +
            "Ash_Abun TEXT," +
            "EAHE INTEGER," +
            "HWA INTEGER," +
            "HWA_Sever TEXT," +
            "EAHE_Abun TEXT," +
            "PRIMARY KEY (Cell,Date);";

    RUFAdbOpenHelper (Context context){
        super(context,TABLE_NAME,null,VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db){
        db.execSQL(CREATE_STRING);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db,int oldVersion, int newVersion){
        //TODO idfk
        //Not Implemented
    }
}
