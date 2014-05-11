package com.placements;

import java.util.ArrayList;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class PlacementsGuideActivity extends Activity {
	
	
	static ArrayList<String> contentTopic=new ArrayList<String>();
	static ArrayList<String> contentList=new ArrayList<String>();
	
	
	static ArrayList<String> topic1=new ArrayList<String>();
	static ArrayList<String> question=new ArrayList<String>();
	static ArrayList<String> option1=new ArrayList<String>();
	static ArrayList<String> option2=new ArrayList<String>();
	static ArrayList<String> option3=new ArrayList<String>();
	static ArrayList<String> option4=new ArrayList<String>();
	static ArrayList<String> answer=new ArrayList<String>();
	Button aptitude,verbal;
	
	
    /** Called when the activity is first created. */
     
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.main);
        aptitude=(Button) findViewById(R.id.aptitudeId);
        verbal=(Button) findViewById(R.id.verbalId);
        
aptitude.setOnClickListener(new OnClickListener() {
			
			 
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i=new Intent(PlacementsGuideActivity.this,Aptitude.class);
				startActivity(i);
			}
		});
verbal.setOnClickListener(new OnClickListener() {
	
	 
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Intent i=new Intent(PlacementsGuideActivity.this,verbal.class);
		startActivity(i);
	}
});
		
        
        
