/**
 * Copyright 2018 Nord Pool.
 * This library is intended to aid integration with Nord Pool’s Intraday API and comes without any warranty. Users of this library are responsible for separately testing and ensuring that it works according to their own standards.
 * Please send feedback to idapi@nordpoolgroup.com.
 */


package com.nordpool.id.publicapi.v1.order;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum OrderState {

    PENDING("PENDING"),
    ACTI("ACTI"),
    HIBE("HIBE"),
    IACT("IACT"),
    REJECTED("REJECTED");
    private final String value;
    private final static Map<String, OrderState> CONSTANTS = new HashMap<String, OrderState>();

    static {
        for (OrderState c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private OrderState(String value) {
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
    public static OrderState fromValue(String value) {
        OrderState constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
