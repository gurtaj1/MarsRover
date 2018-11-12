package com.nandos.mars.rover;

public class Position {

	private int xCoordinate;
	private int yCoordinate;
	
	public Position(int xCoordinate, int yCoordinate) {
		this.xCoordinate = xCoordinate;
		this.yCoordinate = yCoordinate;
	}
	
	public int getxCoordinate() {return xCoordinate;}
	public void setxCoordinate(int xCoordinate) {this.xCoordinate = xCoordinate;}
	public int getyCoordinate() {return yCoordinate;}
	public void setyCoordinate(int yCoordinate) {this.yCoordinate = yCoordinate;}
	
	public void incrementXPosition() {
		xCoordinate ++;
	}

	public void incrementYPosition() {
		yCoordinate ++;
	}

	public void decrementtXPosition() {
		xCoordinate --;
	}

	public void decrementYPosition() {
		yCoordinate --;
	}
}
