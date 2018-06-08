package com.example.yoshizawarei.lab4;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Scanner;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        Intent intent = getIntent();
        String movie_name = intent.getStringExtra(MainActivity.MOVIE_EXTRA);

        // 1. ImageView
        ImageView imageView = findViewById(R.id.detail_img);
        int img_id = getResources().getIdentifier(movie_name, "drawable", getPackageName());
        imageView.setImageResource(img_id);

        // 2. textView -> Scanner read contents from txt file.
        int txt_id = getResources().getIdentifier(movie_name, "raw", getPackageName());
        Scanner scan = new Scanner(getResources().openRawResource(txt_id));
        String allText = "";
        while (scan.hasNextLine()) {
            allText += scan.nextLine();
        }
        scan.close();
        TextView textView = findViewById(R.id.detail_txt);
        textView.setText(allText);

    }
}
