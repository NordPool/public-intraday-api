/**
 * Copyright 2023 Nord Pool.
 * This library is intended to aid integration with Nord Pool’s Intraday API and comes without any warranty. Users of this library are responsible for separately testing and ensuring that it works according to their own standards.
 * Please send feedback to idapi@nordpoolgroup.com.
 */

package com.nordpool.id.publicapi.v2.trade.leg;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.nordpool.id.publicapi.v1.order.*;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.time.ZonedDateTime;

public class PrivateTradeLeg
    extends BaseTradeLeg
{
    private String portfolioId;
    private String orderId;
    private String userId;
    @JsonDeserialize(using = com.nordpool.id.publicapi.v1.serialize.DateDeserializer.class)
    @JsonSerialize(using = com.nordpool.id.publicapi.v1.serialize.DateSerializer.class)
    private ZonedDateTime deliveryStart;
    @JsonDeserialize(using = com.nordpool.id.publicapi.v1.serialize.DateDeserializer.class)
    @JsonSerialize(using = com.nordpool.id.publicapi.v1.serialize.DateSerializer.class)
    private ZonedDateTime deliveryEnd;

    /**
     * LIMIT, ICEBERG, USER_DEFINED_BLOCK
     *
     */
    private OrderType orderType;
    private String clientOrderId;

    /**
     * No args constructor for use in serialization
     *
     */
    public PrivateTradeLeg() {
    }

    /**
     *
     * @param contractId
     * @param side
     * @param unitPrice
     * @param quantity
     * @param deliveryAreaId
     * @param aggressor
     * @param portfolioId
     * @param orderId
     * @param userId
     * @param deliveryStart
     * @param deliveryEnd
     * @param orderType
     * @param clientOrderId
     */
    public PrivateTradeLeg(String contractId, OrderSide side, Long unitPrice, Long quantity, Long deliveryAreaId, Boolean aggressor, String portfolioId, String orderId, String userId, ZonedDateTime deliveryStart, ZonedDateTime deliveryEnd, OrderType orderType, String clientOrderId) {
        super(contractId, side, unitPrice, quantity, deliveryAreaId, aggressor);
        this.portfolioId = portfolioId;
        this.orderId = orderId;
        this.userId = userId;
        this.deliveryStart = deliveryStart;
        this.deliveryEnd = deliveryEnd;
        this.orderType = orderType;
        this.clientOrderId = clientOrderId;
    }

    public String getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public ZonedDateTime getDeliveryStart() {
        return deliveryStart;
    }

    public void setDeliveryStart(ZonedDateTime deliveryStart) {
        this.deliveryStart = deliveryStart;
    }

    public ZonedDateTime getDeliveryEnd() {
        return deliveryEnd;
    }

    public void setDeliveryEnd(ZonedDateTime deliveryEnd) {
        this.deliveryEnd = deliveryEnd;
    }

    public OrderType getOrderType() {
        return orderType;
    }

    public void setOrderType(OrderType orderType) {
        this.orderType = orderType;
    }

    public String getClientOrderId() {
        return clientOrderId;
    }

    public void setClientOrderId(String clientOrderId) {
        this.clientOrderId = clientOrderId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).appendSuper(super.toString()).append("portfolioId", portfolioId).append("orderId", orderId).append("userId", userId).append("deliveryStart", deliveryStart).append("deliveryEnd", deliveryEnd).append("orderType", orderType).append("clientOrderId", clientOrderId).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().appendSuper(super.hashCode()).append(orderType).append(portfolioId).append(deliveryStart).append(deliveryEnd).append(orderId).append(clientOrderId).append(userId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof com.nordpool.id.publicapi.v2.trade.leg.PrivateTradeLeg) == false) {
            return false;
        }
        com.nordpool.id.publicapi.v2.trade.leg.PrivateTradeLeg rhs = ((com.nordpool.id.publicapi.v2.trade.leg.PrivateTradeLeg) other);
        return new EqualsBuilder().appendSuper(super.equals(other)).append(orderType, rhs.orderType).append(portfolioId, rhs.portfolioId).append(deliveryStart, rhs.deliveryStart).append(deliveryEnd, rhs.deliveryEnd).append(orderId, rhs.orderId).append(clientOrderId, rhs.clientOrderId).append(userId, rhs.userId).isEquals();
    }
}
