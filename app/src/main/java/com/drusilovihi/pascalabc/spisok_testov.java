package com.drusilovihi.pascalabc;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class spisok_testov extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spisok_testov);

        ListView listView_testy = (ListView)findViewById(R.id.listView2);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.spisok_testov,
                android.R.layout.simple_list_item_1);
        listView_testy.setAdapter(adapter);

        final String[] test1 = getResources().getStringArray(R.array.test_1);
        final String[] test2 = getResources().getStringArray(R.array.test_2);
        final String[] test3 = getResources().getStringArray(R.array.test_3);
        final String[] test4 = getResources().getStringArray(R.array.test_4);
        final String[] test5 = getResources().getStringArray(R.array.test_5);
        final String[] test6 = getResources().getStringArray(R.array.test_6);
        final String[] test7 = getResources().getStringArray(R.array.test_7);
        final String[] test8 = getResources().getStringArray(R.array.test_8);

        listView_testy.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        Intent intent_testy_content = new Intent(spisok_testov.this,testy_all.class);
                        intent_testy_content.putExtra("test1",test1);
                        startActivity(intent_testy_content);
                        break;
                    case 1:
                        Intent intent_testy_content1 = new Intent(spisok_testov.this,testy_all.class);
                        intent_testy_content1.putExtra("test1",test2);
                        startActivity(intent_testy_content1);
                        break;
                    case 2:
                        Intent intent_testy_content2 = new Intent(spisok_testov.this,testy_all.class);
                        intent_testy_content2.putExtra("test1",test3);
                        startActivity(intent_testy_content2);
                        break;
                    case 3:
                        Intent intent_testy_content3 = new Intent(spisok_testov.this,testy_all.class);
                        intent_testy_content3.putExtra("test1",test4);
                        startActivity(intent_testy_content3);
                        break;
                    case 4:
                        Intent intent_testy_content4 = new Intent(spisok_testov.this,testy_all.class);
                        intent_testy_content4.putExtra("test1",test5);
                        startActivity(intent_testy_content4);
                        break;
                    case 5:
                        Intent intent_testy_content5 = new Intent(spisok_testov.this,testy_all.class);
                        intent_testy_content5.putExtra("test1",test6);
                        startActivity(intent_testy_content5);
                        break;
                    case 6:
                        Intent intent_testy_content6 = new Intent(spisok_testov.this,testy_all.class);
                        intent_testy_content6.putExtra("test1",test7);
                        startActivity(intent_testy_content6);
                        break;
                    case 7:
                        Intent intent_testy_content7 = new Intent(spisok_testov.this,testy_all.class);
                        intent_testy_content7.putExtra("test1",test8);
                        startActivity(intent_testy_content7);
                        break;

                }
            }
        });
    }
}
