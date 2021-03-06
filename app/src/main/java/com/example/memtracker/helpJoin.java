package com.example.memtracker;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class helpJoin extends AppCompatActivity {

    TextView name;
    EditText CodeID;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help_join);

        Intent intent = getIntent();
        String placeholder = intent.getStringExtra("toJoinUp2");
        name = (TextView) findViewById(R.id.Name);
        name.setText(placeholder);

        CodeID = findViewById(R.id.Code);
        String enteredID = CodeID.getText().toString();
    }

    public void onRight (View view){
        Intent i = new Intent(helpJoin.this, MainPageHelp.class);
        startActivity(i);

        Intent b = new Intent(helpJoin.this, MainPageHelp.class);
        b.putExtra("toManage4", name.getText().toString());
        startActivity(b);

    }
}
