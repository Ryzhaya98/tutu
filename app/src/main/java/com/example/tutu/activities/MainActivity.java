package com.example.tutu.activities;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.tutu.R;
import com.example.tutu.adapter.RecyclerViewAdapter;
import com.example.tutu.models.Product;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    List<Product> lstBook ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lstBook = new ArrayList<>();
        lstBook.add(new Product("Зеленая миля","Categorie Movei","Description Movei",R.drawable.m1));
        lstBook.add(new Product("Побег из шоушенка","Categorie Movei","Description Movei",R.drawable.m2));
        lstBook.add(new Product("Бойцовский клуб","Categorie Movei","Description Movei",R.drawable.m3));
        lstBook.add(new Product("Поймай меня если сможешь","Categorie Movei","Description Movei",R.drawable.m4));
        lstBook.add(new Product("Титаник","Categorie Movei","Description Movei",R.drawable.m5));
        lstBook.add(new Product("Пианист","Categorie Movei","Description Movei",R.drawable.m6));

        RecyclerView myrv = (RecyclerView) findViewById(R.id.recyclerview_id);
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this,lstBook);
        myrv.setLayoutManager(new GridLayoutManager(this,3));
        myrv.setAdapter(myAdapter);


    }
}