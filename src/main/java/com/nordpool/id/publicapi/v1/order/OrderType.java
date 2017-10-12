
package com.nordpool.id.publicapi.v1.order;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum OrderType {

    LIMIT("LIMIT"),
    ICEBERG("ICEBERG"),
    USER_DEFINED_BLOCK("USER_DEFINED_BLOCK");
    private final String value;
    private final static Map<String, OrderType> CONSTANTS = new HashMap<String, OrderType>();

    static {
        for (OrderType c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private OrderType(String value) {
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
    public static OrderType fromValue(String value) {
        OrderType constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
