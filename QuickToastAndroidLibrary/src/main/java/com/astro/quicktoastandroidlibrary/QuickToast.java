package com.astro.quicktoastandroidlibrary;

import android.content.Context;
import android.widget.Toast;

public class QuickToast {

    public static  void Short(Context context,String message){
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }

    public static void Long(Context context,String message) {

        Toast.makeText(context, message, Toast.LENGTH_LONG).show();

    }

}
