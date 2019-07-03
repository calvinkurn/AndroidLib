package com.example.button;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

public class ButtonUnify extends AppCompatActivity {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.button_layout);
    }

    public void setText(String text){
        Button defaultButton = (Button) findViewById(R.id.button);
        defaultButton.setText(text);
    }
}
