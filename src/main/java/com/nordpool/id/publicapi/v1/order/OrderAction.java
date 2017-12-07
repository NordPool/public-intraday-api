/**
 * Copyright 2017 Nord Pool.
 * This library is intended to aid integration with Nord Pool’s Intraday API and comes without any warranty. Users of this library are responsible for separately testing and ensuring that it works according to their own standards.
 * Please send feedback to idapi@nordpoolgroup.com.
 */


package com.nordpool.id.publicapi.v1.order;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum OrderAction {

    USER_ADDED("USER_ADDED"),
    USER_HIBERNATED("USER_HIBERNATED"),
    USER_MODIFIED("USER_MODIFIED"),
    USER_DELETED("USER_DELETED"),
    SYSTEM_HIBERNATED("SYSTEM_HIBERNATED"),
    SYSTEM_MODIFIED("SYSTEM_MODIFIED"),
    SYSTEM_DELETED("SYSTEM_DELETED"),
    PARTIAL_EXECUTION("PARTIAL_EXECUTION"),
    FULL_EXECUTION("FULL_EXECUTION"),
    ICEBERG_SLICE_ADDED("ICEBERG_SLICE_ADDED"),
    SYSTEM_EXPIRED("SYSTEM_EXPIRED");
    private final String value;
    private final static Map<String, OrderAction> CONSTANTS = new HashMap<String, OrderAction>();

    static {
        for (OrderAction c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private OrderAction(String value) {
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
    public static OrderAction fromValue(String value) {
        OrderAction constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
