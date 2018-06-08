package com.example.yoshizawarei.lab2;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class CustomAdapter extends ArrayAdapter<String>{

    private final Activity context;
    private final Integer[] images;
    private final String [] country;


    public CustomAdapter(Activity context, Integer[] images, String[] country) {
        super(context, R.layout.customlayout, country);

        this.context = context;
        this.images = images;
        this.country = country;
    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.customlayout, parent,false);

        ImageView imageView = (ImageView)rowView.findViewById(R.id.imageView);
        TextView textView = (TextView)rowView.findViewById(R.id.textView);

        imageView.setImageResource(images[position]);
        textView.setText(country[position]);

        return rowView;
    }


}
