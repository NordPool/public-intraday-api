
package com.nordpool.id.publicapi.v1.order;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum OrderModificationType {

    ACTI("ACTI"),
    DEAC("DEAC"),
    MODI("MODI"),
    DELE("DELE");
    private final String value;
    private final static Map<String, OrderModificationType> CONSTANTS = new HashMap<String, OrderModificationType>();

    static {
        for (OrderModificationType c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private OrderModificationType(String value) {
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
    public static OrderModificationType fromValue(String value) {
        OrderModificationType constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
