package com.rifqi.calll;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.Holder> {
    private ArrayList<Hero> heroes;
    private Context context;

    public Adapter(ArrayList<Hero> heroes, Context context) {
        this.heroes = heroes;
        this.context = context;
    }

    @NonNull
    @Override
    public Adapter.Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(context).inflate(R.layout.item_hero, parent, false);
        return new Holder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.Holder holder, int position) {
        Hero hero = heroes.get(position);
        holder.nama.setText(hero.getNama());
        holder.img.setImageResource(hero.getImghero());
        holder.btnCall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(context, DetailCall.class);
                Bundle bundle = new Bundle();
                bundle.putSerializable("Hero", heroes);
                i.putExtra("Hero", bundle);
                context.startActivity(i);
            }
        });

    }

    @Override
    public int getItemCount() {
        return heroes.size();
    }

    public class Holder extends RecyclerView.ViewHolder {
        public TextView nama;
        public ImageView img;
        public Button btnCall;

        public Holder(@NonNull View itemView) {

            super(itemView);

            nama = itemView.findViewById(R.id.nama);
            img = itemView.findViewById(R.id.imghero);
            btnCall = itemView.findViewById(R.id.panggil);
        }
    }
}
