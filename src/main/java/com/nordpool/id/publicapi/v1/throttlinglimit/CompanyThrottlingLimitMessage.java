/**
 * Copyright 2026 Nord Pool.
 * This library is intended to aid integration with Nord Pool’s Intraday API and comes without any warranty. Users of this library are responsible for separately testing and ensuring that it works according to their own standards.
 * Please send feedback to idapi@nordpoolgroup.com.
 */

package com.nordpool.id.publicapi.v1.throttlinglimit;

import java.util.List;

public class CompanyThrottlingLimitMessage {

    private Long loginsPer20s;
    private Long loginsPer20min;
    private Long throttlingLoginLimitPer20s;
    private Long throttlingLoginLimitPer20min;
    private List<MarketOrderLimits> orderLimits;

    public List<MarketOrderLimits> getOrderLimits() {
        return orderLimits;
    }

    public void setOrderLimits(List<MarketOrderLimits> orderLimits) {
        this.orderLimits = orderLimits;
    }

    public Long getLoginsPer20s() {
        return loginsPer20s;
    }

    public void setLoginsPer20s(Long loginsPer20s) {
        this.loginsPer20s = loginsPer20s;
    }

    public Long getLoginsPer20min() {
        return loginsPer20min;
    }

    public void setLoginsPer20min(Long loginsPer20min) {
        this.loginsPer20min = loginsPer20min;
    }

    public Long getThrottlingLoginLimitPer20s() {
        return throttlingLoginLimitPer20s;
    }

    public void setThrottlingLoginLimitPer20s(Long throttlingLoginLimitPer20s) {
        this.throttlingLoginLimitPer20s = throttlingLoginLimitPer20s;
    }

    public Long getThrottlingLoginLimitPer20min() {
        return throttlingLoginLimitPer20min;
    }

    public void setThrottlingLoginLimitPer20min(Long throttlingLoginLimitPer20min) {
        this.throttlingLoginLimitPer20min = throttlingLoginLimitPer20min;
    }
}
