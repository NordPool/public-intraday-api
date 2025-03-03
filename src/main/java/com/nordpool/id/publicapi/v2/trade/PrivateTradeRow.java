/**
 * Copyright 2023 Nord Pool.
 * This library is intended to aid integration with Nord Pool’s Intraday API and comes without any warranty. Users of this library are responsible for separately testing and ensuring that it works according to their own standards.
 * Please send feedback to idapi@nordpoolgroup.com.
 */

package com.nordpool.id.publicapi.v2.trade;

import com.nordpool.id.publicapi.v1.trade.Currency;
import com.nordpool.id.publicapi.v1.trade.TradeContractPhase;
import com.nordpool.id.publicapi.v1.trade.TradeState;
import com.nordpool.id.publicapi.v2.trade.leg.PrivateTradeLeg;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import java.time.ZonedDateTime;
import java.util.List;

public class PrivateTradeRow
    extends BaseTradeRow
{
    /**
     * Basic data about orders participated in the trade
     *
     */
    private List<PrivateTradeLeg> legs = null;

    private TradeContractPhase contractPhase;

    /**
     * No args constructor for use in serialization
     *
     */
    public PrivateTradeRow() {
    }

    /**
     *
     * @param tradeId
     * @param tradeTime
     * @param state
     * @param currency
     * @param eventSequenceNo
     * @param revisionNo
     * @param mediumDisplayName
     * @param updatedAt
     * @param legs
     * @param contractPhase
     */
    public PrivateTradeRow(String tradeId, ZonedDateTime tradeTime, TradeState state, Currency currency, Long eventSequenceNo, Long revisionNo, String mediumDisplayName, Boolean companyTrade, ZonedDateTime updatedAt, List<PrivateTradeLeg> legs, TradeContractPhase contractPhase) {
        super(tradeId, tradeTime, state, currency, eventSequenceNo, revisionNo, mediumDisplayName, updatedAt, companyTrade);
        this.legs = legs;
        this.contractPhase = contractPhase;
    }

    public List<PrivateTradeLeg> getLegs() {
        return this.legs;
    }

    public void setLegs(List<PrivateTradeLeg> legs) {
        this.legs = legs;
    }

    public TradeContractPhase getContractPhase() {
        return contractPhase;
    }

    public void setContractPhase(TradeContractPhase contractPhase) {
        this.contractPhase = contractPhase;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).appendSuper(super.toString()).append("legs", legs).append("contractPhase", contractPhase).toString();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }

        if (!(other instanceof PrivateTradeRow)) {
            return false;
        }

        PrivateTradeRow rhs = (PrivateTradeRow) other;
        return new EqualsBuilder().appendSuper(super.equals(other)).append(legs, rhs.legs).append(contractPhase, rhs.contractPhase).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().appendSuper(super.hashCode()).append(legs).append(contractPhase).toHashCode();
    }

}
