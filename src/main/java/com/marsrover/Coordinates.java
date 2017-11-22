package com.marsrover;

public class Coordinates {

    private int x;
    private int y;

    public Coordinates(final int x, final int y) {
        this.x = x;
        this.y = y;
    }

    private boolean isXOutsideBoundary(final int x) {
        return x >= this.x;
    }

    private boolean isYOutsideBoundary(final int y) {
        return y >= this.y;
    }

    private boolean isYInsideBoundary(final int y) {
        return y <= this.y;
    }

    private boolean isXInsideBoundary(final int x) {
        return x <= this.x;
    }
    
    // Move to new cell in grid by (x,y) steps
    public Coordinates getNewCoordinatesAfterMove(final int xNumSteps, final int yNumSteps) {
        return new Coordinates(this.x + xNumSteps, this.y + yNumSteps);
    }
    
    // Check if the move is with in the grid
    public boolean isCoOrdinatesInsideBoundary(final Coordinates coordinates) {
        return isXInsideBoundary(coordinates.x) && isYInsideBoundary(coordinates.y);
    }

    // Check if the move is going outside the grid
    public boolean isCoOrdinatesOutsideBoundary(final Coordinates coordinates) {
        return isXOutsideBoundary(coordinates.x) && isYOutsideBoundary(coordinates.y);
    }

    @Override
    public String toString() {
        return (new StringBuilder().append(x).append(" ").append(y)).toString();        
    }
}
