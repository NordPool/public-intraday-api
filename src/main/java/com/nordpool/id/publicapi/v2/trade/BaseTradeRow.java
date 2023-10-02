/**
 * Copyright 2023 Nord Pool.
 * This library is intended to aid integration with Nord Pool’s Intraday API and comes without any warranty. Users of this library are responsible for separately testing and ensuring that it works according to their own standards.
 * Please send feedback to idapi@nordpoolgroup.com.
 */

package com.nordpool.id.publicapi.v2.trade;

import java.time.ZonedDateTime;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.nordpool.id.publicapi.v1.base.BaseRow;
import com.nordpool.id.publicapi.v1.trade.Currency;
import com.nordpool.id.publicapi.v1.trade.TradeState;

/**
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

    private Long revisionNo;

    /**
     * A medium length display name for the contract.
     * 
     */
    private String mediumDisplayName;

    private Boolean selfTrade;

    /**
     * No args constructor for use in serialization
     *
     */
    public BaseTradeRow() {
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
     */

    public BaseTradeRow(String tradeId, ZonedDateTime tradeTime, TradeState state, Currency currency, Long eventSequenceNo, Long revisionNo, String mediumDisplayName, ZonedDateTime updatedAt, Boolean selfTrade) {
        super(updatedAt);
        this.tradeId = tradeId;
        this.tradeTime = tradeTime;
        this.state = state;
        this.currency = currency;
        this.eventSequenceNo = eventSequenceNo;
        this.revisionNo = revisionNo;
        this.mediumDisplayName = mediumDisplayName;
        this.selfTrade = selfTrade;
    }

    public String getTradeId() {
        return this.tradeId;
    }

    public void setTradeId(String tradeId) {
        this.tradeId = tradeId;
    }

    public ZonedDateTime getTradeTime() {
        return this.tradeTime;
    }

    public void setTradeTime(ZonedDateTime tradeTime) {
        this.tradeTime = tradeTime;
    }

    public TradeState getState() {
        return this.state;
    }

    public void setState(TradeState state) {
        this.state = state;
    }

    public Currency getCurrency() {
        return this.currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public Long getEventSequenceNo() {
        return this.eventSequenceNo;
    }

    public void setEventSequenceNo(Long eventSequenceNo) {
        this.eventSequenceNo = eventSequenceNo;
    }

    public Long getRevisionNo() {
        return this.revisionNo;
    }

    public void setRevisionNo(Long revisionNo) {
        this.revisionNo = revisionNo;
    }

    public String getMediumDisplayName() {
        return this.mediumDisplayName;
    }

    public void setMediumDisplayName(String mediumDisplayName) {
        this.mediumDisplayName = mediumDisplayName;
    }

    public Boolean getSelfTrade() {
        return selfTrade;
    }

    public void setSelfTrade(Boolean selfTrade) {
        this.selfTrade = selfTrade;
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }

        if (!(other instanceof BaseTradeRow)) {
            return false;
        }

        BaseTradeRow rhs = (BaseTradeRow) other;
        return new EqualsBuilder().appendSuper(super.equals(other)).append(mediumDisplayName, rhs.mediumDisplayName).append(tradeTime, rhs.tradeTime).append(currency, rhs.currency).append(eventSequenceNo, rhs.eventSequenceNo).append(state, rhs.state).append(tradeId, rhs.tradeId).append(selfTrade, rhs.selfTrade).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().appendSuper(super.hashCode()).append(mediumDisplayName).append(tradeTime).append(currency).append(eventSequenceNo).append(state).append(tradeId).append(selfTrade).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).appendSuper(super.toString()).append("tradeId", tradeId).append("tradeTime", tradeTime).append("state", state).append("currency", currency).append("eventSequenceNo", eventSequenceNo).append("mediumDisplayName", mediumDisplayName).append("selfTrade", selfTrade).toString();
    }
}