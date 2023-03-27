/**
 * Copyright 2023 Nord Pool.
 * This library is intended to aid integration with Nord Pool’s Intraday API and comes without any warranty. Users of this library are responsible for separately testing and ensuring that it works according to their own standards.
 * Please send feedback to idapi@nordpoolgroup.com.
 */

package com.nordpool.id.publicapi.v1.throttlinglimit;

public class ThrottlingLimitsMessage {
    private Long timestamp;
    private Long ordersPer10s;
    private Long ordersPer1h;
    private Long ordersPer1day;
    private Long throttlingOrderLimitPer10s;
    private Long throttlingOrderLimitPer1h;
    private Long loginsPer20s;
    private Long loginsPer20min;
    private Long throttlingLoginLimitPer20s;
    private Long throttlingLoginLimitPer20min;

    public Long getTimestamp() {
        return timestamp;
    }

    public Long getOrdersPer10s() {
        return ordersPer10s;
    }

    public Long getOrdersPer1h() {
        return ordersPer1h;
    }

    public Long getOrdersPer1day() {
        return ordersPer1day;
    }

    public Long getThrottlingOrderLimitPer10s() {
        return throttlingOrderLimitPer10s;
    }

    public Long getThrottlingOrderLimitPer1h() {
        return throttlingOrderLimitPer1h;
    }

    public Long getLoginsPer20s() {
        return loginsPer20s;
    }

    public Long getLoginsPer20min() {
        return loginsPer20min;
    }

    public Long getThrottlingLoginLimitPer20s() {
        return throttlingLoginLimitPer20s;
    }

    public Long getThrottlingLoginLimitPer20min() {
        return throttlingLoginLimitPer20min;
    }
}
