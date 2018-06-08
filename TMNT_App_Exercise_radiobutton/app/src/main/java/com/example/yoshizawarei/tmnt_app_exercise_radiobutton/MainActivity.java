package com.example.yoshizawarei.tmnt_app_exercise_radiobutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final RadioGroup radioGroup = findViewById(R.id.radioGroup);
        final RadioButton radioButtonLeo = findViewById(R.id.leo);
        final RadioButton radioButtonRaf = findViewById(R.id.raf);
        final RadioButton radioButtonMich = findViewById(R.id.mich);
        final RadioButton radioButtonDon = findViewById(R.id.don);

    }


    public void radioClick(View view) {
        final TextView tmt_text = findViewById(R.id.tmnt_text);
        final ImageView tmnt_img = findViewById(R.id.tmnt_img);
        if (view.getId() == R.id.leo) {
            tmt_text.setText(R.string.leo);
            tmnt_img.setImageResource(R.drawable.leonardo);
        } else if (view.getId() == R.id.raf) {
            tmt_text.setText(R.string.raf);
            tmnt_img.setImageResource(R.drawable.raphael);
        } else if (view.getId() == R.id.mich) {
            tmt_text.setText(R.string.mich);
            tmnt_img.setImageResource(R.drawable.michelangelo);
        } else {
            tmt_text.setText(R.string.don);
            tmnt_img.setImageResource(R.drawable.donatello);
        }

    }
}
