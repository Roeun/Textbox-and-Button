package com.riseup.textboxbutton;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

	Button btnClick;
	EditText txtWrite;
	TextView lblGetText;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        
        btnClick = (Button) this.findViewById(R.id.btnClickme);
        txtWrite = (EditText) this.findViewById(R.id.txtWrite);
        lblGetText = (TextView) this.findViewById(R.id.lblGetText);
        
        btnClick.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				lblGetText.setText("You have typed: " + txtWrite.getText());
			}
		});
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
}
