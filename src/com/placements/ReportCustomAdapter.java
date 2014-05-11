package com.placements;

import java.util.ArrayList;
import java.util.HashMap;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ReportCustomAdapter extends BaseAdapter{
	
	Context c;
	ArrayList<HashMap<String, String>> list;
	private static LayoutInflater inflater=null;
	public ReportCustomAdapter(Context c,ArrayList<HashMap<String, String>> list) {
		// TODO Auto-generated constructor stub
		this.c=c;
		this.list=list;
		inflater=(LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	}
	 
	public int getCount() {
		// TODO Auto-generated method stub
		return list.size();
	}

	 
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return list.get(position);
	}

	 
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	 
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		View vi=convertView;
		if(convertView==null)
		vi=inflater.inflate(R.layout.report_adapter, null);
		
		
		TextView topic=(TextView) vi.findViewById(R.id.topictextView1);
		TextView date=(TextView) vi.findViewById(R.id.datetextView1);
		TextView total=(TextView) vi.findViewById(R.id.totaltextView1);
		TextView acheived=(TextView) vi.findViewById(R.id.acheivedtextView1);
	
		topic.setText(list.get(position).get("topic"));
		date.setText(list.get(position).get("date"));
		total.setText(list.get(position).get("total"));
		acheived.setText(list.get(position).get("acheived"));
		
		return vi;
	}

}
