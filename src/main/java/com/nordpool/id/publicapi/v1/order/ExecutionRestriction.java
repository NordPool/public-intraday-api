/**
 * Copyright 2022 Nord Pool.
 * This library is intended to aid integration with Nord Pool’s Intraday API and comes without any warranty. Users of this library are responsible for separately testing and ensuring that it works according to their own standards.
 * Please send feedback to idapi@nordpoolgroup.com.
 */


package com.nordpool.id.publicapi.v1.order;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum ExecutionRestriction {

    AON("AON"),
    NON("NON");
    private final String value;
    private final static Map<String, ExecutionRestriction> CONSTANTS = new HashMap<String, ExecutionRestriction>();

    static {
        for (ExecutionRestriction c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private ExecutionRestriction(String value) {
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
    public static ExecutionRestriction fromValue(String value) {
        ExecutionRestriction constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
