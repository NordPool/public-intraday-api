/*
 * Copyright 2017 Nord Pool.
 * This library is intended to aid integration with Nord Pool’s Intraday API and comes without any warranty. Users of this library are responsible for separately testing and ensuring that it works according to their own standards.
 * Please send feedback to idapi@nordpoolgroup.com.
 */

package com.nordpool.id.publicapi.v1.trade;

public enum TradeState {
    COMPLETED,
    CANCELLED,
    RECALL_REJECTED,
    RECALL_GRANTED,
    RECALL_REQUESTED;

    private TradeState() {
    }
}
