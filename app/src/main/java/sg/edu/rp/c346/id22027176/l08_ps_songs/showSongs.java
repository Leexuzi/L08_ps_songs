package sg.edu.rp.c346.id22027176.l08_ps_songs;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class showSongs extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        ListView listView;

        listView = findViewById(R.id.songList);

        // Create the DBHelper object, passing in the
        // activity's Context
        DBHelper db = new DBHelper(showSongs.this);

        // Insert a task
        ArrayList data = db.getTasks();
        db.close();

        ArrayAdapter tasksAdapt = new ArrayAdapter<>(showSongs.this, android.R.layout.simple_list_item_1, data);

        for (int i = 0; i < data.size(); i++) {
            Log.d("data", i +". "+data.get(i));
        }

        listView.setAdapter(tasksAdapt);
    }
}