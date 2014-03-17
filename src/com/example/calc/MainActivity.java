package com.example.calc;



import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends Activity{
	
	int counter;
	Button but;
	TextView display,display2;
	
	
	EditText h1,h2,w;
	
	double feet,inches,kg,ht,bmi,wt;
	int i=12;
	double d=0.0254;
	RadioButton R1;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		counter=0;
		h1=(EditText)findViewById(R.id.input_feet);
	    h2=(EditText)findViewById(R.id.input_inches);
	    w=(EditText)findViewById(R.id.input_kg);
		but=(Button) findViewById(R.id.sub);
		
		R1=(RadioButton)findViewById(R.id.radio1);
		
			
		
		but.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				feet=Integer.parseInt((h1.getText().toString()));
				inches=Integer.parseInt((h2.getText().toString()));
				kg=Integer.parseInt((w.getText().toString()));
				setContentView(R.layout.bmi);
				if(R1.isChecked())
					wt=kg/2.2046;
				else
					wt=kg;
				
				ht=((feet*i + inches)*d);
				
				bmi=wt/(ht*ht);
				bmi=(float)bmi;
				display=(TextView) findViewById(R.id.out_bmi);
				
				display.setText("Your BMI is : "+(float)bmi);
				display2=(TextView) findViewById(R.id.result);
				
				double normal_wt1=18.5*ht*ht-wt;
				double normal_wt2=wt-25*ht*ht;
				if(bmi<18.5)
					display2.setText("You are underweight.But don't worry you need to gain "+ (int)normal_wt1 +"kg to come into the normal weight category.");
				else if(bmi<25)
					display2.setText("You have normal weight.");
				else
					display2.setText("You are overweight.But don't worry you need to lose only"+ (int)normal_wt2 +"to come into the normal weight category.");
			}
		});
	}
	
	
}