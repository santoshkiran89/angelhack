package com.placements;
import java.util.ArrayList;
import java.util.HashMap;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

public class VerbalTestActivity extends Activity {

	Button submitbtn;
	ListView queLV;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.quelist);
		
		submitbtn=(Button) findViewById(R.id.buttonSub);
		queLV=(ListView) findViewById(R.id.listView1);
		
		MySqliteDatabase db=new MySqliteDatabase(VerbalTestActivity.this);
		int count=db.getQuizCount(verbal.topic);
		Toast.makeText(VerbalTestActivity.this, count+"", 5000).show();
		if(count<1)
		{
			Toast.makeText(VerbalTestActivity.this, "inside if block", 5000).show();
			Toast.makeText(VerbalTestActivity.this,verbal.topic, 5000).show();
			if(verbal.topic.equals("Articles"))
			{
				count=count+1;
				db.insertQue(count+"", verbal.topic, "The only sport we enjoy is ...... hockey.",
						"the",
						"an",
						"a",
						"no article needed",
						"no article needed");
				count=count+1;
				db.insertQue(count+"", verbal.topic, "I left it at ...... office.",
						"the",
						"a",
						"an",
						"no article",
						"the");
				count=count+1;
				db.insertQue(count+"", verbal.topic, "He is .... doctor.",
						"the",
						"a",
						"an",
						"no article",
						"a");
				count=count+1;
				db.insertQue(count+"", verbal.topic, "He drives at a speed of 90 miles ...... hour.",
						"the",
						"a",
						"an",
						"no article",
						"an");
				count=count+1;
				db.insertQue(count+"", verbal.topic, "It's in ....... Arthur Road.",
						"the",
						"a",
						"an",
						"no article",
						"no article");
				count=count+1;
				db.insertQue(count+"", verbal.topic, "I don't like ..... milk.",
						"the",
						"an",
						"a",
						"no article",
						"no article");
				count=count+1;
				db.insertQue(count+"", verbal.topic, "It's ...... third road on the left.",
						"the",
						"a",
						"an",
						"no article",
						"the");
				count=count+1;
				db.insertQue(count+"", verbal.topic, "The River yamuna is .... longest river of all.",
						"the",
						"a",
						"an",
						"no article",
						"the");
				count=count+1;
				db.insertQue(count+"", verbal.topic, "We're having fish for.....dinner.",
						"the",
						"a",
						"an",
						"no article",
						"no article");
				count=count+1;
				db.insertQue(count+"", verbal.topic, "....... price of petrol keeps rising.",
						"the",
						"a",
						"an",
						"on article",
						"the");
			}
			
			else if(verbal.topic.equals("Parts Of Speech"))
			{	
				count=count+1;
				db.insertQue(count+"", verbal.topic, "What part of speech describes a verb, adjective, or adverb and answers when? where? how? and to what extent?",
				        "noun",
						"adverb",																				
						"conjuction",
						"verb",
						"adverb");
				count=count+1;
				db.insertQue(count+"", verbal.topic, "What part of speech connects words or groups of words? Examples are but, or and yet. ",
				        "preposition",
						"conjunction",																				
						"verb",
						"noun",
						"conjunction");
			
				count=count+1;
				db.insertQue(count+"", verbal.topic, "What part of speech substitutes for a noun or pronoun? Examples are we, they him, I, you, me, she...",
				        "pronoun",
						"verb",																				
						"adverb",
						"noun",
						"pronoun");
			
				count=count+1;
				db.insertQue(count+"", verbal.topic, "What part of speech describes a noun or pronoun and answers the questions which one(s)? how many/much? or what kind(s)",
				        "adverb",
						"noun",																				
						"adjective",
						"verb",
						"adjective");
			
				count=count+1;
				db.insertQue(count+"", verbal.topic, "Which part of speech expresses a mild or sudden burst of emotion? Examples are wow! or no,.",
				        "noun",
						"interjection",																				
						"verb",
						"adverb",
						"interjection");
			
				
				count=count+1;
				db.insertQue(count+"", verbal.topic, "Which part of speech describes the distance/placement/proximity of one word and another word in a sentence? Examples are on, to, behind, with...",
				        "preposition",
						"noun",																				
						"adverb",
						"verb",
						"preposition");
			
				count=count+1;
				db.insertQue(count+"", verbal.topic, "Which part of speech describes an action or state of being or condition? Examples are throw, run. was, is, seems...",
				        "noun",
						"verb",																				
						"adverb",
						"conjuction",
						"verb");
			
				count=count+1;
				db.insertQue(count+"", verbal.topic, "What part of speech describes a person, place, thing, or idea? Examples are house, jury, determination.",
				        "noun",
						"adverb",																				
						"verb",
						"adjective",
						"noun");
			
				count=count+1;
				db.insertQue(count+"", verbal.topic, "which of the following word is a interjection?",
				        "ouch",
						"into",																				
						"many",
						"too",
						"ouch");
			
				count=count+1;
				db.insertQue(count+"", verbal.topic, "which of the following word is a conjuction?",
				        "many",
						"into",																				
						"and",
						"too",
						"and");
			
				
			}
			
			else
			{
				Toast.makeText(VerbalTestActivity.this, "inside else block", 5000).show();
				ArrayList<HashMap<String, String>> list=db.getQuestions(Aptitude.topic);
				CustomAdapter adapter=new CustomAdapter(VerbalTestActivity.this, list);
				queLV.setAdapter(adapter);
				
			}
	}else if(verbal.topic.equals("Prepositions"))
	{	
		count=count+1;
		db.insertQue(count+"", verbal.topic, "When we get ready for dinner, I have to take my books__________ the table.",
		        "Off",
				"From",																				
				"out",
				"Of",
				"Off");
		count=count+1;
		db.insertQue(count+"", verbal.topic, "Every weekend, we put the trash can ________________ for garbage collection.",
		        "Up",
				"At",																				
				"into",
				"out",
				"out");
	
		count=count+1;
		db.insertQue(count+"", verbal.topic, "You have to leave your shoes ______________the door when you enter the house.",
		        "In",
				"Over",																				
				"To",
				"By",
				"By");
	
		count=count+1;
		db.insertQue(count+"", verbal.topic, "It was a long walk, so he began moving slowly ________________ the town.",
		        "For",
				"towards",																				
				"until",
				"At",
				"towards");
	
		count=count+1;
		db.insertQue(count+"", verbal.topic, "David cleaned his room by stuffing everything _________________his bed.",
		        "In",
				"On",																				
				"Under",
				"Along",
				"Under");
		
		count=count+1;
		db.insertQue(count+"", verbal.topic, "We often go fishing __________________ the river bank.",
		        "towards",
				"Inside",																				
				"Along",
				"around",
				"Along");
	
		count=count+1;
		db.insertQue(count+"", verbal.topic, "The lecture will be held right ______________ the tutorial.",
		        "At",
				"Before",																				
				"Over",
				"beyond",
				"Before");
	
		count=count+1;
		db.insertQue(count+"", verbal.topic, "He was caught by the teacher for cheating ________________the exam",
		        "During",
				"After",																				
				"Near",
				"outside",
				"During");
	
		count=count+1;
		db.insertQue(count+"", verbal.topic, "John needs to submit the report _________ his boss before 5 pm.",
		        "At",
				"To",																				
				"Of",
				"On",
				"To");
	
		count=count+1;
		db.insertQue(count+"", verbal.topic, "James’ wife accused him _____________ cheating.",
		        "Up",
				"To",																				
				"with",
				"of",
				"of");
	}
	else if(verbal.topic.equals("Subject Verb Agreement"))
		{	
			count=count+1;
			db.insertQue(count+"", verbal.topic, "The piano as well as the pipe organ ____________ to be tuned for the big concert. ",
			        "has",
					"have",																				
					"have been",
					"had been",
					"has");
			count=count+1;
			db.insertQue(count+"", verbal.topic, "The mayor together with his two brothers ____________ going to be indicted for accepting bribes.",
			        "is",
					"are",																				
					"was",
					"were ",
					"is");
			count=count+1;
			db.insertQue(count+"", verbal.topic, "Neither of my two suitcases ____________ adequate for this trip.",
			        "are",
					"is",																				
					"was",
					"were",
					"are");
			count=count+1;
			db.insertQue(count+"", verbal.topic, " There ____________ a list of committee members on the head-table. ",
			        "is",
					"are",																				
					"was",
					"were",
					"is");
			count=count+1;
			db.insertQue(count+"", verbal.topic, "Everybody in the class ____________ done the homework well in advance",
			        "have",
					"has",																				
					"had",
					"had not",
					"has");
			count=count+1;
			db.insertQue(count+"", verbal.topic, "The jury ____________ their seats in the courtroom. ",
			        "take",
					"takes",																				
					"is take",
					"was take",
					"take");
			count=count+1;
			db.insertQue(count+"", verbal.topic, "Neither the teacher nor the students ____________ to understand this assignment. ",
			        "SEEM",
					"SEEMS",																				
					"WAS SEEM",
					"NOT",
					"SEEM");
			count=count+1;
			db.insertQue(count+"", verbal.topic, "____________ either my father or my brothers made a down-payment on the house? ",
			        "HAS",
					"HAVE",																				
					"NOT HAVE",
					"NOT HAS",
					"");
			count=count+1;
			db.insertQue(count+"", verbal.topic, "Hartford is one of those cities that ____________ working hard to reclaim a riverfront. ",
			        "is",
					"are",																				
					"were",
					"was",
					"are");
			      count=count+1;
					db.insertQue(count+"", verbal.topic, "Some of the grain ____________ gone bad. ",
					        "HAVE",
							"HAS",																				
							"HAD",
							"HAVING",
							"HAS");
					

		}
	else if(verbal.topic.equals("Analogies"))
	{	
		count=count+1;
		db.insertQue(count+"", verbal.topic, "Wool : Acrylic",
		        "Rayon : Silk ",
				"Winter : Spring ",																				
				"Cotton : Terylene ",
				"Rubber : Plastic ",
				"Cotton : Terylene ");
		count=count+1;
		db.insertQue(count+"", verbal.topic, "Bouquet : Flower",
		        "Skin : Body ",
				"Chain : Link ",																				
				"Page : Book ",
				"Product : Factory ",
				"Chain : Link ");
		count=count+1;
		db.insertQue(count+"", verbal.topic, "Germ : Disease",
		        "Man : Woman ",
				"War : Destruction ",																				
				"Doctor : Medicine ",
				"Owner : Shop ",
				"War : Destruction");
		count=count+1;
		db.insertQue(count+"", verbal.topic, "Ignominy : Disloyalty",
		        "Fame : Heroism ",
				"Derelict : Fool ",																				
				"Death : Victory ",
				"Martyr : Man ",
				"Fame : Heroism");
		count=count+1;
		db.insertQue(count+"", verbal.topic, "Gazelle : Swift",
		        "Horse : Slow ",
				"Lamb : Bleat ",																				
				"Swan : Graceful ",
				"Lion : Roar ",
				"Swan : Graceful ");
		count=count+1;
		db.insertQue(count+"", verbal.topic, "Ascetic : Luxury",
		        "Capitalist : Communist ",
				"Teacher : Classroom ",																				
				"Misogynist : Woman ",
				"Comfort : Salaried ",
				"Misogynist : Woman ");
		count=count+1;
		db.insertQue(count+"", verbal.topic, "Asylum : Refuge",
		        "Traveller : Destination ",
				"Accident : Injury ",																				
				" Flight : Escape ",
				"Peace : War ",
				" Flight : Escape ");
		count=count+1;
		db.insertQue(count+"", verbal.topic, "Spear : Dart",
		        "Cannon : Gun ",
				"Door : Window ",																				
				"Mountain : Molehill ",
				"Knife : Sword",
				"Cannon : Gun ");
		count=count+1;
		db.insertQue(count+"", verbal.topic, "Buzz : Bees",
		        "Whisper : Noise ",
				"Door : Window ",																				
				"Crack : Whip  ",
				"Knife : Sword",
				"Crack : Whip ");
		count=count+1;
		db.insertQue(count+"", verbal.topic, "Argument : Debate",
		        "Violence : Peace ",
				"Fight : Contest  ",																				
				"Crack : Whip  ",
				"Knife : Sword",
				"Fight : Contest  ");
	}
	else if(verbal.topic.equals("Spot Errors"))
	{	
		count=count+1;
		db.insertQue(count+"", verbal.topic, "I shall / ring him / tommorow / in the afternoon.",
		        "A",
				"B",																				
				"C",
				"D",
				" B");
		count=count+1;
		db.insertQue(count+"", verbal.topic, "I enjoyed / during my / stay in / England.",
		        "A",
				"B",																				
				"C",
				"D",
				" A");
		count=count+1;
		db.insertQue(count+"", verbal.topic, "The clothes / were neatly / hanged /on the cloth line.",
		        "A",
				"B",																				
				"C",
				"D",
				" C");
		count=count+1;
		db.insertQue(count+"", verbal.topic, "The major / along with / his soldiers / were killed in the field.",
		        "A",
				"B",																				
				"C",
				"D",
				"D ");
		count=count+1;
		db.insertQue(count+"", verbal.topic, "The firm show / began / when we arrived / in the hall.",
		        "A",
				"B",																				
				"C",
				"D",
				" B");
		count=count+1;
		db.insertQue(count+"", verbal.topic, "I believe / that respect / is more preferable than / money.",
		        "A",
				"B",																				
				"C",
				"D",
				" C");
		count=count+1;
		db.insertQue(count+"", verbal.topic, "I never have / visited / or intend to visit / foreign countries.",
		        "A",
				"B",																				
				"C",
				"D",
				" C");
		count=count+1;
		db.insertQue(count+"", verbal.topic, "In this way nuclear fission / or the splitting / of the atom / have been achieved.",
		        "A",
				"B",																				
				"C",
				"D",
				" D");
		count=count+1;
		db.insertQue(count+"", verbal.topic, "Modern film techniques / are far superior / than that / employed in the past /",
		        "A",
				"B",																				
				"C",
				"D",
				"C ");
		count=count+1;
		db.insertQue(count+"", verbal.topic, "",
		        "A",
				"B",																				
				"C",
				"D",
				" A");
		
	}
	else
	{
		Toast.makeText(VerbalTestActivity.this, "inside else block", 5000).show();
		ArrayList<HashMap<String, String>> list=db.getQuestions(verbal.topic);
		CustomAdapter adapter=new CustomAdapter(VerbalTestActivity.this, list);
		queLV.setAdapter(adapter);
		
	
	
	
	}
	
}
	}

