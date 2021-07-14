package com.appdevelopersumankr.java;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

import com.appdevelopersumankr.java.beginnerlevel.show_topic;
import com.appdevelopersumankr.java.expertlevel.e_screen;
import com.appdevelopersumankr.java.hardlevel.h_screen;
import com.appdevelopersumankr.java.mediumlevel.m_screen;

public class MainActivity extends AppCompatActivity {
    CardView cardView1,cardView2,cardView3,cardView4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate ( savedInstanceState );
        setContentView ( R.layout.activity_main );

        cardView1=findViewById (R.id.cardview1);
        cardView2=findViewById (R.id.cardview2);
        cardView3=findViewById (R.id.cardview3);
        cardView4=findViewById (R.id.cardview4);


        cardView1.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent i1=new Intent (MainActivity.this, show_topic.class);
                startActivity ( i1 );
            }
        } );

        cardView2.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent i2=new Intent (MainActivity.this, m_screen.class);
                startActivity ( i2 );
            }
        } );
        cardView3.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent i3=new Intent (MainActivity.this, h_screen.class);
                startActivity ( i3 );
            }
        } );
        cardView4.setOnClickListener ( new View.OnClickListener () {
            @Override
            public void onClick(View v) {
                Intent i4=new Intent (MainActivity.this, e_screen.class);
                startActivity ( i4 );
            }
        } );

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater ().inflate ( R.menu.mainmenu,menu );
        return super.onCreateOptionsMenu ( menu );
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId ()){
            case R.id.exitid:
                Toast.makeText ( this, "Exit", Toast.LENGTH_SHORT ).show ();
                AlertDialog.Builder alert2=new AlertDialog.Builder ( this);

                // alert2.setMessage ( "Enter Category");
                alert2.setTitle ( "Are you Sure Want to Exit");

                alert2.setPositiveButton ( "yes", new DialogInterface.OnClickListener () {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                        System.exit(0);


                    }
                } );
                alert2.setNegativeButton ( "No", new DialogInterface.OnClickListener () {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText ( MainActivity.this, "Welcome Again", Toast.LENGTH_SHORT ).show ();
                    }
                } );
                alert2.show ();
                break;
            case R.id.aboutusid:
                Toast.makeText ( this, "About us", Toast.LENGTH_SHORT ).show ();
                Intent intent=new Intent (MainActivity.this,Aboutus.class);
                startActivity ( intent );

        }
        return super.onOptionsItemSelected ( item );
    }
}