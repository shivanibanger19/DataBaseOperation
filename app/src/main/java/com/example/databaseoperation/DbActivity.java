package com.example.databaseoperation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import java.text.BreakIterator;

public class DbActivity extends AppCompatActivity {
    EditText etTitle, etSubtitle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_db);
    }

    public void dbHandler(View view) {
        switch (view.getId()) {
            case R.id.btn1:
                saveData();
                break;
            case R.id.btn2:
                saveData();
                break;


        }
    }

    private void retrieveData() {

    }

    private void saveData() {
        String title = etTitle.getText().toString();
        BreakIterator etTSubtitle;
        String subtitle = etSubtitle.getText().toString();
    }
};