/*        contentTopic.add("Partnership");
         contentList.add("When two or more than two persons run a business jointly, they are called patners and the deal is known as patnership." +
         		"Ratio of Division of Gains  " +
         		"I. When investments of all the partners are for the same time, the gain or loss is distributed among the partners in the ratio of their investments." +
         		"Suppose A and B invest Rs. x and Rs. y respectively for a year in a business, then at the end of the year will be the ratio of A s share of profit and Bs share of profit = ratio of x and y." +
         		"II. When investments are for different time periods, then equivalent capitals are calculated for a unit of time by taking capitalnumber of units of time. Now, gain or loss is divided in the ratio of these capitals." +
         		"Suppose A invests Rs. x for p months and B invests Rs. y for q months, then ratio of As share of profit and Bs share of profit = ratio of xp and yq." +
         		"III. When investments are altered in the given period we need to take the changes into consideration while calculating their profits." +
         		"Suppose A and B started their business with Rs.5000 and Rs.10,000 respectively. If after three months A invested another Rs.5000 then we have to consider A s capital for the remaining period is Rs.10,000" +
         		"So ratio of A and B =  ratio of 5000 X 3 + 10,000 X 9 and 10,000 X 12 = ratio of 1,05,000 and 1,20,000 = ratio of 7 and 8" 
         		
);
        
        
        		
        		
        		contentTopic.add("Percentages");
        contentList.add("");
        
        
        contentTopic.add("Time Speed Distance");
        contentList.add("");
       
        contentTopic.add("Time Work");
        contentList.add("");
        
        contentTopic.add("Number System");
        contentList.add(" ");
        
        contentTopic.add("Profit Loss");
        contentList.add(" ");

topic1.add("Partnership");
question.add("1.Karim invests Rs.30000 for one year in a shop. How much his partner Raunaq should invest in order that the profit after one year may be in the ratio 2: 3");
option1.add("Rs.20000");
option2.add("Rs.40000");
option3.add("Rs.45000");
option4.add("Rs.18000");
answer.add("c");
question.add("2.A,B and C are three partners in a business. If twice the investment of A is equal to thrice the capital of B and the capital of B is four times the capital of C. Out of a total profit of Rs.5940, the share of C is :");
option1.add("Rs.700");
option2.add("Rs.900");
option3.add("Rs.740");
option4.add("Rs.540");
answer.add("d");
question.add("3.A invested Rs.2000/- in a firm which is half the investment of 'B's. But C's investment is sum of A and B.Find their investments ratio:");
option1.add("3:2:1");
option2.add("2:3:1");
option3.add("1:2:3");
option4.add("None of these");
answer.add("c");
question.add("4. A's capital is equal to twice B's capital and B's capital is three times C's capital. The ratio of the capital is");
option1.add("2:1:3");
option2.add("1:2:6");
option3.add("6:3:1");
option4.add("1:3:6");
answer.add("c");
question.add("5.Three partners A,B,C invest Rs.26,000, Rs.34000 and Rs.10000 respectively in a business. Out of a profit of Rs.3500, B's share is : ");
option1.add("Rs.1300");
option2.add("Rs.1700");
option3.add("Rs.500");
option4.add("Rs.1500");
answer.add("b");
question.add(" 6.A and B started a joint firm.  A's investment was thrice the investment of B and the period of his investment was two times the period of investment of B. If B got Rs.4000" +
		"as profit, then their total profit is :");
option1.add("Rs.2400");
option2.add("Rs.1600");
option3.add("Rs.2800");
option4.add("Rs.2000");
answer.add("c");
question.add("7. A, B and C enter into partnership by making investments in the ratio 3:5:7. After a year,C invests another Rs.337600 while A withdraw Rs.45600. The ratio of investments then changes to 24:59:167. How much did A invest initially");
option1.add("Rs.4500");
option2.add("Rs.9600");
option3.add("Rs.141600");
option4.add("None of these");
answer.add("c");
question.add("8.A, B and C invest Rs.2000, Rs.3000 and Rs.4000 in a business. After one year, A removed his money but B and C continued for one more year. If the net profit after 2 years is Rs.3200 then A's share in the profit is :");
option1.add("Rs.1000");
option2.add("Rs.600");
option3.add("Rs.800");
option4.add("Rs.400");
answer.add("d");
question.add("9. A and B enter into partnership, investing Rs.12000 and Rs.16000 respectively. After 8 months, C joins them with a capital of Rs.15,000. The share of C in a profit of Rs.45,600 after 2 years will be:");
option1.add("Rs.21,200");
option2.add("Rs.19,200");
option3.add("Rs.14,400");
option4.add("Rs.12,000");
answer.add("d");
question.add("10.Dilip, Ram and Amar started a shop by investing Rs.27000, Rs.81000 and Rs,72000 respectively.  At the end of one year, the profit was distributed. If Ram's share of profit be Rs.36,000, the total profit was :");
option1.add("Rs.1,08,000");
option2.add("Rs.1,16,000");
option3.add("Rs.80,000");
option4.add("None of these");
answer.add("d");

topic1.add("Percentages");
question.add("1.The length of a rectangle is increased by 50%. By what percent would be width have to be decreased to maintain the same area");
option1.add("3712%");
option2.add("60%");
option3.add("75%");
option4.add("None of these");
answer.add("a");
question.add("2.If the side of a square is increased by 30% , its area is increased by :");
option1.add("9%");
option2.add("30%");
option3.add("60%");
option4.add("69%");
answer.add("d");
question.add("3.The price of an article has been reduced by 25%. In order to restore the original price, the new price must be increased by :");
option1.add("3313%");
option2.add("1119%");
option3.add("9111%");
option4.add("6623%");
answer.add("a");
question.add("4.p is six times as large as q. The percent that q is less than p is :");
option1.add("8313");
option2.add("1623");
option3.add("90");
option4.add("60");
answer.add("a");
question.add("5.Sameer spends 40% of his salary on food articles and 13rd of the remaining on transport.  If he saves Rs.450 per month which is half of the balance after spending on food items and transport, what is his monthly salary");
option1.add("Rs.1125");
option2.add("Rs.2250");
option3.add("Rs.2500");
option4.add("Rs.4500");
answer.add("b");
question.add("6.The population of a town increases 4% annually but is decreased by emigration annually to the extent of (1/2)% .What will be the increase percent in three years");
option1.add("9.8");
option2.add("10");
option3.add("10.5");
option4.add("10.8");
answer.add("d");
question.add("7.A man's basic pay for a 40 hour week is Rs.20. Overtime is paid for at 25% above the basic rate. In a certain week he worked overtime and his total wage was Rs.25. He therefore worked for a total of :");
option1.add("45 hours");
option2.add("47 hours");
option3.add("48 hours");
option4.add("50 hours");
answer.add("c");
question.add("8.On decreasing the price of T.V.sets by 30% , its sale is increased by 20%. What is the effect on the revenue received by the shopkeeper.");
option1.add("10% increase");
option2.add("10% decrease");
option3.add("16% increase");
option4.add("16% decrease");
answer.add("d");
question.add("9.Water tax is increased by 20% but its consumption is decreased by 20%. Then, the increase or decrease in the expenditure of the money is ");
option1.add("No change");
option2.add("5% decrease");
option3.add("4% increase");
option4.add("4% decrease");
answer.add("d");
question.add("10.The price of sugar is increased by 20%. If the expenditure is not allowed to increase, the ratio between the reduction in consumption and the original consumption is:");
option1.add("1:3");
option2.add("1:4");
option3.add("1:6");
option4.add("1:5");
answer.add("c");

topic1.add("Time Speed Distance");
question.add("1.The distance between two stations A and B is 220 km. A train leaves A towards B at an average speed of 80 km/hr. After half a hour, another train leaves B towards A at an average speed of 100 km/hr. The distance of the point where the two trains meet, from A is:");
option1.add("120 km");
option2.add("130 km");
option3.add("140 km");
option4.add("150 km");
answer.add("a");
question.add("2.A cart has to cover a distance of 80 km in 10 hours. If it covers half of the journey in (3/5)th time, what should be its speed to cover the remaining distance in the time left.");
option1.add("8 km/hr");
option2.add("20 km/hr");
option3.add("6.4 km/hr");
option4.add("10 km/hr");
answer.add("d");
question.add("3.Ravi started cycling along the boundaries of a square field from corner point A.  After half an hour, he reached the corner point C, diagonally opposite to A. If his speed was 8 km/hr. what is the area of the field in square km.");
option1.add("64");
option2.add("8");
option3.add("4");
option4.add("Cannot be determined");
answer.add("b");
question.add("4.A man goes uphill with an average speed of 35 km/hr and comes down with an average speed of 45 km/hr. The distance travelled in both the cases being the same, the average speed for the entire journey is:");
option1.add("3838 km/hr");
option2.add("3938 km/hr");
option3.add("40 km/hr");
option4.add("None of these");
answer.add("b");
question.add("5.A man walking at 3 km/hr crosses a square field diagonally in 2 min. The area of the field is:");
option1.add("2500m2");
option2.add("3000m2");
option3.add("5000m2");
option4.add("6000m2");
answer.add("c");
question.add("6.A certain distance is covered at a certain speed. If half of this distance is covered in double the time, the ratio of the two speeds is:");
option1.add("4:1");
option2.add("1:4");
option3.add("2:1");
option4.add("1:2");
answer.add("a");
question.add("7.If a boy takes as much time in running 10 m as a car takes in covering 25 m, the distance covered by the boy during the time the car covers 1 km is:");
option1.add("400m");
option2.add("40m");
option3.add("250m");
option4.add("650m");
answer.add("a");
question.add("8.The ratio between the rates of walking of P and Q is 2 : 3. If the time taken by Q to cover a certain distance is 36 minutes, the time taken by P to cover that much distance is:");
option1.add("24 min");
option2.add("54 min");
option3.add("48 min");
option4.add("21.8 min");
answer.add("b");
question.add("9.A man, on tour, travels first 160 km at 64 km/hr and the next 160 km at 80 km/hr. the average speed for the first 320 km of the tour, is:");
option1.add("35.55km/hr");
option2.add("71.11 km/hr");
option3.add("36 km/hr");
option4.add("72 km/hr");
answer.add("b");
question.add("10.A man travels 35 km partly at 4 km/hr and at 5 km/hr. If he covers former distance at 5 km/hr and later distance at 4 km/hr, he could cover 2 km more in the same time. The time taken to cover the whole distance at original rate is:");
option1.add("9 hours");
option2.add("7 hours");
option3.add("412 hours");
option4.add("8 hours");
answer.add("d");

topic1.add("Time Work");
question.add("1.Two men undertake to do a piece of work for Rs.400. One alone can do it in 6 days, the other in 8 days. With the help of a boy, they finish it in 3 days. The boy's share is");
option1.add("Rs.40");
option2.add("Rs.50");
option3.add("Rs.60");
option4.add("Rs.80");
answer.add("b");
question.add("2.If a man or 2 women or 3 boys can do a piece of work in 44 days, then the same piece of work will be done by 1 man, 1 woman and 1 boy in:");
option1.add("21 days");
option2.add("24 days");
option3.add("26 days");
option4.add("33 days");
answer.add("b");
question.add("3.3 men and 4 boys do a piece of work in 8 days, while 4 men and 4 boys finish it in 6 days. 2 men and 4 boys will finish it in:");
option1.add("9 days");
option2.add("10 days");
option3.add("12 days");
option4.add("14 days");
answer.add("d");
question.add("4.If 5 men or 9 women can finish a piece of work in 19 days, 3 men and 6 women will do the same work in :");
option1.add("10 days");
option2.add("12 days");
option3.add("13 days");
option4.add("15 days");
answer.add("d");
question.add("5.8 men can dig a pit in 20 days. If a man works half as much again as a boy, then 4 men and 9 boys can dig a similar pit in:");
option1.add("10 days");
option2.add("12 days");
option3.add("15 days");
option4.add("16 days");
answer.add("d");
question.add("6.8 children and 12 men complete a certain piece of work in 9 days. If each child takes twice the time taken by a man to finish the work, in how many days will 12 men finish the same work.");
option1.add("8");
option2.add("15");
option3.add("9");
option4.add("12");
answer.add("d");
question.add("7.10 men can finish a piece of work in 10 days, where as it take 12 women to finish it in 10 days. If 15 men and 6 women undertake to complete the work, how many days will they take to complete it.");
option1.add("2");
option2.add("4");
option3.add("5");
option4.add("11");
answer.add("c");
question.add("8.If 3 men or 4 women can construct a wall in 43 days, then the number of days that 7 men and 5 women take to construct it is:");
option1.add("12");
option2.add("18");
option3.add("24");
option4.add("30");
answer.add("a");
question.add("9.12 men or 18 women can reap a field in 14 days. The number of days that 8 men and 16 women will take to reap it is:");
option1.add("5");
option2.add("7");
option3.add("8");
option4.add("9");
answer.add("d");
question.add("10.A does half as much work as B in three-fourth of the time. If together they take 18 days to complete a work, how much time shall B take to do it:");
option1.add("30 days");
option2.add("35 days");
option3.add("40 days");
option4.add("None of these");
answer.add("a");

topic1.add("Number system");
question.add("1.The local value of 9 in the numeral 679023 is");
option1.add("9");
option2.add("9000");
option3.add("900");
option4.add("90");
answer.add("b");
question.add("2.The face value of 9 in the numeral 58926 is");
option1.add("900");
option2.add("9");
option3.add("1000");
option4.add("50000");
answer.add("b");
question.add("3.77077+7707+777=");
option1.add("84688");
option2.add("88468");
option3.add("84868");
option4.add("86648");
answer.add("c");
question.add("4.3333+6666+555+?=10576");
option1.add("222");
option2.add("202");
option3.add("122");
option4.add("22");
answer.add("d");
question.add("5.3013x?2=277196 find the digit of in place of ");
option1.add("9");
option2.add("3");
option3.add("7");
option4.add("None of these");
answer.add("a");
question.add("6.46x46+54x54+2x46x54");
option1.add("10004");
option2.add("10000");
option3.add("10324");
option4.add("9676");
answer.add("b");
question.add("7.1014 x 986=");
option1.add("998904");
option2.add("999804");
option3.add("998814");
option4.add("998804");
answer.add("b");
question.add("8.?x48=173 x 240");
option1.add("545");
option2.add("685");
option3.add("865");
option4.add("495");
answer.add("c");
question.add("9.80?=?20");
option1.add("40");
option2.add("400");
option3.add("800");
option4.add("1600");
answer.add("a");
question.add("10.If ab=43 then 3a+2b3a-2b");
option1.add("6");
option2.add("3");
option3.add("5");
option4.add("-1");
answer.add("b");

topic1.add("Profit Loss");
question.add("1.A dealer marks his goods 20% above cost price.  He then allows some discount on it and makes a profit of 8%. The rate of discount is :");
option1.add("12%");
option2.add("10%");
option3.add("6%");
option4.add("4%");
answer.add("b");
question.add("2.A cloth merchant has announced 25% rebate in prices. If one needs to have a rebate of Rs.40, then how many shirts, cash costing Rs.32, he should purchase.");
option1.add("6");
option2.add("5");
option3.add("10");
option4.add("7");
answer.add("b");
question.add("3.The price of an article was increased by p%. Later the new price was decreased by p%. If the latest price was Rs.1, the original price was :");
option1.add("Rs. 1");
option2.add("[1-p2100]");
option3.add("[1000010000-p2]");
option4.add("[1-p2100------v]");
answer.add("c");
question.add("4.The difference between a discount of 40% on Rs.500 and two successive discount of 36%  and 4% on the same amount is :");
option1.add("0");
option2.add("Rs.2");
option3.add("Rs.1.93");
option4.add("Rs.7.20");
answer.add("d");
question.add("5.Tarun bought a T.V with 20% discount on the labelled price. Had he bought it with 25% discount, he would have saved Rs.500. At what price did he buy the T.V ");
option1.add("Rs.5000");
option2.add("Rs.10,000");
option3.add("Rs.12000");
option4.add("Rs.6000");
answer.add("b");
question.add("6.A man purchases an electric heater whose printed price is Rs.160. If he received two successive discounts of 20% and 10%; he paid :");
option1.add("Rs.112");
option2.add("Rs.129.60");
option3.add("Rs.119.60");
option4.add("Rs.115.60");
answer.add("d");
question.add("7.The marked price is 10% higher than the cost price.  A discount of 10% is given on the marked price. In this kind of sale, the seller");
option1.add("bears no loss,no gain");
option2.add("gains");
option3.add("losses");
option4.add("None of these");
answer.add("c");
question.add("8.A trader lists his articles 20% above C.P and allows a discount of 10% on cash payment.  His gain percent is");
option1.add("10%");
option2.add("8%");
option3.add("6%");
option4.add("5%");
answer.add("b");
question.add("9.While selling a watch, a shop-keeper gives a discount of 5%. If he gives a discount of 7%, he earns Rs.15 less as profit. The marked price of the watch is :");
option1.add("Rs.697.50");
option2.add("Rs.787.50");
option3.add("Rs.712.50");
option4.add("Rs.787.50");
answer.add("d");
question.add("10.A shop-keeper earns a profit of 12% on selling a book at 10% discount on the printed price. The ratio of the cost price and the printed price of the book is:");
option1.add("45:56");
option2.add("52:61");
option3.add("50:61");
option4.add("99:125");
answer.add("a");*/
     
    }
}