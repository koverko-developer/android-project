package com.drusilovihi.pascalabc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class task_all extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task_all);

        TextView tv_text_task = (TextView)findViewById(R.id.text_the_task);

        int i = getIntent().getIntExtra("task_1",0);
        switch (i){
            case 0:
                tv_text_task.setText(R.string.task_1);
                break;
            case 1:
                tv_text_task.setText(R.string.task_2);
                break;
            case 2:
                tv_text_task.setText(R.string.task_3);
                break;
            case 3:
                tv_text_task.setText(R.string.task_4);
                break;
            case 4:
                tv_text_task.setText(R.string.task_5);
                break;
        }
    }
}
