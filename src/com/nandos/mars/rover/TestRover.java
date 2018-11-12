package com.nandos.mars.rover;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class TestRover {
	
	private int xCoordinate;
	private int yCoordinate;
	private char facing;
	private String expectedResult;
	public Rover rover;
	Plateau plateau;
	
	@Before
	public void setUp() {
		plateau = new Plateau(new Position(0,0),new Position(5,5));
	}
	
	@Test
	public void testPositionIsSet() {
		rover = new Rover(plateau, new Position(1,2),'N');
		assertEquals(rover.getPosition(), "1 2 N");
		
	}

	@Test(expected = IllegalArgumentException.class)
	public void testIllegalArgumentExceptionIsThrownWhenInvaliPositionIsEntered() {
		rover = new Rover(plateau, new Position(7,6),'N');
	}

public TestRover(int xCoordinate, int yCoordinate,
			char facing, String expectedResult) {
		this.xCoordinate = xCoordinate;
		this.yCoordinate = yCoordinate;
		this.facing = facing;
		this.expectedResult = expectedResult;
	}
	

		@Test
		public void testRoverTurnLeftWhenFacingNorthToFaceWest() {
			rover = new Rover(plateau, new Position(1,2),'N');
			rover.turnLeft();
			assertEquals(rover.getPosition(), "1 2 W");			
			
		}

		@Test
		public void testRoverTurnLeftWhenFacingEastToFaceNorth() {
			rover = new Rover(plateau, new Position(1,2),'E');
			rover.turnLeft();
			assertEquals(rover.getPosition(), "1 2 N");			
			
		}

		@Test
		public void testRoverTurnLeftWhenFacingSouthToFaceEast() {
			rover = new Rover(plateau, new Position(1,2),'S');
			rover.turnLeft();
			assertEquals(rover.getPosition(), "1 2 E");			
			
		}

		@Test
		public void testRoverTurnLeftWhenFacingWestToFaceSouth() {
			rover = new Rover(plateau, new Position(1,2),'W');
			rover.turnLeft();
			assertEquals(rover.getPosition(), "1 2 S");			
			
		}

		   @SuppressWarnings("rawtypes")
			@Parameterized.Parameters
			   public static Collection turnRight() {
			      return Arrays.asList(new Object[][] {
					{1, 2,'N', "1 2 E"},
					{1, 2,'E', "1 2 S"},
					{1, 2,'S', "1 2 W"},
					{1, 2,'W', "1 2 N"}
			      });
			   }

		@Test
		public void testRoverTurnsRight() {
			rover = new Rover(plateau, new Position(xCoordinate, yCoordinate), facing);
			rover.turnRight();
			assertEquals(rover.getPosition(), expectedResult);
			
		}

		@Test
		public void testDirectionIsLeftWhenLisEntered() {
			rover = new Rover(plateau, new Position(1,2),'S');
			rover.moveRoverCommands('L');
			assertEquals(rover.getPosition(), "1 2 E");
			
		}

		@Test
		public void testDirectionIsRightWhenRisEntered() {
			rover = new Rover(plateau, new Position(1,2),'S');
			rover.moveRoverCommands('R');
			assertEquals(rover.getPosition(), "1 2 W");
			
		}
				
		@Test
		public void testRoverMovesNorth() {
			rover = new Rover(plateau, new Position(1,2),'N');
			rover.move();
			assertEquals(rover.getPosition(), "1 3 N");	
		}
		
		@Test
		public void testRoverMovesEast() {
			rover = new Rover(plateau, new Position(1,2),'E');
			rover.move();
			assertEquals(rover.getPosition(), "2 2 E");
			
		}

		@Test
		public void testRoverMovesSouth() {
			rover = new Rover(plateau, new Position(1,2),'S');
			rover.move();
			assertEquals(rover.getPosition(), "1 1 S");
			
		}

		@Test
		public void testRoverMovesWest() {
			rover = new Rover(plateau, new Position(1,2),'W');
			rover.move();
			assertEquals(rover.getPosition(), "0 2 W");
			
		}

	@Test
		public void testRoverMovesForwardWhenMisEntered() {
			rover = new Rover(plateau, new Position(1,2),'N');
			rover.moveRoverCommands('M');
			assertEquals(rover.getPosition(), "1 3 N");
			
		}

		@Test(expected = IllegalArgumentException.class)
		public void testIllegalArgumentExceptionIsThrownWhenInvalidDirectionIsEntered() {
			rover = new Rover(plateau, new Position(1,2),'N');
			rover.moveRoverCommands('W');
		}

		@Test
		public void testProcessRoverMoveCommandsToFinishAt13N() {
			rover = new Rover(plateau, new Position(1,2),'N');
			rover.moveRover("LMLMLMLMM");
			assertEquals(rover.getPosition(), "1 3 N");
		}

		@Test
		public void testProcessRoverMoveCommandsToFinishAt51E() {
			rover = new Rover(plateau, new Position(3,3),'E');
			rover.moveRover("MMRMMRMRRM");
			assertEquals(rover.getPosition(), "5 1 E");
		}
}
