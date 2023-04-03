package com.colgrolool.skidware.commands;

import meteordevelopment.meteorclient.systems.commands.Command;
import meteordevelopment.meteorclient.systems.commands.Commands;

public class SkidCommands {
    public static void register() {
        addCommands(
            new CommandExample()
        );
    }

    public static void addCommands(Command... command) {
        Commands commands = Commands.get();

        for (Command command1 : command) {
            commands.add(command1);
        }
    }
}
