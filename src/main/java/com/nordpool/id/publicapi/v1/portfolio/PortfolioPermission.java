/**
 * Copyright 2017 Nord Pool.
 * This library is intended to aid integration with Nord Pool’s Intraday API and comes without any warranty. Users of this library are responsible for separately testing and ensuring that it works according to their own standards.
 * Please send feedback to idapi@nordpoolgroup.com.
 */


package com.nordpool.id.publicapi.v1.portfolio;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum PortfolioPermission {

    NONE("NONE"),
    READ("READ"),
    WRITE("WRITE");
    private final String value;
    private final static Map<String, PortfolioPermission> CONSTANTS = new HashMap<String, PortfolioPermission>();

    static {
        for (PortfolioPermission c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private PortfolioPermission(String value) {
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
    public static PortfolioPermission fromValue(String value) {
        PortfolioPermission constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
