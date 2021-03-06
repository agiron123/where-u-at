package gitmad.app.WhereUAt;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity implements OnClickListener {
	
	public final static String EXTRA_MESSAGE = "gitmad.app.WhereUAt";
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
    	super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        View findMeButton = findViewById(R.id.find_me_button);
        findMeButton.setOnClickListener(this);
        
        final Button locationListbutton = (Button) findViewById(R.id.location_list_button);
        locationListbutton.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Perform action on click
        		Log.d("Demo", "Location list button pressed");		
            	Intent i = new Intent(MainActivity.this, ResultActivity.class); //private intent
            	MainActivity.this.startActivity(i);
            }
        });
    }
    
    @Override
	public void onClick(View v) {
		Intent i = new Intent(this, ResultActivity.class); //private intent
		EditText editText = (EditText)findViewById(R.id.editText1);
		String message = editText.getText().toString();
		i.putExtra(EXTRA_MESSAGE, message);
		startActivity(i);
		Log.d("Demo", "Find me button pressed");		
	}
}