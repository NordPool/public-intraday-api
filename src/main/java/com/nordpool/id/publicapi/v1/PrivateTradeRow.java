/**
 * Copyright 2022 Nord Pool.
 * This library is intended to aid integration with Nord Pool’s Intraday API and comes without any warranty. Users of this library are responsible for separately testing and ensuring that it works according to their own standards.
 * Please send feedback to idapi@nordpoolgroup.com.
 */


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
    private Long revisionNo;

    /**
     * No args constructor for use in serialization
     * 
     */
    public PrivateTradeRow() {
    }

    /**
     * 
     * @param companyTrade
     * @param eventSequenceNo
     * @param cancellationDeadLine
     * @param mediumDisplayName
     * @param tradeTime
     * @param deleted
     * @param legs
     * @param cancellationFee
     * @param revisionNo
     * @param currency
     * @param state
     * @param tradeId
     * @param updatedAt
     */
    public PrivateTradeRow(List<PrivateTradeLeg> legs, Long cancellationFee, String cancellationDeadLine, Long revisionNo, String tradeId, ZonedDateTime tradeTime, TradeState state, Currency currency, Long eventSequenceNo, Boolean deleted, String mediumDisplayName, Boolean companyTrade, ZonedDateTime updatedAt) {
        super(tradeId, tradeTime, state, currency, eventSequenceNo, deleted, mediumDisplayName, companyTrade, updatedAt);
        this.legs = legs;
        this.cancellationFee = cancellationFee;
        this.cancellationDeadLine = cancellationDeadLine;
        this.revisionNo = revisionNo;
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

    public Long getRevisionNo() {
        return revisionNo;
    }

    public void setRevisionNo(Long revisionNo) {
        this.revisionNo = revisionNo;
    }

    public PrivateTradeRow withRevisionNo(Long revisionNo) {
        this.revisionNo = revisionNo;
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
    public PrivateTradeRow withCompanyTrade(Boolean companyTrade) {
        super.withCompanyTrade(companyTrade);
        return this;
    }

    @Override
    public PrivateTradeRow withUpdatedAt(ZonedDateTime updatedAt) {
        super.withUpdatedAt(updatedAt);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).appendSuper(super.toString()).append("legs", legs).append("cancellationFee", cancellationFee).append("cancellationDeadLine", cancellationDeadLine).append("revisionNo", revisionNo).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().appendSuper(super.hashCode()).append(cancellationFee).append(revisionNo).append(cancellationDeadLine).append(legs).toHashCode();
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
        return new EqualsBuilder().appendSuper(super.equals(other)).append(cancellationFee, rhs.cancellationFee).append(revisionNo, rhs.revisionNo).append(cancellationDeadLine, rhs.cancellationDeadLine).append(legs, rhs.legs).isEquals();
    }

}
