package com.nordpool.id.publicapi.v1.command;

/**
 * Created by Askar.Ibragimov on 2017-05-26.
 */
public class Command {
    private final CommandType type;

    public Command(CommandType type) {
        this.type = type;
    }

    public CommandType getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Command{" +
                "type=" + type +
                '}';
    }
}
