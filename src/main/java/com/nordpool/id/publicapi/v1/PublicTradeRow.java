/*
 * Copyright 2017 Nord Pool.
 * This library is intended to aid integration with Nord Pool’s Intraday API and comes without any warranty. Users of this library are responsible for separately testing and ensuring that it works according to their own standards.
 * Please send feedback to idapi@nordpoolgroup.com.
 */

package com.nordpool.id.publicapi.v1;

import com.nordpool.id.publicapi.v1.base.BaseTradeRow;
import com.nordpool.id.publicapi.v1.trade.leg.PublicTradeLeg;

public class PublicTradeRow extends BaseTradeRow<PublicTradeLeg> {

    public PublicTradeRow() {
    }

    @Override
    public String toString() {
        return "PublicTradeRow{" +
                "} " + super.toString();
    }
}
