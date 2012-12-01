package com.awesome.tictactoe;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class TicTacToeActivity extends Activity implements OnClickListener {
	
	GameBlock[][] dataSets;
	boolean XPlayerFlag = true;
	TicTacToeData mData;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tictactoe);
		
		mData = new TicTacToeData();
		
		Button[] buttonSet = new Button[9];
		dataSets = new GameBlock[3][3];
		int dataCount = 0;
		
		
		for(int x = 1; x <= 3; x++) {
			for(int y = 1; y <= 3; y++) {
				dataSets[x][y] = GameBlock.createBlock(x, y);
				buttonSet[dataCount] = new Button(this);
				buttonSet[dataCount].setId(x + 10*y); //Sets an id in the form xy
				buttonSet[dataCount].setOnClickListener(this);

				dataCount++;
			}
		}
	}
	
	public void onClick(View v) {
		int buttonX = v.getId() / 10;
		int buttonY = v.getId() % 10;
		
		boolean gameOver = false;
		GameBlock currBlock = dataSets[buttonX][buttonY];
		
		//Update game state
		if(currBlock.isAvailable()) {
			currBlock.setActivated(XPlayerFlag);
			gameOver = mData.add(buttonX, buttonY, XPlayerFlag);
			XPlayerFlag = !XPlayerFlag;
		} else {
			Toast.makeText(this, "Place already taken!", Toast.LENGTH_LONG).show();
		}
		//Check if game is over
		if(gameOver) {
			Toast.makeText(this, "Yaay... Someone won...>.>", Toast.LENGTH_LONG).show();
		}
	}

	

}
