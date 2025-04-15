/**
 * Copyright 2022 Nord Pool.
 * This library is intended to aid integration with Nord Pool’s Intraday API and comes without any warranty. Users of this library are responsible for separately testing and ensuring that it works according to their own standards.
 * Please send feedback to idapi@nordpoolgroup.com.
 */


package com.nordpool.id.publicapi.v1.order.error;

import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

public enum ErrorCode {

    MISSING_REQUIRED_FIELD("MISSING_REQUIRED_FIELD"),
    ILLEGAL_FIELD("ILLEGAL_FIELD"),
    FIELD_OUT_OF_RANGE("FIELD_OUT_OF_RANGE"),
    FIELD_FORMAT_INVALID("FIELD_FORMAT_INVALID"),
    FIELD_LENGTH_INVALID("FIELD_LENGTH_INVALID"),
    NON_ASCII_CHARACTERS_NOT_ALLOWED("NON_ASCII_CHARACTERS_NOT_ALLOWED"),
    ITEM_NOT_FOUND("ITEM_NOT_FOUND"),
    ACCESS_MODE_VIOLATION("ACCESS_MODE_VIOLATION"),
    THIRD_PARTY("THIRD_PARTY"),
    INVALID_AREA("INVALID_AREA"),
    REQUEST_OVER_THROTTLING("REQUEST_OVER_THROTTLING"),
    INTERNAL_SERVER_ERROR("INTERNAL_SERVER_ERROR"),
    TRADING_IS_NOT_AVAILABLE("TRADING_IS_NOT_AVAILABLE"),
    INVALID_CONTRACT_FOR_BASKET_ORDER("INVALID_CONTRACT_FOR_BASKET_ORDER"),
    INVALID_TIME_IN_FORCE_FOR_BASKET_ORDER("INVALID_TIME_IN_FORCE_FOR_BASKET_ORDER"),
    EXPOSURE_LIMIT_VALIDATION_ERROR("EXPOSURE_LIMIT_VALIDATION_ERROR"),
    COLLATERAL_LIMIT_VALIDATION_ERROR("COLLATERAL_LIMIT_VALIDATION_ERROR");

    private final String value;
    private final static Map<String, ErrorCode> CONSTANTS = new HashMap<String, ErrorCode>();

    static {
        for (ErrorCode c: values()) {
            CONSTANTS.put(c.value, c);
        }
    }

    private ErrorCode(String value) {
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
    public static ErrorCode fromValue(String value) {
        ErrorCode constant = CONSTANTS.get(value);
        if (constant == null) {
            throw new IllegalArgumentException(value);
        } else {
            return constant;
        }
    }
}
