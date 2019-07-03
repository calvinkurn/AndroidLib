package com.example.toaster;

import android.content.Context;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;

public class ButtonUniform extends View {
    public ButtonUniform(Context context) {
        super(context);
        View.inflate(context,R.layout.button_layout,null);
    }

    public void setText(String text){
        Button uniformButton = (Button)findViewById(R.id.button);
        uniformButton.setText(text);
    }
}
