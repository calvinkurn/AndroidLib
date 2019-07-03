package com.example.toaster;

import android.content.Context;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;

public class ButtonUniform extends RelativeLayout {
    public ButtonUniform(Context context){
        super(context);
        inflate(context,R.layout.button_layout,this);
    }
}
