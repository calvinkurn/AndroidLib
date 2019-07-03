package com.example.nakama.componentlibrary

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.constraint.ConstraintLayout
import android.widget.Button
import com.example.toaster.ButtonUniform

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val layout = findViewById<ConstraintLayout>(R.id.constraint_layout);
        layout.addView(ButtonUniform(this));
    }
}
