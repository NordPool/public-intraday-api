
package com.nordpool.id.publicapi.v1.contract;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum ContractState {

    HIBE("HIBE"),
    IACT("IACT"),
    ACTI("ACTI"),
    FRZN("FRZN");
    private final String value;
    private final static Map<String, ContractState> CONSTANTS = new HashMap<String, ContractState>();

    static {
        for (ContractState c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private ContractState(String value) {
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
    public static ContractState fromValue(String value) {
        ContractState constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
