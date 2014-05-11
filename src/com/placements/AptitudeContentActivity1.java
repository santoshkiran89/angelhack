package com.placements;

import java.util.ArrayList;

import android.app.Activity;
import android.database.DatabaseUtils;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class AptitudeContentActivity1 extends Activity{
	ListView contentLV;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.content);
		contentLV=(ListView) findViewById(R.id.listView1);
		System.out.println(Aptitude.topic+":::::::::::::::::;");
		MySqliteDatabase db=new MySqliteDatabase(AptitudeContentActivity1.this);
		
		if(Aptitude.topic.equals("Partnership"))
		{
		int i=db.getContentCoubt("Partnership");
		if(i<=0)
		{
			try {
				
			
			PlacementsGuideActivity.contentTopic=new ArrayList<String>();
			PlacementsGuideActivity.contentList=new ArrayList<String>();
			PlacementsGuideActivity.contentTopic.add("Partnership");
			PlacementsGuideActivity.contentList.add("PARTNERSHIP -> IMPORTANT FACTS AND FORMULAE ");
	         		
			long result=db.insertContent("Partnership", " I. Partnership : When two or more than two persons run a business jointly, they are called partners and the deal is known as partnership. ");
			db.insertContent("Partnership","II. Ratio of Division of Gains : " );
			db.insertContent("Partnership","(i) When investments of all the partners are for the same time, the gain or loss is distributed among the partners in the ratio of their investments.  ");
	        db.insertContent("Partnership","Suppose A and B invest(ii) When investments are for different time periods, then equivalent capitals are calculated for a unit of time by taking (capital * number of units of time). Now, gain or loss is divided in the ratio of these capitals.  Rs. x and Rs. y respectively for a year in a business, then at the end of the year : (A’s share of profit) : (B’s share of profit) = x : y. ");
	        db.insertContent("Partnership","(ii) When investments are for different time periods, then equivalent capitals are calculated for a unit of time by taking (capital * number of units of time). Now, gain or loss is divided in the ratio of these capitals. ");
	        db.insertContent("Partnership","Suppose A invests Rs. x for p months and B invests Rs. y for q months, then (A’s share of profit) : (B’s share of profit) = xp : yq. ");
	        db.insertContent("Partnership","III. Working and Sleeping Partners : A partner who manages the business is known as working partner and the one who simply invests the money is a sleeping partner.");
	
			if(result>0)
			{
				Toast.makeText(AptitudeContentActivity1.this,"records inserted", 5000).show();
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
				ArrayAdapter<String> adapter=new ArrayAdapter<String>(AptitudeContentActivity1.this, android.R.layout.simple_list_item_1, list);
				contentLV.setAdapter(adapter);
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
		}
		
		}
		else if(Aptitude.topic.equals("Percentages"))
		{
			Toast.makeText(AptitudeContentActivity1.this,"inside percentages ", 5000).show();
			int i=db.getContentCoubt("Percentages");
			if(i<=0)
			{
				try {
					
					
					PlacementsGuideActivity.contentTopic=new ArrayList<String>();
					PlacementsGuideActivity.contentList=new ArrayList<String>();
					
					String a=DatabaseUtils.sqlEscapeString( "Percent means for every hundred x percent x100 ");
					long result=db.insertContent("Percentages",a);
					db.insertContent("Percentages","Formula 1- A is what  of B= AB*100");
			         a=DatabaseUtils.sqlEscapeString("Formula 2- A is howmuch percent greater than b? A-BB*100 ");		
					db.insertContent("Percentages",a);
					db.insertContent("Percentages","Formula 3- A is howmuch percent less than b?B-AB*100 ");
					db.insertContent("Percentages","Formula 4- If A is increased by K% then the new number is (100+K)%*A But there are several methods available to calculate easily. ");
					db.insertContent("Percentages","Formula 5- If A is decreased by K% then the new number is (100+K)%*A But there are several methods available to calculate easily. ");
					db.insertContent("Percentages","Formula 6- A%(B)=B%(A)");
					db.insertContent("Percentages","Formula 7- If several percentages are acting on the same number then we can add all the percentages. x1%(K)+x2%(K)+x3%(K)...=(x1+x2+x3...)%(K)");
					db.insertContent("Percentages","Formula 8- If a number K got increased by A% and B% successively then the final percentage is given by (A+B+AB100)%");
					
					
					/* 
					 	
                         



					db.insertContent("Percentages","III. When investments are altered in the given period we need to take the changes into consideration while calculating their profits." +
			         		"Suppose A and B started their business with Rs.5000 and Rs.10,000 respectively. If after three months A invested another Rs.5000 then we have to consider A s capital for the remaining period is Rs.10,000" +
			         		 "So ratio of A and B =  ratio of 5000 X 3 + 10,000 X 9 and 10,000 X 12 = ratio of 1,05,000 and 1,20,000 = ratio of 7 and 8" );
			*/
					if(result>0)
					{
						Toast.makeText(AptitudeContentActivity1.this,"records inserted", 5000).show();
					}
					} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
					}
			}
			else
			{
				try {
					
					
					ArrayList<String> list=db.getContent("Percentages");
					ArrayAdapter<String> adapter=new ArrayAdapter<String>(AptitudeContentActivity1.this, android.R.layout.simple_list_item_1, list);
					contentLV.setAdapter(adapter);
					} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
					}
				
			}
			
			
			
			
		}
		else if(Aptitude.topic.equals("Time Speed Distance"))
		{
			Toast.makeText(AptitudeContentActivity1.this,"inside Time Speed Distance ", 5000).show();
			int i=db.getContentCoubt("Time Speed Distance");
			if(i<=0)
			{
				try {
					
					
					PlacementsGuideActivity.contentTopic=new ArrayList<String>();
					PlacementsGuideActivity.contentList=new ArrayList<String>();
					
					String a=DatabaseUtils.sqlEscapeString( "1. Distance = Speed × Time ");
					long result=db.insertContent("Time Speed Distance",a);
					db.insertContent("Time Speed Distance"," 2. 1 km/hr = 518 m/s");
			         a=DatabaseUtils.sqlEscapeString("3. If the ratios of speed is a : b : c, then the ratios of time taken is : 1a:1b:1c ");		
					db.insertContent("Time Speed Distance",a);
					db.insertContent(" Time Speed Distance","Relation between variables: ");
					db.insertContent("Time Speed Distance","To distance, Speed and Time both are directly proportional and To speed, Time is inversely proportional. S directly proportional to D and T directiy proprotional to D i.e. if speed is doubled, distance covered in a given time also gets doubled and ,S directly proportional to 1T i.e. if speed is doubled, time taken to cover a distance will be half.");
					db.insertContent("Time Speed Distance","Average speed is defined as =.Total distance travelledTotal time taken ");
					db.insertContent("Time Speed Distance","Relative speed");
					db.insertContent("Time Speed Distance","If two bodies are moving (in the same direction or in the opposite direction), then the speed of one body with respect to the other is called its relative speed. ");
					db.insertContent("Time Speed Distance","Relative speed is a phenomenon that we observe everyday. Suppose you are travelling in college bus and there is a second bus coming in the opposite direction, then it seems that the second Bus  is moving much faster than actual. If both the Buses were moving in the same direction at same speeds, they seem to be stationary if seen from one of these Busses, even though they might actually be at a speed of 100 km/hr each. So what you actually observe is your speed relative to the other. ");
					db.insertContent("Time Speed Distance","Concepts");
					db.insertContent("Time Speed Distance","1.  If two objects are moving in opposite directions towards each other  at speeds u and v, then relative speed = Speed of first + Speed of second = u + v. ");
					db.insertContent("Time Speed Distance","2. If the two objects move in the same direction with speeds u and v, then relative speed = difference of their speeds = u – v. ");
					db.insertContent("Time Speed Distance","Tips for solving questions on trains: ");
					db.insertContent("Time Speed Distance","1. 1 Pole and I Train:Length of The Train (m) = Speed of the Train (m/s) X Time taken to cross the pole (s)");
					db.insertContent("Time Speed Distance","2. 1 Train and 1 Platform:Length of the Train + Length of the Platform (m) = Speed of the Train (m/s) X Time taken to cross the platform (s)");
					db.insertContent("Time Speed Distance","3. 1 Train with speed speed V1  and 1 moving person with speed V2:");
					db.insertContent("Time Speed Distance","Case 1: If both are moving in same direction ");
					db.insertContent("Time Speed Distance","Length of The Train (m) = [Speed of the Train - Speed of the Man] (m/s) X Time taken to cross the man (s)");		
					db.insertContent("Time Speed Distance","Case 2: If both are moving in opposite direction ");
                    db.insertContent("Time Speed Distance ","Length of The Train (m) = [Speed of the Train + Speed of the Man] (m/s) X Time taken to cross the man (s)");
                    db.insertContent("Time Speed Distance","4. 2 Trains with speeds V1,V2");
                    db.insertContent("Time Speed Distance","Case 1: If both are moving in same direction ");
                    db.insertContent("Time Speed Distance","[Length of The Train 1 + Length of the Train 2](m) = [Speed of the Train1 - Speed of the Train 2] (m/s) X Time taken to cross (s)");
                    db.insertContent("Time Speed Distance","Case 2: If both are moving in opposite direction ");
                    db.insertContent("Time Speed Distance","[Length of The Train 1 + Length of the Train 2](m) = [Speed of the Train1 + Speed of the Train 2] (m/s) X Time taken to cross (s)");
                    if(result>0)
					{
						Toast.makeText(AptitudeContentActivity1.this,"records inserted", 5000).show();
					}
					} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
					}
			}
			else
			{
				try {
					
					
					ArrayList<String> list=db.getContent("Time Speed Distance");
					ArrayAdapter<String> adapter=new ArrayAdapter<String>(AptitudeContentActivity1.this, android.R.layout.simple_list_item_1, list);
					contentLV.setAdapter(adapter);
					} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
					}
				
			}
			
			
			
			
		}
		
		else if(Aptitude.topic.equals("Time Work"))
		{
			Toast.makeText(AptitudeContentActivity1.this,"inside Time Work ", 5000).show();
			int i=db.getContentCoubt("Time Work");
			if(i<=0)
			{
				try {
					
					
					PlacementsGuideActivity.contentTopic=new ArrayList<String>();
					PlacementsGuideActivity.contentList=new ArrayList<String>();
					
					String a=DatabaseUtils.sqlEscapeString( "1. Time and Work formula and facts ");
					long result=db.insertContent("Time Work",a);
					db.insertContent("Time Work","1. If A can do a piece of work in n days, then A''s 1 day''s work = 1/n");
			         a=DatabaseUtils.sqlEscapeString("2. If A's 1 day's work =1/n, then A can finish the work in n days");		
					db.insertContent("Time Work",a);
					db.insertContent("Time Work"," 3. If A is thrice as good a workman as B, then:Ratio of work done by A and B = 3 : 1.Ratio of times taken by A and B to finish a work = 1 : 3");
					db.insertContent("Time Work"," Note: If you feel third formula a bit confusion, then please check following explanation.If your speed is 3 times than your friend, then you will be able to do three times work when your friend will able to do it 1 time. So work done ratio of you and your friend is 3:1");
					db.insertContent("Time Work","Also you will take 1/3 time to finish the work than your friend, so time ratio will be 1:3 ");
					
					
					
					
					if(result>0)
					{
						Toast.makeText(AptitudeContentActivity1.this,"records inserted", 5000).show();
					}
					} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
					}
			}
			else
			{
				try {
					
					
					ArrayList<String> list=db.getContent("Time Work");
					ArrayAdapter<String> adapter=new ArrayAdapter<String>(AptitudeContentActivity1.this, android.R.layout.simple_list_item_1, list);
					contentLV.setAdapter(adapter);
					} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
					}
				
			}
		}
		
		
			
		else if(Aptitude.topic.equals("Number System"))
		{
			Toast.makeText(AptitudeContentActivity1.this,"inside Number System ", 5000).show();
			int i=db.getContentCoubt("Number System");
			if(i<=0)
			{
				try {
					
					
					PlacementsGuideActivity.contentTopic=new ArrayList<String>();
					PlacementsGuideActivity.contentList=new ArrayList<String>();
					
					String a=DatabaseUtils.sqlEscapeString("A number can be written in its prime factorization format.");
					long result=db.insertContent("Number System",a);
					db.insertContent("Number System","For example 100 = 22×52");
			         a=DatabaseUtils.sqlEscapeString("Formula 1: The number of factors of a number N=ap.bq.cr... = (p+1).(q+1).(r+1)...");		
					db.insertContent("Number System",a);
					db.insertContent("Number System","Example: Find the number of factors of 100.  ");
					db.insertContent("Number System","Ans: We know that 100 = 22×52 ");
					db.insertContent("Number System","So number of factors of 100 = (2 +1 ).(2 +1) =  9. ");
					db.insertContent("Number System","Infact the factors are 1, 2, 4, 5, 10, 20, 25, 50, 100 ");
					db.insertContent("Number System","Formula 2: The sum of factors of a number N=ap.bq.cr... can be written as ap+1-1a-1×bq+1-1b-1×cr+1-1c-1...");
					db.insertContent("Number System","Example: Find the sum of the factors of 72");
					db.insertContent("Number System","Ans: 72 can be written as (23×32). ");
					db.insertContent("Number System","Sum of all the factors of 72 = (23+1-12-1×32+1-13-1)= 15 x 13= 195");
					db.insertContent("Number System","Formula 3: The number of ways of writing a number as a product of two number = 12×[(p+1).(q+1).(r+1)...] (if the number is not a perfect square)");
					db.insertContent("Number System","If the number is a perfect square then two conditions arise:");
					db.insertContent("Number System","1.The number of ways of writing a number as a product of two distinct numbers = 12×[(p+1).(q+1).(r+1)...-1]");
					db.insertContent("Number System","2.  The number of ways of writing a number as a product of two numbers and those numbers need not be distinct= 12×[(p+1).(q+1).(r+1)...+1]");
					
					
					
					if(result>0)
					{
						Toast.makeText(AptitudeContentActivity1.this,"records inserted", 5000).show();
					}
					} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
					}
			}
			else
			{
				try {
					
					
					ArrayList<String> list=db.getContent("Number System");
					ArrayAdapter<String> adapter=new ArrayAdapter<String>(AptitudeContentActivity1.this, android.R.layout.simple_list_item_1, list);
					contentLV.setAdapter(adapter);
					} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
					}
				
			}
			
		}
	
		else if(Aptitude.topic.equals("Profit Loss"))
		{
			Toast.makeText(AptitudeContentActivity1.this,"inside Profit Loss ", 5000).show();
			int i=db.getContentCoubt("Profit Loss");
			if(i<=0)
			{
				try {
					
					
					PlacementsGuideActivity.contentTopic=new ArrayList<String>();
					PlacementsGuideActivity.contentList=new ArrayList<String>();
					
					String a=DatabaseUtils.sqlEscapeString( "Profit loss and Discount is an application of percentages. ");
					long result=db.insertContent("Profit Loss",a);
					db.insertContent("Profit Loss","Cost Price: The rate at which a merchant buys goods. This is his investment");
			         a=DatabaseUtils.sqlEscapeString("Selling Price: The rate at which a marchant sells his goods. ");		
					db.insertContent("Profit Loss",a);
					db.insertContent("Profit Loss","Marked Price: The rate at which a merchant rises his price above the cost price (may be acticipating some hagglers) ");
					db.insertContent("Profit Loss","Key Formulas: ");
					db.insertContent("Profit Loss","Profit or Gain = Selling Price - Cost Price = SP - CP ");
					db.insertContent("Profit Loss","Profit = CP×(Profit%) ");
					db.insertContent("Profit Loss","Loss = Cost price - Selling price = CP - SP");
					db.insertContent("Profit Loss","Loss = CP×(Loss%)");
					db.insertContent("Profit Loss"," Important: Profit or Loss always calculated on Cost price Only.");
					db.insertContent("Profit Loss","Discount = Marked price - Selling Price = MP - SP" );
					db.insertContent("Profit Loss","Calculating Selling price from Cost price: ");
					db.insertContent("Profit Loss","In the profit case selling price is greater than cost price, and this case we gain some profit.  That is we are increasing the cost price by some percentage to get the selling price.  This can be done in several ways ");
					db.insertContent("Profit Loss"," In profit case");
					db.insertContent("Profit Loss","CP+CP×(Profit%) = SP ");
					db.insertContent("Profit Loss","CP×(100+Profit)% = SP ");
					db.insertContent("Profit Loss"," In loss case");
					db.insertContent("Profit Loss","CP substract of CP*Loss%=SP ");
					db.insertContent("Profit Loss","CP*(100 substract of Loss)% = SP ");
					
					
					
					
					
					if(result>0)
					{
						Toast.makeText(AptitudeContentActivity1.this,"records inserted", 5000).show();
					}
					} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
					}
			}
			else
			{
				try {
					
					
					ArrayList<String> list=db.getContent("Profit Loss");
					ArrayAdapter<String> adapter=new ArrayAdapter<String>(AptitudeContentActivity1.this, android.R.layout.simple_list_item_1, list);
					contentLV.setAdapter(adapter);
					} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
					}
				
			}
	}
		else if(Aptitude.topic.equals("Ratio And Proportion"))
		{
			Toast.makeText(AptitudeContentActivity1.this,"inside Ratio And Proportion", 5000).show();
			int i=db.getContentCoubt("Ratio And Proportion");
			if(i<=0)
			{
				try {
					
					
					PlacementsGuideActivity.contentTopic=new ArrayList<String>();
					PlacementsGuideActivity.contentList=new ArrayList<String>();
					
					String a=DatabaseUtils.sqlEscapeString( "1.The ratio of two quantities a and b in the same units, is the fraction   a/b and we write it as a : b. ");
					long result=db.insertContent("Ratio And Proportion",a);
					db.insertContent("Ratio And Proportion","2.In the ratio a : b, we call a as the first term which is also know as antecedent and b, the second term which is also called consequent.");
			         a=DatabaseUtils.sqlEscapeString("3.What is Proprotion.");		
					db.insertContent("Ratio And Proportion",a);
					db.insertContent("Ratio And Proportion","Equality of two ratios is called proportion.");
					db.insertContent("Ratio And Proportion","If a : b = c : d, we write a : b :: c : d and we say that a, b, c, d are in proportion.Here a and d are called extremes, while b and c are called mean terms. ");
					db.insertContent("Ratio And Proportion"," Product of means = Product of extremes.Thus, a : b :: c : d <=> (b x c) = (a x d).");
					db.insertContent("Ratio And Proportion","4.Fourth, third and mean proportional ");
					db.insertContent("Ratio And Proportion","i). Fourth Proportional:If a : b = c : d, then d is called the fourth proportional to a, b, c.");
					db.insertContent("Ratio And Proportion","ii). Third Proportional:a : b = c : d, then c is called the third proportion to a and b");
					db.insertContent("Ratio And Proportion","iii). Mean Proportional:Mean proportional between a and b is square root of(ab)");
					
					
					
					if(result>0)
					{
						Toast.makeText(AptitudeContentActivity1.this,"records inserted", 5000).show();
					}
					} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
					}
			}
			else
			{
				try {
					
					
					ArrayList<String> list=db.getContent("Ratio And Proportion");
					ArrayAdapter<String> adapter=new ArrayAdapter<String>(AptitudeContentActivity1.this, android.R.layout.simple_list_item_1, list);
					contentLV.setAdapter(adapter);
					} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
					}
				
			}
			
		}
		
		else if(Aptitude.topic.equals("SICI"))
		{
			Toast.makeText(AptitudeContentActivity1.this,"inside SICI", 5000).show();
			int i=db.getContentCoubt("SICI");
			if(i<=0)
			{
				try {
					
					
					PlacementsGuideActivity.contentTopic=new ArrayList<String>();
					PlacementsGuideActivity.contentList=new ArrayList<String>();
					
					String a=DatabaseUtils.sqlEscapeString( " Profit = CP x (profit %)");
					long result=db.insertContent("SICI",a);
					db.insertContent("SICI","Profit %= (Profit/Costprice)×100");
			         a=DatabaseUtils.sqlEscapeString("Simple interest = Principal x (interest %) = P X (R%)");		
					db.insertContent("SICI",a);
					db.insertContent("SICI"," If simple interest for more than 1 year the Simple interest = P×R% ×T=S");
					db.insertContent("SICI","Interest % = Interest/Principal×100=SI/P×100 ");
					db.insertContent("SICI"," Compound Interest Formula: A = P(1+R/100)power n = 6000(1+10/100) power 3");			
					if(result>0)
					{
						Toast.makeText(AptitudeContentActivity1.this,"records inserted", 5000).show();
					}
					} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
					}
			}
			else
			{
				try {
					
					
					ArrayList<String> list=db.getContent("SICI");
					ArrayAdapter<String> adapter=new ArrayAdapter<String>(AptitudeContentActivity1.this, android.R.layout.simple_list_item_1, list);
					contentLV.setAdapter(adapter);
					} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
					}
				
			}
		}
		else if(Aptitude.topic.equals("Pipes cisterns"))
		{
			Toast.makeText(AptitudeContentActivity1.this,"inside Pipes cisterns ", 5000).show();
			int i=db.getContentCoubt("Pipes cisterns");
			if(i<=0)
			{
				try {
					
					
					PlacementsGuideActivity.contentTopic=new ArrayList<String>();
					PlacementsGuideActivity.contentList=new ArrayList<String>();
					
					String a=DatabaseUtils.sqlEscapeString( "1. Pipes and Cisterns important facts and formulae ");
					long result=db.insertContent("Pipes cisterns",a);
					db.insertContent("Pipes cisterns","1. Inlet:");
			         a=DatabaseUtils.sqlEscapeString("A pipe connected with a tank or a cistern or a reservoir, that fills it, is known as an inlet.");		
					db.insertContent("Pipes cisterns",a);
					db.insertContent("Pipes cisterns"," 2. Outlet:");
					db.insertContent("Pipes cisterns","A pipe connected with a tank or cistern or reservoir, emptying it, is known as an outlet ");
					db.insertContent("Pipes cisterns"," 3. If a pipe can fill a tank in x hours, then: part filled in 1 hour =1/x");
					db.insertContent("Pipes cisterns","4. If a pipe can empty a tank in y hours, then:part emptied in 1 hour =1/y");
					db.insertContent("Pipes cisterns","5. If a pipe can fill a tank in x hours and another pipe can empty the full tank in y hours (where y >x), then on opening both the pipes, then the net part filled in 1 hour =1/x-1/y");
					db.insertContent("Pipes cisterns","6. If a pipe can fill a tank in x hours and another pipe can empty the full tank in y hours (where y >x), then on opening both the pipes, then the net part emptied in 1 hour =1/y-1/x");
					
					
						if(result>0)
					{
						Toast.makeText(AptitudeContentActivity1.this,"records inserted", 5000).show();
					}
					} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
					}
			}
			else
			{
				try {
					
					
					ArrayList<String> list=db.getContent("Pipes cisterns");
					ArrayAdapter<String> adapter=new ArrayAdapter<String>(AptitudeContentActivity1.this, android.R.layout.simple_list_item_1, list);
					contentLV.setAdapter(adapter);
					} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
					}
				
			}
			
			
			
			
		}
		
		else if(Aptitude.topic.equals("LCM HCF"))
		{
			Toast.makeText(AptitudeContentActivity1.this,"inside LCM HCF ", 5000).show();
			int i=db.getContentCoubt("LCM HCF");
			if(i<=0)
			{
				try {
					
					
					PlacementsGuideActivity.contentTopic=new ArrayList<String>();
					PlacementsGuideActivity.contentList=new ArrayList<String>();
					
					String a=DatabaseUtils.sqlEscapeString("Finding LCM: There are two ways to find LCM.  First one is division method, second one is Factorization method");
					long result=db.insertContent("LCM HCF",a);
					db.insertContent("LCM HCF","1.Division Method: LCM of 15, 18, 27");
			         a=DatabaseUtils.sqlEscapeString("");		
					db.insertContent("LCM HCF",a);
					db.insertContent("LCM HCF","In division method we have to continue the division until the numbers in the last row become co - primes with each other.  So LCM = 3 x 3 x 5 x 2 x 3 =270");
					db.insertContent("LCM HCF"," 2. Factorization Method: ");
					db.insertContent("LCM HCF","Here we can write all the given numbers in their prime factorization format. ");
					db.insertContent("LCM HCF","15 = 3 x 5");
					db.insertContent("LCM HCF","18 = 2×3^2");
					db.insertContent("LCM HCF","27 = 3^3");
					db.insertContent("LCM HCF","Now take all primes number the given numbers and write their maximum powers. So LCM of 15, 18, 27 = 2×33×5 = 270");
					db.insertContent("LCM HCF","Finding HCF: HCF can be found in two ways. Division Method and Factorization method. ");
					db.insertContent("LCM HCF","Factorization Method:");
					db.insertContent("LCM HCF","We need to write each number in its prime factorization format and take the prime numbers common to all given numbers and their minimum power.");
					db.insertContent("LCM HCF","16=24,  24=23×3");
					db.insertContent("LCM HCF","Now HCF of 16, 24 = 23 ( we must not consider 3 because 16 does not contain the prime factor 3)");
					db.insertContent("LCM HCF","Division Method: ");
					db.insertContent("LCM HCF","");
					db.insertContent("LCM HCF","Formula 1: If r is the remainder in each case when N is divided by x, y, z then the general format of the number is N= K x [LCM (x, y, z)] + r here K is a natural number");
					db.insertContent("LCM HCF","");
					db.insertContent("LCM HCF","Formula 2: If x1,y1,z1 are the remainders when N is divided by x, y, z and x-x1=y-y1=z-z1=athen the general format of the number is given by N= K*[LCM (x, y, z)] - a");
					db.insertContent("LCM HCF","Formula 3: if a, b, c are the remainders in each case when A, B, C are divided by N then N = HCF (A-a, B-b, C-c)");
					db.insertContent("LCM HCF","Formula 4: When A, B, C are divided by N then the remainder is same in each case then N = HCF of any two of (A-B, B-C, C-A)");
					
						if(result>0)
					{
						Toast.makeText(AptitudeContentActivity1.this,"records inserted", 5000).show();
					}
					} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
					}
					

					try {
						
						
						ArrayList<String> list=db.getContent("LCM HCF");
						ArrayAdapter<String> adapter=new ArrayAdapter<String>(AptitudeContentActivity1.this, android.R.layout.simple_list_item_1, list);
						contentLV.setAdapter(adapter);
						} catch (Exception e) {
							// TODO: handle exception
							e.printStackTrace();
						}
					
				
			}
			else
			{
				try {
					
					
					ArrayList<String> list=db.getContent("LCM HCF");
					ArrayAdapter<String> adapter=new ArrayAdapter<String>(AptitudeContentActivity1.this, android.R.layout.simple_list_item_1, list);
					contentLV.setAdapter(adapter);
					} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
					}
				
			}
			
			
			
			
		}
}
}