package com.placements;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class verbal extends Activity {
    /** Called when the activity is first created. */
	Button articlebtn,posbtn,prepbtn,svabtn,anaibtn,spotbtn;
	static String topic;
     
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.verbal);
        articlebtn=(Button) findViewById(R.id.artibtn);
        posbtn=(Button) findViewById(R.id.pospbtn);
        prepbtn=(Button) findViewById(R.id.prepobtn);
        svabtn=(Button) findViewById(R.id.svagbtn);
        anaibtn=(Button) findViewById(R.id.analbtn);
        spotbtn=(Button) findViewById(R.id.spotebtn);
        
        articlebtn.setOnClickListener(new OnClickListener() {
			
			 
			public void onClick(View v) {
				topic="Articles";
			Intent i=new Intent(verbal.this, VerbalTabActivity.class);
			startActivity(i);
			
			}
		});
        posbtn.setOnClickListener(new OnClickListener() {
				
				 
				public void onClick(View v) {
					topic="Parts Of Speech";
				Intent i=new Intent(verbal.this, VerbalTabActivity.class);
				startActivity(i);
				
				}
			});
				
        prepbtn.setOnClickListener(new OnClickListener() {

 
public void onClick(View v) {
	topic="Prepositions";
Intent i=new Intent(verbal.this, VerbalTabActivity.class);
startActivity(i);

}
});

        svabtn.setOnClickListener(new OnClickListener() {

 
public void onClick(View v) {
	topic="Subject Verb Agreement";
Intent i=new Intent(verbal.this, VerbalTabActivity.class);
startActivity(i);

}
});

        anaibtn.setOnClickListener(new OnClickListener() {
		
		 
		public void onClick(View v) {
			topic="Analogies";
		Intent i=new Intent(verbal.this, VerbalTabActivity.class);
		startActivity(i);
		
		}
});
        spotbtn.setOnClickListener(new OnClickListener() {
		
		 
		public void onClick(View v) {
			topic="Spot Errors";
		Intent i=new Intent(verbal.this, VerbalTabActivity.class);
		startActivity(i);
		
		}
});


}
}

