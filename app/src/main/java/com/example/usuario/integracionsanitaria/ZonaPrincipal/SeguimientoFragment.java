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
public class SeguimientoFragment extends Fragment {
    SeguimientoArrayAdapter seguimientoArrayAdapter;

    public static SeguimientoFragment newInstance(){
        return new SeguimientoFragment();
    }


    public SeguimientoFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_seguimiento, container, false);
        //TODO: Valores de prueba
        String[]values = {"Mio","Hola","Hola","Hola"};
        seguimientoArrayAdapter = new SeguimientoArrayAdapter(getActivity(),R.layout.fragment_seguimiento,values);

        ListView listView = (ListView) rootView.findViewById(R.id.seguimiento_listView);
        listView.setAdapter(seguimientoArrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getActivity(), "click", Toast.LENGTH_SHORT).show();
            }
        });

        return rootView;
    }

    public class SeguimientoArrayAdapter extends ArrayAdapter<String> {
        private final Context context;
        private final String[] values;

        public SeguimientoArrayAdapter(Context context,Integer layout,String[] values){
            super(context, layout,values);
            this.context=context;
            this.values=values;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            LayoutInflater layoutInflater = LayoutInflater.from(context);
            View view = null;
            if (values[position].equals("Mio")) {
                view = layoutInflater.inflate(R.layout.seguimiento_desplegado, parent, false);
            }
            else{
                view = layoutInflater.inflate(R.layout.seguimiento_sin_desplegar,parent,false);
            }
            //TODO: modificar datos y mejorar Visualizacion
            return  view;
        }
    }


}
