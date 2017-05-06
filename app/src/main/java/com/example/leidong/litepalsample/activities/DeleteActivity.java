package com.example.leidong.litepalsample.activities;

import android.content.Intent;
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

public class DeleteActivity extends AppCompatActivity {
    private static final String TAG = "DeleteActivity";
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
                int count = Integer.parseInt(editText1.getText().toString().trim());
                DataSupport.delete(Student.class, count);

                Intent intent = new Intent(DeleteActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    /**     * 获取组件
     */
    private void initView() {
        editText1 = (EditText) findViewById(R.id.editText1);
        editText2 = (EditText) findViewById(R.id.editText2);
        editText3 = (EditText) findViewById(R.id.editText3);
        button = (Button) findViewById(R.id.button);
        button.setText("删除");
    }
}
