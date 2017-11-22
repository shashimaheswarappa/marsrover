package com.marsrover;

import org.junit.Assert;
import org.junit.Test;

import com.marsrover.Direction;

public class DirectionTest {

    @Test
    public void leftTurnFromN() {
        Direction north = Direction.N;
        Direction west = north.left();
        Assert.assertEquals(Direction.W, west);
    }

    @Test
    public void rightTurnFromN() {
        Direction north = Direction.N;
        Direction east = north.right();
        Assert.assertEquals(Direction.E, east);
    }

    @Test
    public void leftTurnFromS() {
        Direction south = Direction.S;
        Direction east = south.left();
        Assert.assertEquals(Direction.E, east);
    }

    @Test
    public void rightTurnFromS() {
        Direction south = Direction.S;
        Direction west = south.right();
        Assert.assertEquals(Direction.W, west);
    }
}
