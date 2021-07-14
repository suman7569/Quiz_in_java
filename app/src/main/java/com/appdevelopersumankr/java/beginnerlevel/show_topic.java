package com.appdevelopersumankr.java.beginnerlevel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.appdevelopersumankr.java.R;
import com.appdevelopersumankr.java.adapter.Adapter_for_one;

public class show_topic extends AppCompatActivity {
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_show_topic );

        recyclerView=findViewById ( R.id.recyclerviewid);
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager ( show_topic.this,RecyclerView.VERTICAL,false );
        recyclerView.setLayoutManager ( layoutManager);


        Adapter_for_one adapter=new Adapter_for_one (recyclerView);
        recyclerView.setAdapter ( adapter );
    }
}