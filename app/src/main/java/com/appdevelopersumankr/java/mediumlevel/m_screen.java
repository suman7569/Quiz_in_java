package com.appdevelopersumankr.java.mediumlevel;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.appdevelopersumankr.java.R;
import com.appdevelopersumankr.java.adapter.Adapter_for_four;
import com.appdevelopersumankr.java.adapter.Adapter_for_one;
import com.appdevelopersumankr.java.beginnerlevel.show_topic;

public class m_screen extends AppCompatActivity {
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_m_screen );

        recyclerView=findViewById ( R.id.recyclerviewid);
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager ( m_screen.this,RecyclerView.VERTICAL,false );
        recyclerView.setLayoutManager ( layoutManager);


        Adapter_for_four adapter=new Adapter_for_four (recyclerView);
        recyclerView.setAdapter ( adapter );
    }
}