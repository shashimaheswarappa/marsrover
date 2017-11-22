package com.marsrover;

import org.junit.Test;

import junit.framework.Assert;

public class MarsRoverTest {

    @Test
    public void testRotateLeft() {
        Plateau plateau = new Plateau(5,5);
        Coordinates currentPos = new Coordinates(1,2);
        MarsRover marsRover = new MarsRover(plateau, Direction.N, currentPos);
        marsRover.turnLeft();
        Assert.assertEquals("1 2 W", marsRover.currentLocation());
    }

    @Test
    public void testRotateRight() {
        Plateau plateau = new Plateau(5,5);
        Coordinates currentPos = new Coordinates(1,2);
        MarsRover marsRover = new MarsRover(plateau, Direction.N, currentPos);
        marsRover.turnRight();
        Assert.assertEquals("1 2 E", marsRover.currentLocation());
    }

    @Test
    public void testMove() {
        Plateau plateau = new Plateau(5,5);
        Coordinates currentPos = new Coordinates(1,2);
        MarsRover marsRover = new MarsRover(plateau, Direction.N, currentPos);
        marsRover.move();
        Assert.assertEquals("1 3 N", marsRover.currentLocation());
    }

    @Test
    public void testRunTurnRight() {
        Plateau plateau = new Plateau(5,5);
        Coordinates currentPos = new Coordinates(1,2);
        MarsRover marsRover = new MarsRover(plateau, Direction.N, currentPos);
        marsRover.run("R");
        Assert.assertEquals("1 2 E", marsRover.currentLocation());
    }

    @Test
    public void testRunTurnLeft() {
        Plateau plateau = new Plateau(5,5);
        Coordinates currentPos = new Coordinates(1,2);
        MarsRover marsRover = new MarsRover(plateau, Direction.N, currentPos);
        marsRover.run("L");
        Assert.assertEquals("1 2 W", marsRover.currentLocation());
    }

    @Test
    public void testRunMove() {
        Plateau plateau = new Plateau(5,5);
        Coordinates currentPos = new Coordinates(1,2);
        MarsRover marsRover = new MarsRover(plateau, Direction.N, currentPos);
        marsRover.run("M");
        Assert.assertEquals("1 3 N", marsRover.currentLocation());
    }

    @Test
    public void testRunCommands() {
        Plateau plateau = new Plateau(5,5);
        Coordinates currentPos = new Coordinates(3,3);
        MarsRover marsRover = new MarsRover(plateau, Direction.E, currentPos);
        marsRover.run("MMRMMRMRRM");
        Assert.assertEquals("5 1 E", marsRover.currentLocation());
    }
}
