package com.marsrover.commands;

import com.marsrover.MarsRover;

public class TurnRight implements Command {

    public void execute(final MarsRover rover) {
        rover.turnRight();
    }

}
