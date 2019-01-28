package com.example.toastmodule;

import android.content.Context;
import android.widget.Toast;

public class NoBodyWantsToast {

    public static  void messege(Context context, String mag){
        Toast.makeText(context,mag , Toast.LENGTH_SHORT ).show();
    }
}
