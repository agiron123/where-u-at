package gitmad.app.WhereUAt;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;

public class LocationListActivity extends Activity implements OnClickListener {

	protected void onCreate(Bundle savedInstanceState) 
	{
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.locationlist);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		this.finish();		
	}

}
