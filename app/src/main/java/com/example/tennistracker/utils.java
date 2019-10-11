package com.example.tennistracker;

import android.content.Context;
import android.widget.Toast;

public class utils {

    public static void displayMsg(String str, Context context){
        Toast.makeText(context, "Bouton cliqué : " + str, Toast.LENGTH_SHORT).show();
    }
}
