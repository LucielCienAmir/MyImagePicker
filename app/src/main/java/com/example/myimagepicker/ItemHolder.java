package com.example.myimagepicker;

import android.content.ClipData;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NonNls;

public class ItemHolder extends RecyclerView.ViewHolder{
    ImageView imageView;
    TextView textView;

    public ItemHolder(@NonNull View itemView) {
        super(itemView);
        imageView=itemView.findViewById(R.id.imageView);
        textView=itemView.findViewById(R.id.textView);

    }
}
