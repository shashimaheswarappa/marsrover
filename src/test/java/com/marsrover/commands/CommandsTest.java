package com.marsrover.commands;

import java.util.List;

import org.junit.Test;

import com.marsrover.Coordinates;
import com.marsrover.Direction;
import com.marsrover.MarsRover;
import com.marsrover.Plateau;

import junit.framework.Assert;

public class CommandsTest {
	// Test cases for movements
    @Test
    public void testRotateLeft() {
        CommandParser parser = new CommandParser("L");
        List<Command> commands = parser.toCommands();
        Assert.assertTrue(commands.get(0) instanceof TurnLeft);
        Assert.assertEquals(1, commands.size());
    }

    @Test
    public void testRotateRight() {
        CommandParser parser = new CommandParser("R");
        List<Command> commands = parser.toCommands();
        Assert.assertTrue(commands.get(0) instanceof TurnRight);
    }

    @Test
    public void testMove() {
        CommandParser parser = new CommandParser("M");
        List<Command> commands = parser.toCommands();
        Assert.assertTrue(commands.get(0) instanceof Move);
    }

    @Test
    public void testMultipleCOmmands() {
        CommandParser parser = new CommandParser("MRL");
        List<Command> commands = parser.toCommands();
        Assert.assertTrue(commands.get(0) instanceof Move);
        Assert.assertTrue(commands.get(1) instanceof TurnRight);
        Assert.assertTrue(commands.get(2) instanceof TurnLeft);
    }
    
    // =========== Commands test cases
    @Test
    public void testMove1() {
        Move command = new Move();
        Plateau plateau = new Plateau(5,5);
        Coordinates startingPosition = new Coordinates(1,2);
        MarsRover rover = new MarsRover(plateau, Direction.N, startingPosition);
        command.execute(rover);
        Assert.assertEquals("1 3 N", rover.currentLocation());
    }
    
    @Test
    public void testMove2() {
        TurnLeft command = new TurnLeft();
        Plateau plateau = new Plateau(5,5);
        Coordinates startingPosition = new Coordinates(1,2);
        MarsRover rover = new MarsRover(plateau, Direction.N, startingPosition);
        command.execute(rover);
        Assert.assertEquals("1 2 W", rover.currentLocation());
    }
    
    @Test
    public void testMove3() {
        TurnRight command = new TurnRight();
        Plateau plateau = new Plateau(5,5);
        Coordinates startingPosition = new Coordinates(1,2);
        MarsRover rover = new MarsRover(plateau, Direction.N, startingPosition);
        command.execute(rover);
        Assert.assertEquals("1 2 E", rover.currentLocation());
    }
}
