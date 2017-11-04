/**
 * Copyright 2017 Nord Pool.
 * This library is intended to aid integration with Nord Pool’s Intraday API and comes without any warranty. Users of this library are responsible for separately testing and ensuring that it works according to their own standards.
 * Please send feedback to idapi@nordpoolgroup.com.
 */


package com.nordpool.id.publicapi.v1.market;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Market portfolio
 * 
 */
public class MarketPortfolio {

    /**
     * Market unique identifier
     * 
     */
    private String marketId;

    /**
     * No args constructor for use in serialization
     * 
     */
    public MarketPortfolio() {
    }

    /**
     * 
     * @param marketId
     */
    public MarketPortfolio(String marketId) {
        super();
        this.marketId = marketId;
    }

    /**
     * Market unique identifier
     * 
     */
    public String getMarketId() {
        return marketId;
    }

    /**
     * Market unique identifier
     * 
     */
    public void setMarketId(String marketId) {
        this.marketId = marketId;
    }

    public MarketPortfolio withMarketId(String marketId) {
        this.marketId = marketId;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("marketId", marketId).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(marketId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof MarketPortfolio) == false) {
            return false;
        }
        MarketPortfolio rhs = ((MarketPortfolio) other);
        return new EqualsBuilder().append(marketId, rhs.marketId).isEquals();
    }

}
