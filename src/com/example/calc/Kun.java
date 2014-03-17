package com.example.calc;

import java.math.BigDecimal;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Kun extends Activity {

	
	
	Button submit;
	TextView display;
	EditText h1,h2,w;
	
	BigDecimal feet,inches,kg,ht,bmi;
	int i=12;
	double d=0.0254;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        h1=(EditText)findViewById(R.id.input_feet);
        h2=(EditText)findViewById(R.id.input_inches);
        w=(EditText)findViewById(R.id.input_kg);
        
        display=(TextView)findViewById(R.id.out_bmi);
        
        feet=new BigDecimal(h1.getText().toString());
        inches=new BigDecimal(h2.getText().toString());
        kg=new BigDecimal(w.getText().toString());
       
    	
        submit.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				
				
				
				ht=(inches.add(feet.multiply(new BigDecimal(i))));	
				
				bmi=kg.divide(ht.multiply(ht));
				display.setText("Your total is"+bmi);
			
			}
		});
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
