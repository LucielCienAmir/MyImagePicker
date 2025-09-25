package com.example.myimagepicker;

import android.content.ClipData;
import android.content.Context;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class ItemAdapter extends RecyclerView.Adapter<ItemHolder> {

    public ItemAdapter(ArrayList<MyItem> list, Context context) {
        this.list = list;
        this.context = context;
        this.inflater=LayoutInflater.from(context);

    }

    Context context;
    ArrayList<MyItem> list;
    LayoutInflater inflater;

    @NonNull
    @Override
    public ItemHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ItemHolder(inflater.inflate(R.layout.itemlayout,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull ItemHolder holder, int position) {
        holder.imageView.setImageURI(list.get(position).getUriImage());
        holder.textView.setText(list.get(position).getName());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }
}
