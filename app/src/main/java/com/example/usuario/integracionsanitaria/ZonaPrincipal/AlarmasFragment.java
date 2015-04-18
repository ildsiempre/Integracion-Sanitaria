package com.example.usuario.integracionsanitaria.ZonaPrincipal;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.usuario.integracionsanitaria.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class AlarmasFragment extends Fragment {
    AlarmasArrayAdapter alarmasArrayAdapter;

    public static AlarmasFragment newInstance(){
        return new AlarmasFragment();
    }


    public AlarmasFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_alarmas, container, false);
        //TODO: Valores de prueba
        String[]values = {"Mio","Hola","Hola","Hola","Hola","Hola","Hola","Hola","Hola","Hola","Hola"};
        alarmasArrayAdapter = new AlarmasArrayAdapter(getActivity(),R.layout.fragment_alarmas,values);

        ListView listView = (ListView) rootView.findViewById(R.id.listView_alarmas);
        listView.setAdapter(alarmasArrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getActivity(), "click", Toast.LENGTH_SHORT).show();
            }
        });

        return rootView;
    }

    public class AlarmasArrayAdapter extends ArrayAdapter<String> {
        private final Context context;
        private final String[] values;

        public AlarmasArrayAdapter(Context context,Integer layout,String[] values){
            super(context, layout,values);
            this.context=context;
            this.values=values;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater layoutInflater = LayoutInflater.from(context);
            View view = null;
            if (values[position].equals("Mio")) {//TODO: Guardar la imagen para no usar ProfilePictureView de facebook
                view = layoutInflater.inflate(R.layout.primera_alerta, parent, false);
            }
            else{
                view = layoutInflater.inflate(R.layout.alerta_general,parent,false);
            }
            //TODO: modificar datos y mejorar Visualizacion
            return  view;
        }
    }


}
