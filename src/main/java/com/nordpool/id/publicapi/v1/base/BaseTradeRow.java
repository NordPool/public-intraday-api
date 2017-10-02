/*
 * Copyright 2017 Nord Pool.
 * This library is intended to aid integration with Nord Pool’s Intraday API and comes without any warranty. Users of this library are responsible for separately testing and ensuring that it works according to their own standards.
 * Please send feedback to idapi@nordpoolgroup.com.
 */

package com.nordpool.id.publicapi.v1.base;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.nordpool.id.publicapi.v1.serialize.DateDeserializer;
import com.nordpool.id.publicapi.v1.serialize.DateSerializer;
import com.nordpool.id.publicapi.v1.trade.Currency;
import com.nordpool.id.publicapi.v1.trade.TradeState;

import java.time.ZonedDateTime;
import java.util.Objects;

public abstract class BaseTradeRow extends BaseRow {
    private String tradeId;

    @JsonSerialize(using = DateSerializer.class)
    @JsonDeserialize(using = DateDeserializer.class)
    private ZonedDateTime tradeTime;
    private TradeState state;

    private Currency currency;
    private Long eventSequenceNo;
    private boolean deleted;
    private String mediumDisplayName;

    public BaseTradeRow() {
    }

    public String getTradeId() {
        return tradeId;
    }

    public void setTradeId(String tradeId) {
        this.tradeId = tradeId;
    }

    public ZonedDateTime getTradeTime() {
        return tradeTime;
    }

    public void setTradeTime(ZonedDateTime tradeTime) {
        this.tradeTime = tradeTime;
    }

    public TradeState getState() {
        return state;
    }

    public void setState(TradeState state) {
        this.state = state;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public Long getEventSequenceNo() {
        return eventSequenceNo;
    }

    public void setEventSequenceNo(Long eventSequenceNo) {
        this.eventSequenceNo = eventSequenceNo;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public String getMediumDisplayName() {
        return mediumDisplayName;
    }

    public void setMediumDisplayName(String mediumDisplayName) {
        this.mediumDisplayName = mediumDisplayName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BaseTradeRow)) return false;
        if (!super.equals(o)) return false;
        BaseTradeRow that = (BaseTradeRow) o;
        return deleted == that.deleted &&
                Objects.equals(tradeId, that.tradeId) &&
                Objects.equals(tradeTime, that.tradeTime) &&
                state == that.state &&
                currency == that.currency &&
                Objects.equals(eventSequenceNo, that.eventSequenceNo) &&
                Objects.equals(mediumDisplayName, that.mediumDisplayName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), tradeId, tradeTime, state, currency, eventSequenceNo, deleted, mediumDisplayName);
    }

    @Override
    public String toString() {
        return "BaseTradeRow{" +
                "tradeId='" + tradeId + '\'' +
                ", tradeTime=" + tradeTime +
                ", state=" + state +
                ", currency=" + currency +
                ", eventSequenceNo=" + eventSequenceNo +
                ", deleted=" + deleted +
                ", mediumDisplayName='" + mediumDisplayName + '\'' +
                "} " + super.toString();
    }
}
