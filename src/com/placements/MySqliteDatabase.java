package com.placements;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteDatabase.CursorFactory;


public class MySqliteDatabase extends SQLiteOpenHelper{

	static String DATABSE="placements";
	static int VERSION=1;
	
	String CONTENT_TABLE="content_table";
	String CONTENT_SNO="sno";
	String CONTENT_TOPIC="content_topic";
	String CONTENT_DESC="content_desc";
	
	
	String QUIZ_TABLE="quiz_table";
	String QUIZ_SNO="sno";
	String QUIZ_TOPIC="quiz_topic";
	String QUIZ_DESC="quiz_desc";
	String QUIZ_OP1="op1";
	String QUIZ_OP2="op2";
	String QUIZ_OP3="op3";
	String QUIZ_OP4="op4";
	String QUIZ_ANSWER="answer";
	
	
	
	String REPORT_TABLE="report_table";
	String REPORT_ID="report_id";
	String REPORT_DATE="report_date";
	String REPORT_TOPIC="report_topic";
	String REPORT_TOTAL_MARKS="report_total_marks";
	String REPORT_ACHEIVED="report_acheived";
	
	
	String REPORT_QUE="report_QUE";
	String REPORT_OPTION="report_option";
	String REPORT_ANSWER="report_answer";
	String REPORT_STATUS="report_status";
	String REPORT_QUE_ID="report_que_id";
	
