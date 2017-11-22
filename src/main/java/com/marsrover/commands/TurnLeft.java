package com.marsrover.commands;

import com.marsrover.MarsRover;

public class TurnLeft implements Command {

    public void execute(final MarsRover rover) {
        rover.turnLeft();
    }

}
