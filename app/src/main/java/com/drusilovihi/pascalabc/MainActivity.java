package com.drusilovihi.pascalabc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

    public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void click_lesson_all(View view) {

        Intent intent = new Intent(MainActivity.this,lesson_all.class);
        startActivity(intent);

    }

        public void onclick_test(View view) {

            Intent intent_testy = new Intent(MainActivity.this,spisok_testov.class);
            startActivity(intent_testy);
        }

        public void onClick_the_task(View view) {
           Intent intent_the_task = new Intent(MainActivity.this,Main2Activity.class);
            startActivity(intent_the_task);

        }

        public void onClick_o_app(View view) {

            /*Intent intent_the_app_info = new Intent(MainActivity.this,app_info.class);
            startActivity(intent_the_app_info);*/
            Intent intent_the_app_info = new Intent(MainActivity.this,info_app.class);
            startActivity(intent_the_app_info);
        }
    }
