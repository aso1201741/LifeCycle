package com.example.lifecycle;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends Activity {
	private static final String TAG = "LifeCycle";

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Log.v(TAG,"onCreate is called.");
		setContentView(R.layout.activity_main);
	}

	@Override
	protected void onStart(){
		super.onStart();
		Log.v(TAG,"onStart is called.");
	}

	@Override
	protected void onRestart(){
		super.onRestart();
		Log.v(TAG,"onRestart is called.");
	}

	@Override
	protected void onResume(){
		super.onResume();
		Log.v(TAG,"onResume is called.");
	}

	@Override
	protected void onPause(){
		super.onPause();
		Log.v(TAG,"onPause is called.");
	}

	@Override
	protected void onStop(){
		super.onStop();
		Log.v(TAG,"onStop is called.");
	}

	@Override
	protected void onDestroy(){
		super.onDestroy();
		Log.v(TAG,"onDestroy is called.");
	}

	public void switchA(View v){
		Intent vIntent = new Intent(this,SubActivity.class);
		startActivity(vIntent);
	}

}
