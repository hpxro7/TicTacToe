package com.awesome.tictactoe;

public class GameBlock {
	private boolean isSet;
	private boolean isX;
	private int xCoord;
	private int yCoord;
	
	private GameBlock(int x, int y) {
		xCoord = x;
		yCoord = y;
	}
	
	public static GameBlock createBlock(int x, int y) {
		return new GameBlock(x, y);
	}
	
	public boolean isAvailable() {
		return isSet;
	}
	
	public void setActivated(boolean isXPlayer) {
		if(isXPlayer) {
			isX = true;
		}
		isSet = true;
	}
	
	public boolean isX() {
		return isX;
	}
	
	public boolean isO() {
		return !isX;
	}
}
