package com.nandos.mars.rover;

public class Plateau {
	private Position minPosition;
	private Position maxPosition;
	
	public Position getMinPosition() {return minPosition;}
	public void setMinPosition(Position minPosition) {this.minPosition = minPosition;}
	public Position getMaxPosition() {return maxPosition;}
	public void setMaxPosition(Position maxPosition) {this.maxPosition = maxPosition;}

	
	public Plateau(Position minPosition, Position maxPosition) {
		this.minPosition = minPosition;
		this.maxPosition = maxPosition;
	}

	private boolean isXOnPlateau(int x)
	{ 
		return x >= minPosition.getxCoordinate() && x <= maxPosition.getxCoordinate(); 
	}
	private boolean isYOnPlateau(int y)  
	{
	   return y >= minPosition.getyCoordinate() && y <= maxPosition.getyCoordinate(); 
	}
	
	private boolean areCooridnatesOnPlateau(int x, int y) 
	{
	 return (isXOnPlateau(x) && isYOnPlateau(y)); 
	}

	public boolean isPositionValid(Position position)
	{
		if(!areCooridnatesOnPlateau(position.getxCoordinate(), position.getyCoordinate()))
		{
			return false;
		}
		return true;
	}

}
