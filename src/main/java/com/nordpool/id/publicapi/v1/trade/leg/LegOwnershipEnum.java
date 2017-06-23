/*
 * Copyright 2017 Nord Pool.
 * This library is intended to aid integration with Nord Pool’s Intraday API and comes without any warranty. Users of this library are responsible for separately testing and ensuring that it works according to their own standards.
 * Please send feedback to idapi@nordpoolgroup.com.
 */

package com.nordpool.id.publicapi.v1.trade.leg;

public enum LegOwnershipEnum {
    OWN_BUY,
    OWN_SELL,
    COMPANY_BUY,
    COMPANY_SELL,
    OTHER
}
