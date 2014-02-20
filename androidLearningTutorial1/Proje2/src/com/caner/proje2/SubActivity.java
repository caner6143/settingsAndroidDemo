package com.caner.proje2;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class SubActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_sub);
		
		final Bundle extras = getIntent().getExtras();
		
		if(extras != null)
		{
			final TextView txtSoru = (TextView) findViewById(R.id.tx_sorulansoru);
			txtSoru.setText(extras.getString("Soru"));
		}
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.sub, menu);
		return true;
	}

}
