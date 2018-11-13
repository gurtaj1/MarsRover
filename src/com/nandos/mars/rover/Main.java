package com.nandos.mars.rover;

public class Main {

	public static void main(String[] args) {
		Plateau plateau = new Plateau(new Position(0,0),new Position(5,5));
		Rover rover = new Rover(plateau, new Position(0,0),'N');
		rover.moveRover("MMMMMRMRMMMMMLMLMMMMMRMRMMMMMLMLMMMMMRMRMMMMM");
		System.out.println(rover.getPosition());
	}

}
