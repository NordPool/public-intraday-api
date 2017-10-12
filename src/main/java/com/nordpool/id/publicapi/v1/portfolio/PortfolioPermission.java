
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
