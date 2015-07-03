package edu.continental.adaptadores;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ListView;
import edu.continental.adapters.AdaptadorPrueba;
import edu.continental.beans.Titulos;

public class MainActivity extends Activity {

	ListView lista;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		lista = (ListView) findViewById(R.id.lista);
		
		Titulos [] args = new Titulos[] {
				new Titulos("Universitario", "26 veces campeon", R.drawable.universitario),
				new Titulos("Melgar", "2 veces campeon", R.drawable.melgar),
				new Titulos("USMP", "3 veces campeon", R.drawable.usmp)
		};
		
		AdaptadorPrueba adapter = new AdaptadorPrueba(this, args);
		
		lista.setAdapter(adapter);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
