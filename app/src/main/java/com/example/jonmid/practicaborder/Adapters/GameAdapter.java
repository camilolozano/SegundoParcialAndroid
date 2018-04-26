package com.example.jonmid.practicaborder.Adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


import com.example.jonmid.practicaborder.Models.Game;
import com.example.jonmid.practicaborder.R;

import java.util.ArrayList;
import java.util.List;

public class GameAdapter  extends RecyclerView.Adapter<GameAdapter.ViewHolder>{

    List<Game> game = new ArrayList<>();
    Context context;

    // Constructor de la base
    public GameAdapter(List<Game> game, Context context) {
        this.game = game;
        this.context = context;
    }

    // *********************************************


    @NonNull
    @Override
    public GameAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        // Configuración inicial

        // Traer el archivo xml con el diseño (layout)
        View item = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_food, parent, false);

        // Le paso a la clase creada viewHolder el item llamado anteriormente
        GameAdapter.ViewHolder viewHolder = new GameAdapter.ViewHolder(item);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull GameAdapter.ViewHolder holder, int position) {
        // Asignar los valores a la vista
        holder.textViewname.setText(game.get(position).getName());
        holder.textViewcharacter.setText(game.get(position).getCharacter());
        holder.textViewseries.setText(game.get(position).getGameSeries());

    }

    @Override
    public int getItemCount() {
        return game.size();
    }


    // *********************************************

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView textViewname;
        TextView textViewcharacter;
        TextView textViewseries;

        public ViewHolder(View itemView) {
            super(itemView);
            textViewname  = (TextView) itemView.findViewById(R.id.id_rcv_game);
            textViewcharacter  = (TextView) itemView.findViewById(R.id.id_txv_game_character);
            textViewseries  = (TextView) itemView.findViewById(R.id.id_txv_game_gameseries);
        }
    }

}