	public MySqliteDatabase(Context context) {
		super(context, DATABSE, null, VERSION);
		// TODO Auto-generated constructor stub
		
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		// TODO Auto-generated method stub
		String CREATE_CONTENT="create table "+CONTENT_TABLE+ "("+CONTENT_SNO+ " text,"+CONTENT_TOPIC+" text,"+CONTENT_DESC+" text)";
		System.out.println(CREATE_CONTENT);
		db.execSQL(CREATE_CONTENT);
		
		String CREATE_QUIZ="create table "+QUIZ_TABLE+ "("+QUIZ_SNO+ " text,"+QUIZ_TOPIC+" text,"+QUIZ_DESC+" text,"+QUIZ_OP1+" text," +
				""+QUIZ_OP2+" text," +
						""+QUIZ_OP3+" text,"+QUIZ_OP4+" text,"+QUIZ_ANSWER+" text)";
		
		db.execSQL(CREATE_QUIZ);
		
		
		String CREATE_REPORT="create table "+REPORT_TABLE+ "("+REPORT_ID+ " text,"+REPORT_DATE+" text,"+REPORT_TOPIC+" text,"+REPORT_TOTAL_MARKS+" text," +
		""+REPORT_ACHEIVED+" text)";
		db.execSQL(CREATE_REPORT);
		
		String CREATE_QUE="create table "+REPORT_QUE+ "("+REPORT_ID+ " text,"+REPORT_OPTION+" text,"+REPORT_ANSWER+" text,"+REPORT_STATUS+" text,"+REPORT_QUE_ID+" text)";
		db.execSQL(CREATE_QUE);

	}
	
	
	public ArrayList<HashMap<String, String>> getReportAnswers(String id)
	{
		ArrayList<HashMap<String, String>> list=new ArrayList<HashMap<String, String>>();
		ArrayList<HashMap<String, String>> list1=new ArrayList<HashMap<String, String>>();
		
		SQLiteDatabase db=this.getReadableDatabase();
		try {
			Cursor c=db.rawQuery("select * FROM "+REPORT_QUE+" where "+REPORT_ID+"=?",new String[]{id});
			
			while (c.moveToNext()) {
				HashMap<String,String> hm=new HashMap<String, String>();
				hm.put("option", c.getString(c.getColumnIndex(REPORT_OPTION)));
				hm.put("answer", c.getString(c.getColumnIndex(REPORT_ANSWER)));
				hm.put("status", c.getString(c.getColumnIndex(REPORT_STATUS)));
				hm.put("que", c.getString(c.getColumnIndex(REPORT_QUE_ID)));
					
				list.add(hm);
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally{
			if(db!=null)
				db.close();
		}
		return list1;
	}

	
	public ArrayList<HashMap<String, String>> getReport(String topic)
	{
		ArrayList<HashMap<String, String>> list=new ArrayList<HashMap<String, String>>();
		//ArrayList<HashMap<String, String>> list1=new ArrayList<HashMap<String, String>>();
		
		SQLiteDatabase db=this.getReadableDatabase();
		try {
			Cursor c=db.rawQuery("select * FROM "+REPORT_TABLE+" where "+REPORT_TOPIC+"=?",new String[]{topic});
			
			while (c.moveToNext()) {
				HashMap<String,String> hm=new HashMap<String, String>();
				hm.put("id", c.getString(c.getColumnIndex(REPORT_ID)));
				hm.put("date", c.getString(c.getColumnIndex(REPORT_DATE)));
				hm.put("topic", c.getString(c.getColumnIndex(REPORT_TOPIC)));
				hm.put("total", c.getString(c.getColumnIndex(REPORT_TOTAL_MARKS)));
				hm.put("acheived", c.getString(c.getColumnIndex(REPORT_ACHEIVED)));
				
				list.add(hm);
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally{
			if(db!=null)
				db.close();
		}
		return list;
	}
	

	public long insertReport(String date,String topic,String total_marks,String acheived,ArrayList<String> option,String answer[],ArrayList<String> queList)
	{
		long i=0;
		try {
			SQLiteDatabase db=this.getReadableDatabase();
			int sno=0;
			Cursor c=db.rawQuery("select count(*) from "+REPORT_TABLE, null);
			while (c.moveToNext()) {
			sno=c.getInt(0);
			}
			db=this.getWritableDatabase();
			ContentValues values=new ContentValues();
			values.put(REPORT_ID, sno+1);
			values.put(REPORT_DATE, date);
			values.put(REPORT_TOPIC, topic);
			values.put(REPORT_TOTAL_MARKS, total_marks);
			values.put(REPORT_ACHEIVED, acheived);
			i=db.insert(REPORT_TABLE, null, values);
			if(i>0)
			{
				for(int j=0;j<option.size();j++)
				{
					 values=new ContentValues();
					values.put(REPORT_ID, sno+1);
					values.put(REPORT_OPTION, option.get(j));
					values.put(REPORT_ANSWER, answer[j]);
					values.put(REPORT_QUE_ID, queList.get(j));
					if(option.get(j).equals(answer[j]))
					{
						values.put(REPORT_STATUS, "correct");
					}
					else
					{
						values.put(REPORT_STATUS, "wrong");	
					}
					
					i=db.insert(REPORT_QUE, null, values);
				}
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		return i;
	}
	
	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
		
	}
	
	public long insertContent(String topic,String content)
	{
		long i=0;
		SQLiteDatabase db=this.getReadableDatabase();
		int sno=0;
		try {
			Cursor c=db.rawQuery("select count(*) from "+CONTENT_TABLE, null);
			while (c.moveToNext()) {
			sno=c.getInt(0);
			}
			
			db=this.getWritableDatabase();
			ContentValues values=new ContentValues();
			values.put(CONTENT_SNO, sno+1);
			values.put(CONTENT_TOPIC, topic);
			values.put(CONTENT_DESC, content);
			i=db.insert(CONTENT_TABLE, null, values);
		} catch (Exception e) {
			// TODO: handle exception
		e.printStackTrace();
		}
		finally
		{
			db.close();
		}
		return i;
		
	}
	
	
	public long insertQue(String sno,String topic,String que,String op1,String op2,String op3,String op4,String answer)
	{
		long i=0;
		SQLiteDatabase db=this.getReadableDatabase();
		int no=0;
		try {
			Cursor c=db.rawQuery("select count(*) from "+QUIZ_TABLE, null);
			while (c.moveToNext()) {
			no=c.getInt(0);
			}
			
			db=this.getWritableDatabase();
			ContentValues values=new ContentValues();
			values.put(QUIZ_SNO, no+1);
			values.put(QUIZ_TOPIC, topic);
			values.put(QUIZ_DESC, que);
			values.put(QUIZ_OP1, op1);
			values.put(QUIZ_OP2, op2);
			values.put(QUIZ_OP3, op3);
			values.put(QUIZ_OP4, op4);
			values.put(QUIZ_ANSWER, answer);
			i=db.insert(QUIZ_TABLE, null, values);
			if(c!=null)
			{
				c.close();
			}
		} catch (Exception e) {
			// TODO: handle exception
		e.printStackTrace();
		}
		finally
		{
			db.close();
		}
		return i;
		
	}
	
	
	public int getContentCoubt(String topic)
	{
		SQLiteDatabase db=this.getReadableDatabase();
		Cursor c = null;
		try {
			
			c=db.rawQuery("select count(*) from "+CONTENT_TABLE+" where "+CONTENT_TOPIC+"=?", new String[]{topic}); 
			if(c.moveToNext())
			{
				return c.getInt(0);
			}
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		finally 
		{
			if(c!=null)
			{
				c.close();
			}
			if(db!=null)
				db.close();
		}
		
		return 0;
	}
	
	public int getQuizCount(String topic)
	{
		SQLiteDatabase db=this.getReadableDatabase();
		int i=0;
		try {
			
			Cursor c=db.rawQuery("select count(*) from "+QUIZ_TABLE+" where "+QUIZ_TOPIC+"=?", new String[]{topic}); 
			if(c.moveToNext())
			{
				i=c.getInt(0);
			}
			if(c!=null)
			{
				c.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		finally
		{
			if(db!=null)
				db.close();
		}
		return i;
	}
	
	
	
	
	public ArrayList<String> getContent(String topic)
	{
		ArrayList<String> list=new ArrayList<String>();
		SQLiteDatabase db=this.getReadableDatabase();
		try {
			Cursor c=db.rawQuery("select "+CONTENT_DESC+" FROM "+CONTENT_TABLE+" where "+CONTENT_TOPIC+"=?", new String[]{topic});
			while (c.moveToNext()) {
				list.add(c.getString(0));
			}
			
			if(c!=null)
				c.close();
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally{
			if(db!=null)
				db.close();
		}
		return list;
	}

	public ArrayList<HashMap<String, String>> getQuestions(String topic)
	{
		ArrayList<HashMap<String, String>> list=new ArrayList<HashMap<String, String>>();
		ArrayList<HashMap<String, String>> list1=new ArrayList<HashMap<String, String>>();
		ArrayList<Integer> finalList=new ArrayList<Integer>();
		SQLiteDatabase db=this.getReadableDatabase();
		try {
			Cursor c=db.rawQuery("select * FROM "+QUIZ_TABLE+" where "+QUIZ_TOPIC+"=?", new String[]{topic});
			
			while (c.moveToNext()) {
				HashMap<String,String> hm=new HashMap<String, String>();
				hm.put("Que", c.getString(c.getColumnIndex(QUIZ_DESC)));
				hm.put("op1", c.getString(c.getColumnIndex(QUIZ_OP1)));
				hm.put("op2", c.getString(c.getColumnIndex(QUIZ_OP2)));
				hm.put("op3", c.getString(c.getColumnIndex(QUIZ_OP3)));
				hm.put("op4", c.getString(c.getColumnIndex(QUIZ_OP4)));
				hm.put("answer", c.getString(c.getColumnIndex(QUIZ_ANSWER)));
				
				list.add(hm);
			}
			
			for(int i=0;i<5;i++)
			{
				int j=randInt(0, list.size());
				if(finalList.contains(j))
				{
					boolean flag=true;
					while (flag) {
						j=randInt(0, list.size());
						if(finalList.contains(j))
						{
							flag=true;
						}
						else
						{
							flag=false;
							finalList.add(j);
						}
					}
					
				}
				else
				{
					finalList.add(j);
				}
				
			}
			System.out.println(finalList);
			
			for(int k=0;k<finalList.size();k++)
			{
				list1.add(list.get(finalList.get(k)));
				//System.out.println(list.get(finalList.get(k)));
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		finally{
			if(db!=null)
				db.close();
		}
		return list1;
	}

	
	
	public static int randInt(int min, int max) {

	    // Usually this can be a field rather than a method variable
	    Random rand = new Random();

	    // nextInt is normally exclusive of the top value,
	    // so add 1 to make it inclusive
	    int randomNum = rand.nextInt((max - min) + 1) + min;

	    return randomNum;
	}

}
