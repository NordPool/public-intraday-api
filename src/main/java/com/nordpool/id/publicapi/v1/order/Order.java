/**
 * Copyright 2018 Nord Pool.
 * This library is intended to aid integration with Nord Pool’s Intraday API and comes without any warranty. Users of this library are responsible for separately testing and ensuring that it works according to their own standards.
 * Please send feedback to idapi@nordpoolgroup.com.
 */


package com.nordpool.id.publicapi.v1.order;

import java.time.ZonedDateTime;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Order {

    private String orderId;
    private Long deliveryAreaId;
    /**
     * The portfolio id of the current order
     * 
     */
    private String portfolioId;
    private Long price;
    private Long qty;
    /**
     * Last modification time (status change) of data
     * 
     */
    @JsonDeserialize(using = com.nordpool.id.publicapi.v1.serialize.DateDeserializer.class)
    @JsonSerialize(using = com.nordpool.id.publicapi.v1.serialize.DateSerializer.class)
    private ZonedDateTime createdAt;
    /**
     * Last modification time (status change) of data
     * 
     */
    @JsonDeserialize(using = com.nordpool.id.publicapi.v1.serialize.DateDeserializer.class)
    @JsonSerialize(using = com.nordpool.id.publicapi.v1.serialize.DateSerializer.class)
    private ZonedDateTime updatedAt;
    /**
     * If false: update information with the contents received, If true: delete entity indicated in the message
     * 
     */
    private Boolean deleted;
    /**
     * OWN, COMPANY, OTHER
     * 
     */
    private OrderOwnershipEnum ownership;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Order() {
    }

    /**
     * 
     * @param createdAt
     * @param portfolioId
     * @param deleted
     * @param ownership
     * @param orderId
     * @param price
     * @param qty
     * @param deliveryAreaId
     * @param updatedAt
     */
    public Order(String orderId, Long deliveryAreaId, String portfolioId, Long price, Long qty, ZonedDateTime createdAt, ZonedDateTime updatedAt, Boolean deleted, OrderOwnershipEnum ownership) {
        super();
        this.orderId = orderId;
        this.deliveryAreaId = deliveryAreaId;
        this.portfolioId = portfolioId;
        this.price = price;
        this.qty = qty;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.deleted = deleted;
        this.ownership = ownership;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Order withOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    public Long getDeliveryAreaId() {
        return deliveryAreaId;
    }

    public void setDeliveryAreaId(Long deliveryAreaId) {
        this.deliveryAreaId = deliveryAreaId;
    }

    public Order withDeliveryAreaId(Long deliveryAreaId) {
        this.deliveryAreaId = deliveryAreaId;
        return this;
    }

    /**
     * The portfolio id of the current order
     * 
     */
    public String getPortfolioId() {
        return portfolioId;
    }

    /**
     * The portfolio id of the current order
     * 
     */
    public void setPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
    }

    public Order withPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
        return this;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Order withPrice(Long price) {
        this.price = price;
        return this;
    }

    public Long getQty() {
        return qty;
    }

    public void setQty(Long qty) {
        this.qty = qty;
    }

    public Order withQty(Long qty) {
        this.qty = qty;
        return this;
    }

    /**
     * Last modification time (status change) of data
     * 
     */
    public ZonedDateTime getCreatedAt() {
        return createdAt;
    }

    /**
     * Last modification time (status change) of data
     * 
     */
    public void setCreatedAt(ZonedDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public Order withCreatedAt(ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * Last modification time (status change) of data
     * 
     */
    public ZonedDateTime getUpdatedAt() {
        return updatedAt;
    }

    /**
     * Last modification time (status change) of data
     * 
     */
    public void setUpdatedAt(ZonedDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Order withUpdatedAt(ZonedDateTime updatedAt) {
        this.updatedAt = updatedAt;
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

    public Order withDeleted(Boolean deleted) {
        this.deleted = deleted;
        return this;
    }

    /**
     * OWN, COMPANY, OTHER
     * 
     */
    public OrderOwnershipEnum getOwnership() {
        return ownership;
    }

    /**
     * OWN, COMPANY, OTHER
     * 
     */
    public void setOwnership(OrderOwnershipEnum ownership) {
        this.ownership = ownership;
    }

    public Order withOwnership(OrderOwnershipEnum ownership) {
        this.ownership = ownership;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("orderId", orderId).append("deliveryAreaId", deliveryAreaId).append("portfolioId", portfolioId).append("price", price).append("qty", qty).append("createdAt", createdAt).append("updatedAt", updatedAt).append("deleted", deleted).append("ownership", ownership).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(createdAt).append(portfolioId).append(deleted).append(ownership).append(orderId).append(price).append(qty).append(deliveryAreaId).append(updatedAt).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Order) == false) {
            return false;
        }
        Order rhs = ((Order) other);
        return new EqualsBuilder().append(createdAt, rhs.createdAt).append(portfolioId, rhs.portfolioId).append(deleted, rhs.deleted).append(ownership, rhs.ownership).append(orderId, rhs.orderId).append(price, rhs.price).append(qty, rhs.qty).append(deliveryAreaId, rhs.deliveryAreaId).append(updatedAt, rhs.updatedAt).isEquals();
    }

}
