/**
 * Copyright 2022 Nord Pool.
 * This library is intended to aid integration with Nord Pool’s Intraday API and comes without any warranty. Users of this library are responsible for separately testing and ensuring that it works according to their own standards.
 * Please send feedback to idapi@nordpoolgroup.com.
 */

package com.nordpool.id.publicapi.v1.statistic;

import java.time.ZonedDateTime;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

/**
 * Represents aggregated private statistical data for a specific contract in a delivery area,
 * including portfolio, buy/sell quantities and prices, net position, and last trade information.
 *
 */
public class PrivateStatisticRow extends BaseStatisticRow {

    private String portfolioId;
    private Long ownBuyQuantity;
    private Long ownBuyAveragePrice;
    private Long ownSellQuantity;
    private Long ownSellAveragePrice;
    private Long netQuantity;
    private Long netPosition;
    /**
     * Time of the last trade
     */
    @JsonDeserialize(using = com.nordpool.id.publicapi.v1.serialize.DateDeserializer.class)
    @JsonSerialize(using = com.nordpool.id.publicapi.v1.serialize.DateSerializer.class)
    private ZonedDateTime lastTradeTime;
    /**
     * If false: update information with the contents received, If true: delete entity indicated in the message
     */
    private Boolean deleted;

    /**
     * No args constructor for use in serialization
     */
    public PrivateStatisticRow() {}

    /**
     *
     * @param portfolioId
     * @param ownBuyQuantity
     * @param ownBuyAveragePrice
     * @param ownSellQuantity
     * @param ownSellAveragePrice
     * @param netQuantity
     * @param netPosition
     * @param lastTradeTime
     * @param deliveryAreaId
     * @param contractId
     * @param updatedAt
     * @param deleted
     */
    public PrivateStatisticRow(String portfolioId, Long ownBuyQuantity, Long ownBuyAveragePrice, Long ownSellQuantity, Long ownSellAveragePrice, Long netQuantity, Long netPosition, ZonedDateTime lastTradeTime, Long deliveryAreaId, String contractId, ZonedDateTime updatedAt, Boolean deleted) {
        super(deliveryAreaId, contractId, updatedAt);
        this.portfolioId = portfolioId;
        this.ownBuyQuantity = ownBuyQuantity;
        this.ownBuyAveragePrice = ownBuyAveragePrice;
        this.ownSellQuantity = ownSellQuantity;
        this.ownSellAveragePrice = ownSellAveragePrice;
        this.netQuantity = netQuantity;
        this.netPosition = netPosition;
        this.lastTradeTime = lastTradeTime;
        this.deleted = deleted;
    }

    public String getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
    }

    public PrivateStatisticRow withPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
        return this;
    }

    public Long getOwnBuyQuantity() {
        return ownBuyQuantity;
    }

    public void setOwnBuyQuantity(Long ownBuyQuantity) {
        this.ownBuyQuantity = ownBuyQuantity;
    }

    public PrivateStatisticRow withOwnBuyQuantity(Long ownBuyQuantity) {
        this.ownBuyQuantity = ownBuyQuantity;
        return this;
    }

    public Long getOwnBuyAveragePrice() {
        return ownBuyAveragePrice;
    }

    public void setOwnBuyAveragePrice(Long ownBuyAveragePrice) {
        this.ownBuyAveragePrice = ownBuyAveragePrice;
    }

    public PrivateStatisticRow withOwnBuyAveragePrice(Long ownBuyAveragePrice) {
        this.ownBuyAveragePrice = ownBuyAveragePrice;
        return this;
    }

    public Long getOwnSellQuantity() {
        return ownSellQuantity;
    }

    public void setOwnSellQuantity(Long ownSellQuantity) {
        this.ownSellQuantity = ownSellQuantity;
    }

    public PrivateStatisticRow withOwnSellQuantity(Long ownSellQuantity) {
        this.ownSellQuantity = ownSellQuantity;
        return this;
    }

    public Long getOwnSellAveragePrice() {
        return ownSellAveragePrice;
    }

    public void setOwnSellAveragePrice(Long ownSellAveragePrice) {
        this.ownSellAveragePrice = ownSellAveragePrice;
    }

    public PrivateStatisticRow withOwnSellAveragePrice(Long ownSellAveragePrice) {
        this.ownSellAveragePrice = ownSellAveragePrice;
        return this;
    }

    public Long getNetQuantity() {
        return netQuantity;
    }

    public void setNetQuantity(Long netQuantity) {
        this.netQuantity = netQuantity;
    }

    public PrivateStatisticRow withNetQuantity(Long netQuantity) {
        this.netQuantity = netQuantity;
        return this;
    }

    public Long getNetPosition() {
        return netPosition;
    }

    public void setNetPosition(Long netPosition) {
        this.netPosition = netPosition;
    }

    public PrivateStatisticRow withNetPosition(Long netPosition) {
        this.netPosition = netPosition;
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

    /**
     * Time of the last trade
     *
     */
    public PrivateStatisticRow withLastTradeTime(ZonedDateTime lastTradeTime) {
        this.lastTradeTime = lastTradeTime;
        return this;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public PrivateStatisticRow withDeleted(Boolean deleted) {
        this.deleted = deleted;
        return this;
    }

    @Override
    public PrivateStatisticRow withDeliveryAreaId(Long deliveryAreaId) {
        super.withDeliveryAreaId(deliveryAreaId);
        return this;
    }

    @Override
    public PrivateStatisticRow withContractId(String contractId) {
        super.withContractId(contractId);
        return this;
    }

    @Override
    public PrivateStatisticRow withUpdatedAt(ZonedDateTime updatedAt) {
        super.withUpdatedAt(updatedAt);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this)
            .appendSuper(super.toString())
            .append("portfolioId", portfolioId)
            .append("ownBuyQuantity", ownBuyQuantity)
            .append("ownBuyAveragePrice", ownBuyAveragePrice)
            .append("ownSellQuantity", ownSellQuantity)
            .append("ownSellAveragePrice", ownSellAveragePrice)
            .append("netQuantity", netQuantity)
            .append("netPosition", netPosition)
            .append("lastTradeTime", lastTradeTime)
            .append("deleted", deleted)
            .toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
            .appendSuper(super.hashCode())
            .append(portfolioId)
            .append(ownBuyQuantity)
            .append(ownBuyAveragePrice)
            .append(ownSellQuantity)
            .append(ownSellAveragePrice)
            .append(netQuantity)
            .append(netPosition)
            .append(lastTradeTime)
            .append(deleted)
            .toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof PrivateStatisticRow)) {
            return false;
        }
        PrivateStatisticRow rhs = (PrivateStatisticRow) other;
        return new EqualsBuilder()
            .appendSuper(super.equals(other))
            .append(portfolioId, rhs.portfolioId)
            .append(ownBuyQuantity, rhs.ownBuyQuantity)
            .append(ownBuyAveragePrice, rhs.ownBuyAveragePrice)
            .append(ownSellQuantity, rhs.ownSellQuantity)
            .append(ownSellAveragePrice, rhs.ownSellAveragePrice)
            .append(netQuantity, rhs.netQuantity)
            .append(netPosition, rhs.netPosition)
            .append(lastTradeTime, rhs.lastTradeTime)
            .append(deleted, rhs.deleted)
            .isEquals();
    }
}
