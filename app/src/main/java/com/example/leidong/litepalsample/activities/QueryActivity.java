package com.example.leidong.litepalsample.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.leidong.litepalsample.R;
import com.example.leidong.litepalsample.beans.Student;

import org.litepal.crud.DataSupport;

/**
 * Created by leidong on 2017/5/5.
 */

public class QueryActivity extends AppCompatActivity {
    private static final String TAG = "QueryActivity";
    private EditText editText1, editText2, editText3;
    private Button button;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edit);

        initView();

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Student student = new Student();
                int id = Integer.parseInt(editText1.getText().toString().trim());
                student = DataSupport.find(Student.class, id);

                editText1.setText(String.valueOf(student.getId()));
                editText2.setText(student.getName());
                editText3.setText(String.valueOf(student.getAge()));
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
        button.setText("查找");
    }
}
