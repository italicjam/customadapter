package edu.continental.adapters;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import edu.continental.adaptadores.R;
import edu.continental.beans.Titulos;

public class AdaptadorPrueba extends ArrayAdapter {
	
	Activity context;
	Titulos[] objetos;

	public AdaptadorPrueba(Activity context, Titulos[] data) {
		super(context, R.layout.adaptador_personal_lista, data);
		
		this.objetos = data;
		this.context = context;
		
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		
		LayoutInflater inflater = context.getLayoutInflater();
		View item = inflater.inflate(R.layout.adaptador_personal_lista, null);
		
		TextView tvTitulo = (TextView)item.findViewById(R.id.tvTitulo);
		tvTitulo.setText(objetos[position].getTitulo());
		TextView tvDescripcion = (TextView)item.findViewById(R.id.tvDescripcion);
		tvDescripcion.setText(objetos[position].getDescripcion());
		ImageView imgEquipo = (ImageView) item.findViewById(R.id.imgEquipo);
		imgEquipo.setImageResource(objetos[position].getImage());
		
		
		return item;
	}
	
	

}
