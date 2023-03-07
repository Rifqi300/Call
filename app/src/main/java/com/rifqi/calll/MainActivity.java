package com.rifqi.calll;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);

                final RecyclerView rcall = findViewById(R.id.rcall);
                ArrayList<Hero>heroes = new ArrayList<>();
                rcall.setAdapter(new Adapter(heroes,this));
                heroes.add(new Hero("adipati",R.drawable.adipati));
                heroes.add(new Hero("iqbal",R.drawable.iqbal));
                heroes.add(new Hero("mawar",R.drawable.mawar));
                heroes.add(new Hero("sule",R.drawable.sule));

                rcall.setLayoutManager(new GridLayoutManager(this
                ,2));
        }
}