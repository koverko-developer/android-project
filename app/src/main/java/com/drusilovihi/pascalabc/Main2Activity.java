package com.drusilovihi.pascalabc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.PopupMenu;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ListView lv_tast = (ListView)findViewById(R.id.listView3);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this, R.array.task_spisok, android.R.layout.simple_list_item_1);
        lv_tast.setAdapter(adapter);

        lv_tast.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        Intent intent0 = new Intent(Main2Activity.this, task_all.class);
                        intent0.putExtra("task_1", 0);
                        startActivity(intent0);
                        break;
                    case 1:
                        Intent intent1 = new Intent(Main2Activity.this, task_all.class);
                        intent1.putExtra("task_1", 1);
                        startActivity(intent1);
                        break;
                    case 2:
                        Intent intent2 = new Intent(Main2Activity.this, task_all.class);
                        intent2.putExtra("task_1", 2);
                        startActivity(intent2);
                        break;
                    case 3:
                        Intent intent3 = new Intent(Main2Activity.this, task_all.class);
                        intent3.putExtra("task_1", 3);
                        startActivity(intent3);
                        break;
                    case 4:
                        Intent intent4 = new Intent(Main2Activity.this, task_all.class);
                        intent4.putExtra("task_1", 4);
                        startActivity(intent4);
                        break;
                }


            }


        });
    }
}