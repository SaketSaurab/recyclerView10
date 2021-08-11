package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.GridLayout;
import android.widget.LinearLayout;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements OnNameItemClicked {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        RecyclerView recyclerView=findViewById(R.id.recylcerview);
        ArrayList<String>names=new ArrayList<>();
        names.add("Shiv");
        names.add("Jack");
        names.add("Rockey");
        names.add("Shiv");
        names.add("Jack");
        names.add("Rockey");


        MyAdapter adapter=new MyAdapter(names, this,this);
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        GridLayoutManager gridLayoutManager=new GridLayoutManager(this,3);

        recyclerView.setLayoutManager(gridLayoutManager);

        recyclerView.setAdapter(adapter);


    }

    @Override
    public void onMyNameClicked(String name) {
        Toast.makeText(this,name,Toast.LENGTH_SHORT).show();

        //



    }
}