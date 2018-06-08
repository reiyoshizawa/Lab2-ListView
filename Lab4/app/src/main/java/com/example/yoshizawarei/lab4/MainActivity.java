package com.example.yoshizawarei.lab4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.GridLayout;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    public static final String MOVIE_EXTRA = "movie name";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        GridLayout gridLayout = findViewById(R.id.grid_movies);
        for (int i = 0; i < gridLayout.getChildCount(); i++) {
            ImageButton imageButton = (ImageButton) gridLayout.getChildAt(i);
            imageButton.setOnClickListener(this);
        }
    }

    private void toast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onClick(View v) {
        // 1. start the default activity
        //    - Intent
        //    - putExtra (movie name)
        String imgTag = v.getTag().toString();
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra(MOVIE_EXTRA, imgTag);

        startActivity(intent);
        toast(imgTag);
    }
}
