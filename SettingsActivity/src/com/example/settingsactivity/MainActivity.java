package com.example.settingsactivity;

import org.w3c.dom.Text;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends Activity {

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
	
	public void onButtonClick(View view)
	{
		switch (view.getId()) {
		case R.id.button1:
			startActivity(new Intent(this,Ayarlar.class));
			break;
		}
	}
	
	@Override
	protected void onResume()
	{
		super.onResume();
		SharedPreferences ayarlar = getSharedPreferences("com.example.settingsactivity_preferences", MODE_PRIVATE);
		
		String kullaniciadi = ayarlar.getString("kullanici", "farketmez");
		TextView tv = (TextView)findViewById(R.id.textView1);
		
		tv.setText(kullaniciadi);
	}

}
