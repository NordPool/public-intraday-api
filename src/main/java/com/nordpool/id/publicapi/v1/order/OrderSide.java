
package com.nordpool.id.publicapi.v1.order;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum OrderSide {

    BUY("BUY"),
    SELL("SELL");
    private final String value;
    private final static Map<String, OrderSide> CONSTANTS = new HashMap<String, OrderSide>();

    static {
        for (OrderSide c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private OrderSide(String value) {
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
    public static OrderSide fromValue(String value) {
        OrderSide constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
