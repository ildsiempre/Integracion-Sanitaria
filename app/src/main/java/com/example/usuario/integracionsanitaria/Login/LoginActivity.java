package com.example.usuario.integracionsanitaria.Login;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;

import com.example.usuario.integracionsanitaria.Login.InitialLoginFragment;
import com.example.usuario.integracionsanitaria.R;


public class LoginActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new InitialLoginFragment())
                    .commit();
        }
    }
}
