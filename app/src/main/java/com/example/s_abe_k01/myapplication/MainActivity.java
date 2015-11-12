package com.example.s_abe_k01.myapplication;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

/*

        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
*/

        //前回データファイルのオープン

        SharedPreferences sp = getSharedPreferences("AppData",MODE_PRIVATE);
        SharedPreferences.Editor ed = sp.edit();

        //内容確認

        if(sp.getBoolean("HadBooted", false)){ //"起動済み情報の内容がTrueの時"
            Toast.makeText(this, "This Application had Booted before.", Toast.LENGTH_SHORT).show();
            Intent i = new Intent(this, ClipData.class);
            startActivity(i);

        }else{
            Toast.makeText(this, "First time boot.", Toast.LENGTH_SHORT).show();
            //起動情報を書き込み
            ed.putBoolean("HadBooted",true);
            ed.commit();

            //規約画面へ推移
            Log.d("MSG", "規約画面へ");
            Intent i = new Intent(this, Kiyaku.class);
            startActivity(i);

        }

/*
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
*/

    }

/*
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
*/

/*
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
*/

}
