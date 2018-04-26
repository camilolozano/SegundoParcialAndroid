package com.example.jonmid.practicaborder.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.jonmid.practicaborder.Models.Food;
import com.example.jonmid.practicaborder.R;

import java.util.ArrayList;
import java.util.List;

public class FoodAdapter  extends RecyclerView.Adapter<FoodAdapter.ViewHolder>  {
    List<Food> food = new ArrayList<>();
    Context context;

    // Constructor de la base
    public FoodAdapter(List<Food> food, Context context) {
        this.food = food;
        this.context = context;
    }

    // *********************************************


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Configuración inicial

        // Traer el archivo xml con el diseño (layout)
        View item = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_food, parent, false);

        // Le paso a la clase creada viewHolder el item llamado anteriormente
        ViewHolder viewHolder = new ViewHolder(item);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        // Asignar los valores a la vista
        holder.textViewtitle.setText(food.get(position).getTitle());
    }

    @Override
    public int getItemCount() {
        return food.size();
    }


    // *********************************************

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView textViewtitle;

        public ViewHolder(View itemView) {
            super(itemView);
            textViewtitle  = (TextView) itemView.findViewById(R.id.id_txv_food_title);
        }
    }
}
