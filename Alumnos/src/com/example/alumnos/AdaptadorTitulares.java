package com.example.alumnos;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class AdaptadorTitulares extends BaseAdapter
{
	static Activity contexto;
	Titular[] datos;
	
	@SuppressWarnings("static-access")
	AdaptadorTitulares(Activity actividad, Titular[] datos)
	{
		//para array adapter super usaria parametros: contexto, R.layout.activity_adaptador_titulares, datos
		super();//donde, desde donde, que arreglo 
		this.contexto = actividad;
		this.datos  = datos;
	}
	
	@SuppressLint("ViewHolder")
	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		LayoutInflater inflater = contexto.getLayoutInflater();//apartir de un xml crea objeto en java
		View view = inflater.inflate(R.layout.activity_adaptador_titulares, null, true);//usar ojeto inflater
		
		TextView txtCurso = (TextView) view.findViewById(R.id.txtCurso);
		txtCurso.setText(datos[position].getNombre());
		
		TextView txtCiclo = (TextView) view.findViewById(R.id.txtCiclo);
		txtCiclo.setText(datos[position].getCiclo());
		return view;
	}

	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return datos.length;
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return datos[position].getNombre();
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}
	
}