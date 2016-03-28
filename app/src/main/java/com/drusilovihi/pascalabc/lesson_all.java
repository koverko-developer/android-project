package com.drusilovihi.pascalabc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class lesson_all extends AppCompatActivity {

    ListView lvLesson;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_all);

        lvLesson = (ListView)findViewById(R.id.listView);
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this, R.array.lesson, android.R.layout.simple_list_item_1);
        lvLesson.setAdapter(adapter);

        lvLesson.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
            switch (position){
                case 0:
                    Intent intent0 = new Intent(lesson_all.this,ScrollingActivityL0.class);
                    startActivity(intent0);
                    break;
                case 1:
                    Intent intent1 = new Intent(lesson_all.this,ScrollingActivityl1.class);
                    startActivity(intent1);
                    break;
                case 2:
                    Intent intent2 = new Intent(lesson_all.this,ScrollingActivity2.class);
                    startActivity(intent2);
                    break;
                case 3:
                    Intent intent3 = new Intent(lesson_all.this,ScrollingActivity3.class);
                    startActivity(intent3);
                    break;
                case 4:
                    Intent intent4 = new Intent(lesson_all.this,ScrollingActivity4.class);
                    startActivity(intent4);
                    break;
                case 5:
                    Intent intent5 = new Intent(lesson_all.this,ScrollingActivity5.class);
                    startActivity(intent5);
                    break;
                case 6:
                    Intent intent6 = new Intent(lesson_all.this,ScrollingActivity6.class);
                    startActivity(intent6);
                    break;
                case 7:
                    Intent intent7 = new Intent(lesson_all.this,ScrollingActivity7.class);
                    startActivity(intent7);
                    break;
                case 8:
                    Intent intent8 = new Intent(lesson_all.this,ScrollingActivity8.class);
                    startActivity(intent8);
                    break;
                case 9:
                    Intent intent9 = new Intent(lesson_all.this,ScrollingActivity9.class);
                    startActivity(intent9);
                    break;
                case 10:
                    Intent intent10 = new Intent(lesson_all.this,ScrollingActivity10.class);
                    startActivity(intent10);
                    break;
                case 11:
                    Intent intent11 = new Intent(lesson_all.this,ScrollingActivity11.class);
                    startActivity(intent11);
                    break;
                case 12:
                    Intent intent12 = new Intent(lesson_all.this,ScrollingActivity12.class);
                    startActivity(intent12);
                    break;
                case 13:
                    Intent intent13 = new Intent(lesson_all.this,ScrollingActivity13.class);
                    startActivity(intent13);
                    break;
                case 14:
                    Intent intent14 = new Intent(lesson_all.this,ScrollingActivity14.class);
                    startActivity(intent14);
                    break;
                case 15:
                    Intent intent15 = new Intent(lesson_all.this,ScrollingActivity15.class);
                    startActivity(intent15);
                    break;
                case 16:
                    Intent intent16 = new Intent(lesson_all.this,ScrollingActivity16.class);
                    startActivity(intent16);
                    break;
                case 17:
                    Intent intent17 = new Intent(lesson_all.this,ScrollingActivity17.class);
                    startActivity(intent17);
                    break;

            }

            }
        });
    }
}
