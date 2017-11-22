package com.marsrover;

import java.util.List;

import com.marsrover.commands.Command;
import com.marsrover.commands.CommandParser;

public class MarsRover {

    private Coordinates currentCoordinates;
    private Direction currentDirection;
    private Plateau plateau;


    public MarsRover(final Plateau plateau, final Direction direction, final Coordinates coordinates) {
        this.plateau = plateau;
        this.currentDirection = direction;
        this.currentCoordinates = coordinates;
    }

    public void run(final String commandString) {
        List<Command> roverCommands = new CommandParser(commandString).toCommands();
        for (Command command : roverCommands) {
            command.execute(this);
        }
    }

    public String currentLocation() {
        return currentCoordinates.toString() + " " + currentDirection.toString();
    }

    public void turnRight() {
        this.currentDirection = this.currentDirection.right();
    }

    public void turnLeft() {
        this.currentDirection = this.currentDirection.left();
    }

    public void move() {
        Coordinates positionAfterMove = currentCoordinates.getNewCoordinatesAfterMove(currentDirection.getX(), currentDirection.getY());

        if(plateau.isCoOrdinatesInsideBoundary(positionAfterMove)) {
        	// Check if rover is moving outside the grid
            currentCoordinates = currentCoordinates.getNewCoordinatesAfterMove(currentDirection.getX(), currentDirection.getY());
        }
    }
}
