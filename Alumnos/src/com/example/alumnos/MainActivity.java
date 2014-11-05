package com.example.alumnos;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

public class MainActivity extends ActionBarActivity {
	
	ListView listaAlumnos;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		//codigo
		listaAlumnos = (ListView) findViewById(R.id.listView1);
		
		Titular[] args = {
				new Titular("Juan","5145", R.drawable.user91),
				new Titular("Alan","5455", R.drawable.user91),
				new Titular("Mario","9638", R.drawable.user91),
				new Titular("Carlos","9879", R.drawable.user91),
				new Titular("Maria","9784", R.drawable.user91),
				new Titular("Jose","1962", R.drawable.user91),
				new Titular("Candi","1635", R.drawable.user91),
		};
		
		AdaptadorTitulares adaptador = new AdaptadorTitulares(this, args);
		listaAlumnos.setAdapter(adaptador);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
