package com.example.yoshizawarei.layoutexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        tmnt_text.setText(R.string.topLabelChanged);
        //        int a = R.array.tmnt;

        final Spinner tmnt_spinner = findViewById(R.id.tmnt_spinner);
        final TextView tmnt_text = findViewById(R.id.tmnt_text);
        final ImageView tmnt_img = findViewById(R.id.tmnt_img);

        tmnt_spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                tmnt_text.setText("You choose " + tmnt_spinner.getSelectedItem());
                if (tmnt_spinner.getSelectedItem().toString().equals("Leo")) {
                    tmnt_img.setImageResource(R.drawable.leonardo);
                } else if (tmnt_spinner.getSelectedItem().toString().equals("Raf")) {
                    tmnt_img.setImageResource(R.drawable.raphael);
                } else if (tmnt_spinner.getSelectedItem().toString().equals("Mich")) {
                    tmnt_img.setImageResource(R.drawable.michelangelo);
                } else {
                    tmnt_img.setImageResource(R.drawable.donatello);
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });



    }
}
