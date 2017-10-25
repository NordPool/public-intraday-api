
package com.nordpool.id.publicapi.v1.trade;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum Currency {

    EUR("EUR"),
    GBP("GBP"),
    RUR("RUR");
    private final String value;
    private final static Map<String, Currency> CONSTANTS = new HashMap<String, Currency>();

    static {
        for (Currency c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private Currency(String value) {
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
    public static Currency fromValue(String value) {
        Currency constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
