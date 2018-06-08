package com.example.yoshizawarei.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int rand1;
    private int rand2;
    private int score;
    private Button leftButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // right after the activity gets created.
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        leftButton = findViewById(R.id.leftButton);
        leftButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // when left button clicked.
            }
        });

        // initial settings
        score = 0;
        generateRandomNumbers();

    }

    private void generateRandomNumbers() {
        rand1 = (int) (Math.random() * 100) + 1; // 1 <=    < 100
        rand2 = (int) (Math.random() * 100) + 1;
        while (rand1 == rand2) {
            rand2 = (int) (Math.random() * 100) + 1;
        }
        Button leftButt = findViewById(R.id.leftButton);
        leftButt.setText(String.valueOf(rand1));
        Button rightButt = findViewById(R.id.rightButton);
        rightButt.setText("" + rand2);
    }

    public void buttonClicked(View view) {
        String show = "";
        if (view.getId() == R.id.leftButton) {
            // left button clicked
            if (rand1 > rand2) {
                score++;
                show = "RIGHT!";
            } else {
                score--;
                show = "WRONG!";
            }
        } else {
            if (rand2 > rand1) {
                score++;
                show = "RIGHT!";
            } else {
                score--;
                show = "WRONG!";
            }
        }

        Toast.makeText(this, "YOU ARE " + show, Toast.LENGTH_SHORT).show();
        TextView scoreView = findViewById(R.id.score);
        scoreView.setText("Score: " + score);
        generateRandomNumbers();
    }
}