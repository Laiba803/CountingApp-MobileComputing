package com.example.countinglearningapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class Adapter extends ArrayAdapter<CountingClass> {
    public Adapter(@NonNull Context context, ArrayList<CountingClass> CountingList) {
        super(context, R.layout.activity_list_entries, CountingList);
    }

    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        CountingClass list = getItem(position);
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.activity_list_entries, parent, false);
        TextView number = convertView.findViewById(R.id.number);
        TextView sentence = convertView.findViewById(R.id.sentence);
        ImageView imageView = convertView.findViewById(R.id.imageView6);
        number.setText(list.number);
        sentence.setText(list.sentence);
        imageView.setImageResource(list.imgID);
        return convertView;
    }
}
