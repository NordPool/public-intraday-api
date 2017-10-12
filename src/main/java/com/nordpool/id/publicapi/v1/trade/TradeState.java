
package com.nordpool.id.publicapi.v1.trade;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum TradeState {

    COMPLETED("COMPLETED"),
    DISPUTED("DISPUTED"),
    NOT_CANCELLED("NOT_CANCELLED"),
    CANCELLED("CANCELLED");
    private final String value;
    private final static Map<String, TradeState> CONSTANTS = new HashMap<String, TradeState>();

    static {
        for (TradeState c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private TradeState(String value) {
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
    public static TradeState fromValue(String value) {
        TradeState constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
