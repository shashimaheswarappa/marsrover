package com.marsrover;

public class Plateau {

    private Coordinates topRightCoordinates;
    private Coordinates bottomLeftCoordinates;

    public Plateau() {
       topRightCoordinates = new Coordinates(0, 0);
       bottomLeftCoordinates = new Coordinates(0, 0);
    }
    
    public Plateau(final int topRightXCoordinate, final int topRightYCoordinate) {
        topRightCoordinates = new Coordinates(0, 0);
        bottomLeftCoordinates = new Coordinates(0, 0);
        this.topRightCoordinates = this.topRightCoordinates.getNewCoordinatesAfterMove(topRightXCoordinate, topRightYCoordinate);
    }

    public boolean isCoOrdinatesInsideBoundary(final Coordinates coordinates) {
        return this.bottomLeftCoordinates.isCoOrdinatesOutsideBoundary(coordinates) && 
        	   this.topRightCoordinates.isCoOrdinatesInsideBoundary(coordinates);
    }

}
