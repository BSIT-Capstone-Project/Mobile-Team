package com.mobi.tmsclient;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class ExistingActivity extends Activity {

	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_existing);
        
        Button login = (Button) findViewById(R.id.btnLogin);
        login.setOnClickListener(new OnClickListener(){

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(ExistingActivity.this,DashboardActivity.class);
				startActivity(i);
				overridePendingTransition(R.anim.abc_slide_in_top,R.anim.abc_slide_out_bottom);
			}
        	
        });
    }
	
	@Override
	public void onBackPressed(){
		super.onBackPressed();
		overridePendingTransition(R.anim.slide_in_left,R.anim.slide_out_right);
	}
}
