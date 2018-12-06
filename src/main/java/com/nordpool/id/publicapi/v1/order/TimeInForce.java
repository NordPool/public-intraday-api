/**
 * Copyright 2018 Nord Pool.
 * This library is intended to aid integration with Nord Pool’s Intraday API and comes without any warranty. Users of this library are responsible for separately testing and ensuring that it works according to their own standards.
 * Please send feedback to idapi@nordpoolgroup.com.
 */


package com.nordpool.id.publicapi.v1.order;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.HashMap;
import java.util.Map;

public enum TimeInForce {

    IOC("IOC"),
    FOK("FOK"),
    NON("NON"),
    GTD("GTD"),
    GFS("GFS");
    private final String value;
    private final static Map<String, TimeInForce> CONSTANTS = new HashMap<String, TimeInForce>();

    static {
        for (TimeInForce c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private TimeInForce(String value) {
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
    public static TimeInForce fromValue(String value) {
        TimeInForce constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
