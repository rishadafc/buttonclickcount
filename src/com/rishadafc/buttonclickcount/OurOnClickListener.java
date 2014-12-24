package com.rishadafc.buttonclickcount;

import android.view.View;
import android.view.View.OnClickListener;

public class OurOnClickListener implements OnClickListener {
	
	MainActivity caller;
	
	public OurOnClickListener(MainActivity activity) {
		this.caller = activity;
	}
	
	@Override
	public void onClick(View v) {
		caller.theTextView.setText("The button got clicked");
	}

}
