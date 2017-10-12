
package com.nordpool.id.publicapi.v1.command;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum CommandType {

    LOGOUT("LOGOUT"),
    TOKEN_REFRESH("TOKEN_REFRESH");
    private final String value;
    private final static Map<String, CommandType> CONSTANTS = new HashMap<String, CommandType>();

    static {
        for (CommandType c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private CommandType(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    @JsonValue
    public String value() {
        return this.value;
    }

    @JsonCreator
    public static CommandType fromValue(String value) {
        CommandType constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
