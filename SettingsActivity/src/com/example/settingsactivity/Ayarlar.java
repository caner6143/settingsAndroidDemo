package com.example.settingsactivity;

import android.os.Bundle;
import android.preference.PreferenceActivity;

public class Ayarlar extends PreferenceActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState)
	{
		super.onCreate(savedInstanceState);
		addPreferencesFromResource(R.xml.ayarlar);
	}
}
