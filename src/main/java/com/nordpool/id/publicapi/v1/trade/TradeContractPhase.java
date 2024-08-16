/**
 * Copyright 2022 Nord Pool.
 * This library is intended to aid integration with Nord Pool’s Intraday API and comes without any warranty. Users of this library are responsible for separately testing and ensuring that it works according to their own standards.
 * Please send feedback to idapi@nordpoolgroup.com.
 */


package com.nordpool.id.publicapi.v1.trade;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.HashMap;
import java.util.Map;

public enum TradeContractPhase {

    CONT("CONT"),
    AUCT("AUCT");
    private final String value;
    private final static Map<String, TradeContractPhase> CONSTANTS = new HashMap<String, TradeContractPhase>();

    static {
        for (TradeContractPhase c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private TradeContractPhase(String value) {
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
    public static TradeContractPhase fromValue(String value) {
        TradeContractPhase constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }

}
