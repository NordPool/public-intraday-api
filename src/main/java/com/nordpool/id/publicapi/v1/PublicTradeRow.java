/**
 * Copyright 2017 Nord Pool.
 * This library is intended to aid integration with Nord Pool’s Intraday API and comes without any warranty. Users of this library are responsible for separately testing and ensuring that it works according to their own standards.
 * Please send feedback to idapi@nordpoolgroup.com.
 */


package com.nordpool.id.publicapi.v1;

import java.time.ZonedDateTime;
import java.util.List;
import com.nordpool.id.publicapi.v1.base.BaseTradeRow;
import com.nordpool.id.publicapi.v1.trade.Currency;
import com.nordpool.id.publicapi.v1.trade.TradeState;
import com.nordpool.id.publicapi.v1.trade.leg.PublicTradeLeg;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

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
     * 
     * @param mediumDisplayName
     * @param tradeTime
     * @param deleted
     * @param companyTrade
     * @param legs
     * @param currency
     * @param eventSequenceNo
     * @param state
     * @param tradeId
     * @param updatedAt
     */
    public PublicTradeRow(List<PublicTradeLeg> legs, String tradeId, ZonedDateTime tradeTime, TradeState state, Currency currency, Long eventSequenceNo, Boolean deleted, String mediumDisplayName, Boolean companyTrade, ZonedDateTime updatedAt) {
        super(tradeId, tradeTime, state, currency, eventSequenceNo, deleted, mediumDisplayName, companyTrade, updatedAt);
        this.legs = legs;
    }

    /**
     * Basic data about orders participated in the trade
     * 
     */
    public List<PublicTradeLeg> getLegs() {
        return legs;
    }

    /**
     * Basic data about orders participated in the trade
     * 
     */
    public void setLegs(List<PublicTradeLeg> legs) {
        this.legs = legs;
    }

    public PublicTradeRow withLegs(List<PublicTradeLeg> legs) {
        this.legs = legs;
        return this;
    }

    @Override
    public PublicTradeRow withTradeId(String tradeId) {
        super.withTradeId(tradeId);
        return this;
    }

    @Override
    public PublicTradeRow withTradeTime(ZonedDateTime tradeTime) {
        super.withTradeTime(tradeTime);
        return this;
    }

    @Override
    public PublicTradeRow withState(TradeState state) {
        super.withState(state);
        return this;
    }

    @Override
    public PublicTradeRow withCurrency(Currency currency) {
        super.withCurrency(currency);
        return this;
    }

    @Override
    public PublicTradeRow withEventSequenceNo(Long eventSequenceNo) {
        super.withEventSequenceNo(eventSequenceNo);
        return this;
    }

    @Override
    public PublicTradeRow withDeleted(Boolean deleted) {
        super.withDeleted(deleted);
        return this;
    }

    @Override
    public PublicTradeRow withMediumDisplayName(String mediumDisplayName) {
        super.withMediumDisplayName(mediumDisplayName);
        return this;
    }

    @Override
    public PublicTradeRow withCompanyTrade(Boolean companyTrade) {
        super.withCompanyTrade(companyTrade);
        return this;
    }

    @Override
    public PublicTradeRow withUpdatedAt(ZonedDateTime updatedAt) {
        super.withUpdatedAt(updatedAt);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).appendSuper(super.toString()).append("legs", legs).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().appendSuper(super.hashCode()).append(legs).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PublicTradeRow) == false) {
            return false;
        }
        PublicTradeRow rhs = ((PublicTradeRow) other);
        return new EqualsBuilder().appendSuper(super.equals(other)).append(legs, rhs.legs).isEquals();
    }

}
