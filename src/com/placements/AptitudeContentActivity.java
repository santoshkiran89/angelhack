package com.placements;

import java.util.ArrayList;

import android.app.Activity;
import android.database.DatabaseUtils;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class AptitudeContentActivity extends Activity{
	ListView contentLV;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.content);
		contentLV=(ListView) findViewById(R.id.listView1);
		MySqliteDatabase db=new MySqliteDatabase(AptitudeContentActivity.this);
		
		if(Aptitude.topic.equals("Partnership"))
		{
		int i=db.getContentCoubt("Partnership");
		if(i<=0)
		{
			try {
				
			
			PlacementsGuideActivity.contentTopic=new ArrayList<String>();
			PlacementsGuideActivity.contentList=new ArrayList<String>();
			
	        
			long result=db.insertContent("Partnership", "When two or more than two persons run a business jointly, they are called patners and the deal is known as patnership." +
	         		"Ratio of Division of Gains  ");
			db.insertContent("Partnership","I. When investments of all the partners are for the same time, the gain or loss is distributed among the partners in the ratio of their investments." +
	         		"Suppose A and B invest Rs. x and Rs. y respectively for a year in a business, then at the end of the year will be the ratio of A s share of profit and Bs share of profit = ratio of x and y."  );
			db.insertContent("Partnership"," II. When investments are for different time periods, then equivalent capitals are calculated for a unit of time by taking capitalnumber of units of time. Now, gain or loss is divided in the ratio of these capitals." +
     		"Suppose A invests Rs. x for p months and B invests Rs. y for q months, then ratio of As share of profit and Bs share of profit = ratio of xp and yq."  );
	         		
			
			db.insertContent("Partnership","III. When investments are altered in the given period we need to take the changes into consideration while calculating their profits." +
	         		"Suppose A and B started their business with Rs.5000 and Rs.10,000 respectively. If after three months A invested another Rs.5000 then we have to consider A s capital for the remaining period is Rs.10,000" +
	         		 "So ratio of A and B =  ratio of 5000 X 3 + 10,000 X 9 and 10,000 X 12 = ratio of 1,05,000 and 1,20,000 = ratio of 7 and 8" );
	
			if(result>0)
			{
				Toast.makeText(AptitudeContentActivity.this,"records inserted", 5000).show();
			}
			
			}catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		else
		{
			try {
				
				
				ArrayList<String> list=db.getContent("Partnership");
				ArrayAdapter<String> adapter=new ArrayAdapter<String>(AptitudeContentActivity.this, android.R.layout.simple_list_item_1, list);
				contentLV.setAdapter(adapter);
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
		}
		
		}
		else if(Aptitude.topic.equals("Percentages"))
		{
			int i=db.getContentCoubt("Percentages");
			if(i<=0)
			{
				try {
					
					
					PlacementsGuideActivity.contentTopic=new ArrayList<String>();
					PlacementsGuideActivity.contentList=new ArrayList<String>();
					
					String a=DatabaseUtils.sqlEscapeString( "Percent means for every hundred.  x percent x100 ");
					long result=db.insertContent("Percentages",a);
					db.insertContent("Percentages","Formula 1- A is what  of B= AB 100");
			         a=DatabaseUtils.sqlEscapeString("Formula 2- A is howmuch percent greater than % ? : B A-BB*100 ");		
					db.insertContent("Percentages",a);
					
		     		
			        /* 		
					
					db.insertContent("Percentages","III. When investments are altered in the given period we need to take the changes into consideration while calculating their profits." +
			         		"Suppose A and B started their business with Rs.5000 and Rs.10,000 respectively. If after three months A invested another Rs.5000 then we have to consider A s capital for the remaining period is Rs.10,000" +
			         		 "So ratio of A and B =  ratio of 5000 X 3 + 10,000 X 9 and 10,000 X 12 = ratio of 1,05,000 and 1,20,000 = ratio of 7 and 8" );
			*/
					if(result>0)
					{
						Toast.makeText(AptitudeContentActivity.this,"records inserted", 5000).show();
					}
					} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
					}
			}
			else
			{
				
			}
			
			
			
			
		}
	}

}
