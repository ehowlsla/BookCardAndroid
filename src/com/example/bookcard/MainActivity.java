package com.example.bookcard;
 

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.activity_main);
		
		
		Intent intent = new Intent(this, LoadingActivity.class);
		startActivityForResult(intent, 1);
		
		Spinner spinner = (Spinner) findViewById(R.id.spinner);
		ArrayAdapter adapter = ArrayAdapter.createFromResource(this, 
					R.array.spiner, 
					android.R.layout.simple_spinner_item);
		spinner.setAdapter(adapter);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
