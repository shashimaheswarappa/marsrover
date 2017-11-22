package com.marsrover;

import org.junit.Assert;
import org.junit.Test;

import com.marsrover.Coordinates;

public class CoordinatesTest {

    @Test
    public void incrementX() {
        Coordinates boundaryCoordinates = new Coordinates(2,3);
        boundaryCoordinates = boundaryCoordinates.getNewCoordinatesAfterMove(1, 0);
        Assert.assertEquals("3 3", boundaryCoordinates.toString());
    }

    @Test
    public void decrementX() {
        Coordinates boundaryCoordinates = new Coordinates(2,3);
        boundaryCoordinates = boundaryCoordinates.getNewCoordinatesAfterMove(-1, 0);
        Assert.assertEquals("1 3", boundaryCoordinates.toString());
    }

    @Test
    public void incrementY() {
        Coordinates boundaryCoordinates = new Coordinates(2,3);
        boundaryCoordinates = boundaryCoordinates.getNewCoordinatesAfterMove(0, 1);
        Assert.assertEquals("2 4", boundaryCoordinates.toString());
    }

    @Test
    public void decrementY() {
        Coordinates boundaryCoordinates = new Coordinates(2,3);
        boundaryCoordinates = boundaryCoordinates.getNewCoordinatesAfterMove(0, -1);
        Assert.assertEquals("2 2", boundaryCoordinates.toString());
    }

    @Test
    public void checkXisInBoundary() {
        Coordinates boundaryCoordinates = new Coordinates(5,5);
        Coordinates internalPoint = new Coordinates(4,5);
        Assert.assertTrue(boundaryCoordinates.isCoOrdinatesInsideBoundary(internalPoint));
    }


    @Test
    public void checkYisInBoundary() {
        Coordinates boundaryCoordinates = new Coordinates(5,5);
        Coordinates internalPoint = new Coordinates(5,4);
        Assert.assertTrue(boundaryCoordinates.isCoOrdinatesInsideBoundary(internalPoint));
    }


    @Test
    public void checkXisNotInBoundary() {
        Coordinates boundaryCoordinates = new Coordinates(5,5);
        Coordinates externalPoint = new Coordinates(8,5);
        Assert.assertTrue(boundaryCoordinates.isCoOrdinatesOutsideBoundary(externalPoint));
    }


    @Test
    public void checkYisNotInBoundary() {
        Coordinates boundaryCoordinates = new Coordinates(5,5);
        Coordinates externalPoint = new Coordinates(5,8);
        Assert.assertTrue(boundaryCoordinates.isCoOrdinatesOutsideBoundary(externalPoint));
    }
}
