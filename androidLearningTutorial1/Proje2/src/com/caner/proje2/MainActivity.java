package com.caner.proje2;

import android.R.string;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

	final public static int Cevap_Sorgula = 332;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public void degistirActivity(final View view) {
		switch (view.getId()) {
		case R.id.button1:
			// startActivity(new Intent(this))
			break;

		case R.id.button2:
			Intent intent = new Intent(this, SubActivity.class);
			String edittext = ((EditText) findViewById(R.id.editText1))
					.getText().toString();
			intent.putExtra("Soru", edittext);
			startActivityForResult(intent, Cevap_Sorgula);
			break;

		case R.id.button_tel:
			Intent intent1 = new Intent(this, com.caner.proje2.Intent.class);
						startActivity(intent1);
			break;
			
		default:
			break;
		}
	}

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		if (resultCode == Activity.RESULT_OK && requestCode == Cevap_Sorgula) {
			Toast.makeText(this,
					"Cevabýnýz : " + data.getExtras().getInt("Cevap"),
					Toast.LENGTH_SHORT).show();
		}
		super.onActivityResult(requestCode, resultCode, data);
	}

}
