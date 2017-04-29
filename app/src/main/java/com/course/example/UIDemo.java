/*
 * Type in user name. If correct name is entered, the View is
 * changed.
 */

package com.course.example;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.Button;
import android.widget.Toast;
import android.widget.ImageButton;

public class UIDemo extends Activity {
	private Button btnLogin;
	private EditText txtUserName;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main);

		txtUserName = (EditText) findViewById(R.id.txtUserName);
		txtUserName.setHint("First  name + Last Name");

		btnLogin = (Button) findViewById(R.id.btnLogin);
		btnLogin.setOnClickListener(new OnClickListener() {

			public void onClick(View v1) {
				String strUserName = txtUserName.getText().toString();
				if (strUserName.equals("Harry Bentley")) {
					showScreen2();
				}
				else {
					Toast.makeText(UIDemo.this, 
					  "Invalid User", Toast.LENGTH_LONG).show();
				}
				
			}
		});
	}
	
	//display new layout file
	private void showScreen2() {
		setContentView(R.layout.screen2);
		EditText txtData2 = (EditText) findViewById(R.id.txtData2);
		txtData2.setText("Yes - " + txtUserName.getText().toString());

		ImageButton btnWork2 = (ImageButton) findViewById(R.id.btnWork2);
		btnWork2.setOnClickListener(new OnClickListener() {

			public void onClick(View v) {
				Toast.makeText(getApplicationContext(), "Bye",
						Toast.LENGTH_SHORT).show();
				finish();
			}
		});
	}
}