package com.example.demonabu;

import java.security.KeyStore.PasswordProtection;

import android.app.Activity;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.ToggleButton;

public class TextPlay extends Activity{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.text);
		
		final EditText et = (EditText) findViewById(R.id.etCommand);
		final ToggleButton tg = (ToggleButton) findViewById(R.id.tbToggle);
		et.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);
		tg.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				if (tg.isChecked())
				{ et.setInputType(InputType.TYPE_CLASS_TEXT | InputType.TYPE_TEXT_VARIATION_PASSWORD);}
				else
				{ et.setInputType(InputType.TYPE_CLASS_TEXT);}
			}
		});
	}

}
