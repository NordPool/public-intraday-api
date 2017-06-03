/*
 * Copyright 2017 Nord Pool.
 * This library is intended to aid integration with Nord Pool’s Intraday API and comes without any warranty. Users of this library are responsible for separately testing and ensuring that it works according to their own standards.
 * Please send feedback to idapi@nordpoolgroup.com.
 */

package com.nordpool.id.publicapi.v1.contract;

public enum ProductType {
    P15MIN("QH", "Quarterly_Hour_Power"),
    P30MIN("HH", "Half_Hourly_Power"),
    P60MIN("PH", "Intraday_Power_D"),
    BLOCK_2H("2H", ""),
    BLOCK_4H("4H", ""),
    DON("DON", ""),
    DB34("DB34", ""),
    DP("DP", "Continuous_Power_Peak"),
    DEP("DEP", ""),
    DB("DB", "Continuous_Power_Base"),
    CUSTOM_BLOCK("CB", "");

    private String type;
    private String xbidType;

    private ProductType(String type, String xbidType) {
        this.type = type;
        this.xbidType = xbidType;
    }

    public String getType() {
        return this.type;
    }

    public String getXbidType() {
        return this.xbidType;
    }
}
