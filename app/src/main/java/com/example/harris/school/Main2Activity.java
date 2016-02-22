package com.example.harris.school;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import io.realm.Realm;

public class Main2Activity extends AppCompatActivity {

    public EditText inputSubject;
    public EditText inputDetails;
    public EditText inputDate;
    Realm homeworkDB;
    private static final String TAG = "MyLog";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        homeworkDB = Realm.getInstance(this);

    }

    public void setData(View view){


        inputSubject = (EditText) (findViewById(R.id.editTextSubject));
        String stringSubject = inputSubject.getText().toString();

        inputDetails = (EditText) findViewById(R.id.editTextDetails);
        String stringDetails = inputDetails.getText().toString();

        inputDate = (EditText) findViewById(R.id.editTextDate);
        String stringDate = inputDate.getText().toString();

        homeworkDB.beginTransaction();

        dbItem dbItem = homeworkDB.createObject(dbItem.class);

        dbItem.setSubject(stringSubject);
        dbItem.setDate(stringDate);
        dbItem.setDetails(stringDetails);

        homeworkDB.commitTransaction();

        Intent returnHome = new Intent(this, Main2Activity.class);
        startActivity(returnHome);
    }

}
