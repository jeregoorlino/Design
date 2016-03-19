package com.example.jeregoorlino.mysprinkler;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Register extends AppCompatActivity {
    private UserRegisterTask mRegisterTask = null;

    // UI references.
    private EditText mEmailView;
    private EditText mPasswordView;
    private EditText mPhoneView;
    private EditText mNameView;
    private EditText mSerialView;
    private View mRegisterFormView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        /*super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);*/

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        toolbar.setTitle("Register Account");
        setSupportActionBar(toolbar);
        mEmailView = (EditText) findViewById(R.id.rEmail);
        mPasswordView = (EditText) findViewById(R.id.rPassword);
        mPhoneView = (EditText) findViewById(R.id.rPhone);
        mNameView = (EditText) findViewById(R.id.rName);
        mSerialView = (EditText) findViewById(R.id.rEyeSerial);
        Button mEmailRegisterButton = (Button) findViewById(R.id.email_register_button);
        mEmailRegisterButton.setOnClickListener(new View.OnClickListener() {
            /*@Override
            public void onClick(View view) {
                attemptRegister();
            }*/
        });

        mRegisterFormView = findViewById(R.id.register_form);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

    }

}
