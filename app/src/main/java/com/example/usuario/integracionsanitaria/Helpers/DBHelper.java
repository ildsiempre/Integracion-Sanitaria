package com.example.usuario.integracionsanitaria.Helpers;

import android.content.Context;
import android.os.Handler;

/**
 * Created by Usuario on 18/04/2015.
 */
public class DBHelper {
    Context context;
    String root;
    public DBHelper(Context context,String root){
        this.context=context;
        this.root = root;
    }

    public DBHelper child(String child){//Función que permite tomar referencia de un hijo en la tabla para acotar la búsqueda
        return new DBHelper(context,root.concat("/"+child));
    }



    //TODO: ProgresDialog?
    public void getInfo(Integer code){
        //Coge informacion de la base de datos
    }
    public void setInfo(Integer code){
        //Mete información en la base de datos
    }

    //TODO: Crear la interfaz para el Callback

    interface DBCallback{
        void callbackCall();
    }

    class Worker{
        DBCallback dbCallback;
        void onEvent(){
            dbCallback.callbackCall();
        }
    }

}
