package com.marsrover.commands;

import com.marsrover.MarsRover;

public class Move implements Command {

    public void execute(final MarsRover rover) {
        rover.move();
    }

}
