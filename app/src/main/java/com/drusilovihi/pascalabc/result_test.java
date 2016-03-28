package com.drusilovihi.pascalabc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class result_test extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_test);

        String col_pr = getIntent().getStringExtra("col_pr");

        int col_pr_int = Integer.parseInt(col_pr);
        int proc = (col_pr_int*10);
        String result2 = "Вы ответили правильно на "+col_pr+ " вопросов из 10\n\n Всего набрано "+proc+" %";

        TextView tvRes = (TextView)findViewById(R.id.textV_result);

        tvRes.setText(result2);


    }

    public void onClick_end_test(View view) {

        Intent intent_end_test = new Intent(result_test.this,MainActivity.class);
        startActivity(intent_end_test);
    }
}
