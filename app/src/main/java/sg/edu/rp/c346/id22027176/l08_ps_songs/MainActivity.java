package sg.edu.rp.c346.id22027176.l08_ps_songs;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    EditText title, singer, year;
    RadioGroup rg;
    RadioButton radBtn;
    Button insert, showList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        title = findViewById(R.id.ttlInp);
        singer = findViewById(R.id.singInp);
        year = findViewById(R.id.yrInp);
        insert = findViewById(R.id.insert);
        showList = findViewById(R.id.showlist);
        rg = findViewById(R.id.r);

        insert.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                // Create the DBHelper object, passing in the
                // activity's Context
                DBHelper db = new DBHelper(MainActivity.this);

                // Insert a song
                String titl = title.getText().toString();
                String singe = singer.getText().toString();
                int yea = Integer.parseInt(year.getText().toString());
                int rBtnId = rg.getCheckedRadioButtonId();
                radBtn = findViewById(rBtnId);
                int sta = Integer.parseInt(radBtn.getText().toString());
                db.insertSong(titl, singe, yea, sta);
                Log.d("aaaaa", db.toString());
            }
        });

        showList.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, showSongs.class);
                startActivity(intent);
            }
        });

    }
}