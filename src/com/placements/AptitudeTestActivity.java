package com.placements;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class AptitudeTestActivity extends Activity {

	private static final int MENU_ITEM_1 = Menu.FIRST + 1;
	Button submitbtn;
	ListView queLV;
	ArrayList<HashMap<String, String>> list;
	static String[] answers=new String[5];
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// TODO Auto-generated method stub
		menu.add(Menu.NONE,MENU_ITEM_1,Menu.NONE,"Submit").setIcon(R.drawable.ic_launcher);
		return super.onCreateOptionsMenu(menu);
	}
	
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		switch (item.getItemId()) {
		case MENU_ITEM_1:
			//Toast.makeText(AptitudeTestActivity.this, "Test submitted", 5000).show();
			ArrayList<String> optionList=new ArrayList<String>();
			ArrayList<String> queList=new ArrayList<String>();
			int score=0;
			for(int i=0;i<list.size();i++)
			{
				optionList.add(list.get(i).get("answer"));
				queList.add(list.get(i).get("Que"));
				if(list.get(i).get("answer").equals(answers[i]))
				{
					score=score+1;
				}
			}
			
			MySqliteDatabase db=new MySqliteDatabase(AptitudeTestActivity.this);
			long a=db.insertReport(new Date().toString(), Aptitude.topic, list.size()+"", score+"", optionList, answers,queList);
			if(a>0)
			Toast.makeText(AptitudeTestActivity.this, "Test submitted, your score is:"+score, 5000).show();
			else
				Toast.makeText(AptitudeTestActivity.this, "Test not submitted", 5000).show();
			break;

		default:
			break;
		}
		return super.onOptionsItemSelected(item);
	}
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.quelist);
		
		submitbtn=(Button) findViewById(R.id.buttonSub);
		queLV=(ListView) findViewById(R.id.listView1);
		
		MySqliteDatabase db=new MySqliteDatabase(AptitudeTestActivity.this);
		int count=db.getQuizCount(Aptitude.topic);
		Toast.makeText(AptitudeTestActivity.this, count+"", 5000).show();
		if(count<1)
		{
			Toast.makeText(AptitudeTestActivity.this, "inside if block", 5000).show();
			Toast.makeText(AptitudeTestActivity.this,Aptitude.topic, 5000).show();
			if(Aptitude.topic.equals("Partnership"))
			{
				count=count+1;
				db.insertQue(count+"", Aptitude.topic, "Karim invests Rs.30000 for one year in a shop. How much his partner Raunaq should invest in order that the profit after one year may be in the ratio 2: 3 ",
						"Rs.20000",
						"Rs.40000",
						"Rs.45000",
						"Rs.18000",
						"Rs.45000");
				count=count+1;
				db.insertQue(count+"", Aptitude.topic, " A,B and C are three partners in a business. If twice the investment of A is equal to thrice the capital of B and the capital of B is four times the capital of C. Out of a total profit of Rs.5940, the share of C is :",
						"Rs.700",
						"Rs.900",
						"Rs.740",
						"Rs.540",
						"Rs.540");
				count=count+1;
				db.insertQue(count+"", Aptitude.topic, " A invested Rs.2000/- in a firm which is half the investment of 'B's. But C's investment is sum of A and B.Find their investments ratio:",
				        " 3:2:1",
						"2:3:1",
						"1:2:3",
						"None of these",
						"1:2:3");
				count=count+1;
				db.insertQue(count+"", Aptitude.topic, "A's capital is equal to twice B's capital and B's capital is three times C's capital. The ratio of the capital is :",
				        " 2:1:3",
						"1:2:6",
						" 6:3:1",
						"1:3:6",
						"6:3:1");
				count=count+1;
				db.insertQue(count+"", Aptitude.topic, "Three partners A,B,C invest Rs.26,000, Rs.34000 and Rs.10000 respectively in a business. Out of a profit of Rs.3500, B's share is :",
				        "Rs.1300",
						"Rs.1700",
						"Rs.500",
						"Rs.1500",
						"Rs.1700");
				count=count+1;
				db.insertQue(count+"", Aptitude.topic, "A and B started a joint firm.  A's investment was thrice the investment of B and the period of his investment was two times the period of investment of B. If B got Rs.4000as profit, then their total profit is :",
				        "Rs.24000",
						"Rs.16000",
						"Rs.28000",
						"Rs.20000",
						"Rs.28000");
				count=count+1;
				db.insertQue(count+"", Aptitude.topic, "A, B and C enter into partnership by making investments in the ratio 3:5:7. After a year,C invests another Rs.337600 while A withdraw Rs.45600. The ratio of investments then changes to 24:59:167. How much did A invest initially ?",
				        "Rs.45600",
						"Rs.96000",
						"Rs.141600",
						"None of these",
						"Rs.141600");
				
				count=count+1;
				db.insertQue(count+"", Aptitude.topic, " A, B and C invest Rs.2000, Rs.3000 and Rs.4000 in a business. After one year, A removed his money but B and C continued for one more year. If the net profit after 2 years is Rs.3200 then A's share in the profit is :",
				        "Rs.1000",
						"Rs.600",
						"Rs.800",
						"Rs.400",
						"Rs.400");
				
				count=count+1;
				db.insertQue(count+"", Aptitude.topic, " A and B enter into partnership, investing Rs.12000 and Rs.16000 respectively. After 8 months, C joins them with a capital of Rs.15,000. The share of C in a profit of Rs.45,600 after 2 years will be :",
				        "Rs.21,200",
						"Rs.19,200",
						"Rs.14,400",
						"Rs.12,000",
						"Rs.12,000");
				
				count=count+1;
				db.insertQue(count+"", Aptitude.topic, "Dilip, Ram and Amar started a shop by investing Rs.27000, Rs.81000 and Rs,72000 respectively.  At the end of one year, the profit was distributed. If Ram's share of profit be Rs.36,000, the total profit was :",
				        "Rs.1,08,000",
						"Rs.1,16,000",
						"Rs.80,000",
						"None of these",
						"None of these");
				
				
			}
			else if(Aptitude.topic.equals("Ratio And Proportion"))
			{
				count=count+1;
				db.insertQue(count+"", Aptitude.topic, "One year ago the ratio between Laxman's and Gopal's salary was 3:4.  The ratio's of their individual salaries between last year's and this year's salaries are 4:5 and 2:3 respectively.  At present the total of their salary is Rs.4290.  The salary of Laxman now is :",
				        "Rs.1040",
						"Rs.1650",
						"Rs.2560",
						"Rs.3120",
						"Rs.1650");
				count=count+1;
				db.insertQue(count+"", Aptitude.topic, "The ratio between Sumit's and Prakash's age at present is 2:3. Sumit is 6 years younger than Prakash. The ratio of Sumit's age to Prakash's age after 6 years will be :",
				        "1 : 2",
						"2 : 3",
						"3 : 4",
						"3 : 8",
						"3 : 4");
				count=count+1;
				db.insertQue(count+"", Aptitude.topic, "The ratio between the ages of Kamala and Savitri is 6:5 and the sum of their ages is 44 years.  The ratio of their ages after 8 years will be :",
				        "5 : 6",
						"7 : 8",
						"8 : 7",
						"14:13",
						"8 : 7");
				count=count+1;
				db.insertQue(count+"", Aptitude.topic, "In a mixture of 60 litres, the ratio of milk and water is 2:1.  What amount of water must be added to make the ratio 1:2?",
						
				        "42 litres",
						"56 litres",
						"60 litres",
						"77 litres",
						"60 litres");
				count=count+1;
				db.insertQue(count+"", Aptitude.topic, "A's money is to B's money as 4:5 and B's money is to C's money as 2:3. If A has Rs.800, C has ",
				        "Rs.1000",
						"Rs.1200",
						" Rs.1500",
						"Rs.2000",
						"Rs.1500");
				count=count+1;
				db.insertQue(count+"", Aptitude.topic, "Vinay got thrice as many marks in Maths as in English.  The proportion of his marks in Maths and History is 4:3. If his total marks in Maths, English and History are 250, what are his marks in English ?",
				        "120",
						"90",
						"40",
						"80",
						"40");
				count=count+1;
				db.insertQue(count+"", Aptitude.topic, "Gold is 19 times as heavy as water and copper 9 times as heavy as water.  The ratio in which these two metals be mixed so that the mixture is 15 times as heavy as water is:",
				        "1 : 2",
						"2:3",
						"3:2",
						"12:13",
						"3:2");
				count=count+1;
				db.insertQue(count+"", Aptitude.topic, "Rs.1050 is divided among P, Q and R. The share of P is 25 of the combined share of Q and R. Thus, P gets:",
				        "Rs.200",
						"Rs.300",
						"Rs.400",
						"Rs.340",
						"Rs.300");
				
				count=count+1;
				db.insertQue(count+"", Aptitude.topic, "729 ml.of a mixture contains milk and water in the ratio of 7:2. How much more water is to be added to get a new mixture containing milk and water in the ratio of 7:3 ?",
				        "60 ml",
						"70 ml",
						"80 ml",
						"90 ml",
						"80 ml");
				count=count+1;
				db.insertQue(count+"", Aptitude.topic, "The students in three classes are in the ratio 2:3:5.  If 20 students are increased in each class, the ratio changes to 4:5:7. The total number of students before the increase were :",
						
				        "90",
						"70",
						"100",
						"80",
						"100");
				count=count+1;
				db.insertQue(count+"", Aptitude.topic, "If a:b = 2:3 and b:c = 4:3, then find a:b:c",
				        "8:12:9",
						"9:12:13",
						"12:2:14:",
						"3:9:13",
						"9:12:13");
				count=count+1;
				db.insertQue(count+"", Aptitude.topic, "Find the fourth proportion to 2,3,6",
				        "18",
						"12",
						"9",
						"8",
						"9");
				count=count+1;
				db.insertQue(count+"", Aptitude.topic, "If A:B:C = 2:3:4, then find AB:BC:CA",
				        "5:9:24",
						"6:9:24",
						"7:9:24",
						"8:9:24",
						"8:9:24");
				count=count+1;
				db.insertQue(count+"", Aptitude.topic, "If A:B = 2:3, B:C = 4:5 and C:D = 6:7, then find the value of A:B:C:D",
				        "15:24:30:35",
						"16:24:30:35",
						"17:24:30:35",
						"18:24:30:35",
						"16:24:30:35");
				count=count+1;
				db.insertQue(count+"", Aptitude.topic, "If 2 : 9 :: x : 18, then find the value of x",
				        "2",
						"3",
						"4",
						"6",
						"4");
				count=count+1;
				db.insertQue(count+"", Aptitude.topic, "if x:y = 1:3, then find the value of (7x+3y):(2x+y)",
				        "14:5",
						"12:9",
						"16:5",
						"2:9",
						"16:5");
				count=count+1;
				db.insertQue(count+"", Aptitude.topic, "The salaries of A, B and C are of ratio 2:3:5. If the increments of 15%, 10% and 20% are done to their respective salaries, then find the new ratio of their salaries",
				        "20:33:60",
						"21:33:60",
						"22:33:60",
						"23:33:60",
						"23:33:60");
				count=count+1;
				db.insertQue(count+"", Aptitude.topic, "If Rs. 782 is divided into three parts, proportional to 12:23:34find the first part.",
				        "119",
						"204",
						"234",
						"245",
						"204");
				count=count+1;
				db.insertQue(count+"", Aptitude.topic, "Rs. 120 are divided among A, B, C such that A's share is Rs. 20 more than B's and Rs. 20 less than C's. What is B's share",
				        "Rs 10",
						"Rs 20",
						"Rs 25",
						"Rs 27",
						"Rs 20");
				count=count+1;
				db.insertQue(count+"", Aptitude.topic, "In a college, the ratio of the number of boys to girls is 8 : 5. If there are 200 girls, the total number of students in the college is",
				        "430",
						"520",
						"550",
						"250",
						"520");
				count=count+1;
				db.insertQue(count+"", Aptitude.topic, "Two numbers are respectively 20% and 50",
				        "2:5",
						"3:5",
						"4:5",
						"6:9",
						"4:5");
				count=count+1;
				db.insertQue(count+"", Aptitude.topic, "In a mixture 60 litres, the ratio of milk and water 2 : 1. If the this ratio is to be 1 : 2, then the quanity of water to be further added is",
				        "20",
						"30",
						"40",
						"60",
						"60");
				count=count+1;
				db.insertQue(count+"", Aptitude.topic, "If three numbers in the ratio 3 : 2: 5 be such that the sum of their squares is 1862, the middle number will be",
				        "18",
						"14",
						"13",
						"8",
						"14");
				count=count+1;
				db.insertQue(count+"", Aptitude.topic, "A dog takes 3 leaps for every 5 leaps of a hare. If one leap of the dog is equal to 3 leaps of the hare, the ratio of the speed of the dog to that of the hare is",
				        "4:5",
						"9:5",
						"2:9",
						"4:8",
						"9:5");
				count=count+1;
				db.insertQue(count+"", Aptitude.topic, "The least whole number which when subtracted from both the terms of the ratio 6 : 7 to give a ratio less than 16 : 21, is",
				        "3",
						"6",
						"8",
						"9",
						"3");
				count=count+1;
				db.insertQue(count+"", Aptitude.topic, "The sum of three numbers is 98. If the ratio of the first to the second is 2:3 and that of the second to the third is 5:8, then the second number is",
				        "30",
						"50",
						"10",
						"20",
						"30");
				count=count+1;
				db.insertQue(count+"", Aptitude.topic, "Salaries of Ravi and Sumit are in the ratio 2:3. If the salary of each is increased by Rs 4000, the new ratio becomes 40:57. What is Sumit present salary.",
				        "10000",
						"20000",
						"38000",
						"34000",
						"38000");
				count=count+1;
				db.insertQue(count+"", Aptitude.topic, "A and B together have Rs. 1210. If 4/15 of A's amount is equal to 2/5 of B's amount. How much amount B have",
				        "Rs 484",
						"Rs 480",
						"Rs 389",
						"Rs 600",
						"Rs 484");
				count=count+1;
				db.insertQue(count+"", Aptitude.topic, "If 40% of a number is equal to two-third of another number, what is the ratio of first number to the second number.",
				        "5:3",
						"6:8",
						"2:8",
						"2:9",
						"5:3");
				count=count+1;
				db.insertQue(count+"", Aptitude.topic, "A sum of money is to be distributed among A, B, C, D in the proportion of5:2:4:3. If C gets Rs. 1000 more than D, what is B's share?",
				        "Rs 500",
						"Rs 100",
						"Rs 300",
						"Rs. 2000",
						"Rs. 2000");
				count=count+1;
				db.insertQue(count+"", Aptitude.topic, "A and B together have Rs. 1210. If 4/5 of A's amount is equal to 2/5 of B's amount, how much amount does B have?",
				        "Rs. 460",
						"Rs  200",
						"Rs 300",
						"Rs 400",
						"Rs. 460");
				count=count+1;
				db.insertQue(count+"", Aptitude.topic, "A sum of Rs.312 was divided among 100 boys and girls in such a way that the boy gets Rs.3.60 and each girl Rs.2.40 the number of girls is",
				        "40",
						"39",
						"20",
						"10",
						"40");
				count=count+1;
				db.insertQue(count+"", Aptitude.topic, "In a mixture 60 litres, the ratio of milk and water 2:1. If the this ratio is to be1:2, then the quantity of water to be further added is:",
				        "10",
						"30",
						"20",
						"60",
						"60");
				count=count+1;
				db.insertQue(count+"", Aptitude.topic, "Two numbers are respectively 20% and 50% more than a third number. The ratio of the two numbers is:",
				        "2:9",
						"3:7",
						"4:5",
						"4:3",
						"4:5");
				count=count+1;
				db.insertQue(count+"", Aptitude.topic, "Seats for Mathematics, Physics and Biology in a school are in the ratio 5:7:8. There is a proposal to increase these seats by 40%, 50% and 75% respectively. What will be the ratio of increased seats?",
				        "2:3:4",
						"4:5:6",
						"6:7:8",
						"None of these",
						"None of these");
				count=count+1;
				db.insertQue(count+"", Aptitude.topic, "A sum of Rs. 36.90 is made up of 180 coins which are either 10 paise coins or 25 p coins. The number of 10 p coins is:",
				        "36",
						"28",
						"54",
						"50",
						"54");
				count=count+1;
				db.insertQue(count+"", Aptitude.topic, "The salaries A, B, C are in the ratio 2:3:5. If the increments of 15%, 10% and 20% are allowed respectively in their salaries, then what will be new ratio of their salaries?",
				        "33:48:50",
						"33:23:50",
						"23:33:60",
						"34:98:39",
						"23:33:60");

				count=count+1;
				db.insertQue(count+"", Aptitude.topic, "The ratio of the number of boys and girls in a college is 7:8. If the percentage increase in the number of boys and girls be 20% and 10% respectively, what will be the new ratio?",
				        "24:46",
						"23:37",
						"21:22",
						"33:77",
						"21:22");

				count=count+1;
				db.insertQue(count+"", Aptitude.topic, "Salaries of Ravi and Sumit are in the ratio 2:3. If the salary of each is increased by Rs. 4000, the new ratio becomes 40:57. What is Sumit's salary?",
				        "Rs. 38,000",
						"RS. 39000",
						"Rs. 20000",
						"Rs. 34000",
						"Rs. 38,000");

				count=count+1;
				db.insertQue(count+"", Aptitude.topic, "If 40% of a number is equal to two-third of another number, what is the ratio of first number to the second number?",
				        "5:3",
						"3:5",
						"6:5",
						"2:9",
						"5:3");

				count=count+1;
				db.insertQue(count+"", Aptitude.topic, "If 0.75:x::5:8, then x is equal to:",
				        "2,60",
						"1.20",
						"3.48",
						"2.98",
						"1.20");

				count=count+1;
				db.insertQue(count+"", Aptitude.topic, "The sum of three numbers is 98. If the ratio of the first to second is 2:3 and that of the second to the third is 5:8, then the second number is:",
				        "60",
						"20",
						"30",
						"40",
						"30");

				count=count+1;
				db.insertQue(count+"", Aptitude.topic, "Find the unknown value in the proportion:  2 : x = 3 : 9.",
				        "6",
						"8",
						"3",
						"5",
						"6");
				count=count+1;
				db.insertQue(count+"", Aptitude.topic, "Find the unknown value in the proportion:  (2x + 1) : 2 = (x + 2) : 5",
				        "-8/3",
						"-1/5",
						"-2/3",
						"-2/4",
						"-2/3");

				count=count+1;
				db.insertQue(count+"", Aptitude.topic, "If twelve inches correspond to 30.48 centimeters, how many centimeters are there in thirty inches?",
				        "76.2CMS",
						"34.2CMS",
						"7.8CMS",
						"28.6CMS",
						"76.2CMS");

				count=count+1;
				db.insertQue(count+"", Aptitude.topic, "The tax on a property with an assessed value of $70 000 is $1 100. What is the assessed value of a property if the tax is $1 400?",
				        "$89 090.91",
						"$49.39393",
						"$69.39393",
						"$99.39339",
						"$89 090.91");

				count=count+1;
				db.insertQue(count+"", Aptitude.topic, "One piece of pipe 21 meters long is to be cut into two pieces, with the lengths of the pieces being in a 2 : 5 ratio. What are the lengths of the pieces?",
				        "6",
						"4",
						"2",
						"5",
						"6");
				count=count+1;
				db.insertQue(count+"", Aptitude.topic, "Find the mean proportional of –3 and 12.",
				        "7",
						"6",
						"5",
						"NO solution",
						"no solution");
				db.insertQue(count+"", Aptitude.topic, "Find the mean proportional of 3/2 and 3/8.",
				        "-3/4",
						"+3/4",
						"-3/4 AND +3/4",
						"no solution",
						"-3/4 AND +3/4");

				db.insertQue(count+"", Aptitude.topic, "Rs.630 is to be distributed among ramu and kiran in the proportion 7:11.how much would kiran get?",
				        "438",
						"385",
						"456",
						"245",
						"385");
				db.insertQue(count+"", Aptitude.topic, "The ratio of two numbers is 3:4. The L.C.M of the numbers is 180. what  are those numbers.",
				        "45 and 60",
						"39 and 49",
						"12 and 29",
						"50 and 47",
						"45 and 60");


}
				else if(Aptitude.topic.equals("Percentages"))
				{
					count=count+1;
					db.insertQue(count+"", Aptitude.topic, "The length of a rectangle is increased by 50%. By what percent would be width have to be decreased to maintain the same area ?",
					        "3712%",
							"489%",
							"567%",
							"789%",
							"3712%");
					count=count+1;
					db.insertQue(count+"", Aptitude.topic, " if the side of a square is increased by 30% , its area is increased by :",
					        "17%",
							"28%",
							"38%",
							"69%",
							"69%");

					count=count+1;
					db.insertQue(count+"", Aptitude.topic, "The price of an article has been reduced by 25%. In order to restore the original price, the new price must be increased by :",
					        "3313%",
							"2345%",
							"4536%",
							"1222%",
							"3313%");

					count=count+1;
					db.insertQue(count+"", Aptitude.topic, "p is six times as large as q. The percent that q is less than p is :",
					        "8313",
							"8976",
							"2354",
							"2314",
							"8313");

					count=count+1;
					db.insertQue(count+"", Aptitude.topic, "Sameer spends 40% of his salary on food articles and 13rd of the remaining on transport.  If he saves Rs.450 per month which is half of the balance after spending on food items and transport, what is his monthly salary?",
					        "Rs.2260",
							"Rs.2259",
							"Rs.2345",
							"Rs.2250",
							"Rs.2250");

					count=count+1;
					db.insertQue(count+"", Aptitude.topic, "The population of a town increases 4% annually but is decreased by emigration annually to the extent of (1/2)% .What will be the increase percent in three years ?",
					        "3.8",
							"9.8",
							"20.8",
							"10.8",
							"10.8");
					count=count+1;
					db.insertQue(count+"", Aptitude.topic, "A man's basic pay for a 40 hour week is Rs.20. Overtime is paid for at 25% above the basic rate. In a certain week he worked overtime and his total wage was Rs.25. He therefore worked for a total of ",
					        "45 hrs",
							"48 hrs",
							"62 hrs",
							"52 hrs",
							"48 hrs");

					count=count+1;
					db.insertQue(count+"", Aptitude.topic, "On decreasing the price of T.V.sets by 30% , its sale is increased by 20%. What is the effect on the revenue received by the shopkeeper ?",
					        "No change",
							"4% increase",
							"5% decrease",
							"4% decrease",
							"16% decrease");

					
					count=count+1;
					db.insertQue(count+"", Aptitude.topic, "On decreasing the price of T.V.sets by 30% , its sale is increased by 20%. What is the effect on the revenue received by the shopkeeper ?",
					        "no change",
							"10% increase",
							"5% decrease",
							"4% decrease",
							"4% decrease");

					
					count=count+1;
					db.insertQue(count+"", Aptitude.topic, "The price of sugar is increased by 20%. If the expenditure is not allowed to increase, the ratio between the reduction in consumption and the original consumption is :",
					        "1.3",
							"1.6",
							"1.4",
							"1.5",
							"1.6");
				}
				else if(Aptitude.topic.equals("SICI"))
				{

					count=count+1;
					db.insertQue(count+"", Aptitude.topic, "The rate of interest on a sum of money is 4% per annum for the first 2 years, 6% per annum for the next 4 years and 8% per annum for the period beyond 6 years. If the simple interest occured by the sum for a total period of 9 years is Rs.1120, what is the sum?",
					        "Rs.2000",
							"Rs.4000",
							"Rs.5000",
							"Rs.8000",
							"Rs.2000");

					
					count=count+1;
					db.insertQue(count+"", Aptitude.topic, "Two equal amounts of money are deposited in two banks, each at 15% per annum, for 312 and 5 years. If the difference between their interest is Rs.144, each sum is :",
					        "Rs.640",
							"Rs.340",
							"Rs.740",
							"Rs.540",
							"Rs.640");

					
					count=count+1;
					db.insertQue(count+"", Aptitude.topic, "The difference between the interests received from two different banks on Rs.500 for 2 years, is Rs.2.50.The difference between their rates is :",
					        "0.45%",
							"0.35%",
							"0.85%",
							"0.25%",
							"0.25%");
					count=count+1;
					db.insertQue(count+"", Aptitude.topic, " At simple interest, a sum doubles after 20 years. The rate of interest per annum is :",
					        "1%",
							"5%",
							"2%",
							"6%",
							"5%");
					count=count+1;
					db.insertQue(count+"", Aptitude.topic, "The simple interest on a sum of money at 8% per annum for 6 years is half the sum. The sum is :",
					        "2%",
							"6%",
							"7%",
							"Data inadequate",
							"Data inadequate");
					count=count+1;
					db.insertQue(count+"", Aptitude.topic, "A sum of money becomes Rs.6690 after three years and Rs.10,035 after 6 years on compound interest. The sum is :",
					        "Rs.4400", 			
							"Rs.4445",
							"Rs.4460",
							"Rs.4520",
							"Rs.4460");
					count=count+1;
					db.insertQue(count+"", Aptitude.topic, "The difference between simple interest and compound interest on a sum for 2 years at 8%, when the interest is compounded annually Rs.16. If the interest was compounded half-yearly, the difference in two interests would be nearly :",
					        "Rs.16",
					        "Rs.16.80",
							"Rs.21.85",
							"Rs.24.64",
							"Rs.24.64");
					count=count+1;
					db.insertQue(count+"", Aptitude.topic, "The value k of a machine depreciates every year at the rate of 10% on its value at the beginning of that year. If the present value of the machine is Rs.729, its worth 3 years ago was :",
					        "Rs.947.10",					       					       					   
							"Rs.800",
							"Rs.1000",
							"Rs.750.87",
							"Rs.1000");
					count=count+1;
					db.insertQue(count+"", Aptitude.topic, "4.	The least number of complete years in which a sum of money put out at 20% C.I. will be more than doubled is :",
					        "3",
							"4",																				
							"5",
							"6",
							"4");
					count=count+1;
					db.insertQue(count+"", Aptitude.topic, "5.	A sum of Rs.550 was taken a loan. This is to be repaid in two equal annual instalments. If the rate of interest be 20% compounded annually, then the value of each instalment is :",
					        "Rs.421",
							"Rs.396",																				
							"Rs.360",
							"Rs.350",
							"Rs.360");										
		}
		
		else if(Aptitude.topic.equals("Time Speed Distance"))
		{
			count=count+1;
			db.insertQue(count+"", Aptitude.topic, "1.	The distance between two stations A and B is 220 km. A train leaves A towards B at an average speed of 80 km/hr. After half a hour, another train leaves B towards A at an average speed of 100 km/hr. The distance of the point where the two trains meet, from A is :",
			        "120 km",			         			        			     
					"130 km",																				
					"140 km",
					"150 km",
					"120 km");
			count=count+1;
			db.insertQue(count+"", Aptitude.topic, "A cart has to cover a distance of 80 km in 10 hours. If it covers half of the journey in (3/5)th time, what should be its speed to cover the remaining distance in the time left ?",
			        "8 km/hr",			       			  
					"20 km/hr",																				
					"6.4 km/hr",
					"10 km/hr",
					"10 km/hr");
			count=count+1;
			db.insertQue(count+"", Aptitude.topic, "Ravi started cycling along the boundaries of a square field from corner point A.  After half an hour, he reached the corner point C, diagonally opposite to A. If his speed was 8 km/hr. what is the area of the field in square km ?",
			        "64",			        			        			        
					"8",																				
					"4",
					"Cannot be determined",
					"8");
			count=count+1;
			db.insertQue(count+"", Aptitude.topic, "A man goes uphill with an average speed of 35 km/hr and comes down with an average speed of 45 km/hr. The distance travelled in both the cases being the same, the average speed for the entire journey is :",
			        "3838 km/hr",			        			        			       
					"3938 km/hr",																				
					"40 km/hr",
					"None of these",
					"3938 km/hr");
			count=count+1;
			db.insertQue(count+"", Aptitude.topic, ". A man walking at 3 km/hr crosses a square field diagonally in 2 min. The area of the field is :",
			        "2500 m2",
					"3000 m2",																				
					"5000 m2",
					"6000 m2",
					"5000 m2");
			count=count+1;
			db.insertQue(count+"", Aptitude.topic, "A certain distance is covered at a certain speed. If half of this distance is covered in double the time, the ratio of the two speeds is :",
			        "4 : 1",			        			        			        
					"1 : 4",																				
					"2 : 1",
					"1 : 2",
					"4 : 1");
			count=count+1;
			db.insertQue(count+"", Aptitude.topic, ". If a boy takes as much time in running 10 m as a car takes in covering 25 m, the distance covered by the boy during the time the car covers 1 km. is :",
			        "400 m",			        			        			        
					"40m",																				
					"250 m",
					"650 m",
					"400 m");
			count=count+1;
			db.insertQue(count+"", Aptitude.topic, ". The ratio between the rates of walking of P and Q is 2 : 3. If the time taken by Q to cover a certain distance is 36 minutes, the time taken by P to cover that much distance is :",
			        "24 min",
					"54 min",																				
					"48 min",
					"21.6 min",
					"54 min");
			count=count+1;
			db.insertQue(count+"", Aptitude.topic, "A man, on tour, travels first 160 km at 64 km/hr and the next 160 km at 80 km/hr. the average speed for the first 320 km of the tour, is :",
			        "35.55 km/hr",
					"71.11 km/hr",																				
					"36 km/hr",
					"72 km/hr",
					"71.11 km/hr");
			count=count+1;
			db.insertQue(count+"", Aptitude.topic, ". A man travels 35 km partly at 4 km/hr and at 5 km/hr. If he covers former distance at 5 km/hr and later distance at 4 km/hr, he could cover 2 km more in the same time. The time taken to cover the whole distance at original rate is ",
			        "9 hours ",
					"7 hours",																				
					"412 hours",
					"8 hours",
					"8 hours");	
		}
		else if(Aptitude.topic.equals("Time Work"))
		{
			count=count+1;
			db.insertQue(count+"", Aptitude.topic, ". Two men undertake to do a piece of work for Rs.400. One alone can do it in 6 days, the other in 8 days. With the help of a boy, they finish it in 3 days. The boy's share is ",
			        "Rs.40",			       			       			   
					"Rs.50",																				
					"Rs.60",
					"Rs.80",
					"Rs.50");
			count=count+1;
		    db.insertQue(count+"", Aptitude.topic, "If a man or 2 women or 3 boys can do a piece of work in 44 days, then the same piece of work will be done by 1 man, 1 woman and 1 boy in :",
			        "21 days",			      			       			   
					"24 days",																				
					"26 days",
					"33 days",
					"24 days");
			count=count+1;
			db.insertQue(count+"", Aptitude.topic, "3 men and 4 boys do a piece of work in 8 days, while 4 men and 4 boys finish it in 6 days. 2 men and 4 boys will finish it in:",
			        "9 days",
					"10 days",																				
					"12 days",
					"14 days",
					"14 days");
			count=count+1;
			db.insertQue(count+"", Aptitude.topic, "If 5 men or 9 women can finish a piece of work in 19 days, 3 men and 6 women will do the same work in :",
			        "10 days",			        			        			         
					"12 days",																				
					"13 days",
					"15 days",
					"15 days");
			count=count+1;
			db.insertQue(count+"", Aptitude.topic, "8 men can dig a pit in 20 days. If a man works half as much again as a boy, then 4 men and 9 boys can dig a similar pit in :",
			        "10 days",
					"12 days",																				
					"15 days",
					"16 days",
					"16 days");
			count=count+1;
			db.insertQue(count+"", Aptitude.topic, "8 children and 12 men complete a certain piece of work in 9 days. If each child takes twice the time taken by a man to finish the work, in how many days will 12 men finish the same work ?",
			        "8",			        			        			     
					"15",																				
					"9",
					"12",
					"12");
			count=count+1;
			db.insertQue(count+"", Aptitude.topic, "10 men can finish a piece of work in 10 days, where as it take 12 women to finish it in 10 days. If 15 men and 6 women undertake to complete the work, how many days will they take to complete it ?",
			        "2",			      
					"4",																				
					"5",
					"11",
					"5");
			count=count+1;
			db.insertQue(count+"", Aptitude.topic, "If 3 men or 4 women can construct a wall in 43 days, then the number of days that 7 men and 5 women take to construct it is :",
			        "12",
					"18",																				
					"24",
					"30",
					"12");
			count=count+1;
			db.insertQue(count+"", Aptitude.topic, "12 men or 18 women can reap a field in 14 days. The number of days that 8 men and 16 women will take to reap it is :",
			        "5",			      
					"7",																				
					"8",
					"9",
					"9");
			count=count+1;
			db.insertQue(count+"", Aptitude.topic, "A does half as much work as B in three-fourth of the time. If together they take 18 days to complete a work, how much time shall B take to do it ?",
			        "30 days",
					"35 days",																				
					"40 days",
					"None of these",
					"30 days");						
		}
		else if(Aptitude.topic.equals("Pipes cisterns"))
		{
			count=count+1;
			db.insertQue(count+"", Aptitude.topic, "Two pipes P and Q can fill a cistern in 12 minutes and 16 minutes respectively.  Simultaneously both the pipes are opened together, then after how much time Q should be closed so that the tank is full in 9 min ?",
			        "3.5 min",
					"4 min",																				
					"4.5 min",
					"4.75 min",
					"4 min");
			count=count+1;
			db.insertQue(count+"", Aptitude.topic, "A tap can fill a tank in 32 min. and another can empty it in 16 min.  If the tank is already half full and both the tanks are opened together, the tank will be",
			        ") filled in 4 min",
					"emptied in 18 min",																				
					"filled in 12 min",
					"emptied in 16 min",
					"emptied in 16 min");
			count=count+1;
			db.insertQue(count+"", Aptitude.topic, "A leak in the lower portion of a tank can empty the full tank in 9 hrs.  An inlet pipe fills water at the rtae of 10 lit. a minute.  When the tank is full, the inlet is opened and due to leak, the tank is empty in 16 hrs.  How many litres does the cistern hold ?",
			        "17,580 ",			      
					"17,960",																				
					"18,290",
					"12,342",
					"12,342");
			count=count+1;
			db.insertQue(count+"", Aptitude.topic, "Two pipes P and Q can fill a cistern in 12 min. and 15 min. respectively but a third pipe ‘R’ can empty the full tank in 6 min.  P and Q are kept open for 5 min. in the beginning and then ‘R’ is also opened.  In what time is the cistern emptied ?",
			        ") 30 min. ",
					"33 min",																				
					"37.5 min",
					"45 min",
					"45 min");
			count=count+1;
			db.insertQue(count+"", Aptitude.topic, "Two pipes X and Y fill a tank in 15 hrs. and 20 hrs. respectively, while a third pipe ‘Z’ can empty the full tank in 25 hrs.  All the three pipes are opened in the beginning.  After 10 hrs. Z is closed.  In how much time, will the tank be full ?",
			        "12 hrs",			       
					"13 hrs",																				
					"16 hrs",
					"18 hrs",
					"12 hrs");
			count=count+1;
			db.insertQue(count+"", Aptitude.topic, "A cistern can be filled in 9 hrs. but it takes 10 hours, due to a leak in its lower part.  If the cistern is full, then the time that the leak will take to empty it, is :",
			        "60 min.",
					"90 min",																				
					"80 min",
					"70 min",
					"90 min");
			count=count+1;
			db.insertQue(count+"", Aptitude.topic, "To fill a cistern, pipes P, Q & R take 20, 15 & 12 minutes respectively.  The time in minutes that the three pipes together will take to fill the cistern is :",
			        ") 5 min ",
					"10 min",																				
					"12 min",
					"15.66 min",
					"5 min");
			count=count+1;
			db.insertQue(count+"", Aptitude.topic, "A tank can be filled by a pipe in 20 min. and by another pipe in 60 min.  Both the pipes are kept open for 10 min. and then the first pipe is shut off.  After this, the tank will be completely filled in",
			        "10 min",
					"12 min",																				
					"15 min",
					"20 min",
					"20 min");
			count=count+1;
			db.insertQue(count+"", Aptitude.topic, "Two taps X and Y can fill a tank in 10 hrs. and 15 hrs.respectively.  If the both taps are opened together, the tank will be full in ",
			        "5 hrs",
					"12.5 hrs",																				
					"6 hrs",
					"7.5 hrs",
					"6 hrs");
			count=count+1;
			db.insertQue(count+"", Aptitude.topic, "If two pipes function together, the cistern will be filled in 6 hrs.  One pipe fills the cistern 5 hrs. faster than the other.  How many hours it take the second pipe to fill the cistern?",
			        "20 hrs",			     
					"38 hrs",																				
					"15 hrs",
					"30 hrs",
					"15 hrs");
		}
		else if(Aptitude.topic.equals("LCM HCF"))
		{
			count=count+1;
			db.insertQue(count+"", Aptitude.topic, "LCM of 27,314and53is",
			        "40",
					"30",																				
					"19",
					"10",
					"30");
			count=count+1;
			db.insertQue(count+"", Aptitude.topic, "The HCF of two numbers is 12 and their difference is also 12. The numbers are",
			        "84,96",
					"22,45",																				
					"45,78",
					"12,78",
					"84,96");
			count=count+1;
			db.insertQue(count+"", Aptitude.topic, "The HCF of two numbers is 16 and their LCM is 160.  If one of the numbers is 32, then the other number is ",
			        "70",
					"60",																				
					"80",
					"90",
					"80");
			count=count+1;
			db.insertQue(count+"", Aptitude.topic, "HCF of three numbers is 12. If they are in the ratio 1:2:3, then the numbers are",
			        "12,24,36",
					"13,17,18",																				
					"14,16,18",
					"16,17,18",
					"12,24,36");
			count=count+1;
			db.insertQue(count+"", Aptitude.topic, "Six bells commence tolling together and toll at intervals of 2,4,6,8,10 and 12 seconds respectively.  In 30 minutes, how many times do they toll together?",
			        "16",
					"19",																				
					"14",
					"23",
					"16");
			count=count+1;
			db.insertQue(count+"", Aptitude.topic, "The largest natural number which exactly divides the product of any four consecutive natural numbers is :",
			        "24",
					"46",																				
					"45",
					"36",
					"24");
			count=count+1;
			db.insertQue(count+"", Aptitude.topic, "The traffic lights at three different road crossing change after every 48 sec; 72 sec; and 108 sec., respectively.  If they all change simultaneously at 8:20:00 hrs, then they will again change simultaneously at",
			        " 8:27:12 Hrs",
					" 9:27:29 Hrs",																				
					" 7:27:13 Hrs",
					" 9:28:14 Hrs",
					" 8:27:12 Hrs");
			count=count+1;
			db.insertQue(count+"", Aptitude.topic, "The greatest number by which if 1657 and 2037 are divided the remainders will be 6 and 5 respectively is",
			        "127",
					"143",																				
					"123",
					"129",
					"127");
			count=count+1;
			db.insertQue(count+"", Aptitude.topic, "The HCF and LCM of two numbers are 44 and 264 respectively. If the first number is divisible by 3, then the first number is",
			        "264",
					"132",																				
					"Both a and b",
					"33",
					"Both a and b");
			count=count+1;
			db.insertQue(count+"", Aptitude.topic, "The smallest number which is divisible by 12, 15, 20 and is a perfect square, is",
			        "3700",
					"3600",																				
					"3800",
					"3900",
					"3600");
			
		}
			
		else if(Aptitude.topic.equals("Number System"))
		{
			count=count+1;
			db.insertQue(count+"", Aptitude.topic, "The local value of 9 in the numeral 679023 is ",
			        "900",
					"9000",																				
					"9",
					"90",
					"9000");
			count=count+1;
			db.insertQue(count+"", Aptitude.topic, "The face value of 9 in the numeral 58926 is",
			        "9",
					"90",																				
					"600",
					"7000",
					"9");
			count=count+1;
			db.insertQue(count+"", Aptitude.topic, "77077+7707+77+7=?",
			        "87690",
					"89345",																				
					"84868",
					"87654",
					"84868");
			count=count+1;
			db.insertQue(count+"", Aptitude.topic, "3333+6666+555+?=10576",
			        "35",
					"23",																				
					"34",
					"22",
					"22");
			count=count+1;
			db.insertQue(count+"", Aptitude.topic, "3013x?2=277196 find the digit of in place of ?",
			        "9",
					"3",																				
					"4",
					"5",
					"9");
			count=count+1;
			db.insertQue(count+"", Aptitude.topic, "46x46+54x54+2x46x54",
			        "50000",
					"60000",																				
					"10000",
					"30000",
					"10000");
			count=count+1;
			db.insertQue(count+"", Aptitude.topic, "1014 x 986=?",
			        "999802",
					"999808",																				
					"999809",
					"999804",
					"999804");
			count=count+1;
			db.insertQue(count+"", Aptitude.topic, "80?=?20",
			        "40",
					"60",																				
					"70",
					"80",
					"40");
			
			count=count+1;
			db.insertQue(count+"", Aptitude.topic, "If ab=43 then 3a+2b3a-2b",
			        "9",
					"3",																				
					"4",
					"8",
					"3");
			
		}
			
		else if(Aptitude.topic.equals("Profit Loss"))
		{	
			count=count+1;
			db.insertQue(count+"", Aptitude.topic, "A dealer marks his goods 20% above cost price.  He then allows some discount on it and makes a profit of 8%. The rate of discount is :",
			        "40%",
					"30%",																				
					"10%",
					"20%",
					"10%");
			count=count+1;
			db.insertQue(count+"", Aptitude.topic, "A cloth merchant has announced 25% rebate in prices. If one needs to have a rebate of Rs.40, then how many shirts, cash costing Rs.32, he should purchase ?",
			        "5",
					"6",																				
					"7",
					"8",
					"5");
			count=count+1;
			db.insertQue(count+"", Aptitude.topic, "The price of an article was increased by p%. Later the new price was decreased by p%. If the latest price was Rs.1, the original price was :",
			        "[1000010000-p2]",
					"Rs.1",																				
					"Rs.3",
					"[100100+p2",
					"[1000010000-p2]");
			count=count+1;
			db.insertQue(count+"", Aptitude.topic, "The difference between a discount of 40% on Rs.500 and two successive discount of 36%  and 4% on the same amount is :",
			        "Rs.2",
					"Rs.4",																				
					"Rs.9",
					"Rs.7.20",
					"Rs.7.20");
			count=count+1;
			db.insertQue(count+"", Aptitude.topic, "Tarun bought a T.V with 20% discount on the labelled price. Had he bought it with 25% discount, he would have saved Rs.500. At what price did he buy the T.V ?",
			       
			        "10,000",
					"20,000",																				
					"30,000",
					"40,000",
					"10,000");
			count=count+1;
			db.insertQue(count+"", Aptitude.topic, "A man purchases an electric heater whose printed price is Rs.160. If he received two successive discounts of 20% and 10%; he paid :",
			        "Rs.119.60",
					"Rs.134",																				
					"Rs.167",
					"Rs.120",
					"Rs.119.60");
			count=count+1;
			db.insertQue(count+"", Aptitude.topic, "The marked price is 10% higher than the cost price.  A discount of 10% is given on the marked price. In this kind of sale, the seller ",
			        "losses",
					"gain",			
					"bears no loss, no gain",
					"none of these",
			       "losses");
			count=count+1;
			db.insertQue(count+"", Aptitude.topic, "A trader lists his articles 20% above C.P and allows a discount of 10% on cash payment.  His gain percent is :",
			        "8%",
					"2%",																				
					"6%",
					"4%",
					"8%");
			count=count+1;
			db.insertQue(count+"", Aptitude.topic, "While selling a watch, a shop-keeper gives a discount of 5%. If he gives a discount of 7%, he earns Rs.15 less as profit. The marked price of the watch is ",
			        "Rs.127.89",
					"Rs123.7",																				
					"Rs 394.9",
					"Rs 787.50",
					"Rs 787.50");
			count=count+1;
			db.insertQue(count+"", Aptitude.topic, "shop-keeper earns a profit of 12% on selling a book at 10% discount on the printed ",
			        "45:56",
					"24:90",																				
					"23:89",
					"787:50",
					"45:56");
		}
		
			 list=db.getQuestions(Aptitude.topic);
				CustomAdapter adapter=new CustomAdapter(AptitudeTestActivity.this, list);
				queLV.setAdapter(adapter);
				
		
		
			
		
	}
		
		else
		{
			Toast.makeText(AptitudeTestActivity.this, "inside else block", 5000).show();
			 list=db.getQuestions(Aptitude.topic);
			CustomAdapter adapter=new CustomAdapter(AptitudeTestActivity.this, list);
			queLV.setAdapter(adapter);
			
		}
}
}
