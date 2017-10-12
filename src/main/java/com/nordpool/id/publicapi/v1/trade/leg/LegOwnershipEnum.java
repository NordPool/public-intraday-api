
package com.nordpool.id.publicapi.v1.trade.leg;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum LegOwnershipEnum {

    OWN_BUY("OWN_BUY"),
    OWN_SELL("OWN_SELL"),
    COMPANY_BUY("COMPANY_BUY"),
    COMPANY_SELL("COMPANY_SELL"),
    OTHER("OTHER");
    private final String value;
    private final static Map<String, LegOwnershipEnum> CONSTANTS = new HashMap<String, LegOwnershipEnum>();

    static {
        for (LegOwnershipEnum c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private LegOwnershipEnum(String value) {
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
    public static LegOwnershipEnum fromValue(String value) {
        LegOwnershipEnum constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
