package com.example.leidong.litepalsample.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.leidong.litepalsample.R;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = "MainActivity";
    private Button addButton, deleteButton, modifyButton, queryButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initView();
    }

    /**
     * 获取组件
     */
    private void initView() {
        addButton = (Button) findViewById(R.id.button1);
        deleteButton = (Button) findViewById(R.id.button2);
        modifyButton = (Button) findViewById(R.id.button3);
        queryButton = (Button) findViewById(R.id.button4);
        addButton.setOnClickListener(this);
        deleteButton.setOnClickListener(this);
        modifyButton.setOnClickListener(this);
        queryButton.setOnClickListener(this);
    }

    /**
     * 按钮点击事件
     * @param v
     */
    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button1:
                addButtonClick();
                break;
            case R.id.button2:
                deleteButtomClick();
                break;
            case R.id.button3:
                modifyButtonClick();
                break;
            case R.id.button4:
                queryButtonClick();
                break;
            default:
                break;
        }
    }

    /**
     * 添加按钮点击
     */
    private void addButtonClick() {
        Intent intent = new Intent(MainActivity.this, AddActivity.class);
        startActivity(intent);
    }

    /**
     * 删除按钮点击
     */
    private void deleteButtomClick() {
        Intent intent = new Intent(MainActivity.this, DeleteActivity.class);
        startActivity(intent);
    }

    /**
     * 修改按钮点击
     */
    private void modifyButtonClick() {
        Intent intent = new Intent(MainActivity.this, ModifyActivity.class);
        startActivity(intent);
    }

    /**
     * 查询按钮点击
     */
    private void queryButtonClick() {
        Intent intent = new Intent(MainActivity.this, QueryActivity.class);
        startActivity(intent);
    }
}
