package com.example.toaster;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;

public class ButtonUniform extends AppCompatActivity {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.button_layout);
    }

    public void setText(String text){
        Button uniformButton = (Button)findViewById(R.id.button);
        uniformButton.setText(text);
    }
}
