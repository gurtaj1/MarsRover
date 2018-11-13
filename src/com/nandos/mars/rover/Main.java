package com.nandos.mars.rover;

public class Main {

	public static void main(String[] args) {
		Plateau plateau = new Plateau(new Position(0,0),new Position(5,5));
		Rover rover = new Rover(plateau, new Position(1,2),'N');
		rover.moveRover("LMLMLMLMM");
		System.out.println(rover.getPosition());
		
		rover = new Rover(plateau, new Position(3,3),'E');
		rover.moveRover("MMRMMRMRRM");
		System.out.println(rover.getPosition());

		rover = new Rover(plateau, new Position(5,0),'W');
		rover.moveRover("MMMMMRRMMLMRMLMRMLLMMRMMLMMLMRRMMRMMMMMRMRMM");
		System.out.println(rover.getPosition());
	}

}
