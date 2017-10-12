
package com.nordpool.id.publicapi.v1.base;

import java.time.ZonedDateTime;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.nordpool.id.publicapi.v1.trade.Currency;
import com.nordpool.id.publicapi.v1.trade.TradeState;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Copyright 2017 Nord Pool.
 * This library is intended to aid integration with Nord Pool’s Intraday API and comes without any warranty. Users of this library are responsible for separately testing and ensuring that it works according to their own standards.
 * Please send feedback to idapi@nordpoolgroup.com.
 * <p>
 * Class with base trade fields
 * 
 */
public class BaseTradeRow
    extends BaseRow
{

    /**
     * Trade ID
     * 
     */
    private String tradeId;
    @JsonDeserialize(using = com.nordpool.id.publicapi.v1.serialize.DateDeserializer.class)
    @JsonSerialize(using = com.nordpool.id.publicapi.v1.serialize.DateSerializer.class)
    private ZonedDateTime tradeTime;
    /**
     * COMPLETED - the trade is completed, CANCELLED - the trade is cancelled.
     * 
     */
    private TradeState state;
    /**
     * Currency code
     * 
     */
    private Currency currency;
    private Long eventSequenceNo;
    /**
     * A flag that indicates if this trade should no longer be visible on the market (old trade).
     * 
     */
    private Boolean deleted;
    /**
     * A medium length display name for the contract.
     * 
     */
    private String mediumDisplayName;

    /**
     * No args constructor for use in serialization
     * 
     */
    public BaseTradeRow() {
    }

    /**
     * 
     * @param mediumDisplayName
     * @param tradeTime
     * @param deleted
     * @param currency
     * @param eventSequenceNo
     * @param state
     * @param tradeId
     * @param updatedAt
     */
    public BaseTradeRow(String tradeId, ZonedDateTime tradeTime, TradeState state, Currency currency, Long eventSequenceNo, Boolean deleted, String mediumDisplayName, ZonedDateTime updatedAt) {
        super(updatedAt);
        this.tradeId = tradeId;
        this.tradeTime = tradeTime;
        this.state = state;
        this.currency = currency;
        this.eventSequenceNo = eventSequenceNo;
        this.deleted = deleted;
        this.mediumDisplayName = mediumDisplayName;
    }

    /**
     * Trade ID
     * 
     */
    public String getTradeId() {
        return tradeId;
    }

    /**
     * Trade ID
     * 
     */
    public void setTradeId(String tradeId) {
        this.tradeId = tradeId;
    }

    public BaseTradeRow withTradeId(String tradeId) {
        this.tradeId = tradeId;
        return this;
    }

    public ZonedDateTime getTradeTime() {
        return tradeTime;
    }

    public void setTradeTime(ZonedDateTime tradeTime) {
        this.tradeTime = tradeTime;
    }

    public BaseTradeRow withTradeTime(ZonedDateTime tradeTime) {
        this.tradeTime = tradeTime;
        return this;
    }

    /**
     * COMPLETED - the trade is completed, CANCELLED - the trade is cancelled.
     * 
     */
    public TradeState getState() {
        return state;
    }

    /**
     * COMPLETED - the trade is completed, CANCELLED - the trade is cancelled.
     * 
     */
    public void setState(TradeState state) {
        this.state = state;
    }

    public BaseTradeRow withState(TradeState state) {
        this.state = state;
        return this;
    }

    /**
     * Currency code
     * 
     */
    public Currency getCurrency() {
        return currency;
    }

    /**
     * Currency code
     * 
     */
    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public BaseTradeRow withCurrency(Currency currency) {
        this.currency = currency;
        return this;
    }

    public Long getEventSequenceNo() {
        return eventSequenceNo;
    }

    public void setEventSequenceNo(Long eventSequenceNo) {
        this.eventSequenceNo = eventSequenceNo;
    }

    public BaseTradeRow withEventSequenceNo(Long eventSequenceNo) {
        this.eventSequenceNo = eventSequenceNo;
        return this;
    }

    /**
     * A flag that indicates if this trade should no longer be visible on the market (old trade).
     * 
     */
    public Boolean getDeleted() {
        return deleted;
    }

    /**
     * A flag that indicates if this trade should no longer be visible on the market (old trade).
     * 
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public BaseTradeRow withDeleted(Boolean deleted) {
        this.deleted = deleted;
        return this;
    }

    /**
     * A medium length display name for the contract.
     * 
     */
    public String getMediumDisplayName() {
        return mediumDisplayName;
    }

    /**
     * A medium length display name for the contract.
     * 
     */
    public void setMediumDisplayName(String mediumDisplayName) {
        this.mediumDisplayName = mediumDisplayName;
    }

    public BaseTradeRow withMediumDisplayName(String mediumDisplayName) {
        this.mediumDisplayName = mediumDisplayName;
        return this;
    }

    @Override
    public BaseTradeRow withUpdatedAt(ZonedDateTime updatedAt) {
        super.withUpdatedAt(updatedAt);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).appendSuper(super.toString()).append("tradeId", tradeId).append("tradeTime", tradeTime).append("state", state).append("currency", currency).append("eventSequenceNo", eventSequenceNo).append("deleted", deleted).append("mediumDisplayName", mediumDisplayName).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().appendSuper(super.hashCode()).append(mediumDisplayName).append(tradeTime).append(deleted).append(currency).append(eventSequenceNo).append(state).append(tradeId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BaseTradeRow) == false) {
            return false;
        }
        BaseTradeRow rhs = ((BaseTradeRow) other);
        return new EqualsBuilder().appendSuper(super.equals(other)).append(mediumDisplayName, rhs.mediumDisplayName).append(tradeTime, rhs.tradeTime).append(deleted, rhs.deleted).append(currency, rhs.currency).append(eventSequenceNo, rhs.eventSequenceNo).append(state, rhs.state).append(tradeId, rhs.tradeId).isEquals();
    }

}
