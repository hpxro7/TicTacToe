package com.awesome.tictactoe;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

public class ChooseUser extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_choose_user);
		Button topLeft = new Button(this);
		Button topCenter = new Button(this);
		Button topRight = new Button(this);
		Button middleLeft = new Button(this);
		Button middleCenter = new Button(this);
		Button middleRight = new Button(this);
		Button bottomLeft = new Button(this);
		Button bottomCenter = new Button(this);
		Button bottomRight = new Button(this);
	}
	
	


}
