package com.placements;

import android.app.Activity;
import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class VerbalTabActivity extends TabActivity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		 Resources ressources = getResources(); 
			TabHost tabHost = getTabHost();  
		// Android tab …’AndroidActivity’ is a new Activity here
			Intent intentAndroid = new Intent().setClass(this, VerbalContentActivity.class); 
			TabSpec tabSpecAndroid = tabHost .newTabSpec("Content") 
			.setIndicator("Content", ressources.getDrawable(R.drawable.logo)) 	.setContent(intentAndroid);  
		// Apple tab …’AppleActivity’ is a new Activity here
			Intent intentApple = new Intent().setClass(this, VerbalTestActivity.class);
			 TabSpec tabSpecApple = tabHost .newTabSpec("Quiz") 
			.setIndicator("Quiz", ressources.getDrawable(R.drawable.logo)) 	.setContent(intentApple);  
			// Apple tab …’AppleActivity’ is a new Activity here
				Intent intentApple1 = new Intent().setClass(this, VerbalReportsActivity.class);
				 TabSpec tabSpecApple1 = tabHost .newTabSpec("Reports") 
				.setIndicator("Reports", ressources.getDrawable(R.drawable.logo)) 	.setContent(intentApple1);  
			
			 // add all tabs 	
			tabHost.addTab(tabSpecAndroid);
			 tabHost.addTab(tabSpecApple);
			 tabHost.addTab(tabSpecApple1);
			tabHost.setCurrentTab(0);

	}

}
