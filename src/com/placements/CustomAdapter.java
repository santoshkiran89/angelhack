package com.placements;

import java.util.ArrayList;
import java.util.HashMap;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.BaseAdapter;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class CustomAdapter extends BaseAdapter{

	Context c;
	ArrayList<HashMap<String, String>> list;
	private static LayoutInflater inflater=null;
	public CustomAdapter(Context c,ArrayList<HashMap<String, String>> list) {
		// TODO Auto-generated constructor stub
		this.c=c;
		this.list=list;
		inflater=(LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
	}
	
	public int getCount() {
		// TODO Auto-generated method stub
		return list.size();
	}

	 
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return list.get(arg0);
	}

	 
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return arg0;
	}

	 
	public View getView(final int arg0, View arg1, ViewGroup arg2) {
		// TODO Auto-generated method stub
		View vi=arg1;
		if(arg1==null)
		vi=inflater.inflate(R.layout.que_adapter, null);
		
		
		TextView que=(TextView) vi.findViewById(R.id.textView1);
		RadioButton op1=(RadioButton) vi.findViewById(R.id.radio0);
		RadioButton op2=(RadioButton) vi.findViewById(R.id.radio1);
		RadioButton op3=(RadioButton) vi.findViewById(R.id.radio2);
		RadioButton op4=(RadioButton) vi.findViewById(R.id.radio3);
		
		que.setText(list.get(arg0).get("Que"));
		
		op1.setText(list.get(arg0).get("op1"));
		op2.setText(list.get(arg0).get("op2"));
		op3.setText(list.get(arg0).get("op3"));
		op4.setText(list.get(arg0).get("op4"));
		
		
		
		
		op1.setOnClickListener(new OnClickListener() {
			
			 
			public void onClick(View v) {
				// TODO Auto-generated method stub
				//Toast.makeText(c,"option 1, row:"+arg0, 5000).show();
				AptitudeTestActivity.answers[arg0]=list.get(arg0).get("op1");
			}
		});
			
op2.setOnClickListener(new OnClickListener() {
			
			 
			public void onClick(View v) {
				// TODO Auto-generated method stub
				//Toast.makeText(c,"option 2, row:"+arg0, 5000).show();
				AptitudeTestActivity.answers[arg0]=list.get(arg0).get("op2");
			}
		});
op3.setOnClickListener(new OnClickListener() {
	
	 
	public void onClick(View v) {
		// TODO Auto-generated method stub
		//Toast.makeText(c,"option 3, row:"+arg0, 5000).show();
		AptitudeTestActivity.answers[arg0]=list.get(arg0).get("op3");
		
	}
});
op4.setOnClickListener(new OnClickListener() {
	
	 
	public void onClick(View v) {
		// TODO Auto-generated method stub
		//Toast.makeText(c,"option 4, row:"+arg0, 5000).show();
		AptitudeTestActivity.answers[arg0]=list.get(arg0).get("op4");
	}
});
		
		return vi;
	}

}
