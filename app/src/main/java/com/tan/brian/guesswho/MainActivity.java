package com.tan.brian.guesswho;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageButton;

import java.io.Console;

public class MainActivity extends AppCompatActivity {
    private boolean danny_Click = false;
    private boolean albert_Click = false;
    private boolean briantan_Click = false;
    private boolean julie_Click = false;
    private boolean jay_Click = false;
    private boolean gerard_Click = false;
    private boolean bj_Click = false;
    private boolean kevin_Click = false;
    private boolean leo_Click = false;
    private boolean patrick_Click = false;
    private boolean michael_Click = false;
    private boolean loie_Click = false;

    private ImageButton danny_Btn;
    private ImageButton albert_Btn;
    private ImageButton briantan_Btn;
    private ImageButton julie_Btn;
    private ImageButton jay_Btn;
    private ImageButton gerard_Btn;
    private ImageButton bj_Btn;
    private ImageButton kevin_Btn;
    private ImageButton leo_Btn;
    private ImageButton patrick_Btn;
    private ImageButton michael_Btn;
    private ImageButton loie_Btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        danny_Btn = (ImageButton) findViewById(R.id.danny);
        albert_Btn = (ImageButton) findViewById(R.id.albert);
        briantan_Btn = (ImageButton) findViewById(R.id.briantan);
        julie_Btn = (ImageButton) findViewById(R.id.julie);
        jay_Btn = (ImageButton) findViewById(R.id.jay);
        gerard_Btn = (ImageButton) findViewById(R.id.gerard);
        bj_Btn = (ImageButton) findViewById(R.id.bj);
        kevin_Btn = (ImageButton) findViewById(R.id.kevin);
        leo_Btn = (ImageButton) findViewById(R.id.leo);
        patrick_Btn = (ImageButton) findViewById(R.id.patrick);
        michael_Btn = (ImageButton) findViewById(R.id.michael);
        loie_Btn = (ImageButton) findViewById(R.id.loie);

        // Danny's Button
        danny_Btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (!danny_Click) {
                    danny_Btn.setColorFilter(Color.argb(255, 255, 255, 255));
                }
                else {
                    danny_Btn.clearColorFilter();
                    danny_Btn.setImageResource(R.drawable.danny);
                }

                danny_Click = !danny_Click;
            }
        });

        // Albert's Button
        albert_Btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (!albert_Click) {
                    albert_Btn.setColorFilter(Color.argb(255, 255, 255, 255));
                }
                else {
                    albert_Btn.clearColorFilter();
                    albert_Btn.setImageResource(R.drawable.albert);
                }

                albert_Click = !albert_Click;
            }
        });

        // Brian Tan's Button
        briantan_Btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (!briantan_Click) {
                    briantan_Btn.setColorFilter(Color.argb(255, 255, 255, 255));
                }
                else {
                    briantan_Btn.clearColorFilter();
                    briantan_Btn.setImageResource(R.drawable.briantan);
                }

                briantan_Click = !briantan_Click;
            }
        });

        // Julie's Button
        julie_Btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (!julie_Click) {
                    julie_Btn.setColorFilter(Color.argb(255, 255, 255, 255));
                }
                else {
                    julie_Btn.clearColorFilter();
                    julie_Btn.setImageResource(R.drawable.julie);
                }

                julie_Click = !julie_Click;
            }
        });

        // Jay's Button
        jay_Btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (!jay_Click) {
                    jay_Btn.setColorFilter(Color.argb(255, 255, 255, 255));
                }
                else {
                    jay_Btn.clearColorFilter();
                    jay_Btn.setImageResource(R.drawable.jay);
                }

                jay_Click = !jay_Click;
            }
        });

        // Gerard's Button
        gerard_Btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (!gerard_Click) {
                    gerard_Btn.setColorFilter(Color.argb(255, 255, 255, 255));
                }
                else {
                    gerard_Btn.clearColorFilter();
                    gerard_Btn.setImageResource(R.drawable.gerard);
                }

                gerard_Click = !gerard_Click;
            }
        });

        // BJ's Button
        bj_Btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (!bj_Click) {
                    bj_Btn.setColorFilter(Color.argb(255, 255, 255, 255));
                }
                else {
                    bj_Btn.clearColorFilter();
                    bj_Btn.setImageResource(R.drawable.bj);
                }

                bj_Click = !bj_Click;
            }
        });

        // Kevin's Button
        kevin_Btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (!kevin_Click) {
                    kevin_Btn.setColorFilter(Color.argb(255, 255, 255, 255));
                }
                else {
                    kevin_Btn.clearColorFilter();
                    kevin_Btn.setImageResource(R.drawable.kevin);
                }

                kevin_Click = !kevin_Click;
            }
        });

        // Leo's Button
        leo_Btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (!leo_Click) {
                    leo_Btn.setColorFilter(Color.argb(255, 255, 255, 255));
                }
                else {
                    leo_Btn.clearColorFilter();
                    leo_Btn.setImageResource(R.drawable.leo);
                }

                leo_Click = !leo_Click;
            }
        });

        // Patrick's Button
        patrick_Btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (!patrick_Click) {
                    patrick_Btn.setColorFilter(Color.argb(255, 255, 255, 255));
                }
                else {
                    patrick_Btn.clearColorFilter();
                    patrick_Btn.setImageResource(R.drawable.patrick);
                }

                patrick_Click = !patrick_Click;
            }
        });

        // Michael's Button
        michael_Btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (!michael_Click) {
                    michael_Btn.setColorFilter(Color.argb(255, 255, 255, 255));
                }
                else {
                    michael_Btn.clearColorFilter();
                    michael_Btn.setImageResource(R.drawable.michael);
                }

                michael_Click = !michael_Click;
            }
        });

        // Loie's Button
        loie_Btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                if (!loie_Click) {
                    loie_Btn.setColorFilter(Color.argb(255, 255, 255, 255));
                }
                else {
                    loie_Btn.clearColorFilter();
                    loie_Btn.setImageResource(R.drawable.loie);
                }

                loie_Click = !loie_Click;
            }
        });

    }
}
