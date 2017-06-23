/*
 * Copyright 2017 Nord Pool.
 * This library is intended to aid integration with Nord Pool’s Intraday API and comes without any warranty. Users of this library are responsible for separately testing and ensuring that it works according to their own standards.
 * Please send feedback to idapi@nordpoolgroup.com.
 */

package com.nordpool.id.publicapi.v1.market;

import java.util.Objects;

public class MarketPortfolio {
    private String marketId;

    public MarketPortfolio() {
    }

    public String getMarketId() {
        return marketId;
    }

    public void setMarketId(String marketId) {
        this.marketId = marketId;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof MarketPortfolio)) return false;
        MarketPortfolio that = (MarketPortfolio) o;
        return Objects.equals(marketId, that.marketId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(marketId);
    }

    @Override
    public String toString() {
        return "MarketPortfolio{" +
                "marketId='" + marketId + '\'' +
                '}';
    }
}
