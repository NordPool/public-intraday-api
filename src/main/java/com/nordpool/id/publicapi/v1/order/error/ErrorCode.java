
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
    ITEM_NOT_FOUND("ITEM_NOT_FOUND"),
    ACCESS_MODE_VIOLATION("ACCESS_MODE_VIOLATION"),
    THIRD_PARTY("THIRD_PARTY"),
    INVALID_AREA("INVALID_AREA"),
    PARSING_ERROR("PARSING_ERROR"),
    REUQEST_OVER_THROTTLING("REUQEST_OVER_THROTTLING");
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
