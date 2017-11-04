/**
 * Copyright 2017 Nord Pool.
 * This library is intended to aid integration with Nord Pool’s Intraday API and comes without any warranty. Users of this library are responsible for separately testing and ensuring that it works according to their own standards.
 * Please send feedback to idapi@nordpoolgroup.com.
 */


package com.nordpool.id.publicapi.v1.contract;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum ProductType {

    P15MIN("P15MIN"),
    P30MIN("P30MIN"),
    P60MIN("P60MIN"),
    BLOCK_2H("BLOCK_2H"),
    BLOCK_4H("BLOCK_4H"),
    DON("DON"),
    DB34("DB34"),
    DP("DP"),
    DEP("DEP"),
    DB("DB"),
    CUSTOM_BLOCK("CUSTOM_BLOCK");
    private final String value;
    private final static Map<String, ProductType> CONSTANTS = new HashMap<String, ProductType>();

    static {
        for (ProductType c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private ProductType(String value) {
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
    public static ProductType fromValue(String value) {
        ProductType constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
