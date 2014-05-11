package com.placements;

import java.util.ArrayList;

import android.app.Activity;
import android.database.DatabaseUtils;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class VerbalContentActivity extends Activity{
	ListView contentLV;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.content);
		contentLV=(ListView) findViewById(R.id.listView1);
		System.out.println(verbal.topic+":::::::::::::::::;");
		MySqliteDatabase db=new MySqliteDatabase(VerbalContentActivity.this);
		
		if(verbal.topic.equals("Articles"))
		{
		int i=db.getContentCoubt("Articles");
		if(i<=0)
		{
			try {
				
			
			PlacementsGuideActivity.contentTopic=new ArrayList<String>();
			PlacementsGuideActivity.contentList=new ArrayList<String>();
			PlacementsGuideActivity.contentTopic.add("Articles");
			PlacementsGuideActivity.contentList.add("Articles");
	         		
			long result=db.insertContent("Articles", "In English there are two types of articles:(i)   The Indefinite Articles(ii)  The Definite Article");
			db.insertContent("Articles","The Indefinite Articles : A and An (Please note that ‘An’ is a variant of ‘A’.)'A' and 'An' are to be used with Nouns that are singular.  Singular Nouns are, To simply put, we can put one, two, ... in front of them. " );
			db.insertContent("Articles","The Definite Article: The");
	        db.insertContent("Articles","Notes: 1. The indefinite article ‘a’ is used before: (a) a word beginning with a letter having a consonant sound. Examples:  a book, a man, a dinner.(b) a word that begins with a letter (like O) with the sound like ‘wa’ Examples: a one-rupee note, one-eyed man etc.(c) a word beginning with ‘u’ or ‘eu’ giving the consonant of ‘yu’.Examples: a university, a European.");
	        db.insertContent("Articles","2. The indefinite article ‘an’ is used before:(a) a word beginning with a letter like a, e, i, o, u having a vowel sound.Examples:  an apple, an egg,  an umbrella, an idiot, etc.(b) a word beginning with ‘h’ but the pronunciation starts with a vowel.Examples: an hair, an hour, an honest man, etc.(c) an abbreviation, the first letter of which is ‘M’ Examples: an M.L.A., an M.P., an M.Com an S.D.O and F.R.C.S., an X-mas gift etc");
	        db.insertContent("Articles","Definite Article: the The definite article is used before singular and plural nouns when the noun is specific or particular. The signals that the noun is definite, that it refers to a particular member of a group. For example:");
	        db.insertContent("Articles","The dog that bit me ran away. Here, we're talking about a specific dog, the dog that bit me.");
	        db.insertContent("Articles","I was happy to see the policeman who saved my cat! Here, we're talking about aparticular policeman. Even if we don't know the policeman's name, it's still a particular policeman because it is the one who saved the cat.");
	        db.insertContent("Articles","I saw the elephant at the zoo. Here, we're talking about a specific noun. Probably there is only one elephant at the zoo.");
	        db.insertContent("Articles","Count and Non-count Nouns");
	        db.insertContent("Articles","The can be used with non-count nouns, or the article can be omitted entirely.");
	        db.insertContent("Articles","•	I love to sail over the water (some specific body of water) or I love to sail over water (any water).");
	        db.insertContent("Articles","•	He spilled the milk all over the floor (some specific milk, perhaps the milk you bought earlier that day) or He spilled milk all over the floor (any milk).");
	        db.insertContent("Articles","A/an can be used only with count nouns.");
	        db.insertContent("Articles","•	I need a bottle of water.");
	        db.insertContent("Articles","•	I need a new glass of milk.");
	        db.insertContent("Articles","Most of the time, you can't say, She wants a water, unless you're implying, say, a bottle of water.");
			if(result>0)
			{
				Toast.makeText(VerbalContentActivity.this,"records inserted", 5000).show();
			}
			
			}catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		else
		{
			try {
				
				
				ArrayList<String> list=db.getContent("Articles");
				ArrayAdapter<String> adapter=new ArrayAdapter<String>(VerbalContentActivity.this, android.R.layout.simple_list_item_1, list);
				contentLV.setAdapter(adapter);
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
		}
		
		}
		else if(verbal.topic.equals("Prepositions"))
		{
			Toast.makeText(VerbalContentActivity.this,"inside Prepositions ", 5000).show();
			int i=db.getContentCoubt("Prepositions");
			if(i<=0)
			{
				try {
					
					
					PlacementsGuideActivity.contentTopic=new ArrayList<String>();
					PlacementsGuideActivity.contentList=new ArrayList<String>();
					
					String a=DatabaseUtils.sqlEscapeString( "One point in time");
					long result=db.insertContent("Prepositions",a);
					db.insertContent("Prepositions","On is used with days:");
			         a=DatabaseUtils.sqlEscapeString("•	I will see you on Monday");		
					db.insertContent("Prepositions",a);
					db.insertContent("Prepositions","•	The week begins on Sunday.");
					db.insertContent("Prepositions","At is used with noon, night, midnight, and with the time of day:");
					db.insertContent("Prepositions","•	My plane leaves at noon.");
					db.insertContent("Prepositions","•	The movie starts at 6 p.m.");
					db.insertContent("Prepositions","In is used with other parts of the day, with months, with years, with seasons:");
					db.insertContent("Prepositions","•	He likes to read in the afternoon.");
					db.insertContent("Prepositions","•	The days are long in August.");
					db.insertContent("Prepositions","•	The book was published in 1999.");
					db.insertContent("Prepositions","•	The flowers will bloom in spring.");
					db.insertContent("Prepositions","Extended time:To express extended time, English uses the following prepositions: since, for, by, from—to, from-until, during,(with)in");
					db.insertContent("Prepositions","•	She has been gone since yesterday. (She left yesterday and has not returned.)");
					db.insertContent("Prepositions","•	I'm going to Paris for two weeks. (I will spend two weeks there.)");
					db.insertContent("Prepositions","•	The movie showed from August to October. (Beginning in August and ending in October.)");
					db.insertContent("Prepositions","•	The decorations were up from spring until fall. (Beginning in spring and ending in fall.)");
					db.insertContent("Prepositions","•	I watch TV during the evening. (For some period of time in the evening.)");
					db.insertContent("Prepositions","•	We must finish the project within a year. (No longer than a year.)");
					db.insertContent("Prepositions","Place:To express notions of place, English uses the following prepositions: to talk about the point itself: in, to express something contained: inside, to talk about the surface: on, to talk about a general vicinity, at.");
					db.insertContent("Prepositions","•	There is a wasp in the room.");
					db.insertContent("Prepositions","•	Put the present inside the box.");
					db.insertContent("Prepositions","•	I left your keys on the table.");
					db.insertContent("Prepositions","•	She was waiting at the corner.");
					db.insertContent("Prepositions","Higher than a point:To express notions of an object being higher than a point, English uses the following prepositions: over, above.");
					db.insertContent("Prepositions","•	He threw the ball over the roof.");
					db.insertContent("Prepositions","•	Hang that picture above the couch.");
					db.insertContent("Prepositions","Lower than a point:To express notions of an object being lower than a point, English uses the following prepositions: under, underneath, beneath, below.");
					db.insertContent("Prepositions","•	The rabbit burrowed under the ground");
					db.insertContent("Prepositions","•	The child hid underneath the blanket.");
					db.insertContent("Prepositions","•	We relaxed in the shade beneath the branches");
					db.insertContent("Prepositions","•	The valley is below sea-level.");
					db.insertContent("Prepositions","Close to a point:To express notions of an object being close to a point, English uses the following prepositions: near, by, next to, between, among, opposite.");
					db.insertContent("Prepositions","•	She lives near the school.");
					db.insertContent("Prepositions","•	There is an ice cream shop by the store.");
					db.insertContent("Prepositions","•	An oak tree grows next to my house");
					db.insertContent("Prepositions","•	The house is between Elm Street and Maple Street.");
					db.insertContent("Prepositions","•	I found my pen lying among the books.");
					db.insertContent("Prepositions","•	The bathroom is opposite that room.");
					
					
					if(result>0)
					{
						Toast.makeText(VerbalContentActivity.this,"records inserted", 5000).show();
					}
					} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
					}
			}
			else
			{
				try {
					
					
					ArrayList<String> list=db.getContent("Prepositions");
					ArrayAdapter<String> adapter=new ArrayAdapter<String>(VerbalContentActivity.this, android.R.layout.simple_list_item_1, list);
					contentLV.setAdapter(adapter);
					} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
					}
				
			}
			
			
			
			
		}
		
					
		else if(verbal.topic.equals("Analogies"))
		{
			Toast.makeText(VerbalContentActivity.this,"inside Analogies ", 5000).show();
			int i=db.getContentCoubt("Analogies");
			if(i<=0)
			{
				try {
					PlacementsGuideActivity.contentTopic=new ArrayList<String>();
					PlacementsGuideActivity.contentList=new ArrayList<String>();
					
					String a=DatabaseUtils.sqlEscapeString( "An analogy means a similarity or a correspondence. In questions based on analogy, you are given a pair of words or letters that have a certain relationship.");
					long result=db.insertContent("Analogies",a);
					db.insertContent("Analogies",". From the alternatives provided, you have to select the choice that best matches the relationship existing between the first two words or letters. ");
			         a=DatabaseUtils.sqlEscapeString("•	I will see you on Monday");		
					db.insertContent("Analogies",a);
					db.insertContent("Analogies","The given pair of words or letters is set off by a colon or ratio sign ( : ) signifying how the word A is related to the word B. ");
					db.insertContent("Analogies","The double colon ( : : ) that separate the given pair stands for “in the same way”. For example:");
					db.insertContent("Analogies","King : Prince : :");
					db.insertContent("Analogies","(a) Uncle : Nephew  ");
					db.insertContent("Analogies","(b) Profuse : Availability");
					db.insertContent("Analogies","(c) President : Minister     ");
					db.insertContent("Analogies","(d) Stallion : Colt");
					db.insertContent("Analogies","Choice (d) is the answer. In the above example, the relationship is that of a father and a young one.");
					db.insertContent("Analogies","Analogy question can be solved easily by using the following methods:");
					db.insertContent("Analogies","A. Initially establish the relationship between the given pair and then check the answer choices to find a similar relationship. For example:");
					db.insertContent("Analogies","Angle : Radian : :");
					db.insertContent("Analogies","(a) Cattle : Herd  ");
					db.insertContent("Analogies","(b) Odometer : Speed");
					db.insertContent("Analogies","(c) Dearth : Scarcity ");
					db.insertContent("Analogies","(d) Area : Hectares");
					db.insertContent("Analogies","Choice (d) is the answer. In the above example, Angle is measured in radians, so it is a quantity - unit relationship. Similarly ‘Area’ is measured in Hectares.");
					db.insertContent("Analogies","B. If the relationship is the same but positions are interchanged, then it’s like a trap, don’t go for it. For example.");
					db.insertContent("Analogies","Ostrich : Bird : :");
					db.insertContent("Analogies","(a) Mammal : Panther ");
					db.insertContent("Analogies","(b) Bleat : Lambs");
					db.insertContent("Analogies","(c) Pomphret : Fish  ");
					db.insertContent("Analogies","(d) Lion : Cub");
					db.insertContent("Analogies","Here in Choice (a) as well as in the given question, there is a group-member relationship. Choice (a) could have been the answer had the words been interchanged to Panther : Mammals.");
			        db.insertContent("Analogies","Choice (c) is the answer. ");
		
					
					
					if(result>0)
					{
						Toast.makeText(VerbalContentActivity.this,"records inserted", 5000).show();
					}
					} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
					}
			}
			else
			{
				try {
					
					
					ArrayList<String> list=db.getContent("Analogies");
					ArrayAdapter<String> adapter=new ArrayAdapter<String>(VerbalContentActivity.this, android.R.layout.simple_list_item_1, list);
					contentLV.setAdapter(adapter);
					} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
					}
				
			}
			
			
			
			
		}
		else if(verbal.topic.equals("Spot Errors"))
		{
			Toast.makeText(VerbalContentActivity.this,"inside Spot Errors ", 5000).show();
			int i=db.getContentCoubt("Spot Errors");
			if(i<=0)
			{
				try {
					
					
					PlacementsGuideActivity.contentTopic=new ArrayList<String>();
					PlacementsGuideActivity.contentList=new ArrayList<String>();
					
					String a=DatabaseUtils.sqlEscapeString( "Spotting errors is a common test and forms a part of almost allimportant examinations that have Objective English test on theirsyllabi.");
					long result=db.insertContent("Spot Errors",a);
					db.insertContent("Spot Errors","It requires an awareness of the basic rules of grammar – parts ofspeech,genders, infinitives , participles, subject- verb accord, form oftenses,use of articles and certain exceptional usages.");
			         a=DatabaseUtils.sqlEscapeString("Rules and Examples:");		
					db.insertContent("Spot Errors",a);
					db.insertContent("Spot Errors","1. Some nouns always take a singular verb.Scenery , advice, information, machinery, stationary, furniture,abuse, fuel, rice, gram, issue , bedding, repair, news, mischief, poetry,business, economics, physics, mathematics, classics, ethics,athletics,innings, gallows.");
					db.insertContent("Spot Errors","a) The Scenery of Kashmir are enchanting. (Incorrect)");
					db.insertContent("Spot Errors","The Scenery of Kashmir is enchanting. (correct)");
					db.insertContent("Spot Errors","b) He has given advices. (Incorrect)");
					db.insertContent("Spot Errors","He has given advice. (correct)");
					db.insertContent("Spot Errors","c) The Indian team defeated the English by innings (Incorrect)");
					db.insertContent("Spot Errors","The Indian team defeated the English by an innings (correct)");
					db.insertContent("Spot Errors","d) Mathematics are a good subject ( Incorrect).");
					db.insertContent("Spot Errors","Mathematics is a good subject ( correct).");
					db.insertContent("Spot Errors","2. Some nouns are singular in form, but they are used as plural nounsand always take a plural verb.Cattle, gentry, vermin, peasantry, artillery, people, clergy,company,police.");
					db.insertContent("Spot Errors","a)	The cattle is grazing in the ground. (Incorrect)");
					db.insertContent("Spot Errors","The cattle are grazing in the ground. (correct)");
					db.insertContent("Spot Errors","b)	The clergy is in the church( Incorrect)");
					db.insertContent("Spot Errors","The clergy are in the church( correct)");
					db.insertContent("Spot Errors","3. Some nouns are always used in a plural form and always take aplural verb.Trousers, scissors, spectacles, stockings, shorts,measles,goods, premises, thanks, tidings, annals, chattels etc.");
					db.insertContent("Spot Errors","where are my trousers? ( correct)");
					db.insertContent("Spot Errors","b) Spectacles is now a costly item ( Incorrect)");
					db.insertContent("Spot Errors","Spectacles are now a costly item ( Incorrect)");
					db.insertContent("Spot Errors","4. There are some nouns that indicate length, measure, money,weight or number. when they are preceded by a numeral,they remain unchanged in form.Foot, meter, pair, score, dozen, head, year, hundred, thousand,million");
					db.insertContent("Spot Errors","a) It is a three years degree course ( Incorrect)");
					db.insertContent("Spot Errors","It is a three year degree course ( correct)");
					
					
					
					
					if(result>0)
					{
						Toast.makeText(VerbalContentActivity.this,"records inserted", 5000).show();
					}
					} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
					}
			}
			
			else
			{
				try {
					
					
					ArrayList<String> list=db.getContent("Spot Errors");
					ArrayAdapter<String> adapter=new ArrayAdapter<String>(VerbalContentActivity.this, android.R.layout.simple_list_item_1, list);
					contentLV.setAdapter(adapter);
					} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
					}
				
			}
			
			
			
			
		}
		else if(verbal.topic.equals("Subject Verb Agreement"))
		{
			Toast.makeText(VerbalContentActivity.this,"inside Subject Verb Agreement ", 5000).show();
			int i=db.getContentCoubt("Subject Verb Agreement");
			if(i<=0)
			{
				try {
					
					
					PlacementsGuideActivity.contentTopic=new ArrayList<String>();
					PlacementsGuideActivity.contentList=new ArrayList<String>();
					
					String a=DatabaseUtils.sqlEscapeString("Rule 1");
					long result=db.insertContent("Subject Verb Agreement",a);
					db.insertContent("Subject Verb Agreement","");
			         a=DatabaseUtils.sqlEscapeString("");		
					db.insertContent("Subject Verb Agreement",a);
					db.insertContent("Subject Verb Agreement","Two singular subjects connected by or or nor require a singular verb.");
					db.insertContent("Subject Verb Agreement","Example:My aunt or my uncle is arriving by train today.");
					db.insertContent("Subject Verb Agreement","Rule 2");
					db.insertContent("Subject Verb Agreement","Two singular subjects connected by either/or or neither/nor require a singular verb as in Rule 1");
					db.insertContent("Subject Verb Agreement","Examples:Neither Juan nor Carmen is available.");
					db.insertContent("Subject Verb Agreement","Rule 3");
					db.insertContent("Subject Verb Agreement","When I is one of the two subjects connected by either/or or neither/nor, put it second and follow it with the singular verb am.");
					db.insertContent("Subject Verb Agreement","Example:Neither she nor I am going to the festival.");
					db.insertContent("Subject Verb Agreement","Rule 4");
					db.insertContent("Subject Verb Agreement","When a singular subject is connected by or or nor to a plural subject, put the plural subject last and use a plural verb.");
					db.insertContent("Subject Verb Agreement","Example:The serving bowl or the plates go on that shelf.");
					db.insertContent("Subject Verb Agreement","Rule 5");
					db.insertContent("Subject Verb Agreement","When a singular and plural subject are connected by either/or or neither/nor, put the plural subject last and use a plural verb.");
					db.insertContent("Subject Verb Agreement","Example:Neither Jenny nor the others are available.");
					db.insertContent("Subject Verb Agreement","Rule 6");
					db.insertContent("Subject Verb Agreement","As a general rule, use a plural verb with two or more subjects when they are connected byand.");
					db.insertContent("Subject Verb Agreement","Example:A car and a bike are my means of transportation.");
					db.insertContent("Subject Verb Agreement","Rule 7");
					db.insertContent("Subject Verb Agreement","Sometimes the subject is separated from the verb by words such as along with, as well as, besides, or not. Ignore these expressions when determining whether to use a singular or plural verb.");
					db.insertContent("Subject Verb Agreement","Examples:The politician, along with the newsmen, is expected shortly.");
					db.insertContent("Subject Verb Agreement","Rule 8");
					db.insertContent("Subject Verb Agreement","The pronouns each, everyone, every one, everybody, anyone, anybody, someone, andsomebody are singular and require singular verbs. Do not be misled by what follows of.");
					db.insertContent("Subject Verb Agreement","Examples:Each of the girls sings well.");
					db.insertContent("Subject Verb Agreement","Rule 9");
					db.insertContent("Subject Verb Agreement","With words that indicate portions—percent, fraction, part, majority, some, all, none, remainder, and so forth —look at the noun in your of phrase (object of the preposition) to determine whether to use a singular or plural verb. If the object of the preposition is singular, use a singular verb. If the object of the preposition is plural, use a plural verb.");
					db.insertContent("Subject Verb Agreement","Examples:Fifty percent of the pie has disappeared.");
					db.insertContent("Subject Verb Agreement","Rule 10");
					db.insertContent("Subject Verb Agreement","The expression the number is followed by a singular verb while the expression a number is followed by a plural verb.");
					db.insertContent("Subject Verb Agreement","Examples:The number of people we need to hire is thirteen.");
					
					if(result>0)
					{
						Toast.makeText(VerbalContentActivity.this,"records inserted", 5000).show();
					}
					} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
					}
			}
			
			else
			{
				try {
					
					
					ArrayList<String> list=db.getContent("Subject Verb Agreement");
					ArrayAdapter<String> adapter=new ArrayAdapter<String>(VerbalContentActivity.this, android.R.layout.simple_list_item_1, list);
					contentLV.setAdapter(adapter);
					} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
					}
				
			}
			
			
			
			
		}
		else if(verbal.topic.equals("Parts Of Speech"))
		{
			Toast.makeText(VerbalContentActivity.this,"inside Parts Of Speech ", 5000).show();
			int i=db.getContentCoubt("Parts Of Speech");
			if(i<=0)
			{
				try {
					
					
					PlacementsGuideActivity.contentTopic=new ArrayList<String>();
					PlacementsGuideActivity.contentList=new ArrayList<String>();
					
					String a=DatabaseUtils.sqlEscapeString( "A list of parts of speech");
					long result=db.insertContent("Parts Of Speech",a);
					db.insertContent("Parts Of Speech","1. Verb");
			         a=DatabaseUtils.sqlEscapeString("A verb is used to show an action or a state of being");		
					db.insertContent("Parts Of Speech",a);
					db.insertContent("Parts Of Speech","go, write, exist, be");
					db.insertContent("Parts Of Speech","2. Noun");
					db.insertContent("Parts Of Speech","A noun is a word used to refer to people, animals, objects, substances, states, events, ideas and feelings. A noun functions as a subject or object of a verb and can be modified by an adjective.");
					db.insertContent("Parts Of Speech","John, lion, table, freedom, love ...");
					db.insertContent("Parts Of Speech","3. Adjective");
					db.insertContent("Parts Of Speech","Adjectives are used to describe or specify a noun or pronoun");
					db.insertContent("Parts Of Speech","good, beautiful, nice, my ...");
					db.insertContent("Parts Of Speech","4. Adverb");
					db.insertContent("Parts Of Speech","An adverb is used to modify a verb, adjective and other adverbs.");
					db.insertContent("Parts Of Speech","completely, never, there ...");
					db.insertContent("Parts Of Speech","5. Pronoun");
					db.insertContent("Parts Of Speech","A pronoun is used in the place of a noun or phrase.");
					db.insertContent("Parts Of Speech","I, you, he, she, it ...");
					db.insertContent("Parts Of Speech","6. Preposition");
					db.insertContent("Parts Of Speech","Prepositions are used before nouns to form a phrase that shows where, when, how and why");
					db.insertContent("Parts Of Speech","in, above, to, for, at ...");
					db.insertContent("Parts Of Speech","7. Conjunction");
					db.insertContent("Parts Of Speech","Conjunctions join clauses or sentences or words");
					db.insertContent("Parts Of Speech","and, but, when ...");
					db.insertContent("Parts Of Speech","8. Interjection");
					db.insertContent("Parts Of Speech","Interjections are used to show surprise or emotion");
					db.insertContent("Parts Of Speech","oh!, Good Lord");
					db.insertContent("Parts Of Speech","Examples of parts of speech");
					db.insertContent("Parts Of Speech","1.My (adjective) friend (noun) speaks (verb) English (noun) fluently (adverb).");
					db.insertContent("Parts Of Speech","2.•	Oh! (interjection) I ( pronoun) went (verb) to (preposition) school (noun) and (conjunction) I ( pronoun) met (verb) Fred (noun).");
					
                       
					if(result>0)
					{
						Toast.makeText(VerbalContentActivity.this,"records inserted", 5000).show();
					}
					} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
					}
			}
			
			else
			{
				try {
					
					
					ArrayList<String> list=db.getContent("Parts Of Speech");
					ArrayAdapter<String> adapter=new ArrayAdapter<String>(VerbalContentActivity.this, android.R.layout.simple_list_item_1, list);
					contentLV.setAdapter(adapter);
					} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
					}
				
			}
			
			
			
			
		}
				}
				
}
			