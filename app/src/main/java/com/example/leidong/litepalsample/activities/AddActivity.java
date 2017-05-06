package com.example.leidong.litepalsample.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.leidong.litepalsample.R;
import com.example.leidong.litepalsample.beans.Student;

/**
 * Created by leidong on 2017/5/5.
 */

public class AddActivity extends AppCompatActivity{
    private static final String TAG = "AddActivity";
    private EditText editText1, editText2, editText3;
    private Button button;

    @Override
    public void onCreate(final Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edit);

        initView();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s1 = editText1.getText().toString().trim();
                String s2 = editText2.getText().toString().trim();
                String s3 = editText3.getText().toString().trim();

                Student student = new Student();
                student.setId(Integer.parseInt(s1));
                student.setName(s2);
                student.setAge(Integer.parseInt(s3));
                student.save();

                Intent intent = new Intent(AddActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    /**
     * 获取组件
     */
    private void initView() {
        editText1 = (EditText) findViewById(R.id.editText1);
        editText2 = (EditText) findViewById(R.id.editText2);
        editText3 = (EditText) findViewById(R.id.editText3);
        button = (Button) findViewById(R.id.button);
        button.setText("添加");
    }
}
