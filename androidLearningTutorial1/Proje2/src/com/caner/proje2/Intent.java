package com.caner.proje2;

import android.net.Uri;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;

public class Intent extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_intent);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.intent, menu);
		return true;
	}

	public void onNavButtonClick(final View view)
	{
		android.content.Intent intent = null;
		switch (view.getId()) {
		case R.id.sf_intents_telefon:
			intent = new android.content.Intent(android.content.Intent.ACTION_VIEW,Uri.parse("http://www.facebook.com"));
			startActivity(intent);
			break;

		default:
			break;
		}
	}
	
	
}
