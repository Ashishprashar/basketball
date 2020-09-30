package com.android.exampla;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView scoreView1, scoreView2;
    int score1, score2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        scoreView1 = findViewById(R.id.scoreView);
        scoreView2 = findViewById(R.id.scoreView2);
    }

    public void increement3(View view) {
        score1 = score1 + 3;
        scoreView1.setText("" + score1);
    }

    public void increement2(View view) {
        score1 = score1 + 2;
        scoreView1.setText("" + score1);
    }

    public void increement(View view) {
        score1 = score1 + 1;
        scoreView1.setText("" + score1);
    }

    public void increement2_2(View view) {
        score2 = score2 + 2;
        scoreView2.setText("" + score2);
    }


    public void increement_2(View view) {
        score2 = score2 + 1;
        scoreView2.setText("" + score2);
    }

    public void increement3_2(View view) {
        score2 = score2 + 3;
        scoreView2.setText("" + score2);
    }

    public void reset(View view) {
        score1=0;
        score2=0;
        scoreView1.setText("0");
        scoreView2.setText("0");
    }
}