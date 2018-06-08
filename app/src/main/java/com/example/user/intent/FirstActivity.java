package com.example.user.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class FirstActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        btn1=(Button) findViewById(R.id.btnid);
        btn1.setOnClickListener(FirstActivity.this);

    }

    @Override
    public void onClick(View view) {
        Intent intent=new Intent(FirstActivity.this,SecondActivity.class);
        intent.putExtra("tag","Bangladesh is my motherland");
        startActivity(intent);
    }
}
