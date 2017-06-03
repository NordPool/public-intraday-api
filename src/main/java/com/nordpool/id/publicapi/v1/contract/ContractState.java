/*
 * Copyright 2017 Nord Pool.
 * This library is intended to aid integration with Nord Pool’s Intraday API and comes without any warranty. Users of this library are responsible for separately testing and ensuring that it works according to their own standards.
 * Please send feedback to idapi@nordpoolgroup.com.
 */

package com.nordpool.id.publicapi.v1.contract;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum ContractState {
    HIBE,
    IACT,
    ACTI;

    private ContractState() {
    }

    @JsonCreator
    public static ContractState forValue(String value) {
        return valueOf(value);
    }

    @JsonValue
    public String toValue() {
        return this.name();
    }
}
