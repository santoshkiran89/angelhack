package com.placements;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Aptitude extends Activity {
    /** Called when the activity is first created. */
	Button rnpbtn,partnbtn,percbtn,sicibtn,dtsibtn,tnwibtn,pncbtn,lnhbtn,nsibtn,pnlibtn;
	static String topic;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.aptitude);
        rnpbtn=(Button) findViewById(R.id.rnpbtn);
        partnbtn=(Button) findViewById(R.id.partbtn);
        percbtn=(Button) findViewById(R.id.perbtn);
        sicibtn=(Button) findViewById(R.id.sicibtn);
        dtsibtn=(Button) findViewById(R.id.dtsbtn);
        tnwibtn=(Button) findViewById(R.id.tnwbtn);
        pncbtn=(Button) findViewById(R.id.pncbtn);
        lnhbtn=(Button) findViewById(R.id.lnhbtn);
        nsibtn=(Button) findViewById(R.id.nsbtn);
        pnlibtn=(Button) findViewById(R.id.pnlbtn);

rnpbtn.setOnClickListener(new OnClickListener() {
			
			
			public void onClick(View v) {
				topic="Ratio And Proportion";		
			Intent i=new Intent(Aptitude.this, AptitudeTabActivity.class);
			startActivity(i);
			
			}
        });
		
        
       
        partnbtn.setOnClickListener(new OnClickListener() {
			
			
			public void onClick(View v) {
				topic="Partnership";
			Intent i=new Intent(Aptitude.this, AptitudeTabActivity.class);
			startActivity(i);
			
			}
        });
			percbtn.setOnClickListener(new OnClickListener() {
				
				 
				public void onClick(View v) {
					topic="Percentages";
				Intent i=new Intent(Aptitude.this, AptitudeTabActivity.class);
				startActivity(i);
				
				}
			});
sicibtn.setOnClickListener(new OnClickListener() {
			
			 
			public void onClick(View v) {
				topic="SICI";
			Intent i=new Intent(Aptitude.this, AptitudeTabActivity.class);
			startActivity(i);
			
			}
        });
		
				
					dtsibtn.setOnClickListener(new OnClickListener() {
						
						 
						public void onClick(View v) {
							topic="Time Speed Distance";
						Intent i=new Intent(Aptitude.this, AptitudeTabActivity.class);
						startActivity(i);
						
						}
					});
						tnwibtn.setOnClickListener(new OnClickListener() {
							
							 
							public void onClick(View v) {
								topic="Time Work";
							Intent i=new Intent(Aptitude.this, AptitudeTabActivity.class);
							startActivity(i);
							
							}
						});
							
pncbtn.setOnClickListener(new OnClickListener() {
			
			 
			public void onClick(View v) {
				topic="Pipes cisterns";
			Intent i=new Intent(Aptitude.this, AptitudeTabActivity.class);
			startActivity(i);
			
			}
        });
		
lnhbtn.setOnClickListener(new OnClickListener() {
			
			 
			public void onClick(View v) {
				topic="LCM HCF";
			Intent i=new Intent(Aptitude.this, AptitudeTabActivity.class);
			startActivity(i);
			
			}
        });
		
				nsibtn.setOnClickListener(new OnClickListener() {
					
					 
					public void onClick(View v) {
						topic="Number System";
					Intent i=new Intent(Aptitude.this, AptitudeTabActivity.class);
					startActivity(i);
					
					}
});
				pnlibtn.setOnClickListener(new OnClickListener() {
					
					 
					public void onClick(View v) {
						topic="Profit Loss";
					Intent i=new Intent(Aptitude.this, AptitudeTabActivity.class);
					startActivity(i);
					
					}
});
        
        
    }
}
