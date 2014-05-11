package com.placements;


	import java.util.ArrayList;

import android.app.Activity;
	import android.os.Bundle;
	import android.view.View;
	import android.view.View.OnClickListener;
	import android.widget.ArrayAdapter;
	import android.widget.Button;
	import android.widget.EditText;
	import android.widget.Spinner;
import android.widget.Toast;

	public class getContent extends Activity {
		
		Button add;
		EditText contentET;
		Spinner topicSP;
		
		String topicList[]={"Ratio and proportion","Partnership","Percentages","item>simple and compound interest","time speed and distance","time and work","pipes and cisterns","lcm and hcf","number system","profit and loss"};
		
		
		 
		protected void onCreate(Bundle savedInstanceState) {
			// TODO Auto-generated method stub
			super.onCreate(savedInstanceState);
			setContentView(R.layout.content);
			
			add=(Button) findViewById(R.id.button1);
			
			
			
			ArrayAdapter<String> adapter=new ArrayAdapter<String>(getContent.this, android.R.layout.simple_spinner_item, topicList);
			topicSP.setAdapter(adapter);
			
			add.setOnClickListener(new OnClickListener() {
				
				 
				public void onClick(View v) {
					// TODO Auto-generated method stub
					MySqliteDatabase db=new MySqliteDatabase(getContent.this);
					ArrayList<String> a=db.getContent(topicSP.getSelectedItem().toString());
					if(a!=null)
					{
						Toast.makeText(getContent.this, "Content added", 5000).show();
					}
					else
					{
						Toast.makeText(getContent.this, "Content not added", 5000).show();
					}
				}
			});
		}

	}

