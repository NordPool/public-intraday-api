/**
 * Copyright 2018 Nord Pool.
 * This library is intended to aid integration with Nord Pool’s Intraday API and comes without any warranty. Users of this library are responsible for separately testing and ensuring that it works according to their own standards.
 * Please send feedback to idapi@nordpoolgroup.com.
 */


package com.nordpool.id.publicapi.v1.order.error;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum ErrorType {

    NPM("NPM"),
    PRE_TRADE("PRE_TRADE"),
    MW("MW"),
    LTS("LTS"),
    XBID("XBID");
    private final String value;
    private final static Map<String, ErrorType> CONSTANTS = new HashMap<String, ErrorType>();

    static {
        for (ErrorType c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private ErrorType(String value) {
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
    public static ErrorType fromValue(String value) {
        ErrorType constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
