/**
 * Copyright 2021 Nord Pool.
 * This library is intended to aid integration with Nord Pool’s Intraday API and comes without any warranty. Users of this library are responsible for separately testing and ensuring that it works according to their own standards.
 * Please send feedback to idapi@nordpoolgroup.com.
 */


package com.nordpool.id.publicapi.v1.statistic;

import java.time.ZonedDateTime;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Trade history
 * 
 */
public class TradeHistory {

    private Long unitPrice;
    private Long quantity;
    /**
     * Time of the last trade
     * 
     */
    @JsonDeserialize(using = com.nordpool.id.publicapi.v1.serialize.DateDeserializer.class)
    @JsonSerialize(using = com.nordpool.id.publicapi.v1.serialize.DateSerializer.class)
    private ZonedDateTime tradeTime;

    /**
     * No args constructor for use in serialization
     * 
     */
    public TradeHistory() {
    }

    /**
     * 
     * @param unitPrice
     * @param tradeTime
     * @param quantity
     */
    public TradeHistory(Long unitPrice, Long quantity, ZonedDateTime tradeTime) {
        super();
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.tradeTime = tradeTime;
    }

    public Long getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Long unitPrice) {
        this.unitPrice = unitPrice;
    }

    public TradeHistory withUnitPrice(Long unitPrice) {
        this.unitPrice = unitPrice;
        return this;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public TradeHistory withQuantity(Long quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     * Time of the last trade
     * 
     */
    public ZonedDateTime getTradeTime() {
        return tradeTime;
    }

    /**
     * Time of the last trade
     * 
     */
    public void setTradeTime(ZonedDateTime tradeTime) {
        this.tradeTime = tradeTime;
    }

    public TradeHistory withTradeTime(ZonedDateTime tradeTime) {
        this.tradeTime = tradeTime;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("unitPrice", unitPrice).append("quantity", quantity).append("tradeTime", tradeTime).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(unitPrice).append(tradeTime).append(quantity).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TradeHistory) == false) {
            return false;
        }
        TradeHistory rhs = ((TradeHistory) other);
        return new EqualsBuilder().append(unitPrice, rhs.unitPrice).append(tradeTime, rhs.tradeTime).append(quantity, rhs.quantity).isEquals();
    }

}
