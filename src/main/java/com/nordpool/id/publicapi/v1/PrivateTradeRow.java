
package com.nordpool.id.publicapi.v1;

import java.time.ZonedDateTime;
import java.util.List;
import com.nordpool.id.publicapi.v1.base.BaseTradeRow;
import com.nordpool.id.publicapi.v1.trade.Currency;
import com.nordpool.id.publicapi.v1.trade.TradeState;
import com.nordpool.id.publicapi.v1.trade.leg.PrivateTradeLeg;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Copyright 2017 Nord Pool.
 * This library is intended to aid integration with Nord Pool’s Intraday API and comes without any warranty. Users of this library are responsible for separately testing and ensuring that it works according to their own standards.
 * Please send feedback to idapi@nordpoolgroup.com.
 * <p>
 * 
 * 
 */
public class PrivateTradeRow
    extends BaseTradeRow
{

    /**
     * Basic data about orders participated in the trade
     * 
     */
    private List<PrivateTradeLeg> legs = null;
    private Long cancellationFee;
    /**
     * There is a deadline for trade cancellation, in accordance with market rules
     * 
     */
    private String cancellationDeadLine;

    /**
     * No args constructor for use in serialization
     * 
     */
    public PrivateTradeRow() {
    }

    /**
     * 
     * @param mediumDisplayName
     * @param tradeTime
     * @param deleted
     * @param legs
     * @param cancellationFee
     * @param currency
     * @param eventSequenceNo
     * @param state
     * @param cancellationDeadLine
     * @param tradeId
     * @param updatedAt
     */
    public PrivateTradeRow(List<PrivateTradeLeg> legs, Long cancellationFee, String cancellationDeadLine, String tradeId, ZonedDateTime tradeTime, TradeState state, Currency currency, Long eventSequenceNo, Boolean deleted, String mediumDisplayName, ZonedDateTime updatedAt) {
        super(tradeId, tradeTime, state, currency, eventSequenceNo, deleted, mediumDisplayName, updatedAt);
        this.legs = legs;
        this.cancellationFee = cancellationFee;
        this.cancellationDeadLine = cancellationDeadLine;
    }

    /**
     * Basic data about orders participated in the trade
     * 
     */
    public List<PrivateTradeLeg> getLegs() {
        return legs;
    }

    /**
     * Basic data about orders participated in the trade
     * 
     */
    public void setLegs(List<PrivateTradeLeg> legs) {
        this.legs = legs;
    }

    public PrivateTradeRow withLegs(List<PrivateTradeLeg> legs) {
        this.legs = legs;
        return this;
    }

    public Long getCancellationFee() {
        return cancellationFee;
    }

    public void setCancellationFee(Long cancellationFee) {
        this.cancellationFee = cancellationFee;
    }

    public PrivateTradeRow withCancellationFee(Long cancellationFee) {
        this.cancellationFee = cancellationFee;
        return this;
    }

    /**
     * There is a deadline for trade cancellation, in accordance with market rules
     * 
     */
    public String getCancellationDeadLine() {
        return cancellationDeadLine;
    }

    /**
     * There is a deadline for trade cancellation, in accordance with market rules
     * 
     */
    public void setCancellationDeadLine(String cancellationDeadLine) {
        this.cancellationDeadLine = cancellationDeadLine;
    }

    public PrivateTradeRow withCancellationDeadLine(String cancellationDeadLine) {
        this.cancellationDeadLine = cancellationDeadLine;
        return this;
    }

    @Override
    public PrivateTradeRow withTradeId(String tradeId) {
        super.withTradeId(tradeId);
        return this;
    }

    @Override
    public PrivateTradeRow withTradeTime(ZonedDateTime tradeTime) {
        super.withTradeTime(tradeTime);
        return this;
    }

    @Override
    public PrivateTradeRow withState(TradeState state) {
        super.withState(state);
        return this;
    }

    @Override
    public PrivateTradeRow withCurrency(Currency currency) {
        super.withCurrency(currency);
        return this;
    }

    @Override
    public PrivateTradeRow withEventSequenceNo(Long eventSequenceNo) {
        super.withEventSequenceNo(eventSequenceNo);
        return this;
    }

    @Override
    public PrivateTradeRow withDeleted(Boolean deleted) {
        super.withDeleted(deleted);
        return this;
    }

    @Override
    public PrivateTradeRow withMediumDisplayName(String mediumDisplayName) {
        super.withMediumDisplayName(mediumDisplayName);
        return this;
    }

    @Override
    public PrivateTradeRow withUpdatedAt(ZonedDateTime updatedAt) {
        super.withUpdatedAt(updatedAt);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).appendSuper(super.toString()).append("legs", legs).append("cancellationFee", cancellationFee).append("cancellationDeadLine", cancellationDeadLine).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().appendSuper(super.hashCode()).append(cancellationFee).append(cancellationDeadLine).append(legs).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PrivateTradeRow) == false) {
            return false;
        }
        PrivateTradeRow rhs = ((PrivateTradeRow) other);
        return new EqualsBuilder().appendSuper(super.equals(other)).append(cancellationFee, rhs.cancellationFee).append(cancellationDeadLine, rhs.cancellationDeadLine).append(legs, rhs.legs).isEquals();
    }

}
