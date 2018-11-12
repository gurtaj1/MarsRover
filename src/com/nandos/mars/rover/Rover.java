package com.nandos.mars.rover;

public class Rover {
	
	private Position position;
	private Plateau plateau;
	private char facing;

	public char getFacing() {return facing;}
	public void setFacing(char facing) {this.facing = Character.toUpperCase(facing);}
	
	public Rover(Plateau plateau, Position position, char facing) {
		boolean isValidPosition = plateau.isPositionValid(position);
		this.plateau = plateau;
		isPositionValid(position, isValidPosition);
		this.facing = Character.toUpperCase(facing);
		
	}
	private void isPositionValid(Position position, boolean isValidPosition) {
		if (isValidPosition) {
			this.position = position;
		} else {
			throw new IllegalArgumentException(
					"Trying to set an Invalid Position, "
					+ "which is almost cheeky enough for a cheeky Nando's");
		}
	}
	
	
	public String getPosition() {
		return position.getxCoordinate() + " " + position.getyCoordinate() + " " + facing;
	}


	public void moveRover(String commands) {
		for (int i = 0; i < commands.length(); i++) {
			moveRoverCommands(commands.charAt(i));
		}
		
	}

	public void turnLeft() {
		switch (facing) {
		case 'N':
			setFacing('W');
			break;
		case 'E':
			setFacing('N');
			break;
		case 'S':
			setFacing('E');
			break;
		case 'W':
			setFacing('S');
			break;
		default:
			setFacing('N');
			System.out.println("The Direction the Rover is Facing now is " + facing);
		}

	}

	public void turnRight() {
		switch (facing) {
		case 'N':
			setFacing('E');
			break;
		case 'E':
			setFacing('S');
			break;
		case 'S':
			setFacing('W');
			break;
		case 'W':
			setFacing('N');
			break;
		default:
			setFacing('N');
		}

	}

	public void moveRoverCommands(char direction) {
		if (direction == 'L') {
			turnLeft();
		} else if (direction == 'R') {
			turnRight();
		} else if (direction == 'M') {
			move();
		} else {
			throw new IllegalArgumentException(
					"Invalid direction enetered," + " which is cheeky but not cheeky enough for a cheeky Nando's");
		}

	}

	public void move() {
		if (facing == 'N') {
			position.incrementYPosition();
		} else if (facing == 'E') {
			position.incrementXPosition();
		} else if (facing == 'S') {
			position.decrementYPosition();
		} else if (facing == 'W') {
			position.decrementtXPosition();
		}

	}

}
