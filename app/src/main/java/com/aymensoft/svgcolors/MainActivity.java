package com.aymensoft.svgcolors;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView svgimage;
    Button btnBlack, btnRed, btnGreen, btnBlue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        svgimage=(ImageView)findViewById(R.id.image_svg);

        btnBlack=(Button)findViewById(R.id.btn_black);
        btnRed=(Button)findViewById(R.id.btn_red);
        btnGreen=(Button)findViewById(R.id.btn_green);
        btnBlue=(Button)findViewById(R.id.btn_blue);

        //change color to black
        btnBlack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                svgimage.setColorFilter(Color.rgb(0,0,0));
            }
        });

        //change color to red
        btnRed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                svgimage.setColorFilter(Color.rgb(242, 16, 16));
            }
        });

        //change color to green
        btnGreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                svgimage.setColorFilter(Color.rgb(54,214,61));
            }
        });

        //change color to blue
        btnBlue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                svgimage.setColorFilter(Color.rgb(9,0,255));
            }
        });
    }
}
