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

public enum OrderActionIssuer {

    USER("USER"),
    SYSTEM("SYSTEM");
    private final String value;
    private final static Map<String, OrderActionIssuer> CONSTANTS = new HashMap<String, OrderActionIssuer>();

    static {
        for (OrderActionIssuer c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private OrderActionIssuer(String value) {
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
    public static OrderActionIssuer fromValue(String value) {
        OrderActionIssuer constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
