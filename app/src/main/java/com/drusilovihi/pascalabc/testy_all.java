package com.drusilovihi.pascalabc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class testy_all extends AppCompatActivity {

    RadioGroup rg;
    RadioButton rbtn1;
    RadioButton rbtn2;
    RadioButton rbtn3;
    RadioButton rbtn4;
    Button bnt_pr;
    Button btn_nest;
    TextView tv_vopros;
    int col_pr_otvetov =0;

    String[] arr_all;
    int index =0;
    int checkedRadioButtonId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_testy_all);

        rg = (RadioGroup)findViewById(R.id.rg);
        rbtn1 = (RadioButton)findViewById(R.id.radioButton);
        rbtn2 = (RadioButton)findViewById(R.id.radioButton2);
        rbtn3 = (RadioButton)findViewById(R.id.radioButton3);
        rbtn4 = (RadioButton)findViewById(R.id.radioButton4);
        bnt_pr = (Button)findViewById(R.id.button_pr);
        btn_nest = (Button)findViewById(R.id.button_next);
        tv_vopros = (TextView)findViewById(R.id.text_vopros);

        arr_all = getIntent().getStringArrayExtra("test1");

        tv_vopros.setText(arr_all[index]);
        rbtn1.setText(arr_all[index+1]);
        rbtn2.setText(arr_all[index+2]);
        rbtn3.setText(arr_all[index+3]);
        rbtn4.setText(arr_all[index+4]);
        btn_nest.setEnabled(false);
    }

    public void onClick_rg(View view) {

        checkedRadioButtonId = rg.getCheckedRadioButtonId();
        RadioButton myradiobutton = (RadioButton) findViewById(checkedRadioButtonId);
        String xx = myradiobutton.getText().toString();
        if(xx.equals(arr_all[index+5]))
        {
            rg.setBackgroundResource(R.color.pr_otvet);
            rbtn1.setEnabled(false);
            rbtn2.setEnabled(false);
            rbtn3.setEnabled(false);
            rbtn4.setEnabled(false);
            col_pr_otvetov++;
        }
        else {
            rg.setBackgroundResource(R.color.nepr_otvet);


            rbtn1.setEnabled(false);
            rbtn2.setEnabled(false);
            rbtn3.setEnabled(false);
            rbtn4.setEnabled(false);
        }

        rg.clearCheck();
    }

    public void onClick_proverka(View view) {

        try {

            onClick_rg(view);
            bnt_pr.setEnabled(false);
            btn_nest.setEnabled(true);
        }
        catch (Exception ex)
        {
            Toast.makeText(getApplicationContext(),"Выберите вариант ответа!",Toast.LENGTH_SHORT).show();
        }

    }

    public void onClick_next(View view) {

        try {
            index+=6;
            tv_vopros.setText(arr_all[index]);
            rbtn1.setText(arr_all[index+1]);
            rbtn2.setText(arr_all[index+2]);
            rbtn3.setText(arr_all[index+3]);
            rbtn4.setText(arr_all[index+4]);
            rg.setBackgroundResource(R.color.otvet_neitral);

            rbtn1.setEnabled(true);
            rbtn2.setEnabled(true);
            rbtn3.setEnabled(true);
            rbtn4.setEnabled(true);
            bnt_pr.setEnabled(true);
            btn_nest.setEnabled(false);
        }
        catch (Exception ex)
        {
            String col_pr = String.valueOf(col_pr_otvetov);
            Intent intent_result = new Intent(testy_all.this,result_test.class);
            intent_result.putExtra("col_pr",col_pr);
            startActivity(intent_result);
        }
    }
}
