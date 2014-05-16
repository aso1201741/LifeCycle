package com.example.lifecycle;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

public class SubActivity extends Activity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.subactivity);
	}

	public void switchB(View v){
		finish();
	}

}
