/**
 * Copyright 2022 Nord Pool.
 * This library is intended to aid integration with Nord Pool’s Intraday API and comes without any warranty. Users of this library are responsible for separately testing and ensuring that it works according to their own standards.
 * Please send feedback to idapi@nordpoolgroup.com.
 */


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
