/**
 * Copyright 2023 Nord Pool.
 * This library is intended to aid integration with Nord Pool’s Intraday API and comes without any warranty. Users of this library are responsible for separately testing and ensuring that it works according to their own standards.
 * Please send feedback to idapi@nordpoolgroup.com.
 */

package com.nordpool.id.publicapi.v2.trade;

import java.time.ZonedDateTime;
import java.util.List;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import com.nordpool.id.publicapi.v1.trade.Currency;
import com.nordpool.id.publicapi.v1.trade.TradeState;
import com.nordpool.id.publicapi.v2.trade.leg.PublicTradeLeg;

public class PublicTradeRow
    extends BaseTradeRow
{
    /**
     * Basic data about orders participated in the trade
     *
     */
    private List<PublicTradeLeg> legs = null;

    /**
     * No args constructor for use in serialization
     *
     */
    public PublicTradeRow() {
    }

    /**
     * @param tradeId
     * @param tradeTime
     * @param state
     * @param currency
     * @param eventSequenceNo
     * @param revisionNo
     * @param mediumDisplayName
     * @param updatedAt
     * @param legs
     */
    public PublicTradeRow(String tradeId, ZonedDateTime tradeTime, TradeState state, Currency currency, Long eventSequenceNo, Long revisionNo, String mediumDisplayName, ZonedDateTime updatedAt, List<PublicTradeLeg> legs) {
        super(tradeId, tradeTime, state, currency, eventSequenceNo, revisionNo, mediumDisplayName, updatedAt);
        this.legs = legs;
    }

    public List<PublicTradeLeg> getLegs() {
        return this.legs;
    }

    public void setLegs(List<PublicTradeLeg> legs) {
        this.legs = legs;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).appendSuper(super.toString()).append("legs", legs).toString();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }

        if (!(other instanceof PublicTradeRow)) {
            return false;
        }

        PublicTradeRow rhs = (PublicTradeRow) other;
        return new EqualsBuilder().appendSuper(super.equals(other)).append(legs, rhs.legs).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().appendSuper(super.hashCode()).append(legs).toHashCode();
    }
}
