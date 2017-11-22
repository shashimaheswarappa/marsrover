package com.marsrover.commands;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CommandParser {
    private static Map<String, Command> stringToCommandMap = null;
    private String commands;
    
    static {
    	    stringToCommandMap = new HashMap<String, Command>();
    	    stringToCommandMap.put("L", new TurnLeft());
    	    stringToCommandMap.put("R", new TurnRight());
    	    stringToCommandMap.put("M", new Move());
	}

    public CommandParser(final String commands) {
        this.commands = commands;
    }

    public List<Command> toCommands() {
        if(commands == null || commands.trim().length() == 0) 
        	return new ArrayList<Command>();
        
        return buildCommandsList(commands);
    }

    private List<Command> buildCommandsList(final String commandStr) {
        List<Command> commands = new ArrayList<Command>();

        for(String commandCharacter : Arrays.copyOfRange(commandStr.split(""), 0, commandStr.length() + 1)) {
            if (commandCharacter == null) break;
            Command mappedCommand = stringToCommandMap.get(commandCharacter.toUpperCase());
            commands.add(mappedCommand);
        }

        return commands;
    }

}
