package com.ujit.camerademo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class ImageProcessActivity extends AppCompatActivity
{
    private Button imageFunctionButton;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_process);
        imageFunctionButton = (Button) findViewById(R.id.camera_dummy_button);
        imageFunctionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent switchToImProcIntent = new Intent(ImageProcessActivity.this, MainActivity.class);
                startActivity(switchToImProcIntent);
            }
        });
    }
}