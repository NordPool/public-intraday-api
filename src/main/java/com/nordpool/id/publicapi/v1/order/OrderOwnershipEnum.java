
package com.nordpool.id.publicapi.v1.order;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum OrderOwnershipEnum {

    OWN("OWN"),
    COMPANY("COMPANY"),
    OTHER("OTHER");
    private final String value;
    private final static Map<String, OrderOwnershipEnum> CONSTANTS = new HashMap<String, OrderOwnershipEnum>();

    static {
        for (OrderOwnershipEnum c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private OrderOwnershipEnum(String value) {
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
    public static OrderOwnershipEnum fromValue(String value) {
        OrderOwnershipEnum constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
