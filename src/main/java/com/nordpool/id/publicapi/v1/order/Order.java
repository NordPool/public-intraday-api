/*
 * Copyright 2017 Nord Pool.
 * This library is intended to aid integration with Nord Pool’s Intraday API and comes without any warranty. Users of this library are responsible for separately testing and ensuring that it works according to their own standards.
 * Please send feedback to idapi@nordpoolgroup.com.
 */

package com.nordpool.id.publicapi.v1.order;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.nordpool.id.publicapi.v1.serialize.DateDeserializer;
import com.nordpool.id.publicapi.v1.serialize.DateSerializer;

import java.time.ZonedDateTime;
import java.util.Objects;

public class Order {
    private String orderId;
    private Long deliveryAreaId;
    private String portfolioId;
    private Long price;
    private Long qty;
    @JsonSerialize(
            using = DateSerializer.class
    )
    @JsonDeserialize(
            using = DateDeserializer.class
    )
    private ZonedDateTime createdAt;
    @JsonSerialize(
            using = DateSerializer.class
    )
    @JsonDeserialize(
            using = DateDeserializer.class
    )
    private ZonedDateTime updatedAt;
    private boolean deleted;
    private OrderOwnershipEnum ownership;

    public Order() {
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Long getDeliveryAreaId() {
        return deliveryAreaId;
    }

    public void setDeliveryAreaId(Long deliveryAreaId) {
        this.deliveryAreaId = deliveryAreaId;
    }

    public String getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Long getQty() {
        return qty;
    }

    public void setQty(Long qty) {
        this.qty = qty;
    }

    public ZonedDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(ZonedDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public ZonedDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(ZonedDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public OrderOwnershipEnum getOwnership() {
        return ownership;
    }

    public void setOwnership(OrderOwnershipEnum ownership) {
        this.ownership = ownership;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Order)) return false;
        Order order = (Order) o;
        return deleted == order.deleted &&
                Objects.equals(orderId, order.orderId) &&
                Objects.equals(deliveryAreaId, order.deliveryAreaId) &&
                Objects.equals(portfolioId, order.portfolioId) &&
                Objects.equals(price, order.price) &&
                Objects.equals(qty, order.qty) &&
                Objects.equals(createdAt, order.createdAt) &&
                Objects.equals(updatedAt, order.updatedAt) &&
                ownership == order.ownership;
    }

    @Override
    public int hashCode() {
        return Objects.hash(orderId, deliveryAreaId, portfolioId, price, qty, createdAt, updatedAt, deleted, ownership);
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", deliveryAreaId=" + deliveryAreaId +
                ", portfolioId='" + portfolioId + '\'' +
                ", price=" + price +
                ", qty=" + qty +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", deleted=" + deleted +
                ", ownership=" + ownership +
                '}';
    }
}
