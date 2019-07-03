package com.example.toaster;

import android.content.Context;
import android.widget.Toast;

public class ToasterMessage {
    public static void s(Context c,String s){
        Toast.makeText(c,s,Toast.LENGTH_LONG).show();
    }
}
