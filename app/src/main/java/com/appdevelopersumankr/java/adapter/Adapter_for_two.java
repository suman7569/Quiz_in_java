package com.appdevelopersumankr.java.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.appdevelopersumankr.java.R;
import com.appdevelopersumankr.java.beginnerlevel.beg_1;
import com.appdevelopersumankr.java.beginnerlevel.beg_10;
import com.appdevelopersumankr.java.beginnerlevel.beg_11;
import com.appdevelopersumankr.java.beginnerlevel.beg_12;
import com.appdevelopersumankr.java.beginnerlevel.beg_13;
import com.appdevelopersumankr.java.beginnerlevel.beg_2;
import com.appdevelopersumankr.java.beginnerlevel.beg_3;
import com.appdevelopersumankr.java.beginnerlevel.beg_4;
import com.appdevelopersumankr.java.beginnerlevel.beg_5;
import com.appdevelopersumankr.java.beginnerlevel.beg_6;
import com.appdevelopersumankr.java.beginnerlevel.beg_7;
import com.appdevelopersumankr.java.beginnerlevel.beg_8;
import com.appdevelopersumankr.java.beginnerlevel.beg_9;
import com.appdevelopersumankr.java.mediumlevel.m_1;
import com.appdevelopersumankr.java.mediumlevel.m_10;
import com.appdevelopersumankr.java.mediumlevel.m_11;
import com.appdevelopersumankr.java.mediumlevel.m_12;
import com.appdevelopersumankr.java.mediumlevel.m_13;
import com.appdevelopersumankr.java.mediumlevel.m_2;
import com.appdevelopersumankr.java.mediumlevel.m_3;
import com.appdevelopersumankr.java.mediumlevel.m_4;
import com.appdevelopersumankr.java.mediumlevel.m_5;
import com.appdevelopersumankr.java.mediumlevel.m_6;
import com.appdevelopersumankr.java.mediumlevel.m_7;
import com.appdevelopersumankr.java.mediumlevel.m_8;
import com.appdevelopersumankr.java.mediumlevel.m_9;

public class Adapter_for_two extends RecyclerView.Adapter<Adapter_for_two.ViewHolder> {

    View v;
    String[] levelname={" Data Types, Variables and Arrays","Operators and Control Statements",
            "Java Environment & OOPS Concepts","Classes and Methods","Inheritance","String Handling",
            "Exploring java.lang & java.io","Serialization & Networking","java.util – The Collections Framework","Exception Handling",
            "Multithreading","I/O & Applets","Event Handling"};
    Context context;

    public Adapter_for_two(View v) {
        this.v = v;
    }

    public Adapter_for_two(String[] levelname) {
        this.levelname = levelname;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        v= LayoutInflater.from ( parent.getContext () ).inflate ( R.layout.topic_blueprint,null);
        Adapter_for_two.ViewHolder viewHolder=new Adapter_for_two.ViewHolder (v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.textView1.setText (levelname[position]);
    }

    @Override
    public int getItemCount() {
        return levelname.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        TextView textView1;
        public ViewHolder(@NonNull View itemView) {
            super ( itemView );
            textView1=itemView.findViewById ( R.id.levelnameid );
            itemView.setOnClickListener ( this );
        }
        @Override
        public void onClick(View v) {
            int i=getAdapterPosition ();
            int j=i+1;
            //Toast.makeText ( itemView.getContext (), "Level "+j, Toast.LENGTH_LONG ).show ();
            switch (i){
                case 0:
                    Intent intent = new Intent ( itemView.getContext (), m_1.class );
                    itemView.getContext ().startActivity ( intent );
                    break;
                case 1:
                    Intent intent2 = new Intent ( itemView.getContext (), m_2.class );
                    itemView.getContext ().startActivity ( intent2 );
                    break;
                case 2:
                    Intent intent3 = new Intent ( itemView.getContext (), m_3.class );
                    itemView.getContext ().startActivity ( intent3 );
                    break;
                case 3:
                    Intent intent4 = new Intent ( itemView.getContext (), m_4.class );
                    itemView.getContext ().startActivity ( intent4 );
                    break;
                case 4:
                    Intent intent5 = new Intent ( itemView.getContext (), m_5.class );
                    itemView.getContext ().startActivity ( intent5 );
                    break;
                case 5:
                    Intent intent6 = new Intent ( itemView.getContext (), m_6.class );
                    itemView.getContext ().startActivity ( intent6 );
                    break;
                case 6:
                    Intent intent7 = new Intent ( itemView.getContext (), m_7.class );
                    itemView.getContext ().startActivity ( intent7 );
                    break;
                case 7:
                    Intent intent8 = new Intent ( itemView.getContext (), m_8.class );
                    itemView.getContext ().startActivity ( intent8 );
                    break;
                case 8:
                    Intent intent9 = new Intent ( itemView.getContext (), m_9.class );
                    itemView.getContext ().startActivity ( intent9 );
                    break;
                case 9:
                    Intent intent10 = new Intent ( itemView.getContext (), m_10.class );
                    itemView.getContext ().startActivity ( intent10 );
                    break;
                case 10:
                    Intent intent11 = new Intent ( itemView.getContext (), m_11.class );
                    itemView.getContext ().startActivity ( intent11 );
                    break;
                case 11:
                    Intent intent12 = new Intent ( itemView.getContext (), m_12.class );
                    itemView.getContext ().startActivity ( intent12 );
                    break;
                case 12:
                    Intent intent13 = new Intent ( itemView.getContext (), m_13.class );
                    itemView.getContext ().startActivity ( intent13);
                    break;


            }
        }
    }
}
