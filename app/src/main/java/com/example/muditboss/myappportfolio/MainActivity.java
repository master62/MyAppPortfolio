package com.example.muditboss.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        Button b1 =  (Button) findViewById(R.id.B1);
        b1.setOnClickListener(this);

        Button b2 =  (Button) findViewById(R.id.B2);
        b2.setOnClickListener(this);

        Button b3 =  (Button) findViewById(R.id.B3);
        b3.setOnClickListener(this);

        Button b4 =  (Button) findViewById(R.id.B4);
        b4.setOnClickListener(this);

        Button b5 =  (Button) findViewById(R.id.B5);
        b5.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public void onClick(View view){

        switch (view.getId()){


            case R.id.B1:
                Toast.makeText(getApplicationContext(),"This button will launch Spotify Streamer",Toast.LENGTH_SHORT).show();
                break;
            case R.id.B2:
                Toast.makeText(getApplicationContext(),"This button will launch Super Duo",Toast.LENGTH_SHORT).show();
                break;
            case R.id.B3:
                Toast.makeText(getApplicationContext(),"This button will launch Build It Bigger",Toast.LENGTH_SHORT).show();
                break;
            case R.id.B4:
                Toast.makeText(getApplicationContext(),"This button will launch XYZ Reader",Toast.LENGTH_SHORT).show();
                break;
            case R.id.B5:
                Toast.makeText(getApplicationContext(),"This button will launch Loading",Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
