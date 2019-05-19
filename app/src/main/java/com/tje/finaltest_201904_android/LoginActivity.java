package com.tje.finaltest_201904_android;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.view.View;

import com.tje.finaltest_201904_android.databinding.ActivityLoginBinding;

public class LoginActivity extends BaseActivity {

    ActivityLoginBinding act;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bindViews();
        setupEvents();
        setValues();
    }

    @Override
    public void setupEvents() {

        act.loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String inputId = act.idEdt.getText().toString();
                String inputPw = act.pwEdt.getText().toString();


            }
        });

    }

    @Override
    public void setValues() {

    }

    @Override
    public void bindViews() {

        act = DataBindingUtil.setContentView(this, R.layout.activity_login);
    }
}
