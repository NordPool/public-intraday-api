
package com.nordpool.id.publicapi.v1.statistic;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum Tendency {

    UP("UP"),
    DOWN("DOWN"),
    EQUAL("EQUAL");
    private final String value;
    private final static Map<String, Tendency> CONSTANTS = new HashMap<String, Tendency>();

    static {
        for (Tendency c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private Tendency(String value) {
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
    public static Tendency fromValue(String value) {
        Tendency constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
