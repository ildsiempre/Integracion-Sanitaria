package com.example.usuario.integracionsanitaria.Login;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.usuario.integracionsanitaria.R;
import com.example.usuario.integracionsanitaria.ZonaPrincipal.ZonaPrincipalActivity;
import com.rey.material.widget.Button;

/**
 * A placeholder fragment containing a simple view.
 */
public class InitialLoginFragment extends Fragment {


    public InitialLoginFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_login, container, false);
        //Debido a ser appcompat, algunas cosas deben se metidas mediante codigo (creo)
        Toolbar toolbar = (Toolbar) rootView.findViewById(R.id.initial_login_fragment_toolbar);
        toolbar.setTitle(getString(R.string.app_name));
        toolbar.setBackgroundColor(getResources().getColor(R.color.material_blue_dark));
        toolbar.setTitleTextColor(getResources().getColor(R.color.white));

        Button button = (Button) rootView.findViewById(R.id.prueba_button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(),ZonaPrincipalActivity.class);
                startActivity(intent);
                getActivity().finish();
            }
        });
        return rootView;
    }

    @Override
    public void onStart() {
        super.onStart();
        Log.d("LoginActivity", "onStart - Entra en onStart");
        //TODO: comprobar usuario ya existente
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d("LoginActivity","onStop - Entra en onStop");
    }

    @Override
    public void onResume() {
        super.onResume();
        Log.d("LoginActivity","onResume - Entra en onResume");
    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d("LoginActivity","onPause - Entra en onPause");
    }


}


