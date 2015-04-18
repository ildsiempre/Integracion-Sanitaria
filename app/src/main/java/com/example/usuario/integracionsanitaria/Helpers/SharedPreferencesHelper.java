package com.example.usuario.integracionsanitaria.Helpers;


import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Usuario on 18/04/2015.
 */
public class SharedPreferencesHelper { //Clase de ayuda para trabajar con sharedPreferences del telefono
    SharedPreferences sharedPreferences;
    Context context;
    public SharedPreferencesHelper(Context context,String tag){//Constructor generico que recibe el nombre de la bd interna
        sharedPreferences = context.getSharedPreferences(tag,0);
        this.context=context;
    }

    public static SharedPreferencesHelper newInscance(Context context,String tag){//Nueva instancia
        return new SharedPreferencesHelper(context,tag);
    }

    public void putString(String key,String value){//Mete un string (Nombre de usuario por ejemplo)
        sharedPreferences.edit()
                .putString(key,value)
                .apply();
    }

    //Coge string (devuelve null en caso de que no exista)
    public String getString(String key){
        return sharedPreferences.getString(key,null);
    }


    //Mete boolean (tiene citas?)
    public void putBoolean(String key,boolean value){
        sharedPreferences.edit()
                .putBoolean(key,value)
                .apply();
    }

    //Coge boolean (devuelve false en caso de que no exista)
    public boolean getBoolean(String key){
        return sharedPreferences.getBoolean(key,false);
    }

}
