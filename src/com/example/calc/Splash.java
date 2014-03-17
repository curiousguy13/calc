package com.example.calc;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;


public class Splash extends Activity{

	@Override
	protected void onCreate(Bundle Kun) {
		// TODO Auto-generated method stub
		super.onCreate(Kun);
		setContentView(R.layout.splash);
		Thread timer = new Thread(){
			public void run(){
				try{
					sleep(3000);
				}catch(InterruptedException e){
					e.printStackTrace();
				}finally{
					Intent openStartingPoint=new Intent("android.intent.action.START");
					startActivity(openStartingPoint);
				}
			}
		};
		timer.start();
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		finish();
	}

}
