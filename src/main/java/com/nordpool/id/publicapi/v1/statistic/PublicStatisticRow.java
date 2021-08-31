/**
 * Copyright 2021 Nord Pool.
 * This library is intended to aid integration with Nord Pool’s Intraday API and comes without any warranty. Users of this library are responsible for separately testing and ensuring that it works according to their own standards.
 * Please send feedback to idapi@nordpoolgroup.com.
 */


package com.nordpool.id.publicapi.v1.statistic;

import java.time.ZonedDateTime;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Provides a list of contracts available in the area with id <deliveryAreaId> and aggregated statistical data for each contract.
 * 
 */
public class PublicStatisticRow
    extends BaseStatisticRow
{

    private Long lastPrice;
    private Long lastQuantity;
    /**
     * Time of the last trade
     * 
     */
    @JsonDeserialize(using = com.nordpool.id.publicapi.v1.serialize.DateDeserializer.class)
    @JsonSerialize(using = com.nordpool.id.publicapi.v1.serialize.DateSerializer.class)
    private ZonedDateTime lastTradeTime;
    private Long highestPrice;
    private Long lowestPrice;
    private Long vwap;
    private Long turnover;
    private Long dayAheadPrice;
    /**
     * If false: update information with the contents received, If true: delete entity indicated in the message
     * 
     */
    private Boolean deleted;
    /**
     * UP - Last price is higher than a previous price, DOWN - Last price is lower than a previous price, EQUAL - Last price is equal to a previous price
     * 
     */
    private Tendency tendency;
    /**
     * List of trade histories
     * 
     */
    private List<TradeHistory> histories = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public PublicStatisticRow() {
    }

    /**
     * 
     * @param highestPrice
     * @param lowestPrice
     * @param tendency
     * @param vwap
     * @param histories
     * @param deleted
     * @param lastTradeTime
     * @param contractId
     * @param dayAheadPrice
     * @param deliveryAreaId
     * @param lastQuantity
     * @param turnover
     * @param lastPrice
     * @param updatedAt
     */
    public PublicStatisticRow(Long lastPrice, Long lastQuantity, ZonedDateTime lastTradeTime, Long highestPrice, Long lowestPrice, Long vwap, Long turnover, Long dayAheadPrice, Boolean deleted, Tendency tendency, List<TradeHistory> histories, Long deliveryAreaId, String contractId, ZonedDateTime updatedAt) {
        super(deliveryAreaId, contractId, updatedAt);
        this.lastPrice = lastPrice;
        this.lastQuantity = lastQuantity;
        this.lastTradeTime = lastTradeTime;
        this.highestPrice = highestPrice;
        this.lowestPrice = lowestPrice;
        this.vwap = vwap;
        this.turnover = turnover;
        this.dayAheadPrice = dayAheadPrice;
        this.deleted = deleted;
        this.tendency = tendency;
        this.histories = histories;
    }

    public Long getLastPrice() {
        return lastPrice;
    }

    public void setLastPrice(Long lastPrice) {
        this.lastPrice = lastPrice;
    }

    public PublicStatisticRow withLastPrice(Long lastPrice) {
        this.lastPrice = lastPrice;
        return this;
    }

    public Long getLastQuantity() {
        return lastQuantity;
    }

    public void setLastQuantity(Long lastQuantity) {
        this.lastQuantity = lastQuantity;
    }

    public PublicStatisticRow withLastQuantity(Long lastQuantity) {
        this.lastQuantity = lastQuantity;
        return this;
    }

    /**
     * Time of the last trade
     * 
     */
    public ZonedDateTime getLastTradeTime() {
        return lastTradeTime;
    }

    /**
     * Time of the last trade
     * 
     */
    public void setLastTradeTime(ZonedDateTime lastTradeTime) {
        this.lastTradeTime = lastTradeTime;
    }

    public PublicStatisticRow withLastTradeTime(ZonedDateTime lastTradeTime) {
        this.lastTradeTime = lastTradeTime;
        return this;
    }

    public Long getHighestPrice() {
        return highestPrice;
    }

    public void setHighestPrice(Long highestPrice) {
        this.highestPrice = highestPrice;
    }

    public PublicStatisticRow withHighestPrice(Long highestPrice) {
        this.highestPrice = highestPrice;
        return this;
    }

    public Long getLowestPrice() {
        return lowestPrice;
    }

    public void setLowestPrice(Long lowestPrice) {
        this.lowestPrice = lowestPrice;
    }

    public PublicStatisticRow withLowestPrice(Long lowestPrice) {
        this.lowestPrice = lowestPrice;
        return this;
    }

    public Long getVwap() {
        return vwap;
    }

    public void setVwap(Long vwap) {
        this.vwap = vwap;
    }

    public PublicStatisticRow withVwap(Long vwap) {
        this.vwap = vwap;
        return this;
    }

    public Long getTurnover() {
        return turnover;
    }

    public void setTurnover(Long turnover) {
        this.turnover = turnover;
    }

    public PublicStatisticRow withTurnover(Long turnover) {
        this.turnover = turnover;
        return this;
    }

    public Long getDayAheadPrice() {
        return dayAheadPrice;
    }

    public void setDayAheadPrice(Long dayAheadPrice) {
        this.dayAheadPrice = dayAheadPrice;
    }

    public PublicStatisticRow withDayAheadPrice(Long dayAheadPrice) {
        this.dayAheadPrice = dayAheadPrice;
        return this;
    }

    /**
     * If false: update information with the contents received, If true: delete entity indicated in the message
     * 
     */
    public Boolean getDeleted() {
        return deleted;
    }

    /**
     * If false: update information with the contents received, If true: delete entity indicated in the message
     * 
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public PublicStatisticRow withDeleted(Boolean deleted) {
        this.deleted = deleted;
        return this;
    }

    /**
     * UP - Last price is higher than a previous price, DOWN - Last price is lower than a previous price, EQUAL - Last price is equal to a previous price
     * 
     */
    public Tendency getTendency() {
        return tendency;
    }

    /**
     * UP - Last price is higher than a previous price, DOWN - Last price is lower than a previous price, EQUAL - Last price is equal to a previous price
     * 
     */
    public void setTendency(Tendency tendency) {
        this.tendency = tendency;
    }

    public PublicStatisticRow withTendency(Tendency tendency) {
        this.tendency = tendency;
        return this;
    }

    /**
     * List of trade histories
     * 
     */
    public List<TradeHistory> getHistories() {
        return histories;
    }

    /**
     * List of trade histories
     * 
     */
    public void setHistories(List<TradeHistory> histories) {
        this.histories = histories;
    }

    public PublicStatisticRow withHistories(List<TradeHistory> histories) {
        this.histories = histories;
        return this;
    }

    @Override
    public PublicStatisticRow withDeliveryAreaId(Long deliveryAreaId) {
        super.withDeliveryAreaId(deliveryAreaId);
        return this;
    }

    @Override
    public PublicStatisticRow withContractId(String contractId) {
        super.withContractId(contractId);
        return this;
    }

    @Override
    public PublicStatisticRow withUpdatedAt(ZonedDateTime updatedAt) {
        super.withUpdatedAt(updatedAt);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).appendSuper(super.toString()).append("lastPrice", lastPrice).append("lastQuantity", lastQuantity).append("lastTradeTime", lastTradeTime).append("highestPrice", highestPrice).append("lowestPrice", lowestPrice).append("vwap", vwap).append("turnover", turnover).append("dayAheadPrice", dayAheadPrice).append("deleted", deleted).append("tendency", tendency).append("histories", histories).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().appendSuper(super.hashCode()).append(highestPrice).append(lowestPrice).append(deleted).append(tendency).append(lastTradeTime).append(vwap).append(dayAheadPrice).append(histories).append(lastQuantity).append(turnover).append(lastPrice).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PublicStatisticRow) == false) {
            return false;
        }
        PublicStatisticRow rhs = ((PublicStatisticRow) other);
        return new EqualsBuilder().appendSuper(super.equals(other)).append(highestPrice, rhs.highestPrice).append(lowestPrice, rhs.lowestPrice).append(deleted, rhs.deleted).append(tendency, rhs.tendency).append(lastTradeTime, rhs.lastTradeTime).append(vwap, rhs.vwap).append(dayAheadPrice, rhs.dayAheadPrice).append(histories, rhs.histories).append(lastQuantity, rhs.lastQuantity).append(turnover, rhs.turnover).append(lastPrice, rhs.lastPrice).isEquals();
    }

}
