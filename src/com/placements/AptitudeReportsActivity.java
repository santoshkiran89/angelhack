package com.placements;

import java.util.ArrayList;
import java.util.HashMap;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;

public class AptitudeReportsActivity extends Activity {

	ArrayList<HashMap<String, String>> listx;
	ListView list;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.report);
		try {
			
		
		list=(ListView) findViewById(R.id.listView1);
		MySqliteDatabase db=new MySqliteDatabase(AptitudeReportsActivity.this);
	    listx=db.getReport(Aptitude.topic);
		Toast.makeText(AptitudeReportsActivity.this, listx.size()+"", 5000).show();
		System.out.println(list);
		if(listx.size()>0)
		{
			ReportCustomAdapter adapter=new ReportCustomAdapter(AptitudeReportsActivity.this, listx);
			this.list.setAdapter(adapter);
		}
		
		
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		list.setOnItemClickListener(new OnItemClickListener() {

			public void onItemClick(AdapterView<?> arg0, View arg1, int position,
					long arg3) {
				// TODO Auto-generated method stub
				String id=listx.get(position).get("id");
				System.out.println(id);
				String marked_ques=listx.get(position).get("que");
				System.out.println(marked_ques);
				String marked_ans=listx.get(position).get("option");
				System.out.println(marked_ans);
				String correct_ans=listx.get(position).get("answer");
				System.out.println(correct_ans);
				String status_rep=listx.get(position).get("status");
				System.out.println(status_rep);
				
			}
		});
	}
}
