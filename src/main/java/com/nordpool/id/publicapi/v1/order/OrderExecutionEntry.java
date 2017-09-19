/*
 * Copyright 2017 Nord Pool.
 * This library is intended to aid integration with Nord Pool’s Intraday API and comes without any warranty. Users of this library are responsible for separately testing and ensuring that it works according to their own standards.
 * Please send feedback to idapi@nordpoolgroup.com.
 */

package com.nordpool.id.publicapi.v1.order;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.nordpool.id.publicapi.v1.order.error.Error;
import com.nordpool.id.publicapi.v1.serialize.DateDeserializer;
import com.nordpool.id.publicapi.v1.serialize.DateSerializer;

import java.time.ZonedDateTime;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

public class OrderExecutionEntry {
    private Long eventSequenceNo;
    private String marketId;
    private String tenantId;
    private String userId;
    private String orderId;
    private Long revisionNo;
    private String previousOrderId;
    private String originalOrderId;
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
    private UUID clientOrderId;
    private String portfolioId;
    private List<String> contractIds;
    private Long deliveryAreaId;
    private OrderSide side;
    private OrderType orderType;
    private Long unitPrice;
    private Long quantity;
    private TimeInForce timeInForce;
    @JsonSerialize(
            using = DateSerializer.class
    )
    @JsonDeserialize(
            using = DateDeserializer.class
    )
    private ZonedDateTime expireTime;
    private String text;
    private OrderState state;
    private OrderAction action;
    private Long clipSize;
    private Long clipPriceChange;
    private Long remainingQuantity;
    private List<Error> errors;

    public OrderExecutionEntry() {
    }

    public Long getEventSequenceNo() {
        return eventSequenceNo;
    }

    public void setEventSequenceNo(Long eventSequenceNo) {
        this.eventSequenceNo = eventSequenceNo;
    }

    public String getMarketId() {
        return marketId;
    }

    public void setMarketId(String marketId) {
        this.marketId = marketId;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Long getRevisionNo() {
        return revisionNo;
    }

    public void setRevisionNo(Long revisionNo) {
        this.revisionNo = revisionNo;
    }

    public String getPreviousOrderId() {
        return previousOrderId;
    }

    public void setPreviousOrderId(String previousOrderId) {
        this.previousOrderId = previousOrderId;
    }

    public String getOriginalOrderId() {
        return originalOrderId;
    }

    public void setOriginalOrderId(String originalOrderId) {
        this.originalOrderId = originalOrderId;
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

    public UUID getClientOrderId() {
        return clientOrderId;
    }

    public void setClientOrderId(UUID clientOrderId) {
        this.clientOrderId = clientOrderId;
    }

    public String getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
    }

    public List<String> getContractIds() {
        return contractIds;
    }

    public void setContractIds(List<String> contractIds) {
        this.contractIds = contractIds;
    }

    public Long getDeliveryAreaId() {
        return deliveryAreaId;
    }

    public void setDeliveryAreaId(Long deliveryAreaId) {
        this.deliveryAreaId = deliveryAreaId;
    }

    public OrderSide getSide() {
        return side;
    }

    public void setSide(OrderSide side) {
        this.side = side;
    }

    public OrderType getOrderType() {
        return orderType;
    }

    public void setOrderType(OrderType orderType) {
        this.orderType = orderType;
    }

    public Long getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Long unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public TimeInForce getTimeInForce() {
        return timeInForce;
    }

    public void setTimeInForce(TimeInForce timeInForce) {
        this.timeInForce = timeInForce;
    }

    public ZonedDateTime getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(ZonedDateTime expireTime) {
        this.expireTime = expireTime;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public OrderState getState() {
        return state;
    }

    public void setState(OrderState state) {
        this.state = state;
    }

    public OrderAction getAction() {
        return action;
    }

    public void setAction(OrderAction action) {
        this.action = action;
    }

    public Long getClipSize() {
        return clipSize;
    }

    public void setClipSize(Long clipSize) {
        this.clipSize = clipSize;
    }

    public Long getClipPriceChange() {
        return clipPriceChange;
    }

    public void setClipPriceChange(Long clipPriceChange) {
        this.clipPriceChange = clipPriceChange;
    }

    public Long getRemainingQuantity() {
        return remainingQuantity;
    }

    public void setRemainingQuantity(Long remainingQuantity) {
        this.remainingQuantity = remainingQuantity;
    }

    public List<Error> getErrors() {
        return errors;
    }

    public void setErrors(List<Error> errors) {
        this.errors = errors;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OrderExecutionEntry)) return false;
        OrderExecutionEntry that = (OrderExecutionEntry) o;
        return Objects.equals(getEventSequenceNo(), that.getEventSequenceNo()) &&
                Objects.equals(getMarketId(), that.getMarketId()) &&
                Objects.equals(getTenantId(), that.getTenantId()) &&
                Objects.equals(getUserId(), that.getUserId()) &&
                Objects.equals(getOrderId(), that.getOrderId()) &&
                Objects.equals(getRevisionNo(), that.getRevisionNo()) &&
                Objects.equals(getPreviousOrderId(), that.getPreviousOrderId()) &&
                Objects.equals(getOriginalOrderId(), that.getOriginalOrderId()) &&
                Objects.equals(getCreatedAt(), that.getCreatedAt()) &&
                Objects.equals(getUpdatedAt(), that.getUpdatedAt()) &&
                Objects.equals(getClientOrderId(), that.getClientOrderId()) &&
                Objects.equals(getPortfolioId(), that.getPortfolioId()) &&
                Objects.equals(getContractIds(), that.getContractIds()) &&
                Objects.equals(getDeliveryAreaId(), that.getDeliveryAreaId()) &&
                getSide() == that.getSide() &&
                getOrderType() == that.getOrderType() &&
                Objects.equals(getUnitPrice(), that.getUnitPrice()) &&
                Objects.equals(getQuantity(), that.getQuantity()) &&
                getTimeInForce() == that.getTimeInForce() &&
                Objects.equals(getExpireTime(), that.getExpireTime()) &&
                Objects.equals(getText(), that.getText()) &&
                getState() == that.getState() &&
                getAction() == that.getAction() &&
                Objects.equals(getClipSize(), that.getClipSize()) &&
                Objects.equals(getClipPriceChange(), that.getClipPriceChange()) &&
                Objects.equals(getRemainingQuantity(), that.getRemainingQuantity()) &&
                Objects.equals(getErrors(), that.getErrors());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getEventSequenceNo(), getMarketId(), getTenantId(), getUserId(), getOrderId(), getRevisionNo(), getPreviousOrderId(), getOriginalOrderId(), getCreatedAt(), getUpdatedAt(), getClientOrderId(), getPortfolioId(), getContractIds(), getDeliveryAreaId(), getSide(), getOrderType(), getUnitPrice(), getQuantity(), getTimeInForce(), getExpireTime(), getText(), getState(), getAction(), getClipSize(), getClipPriceChange(), getRemainingQuantity(), getErrors());
    }

    @Override
    public String toString() {
        return "OrderExecutionEntry{" +
                "eventSequenceNo=" + eventSequenceNo +
                ", marketId='" + marketId + '\'' +
                ", tenantId='" + tenantId + '\'' +
                ", userId='" + userId + '\'' +
                ", orderId='" + orderId + '\'' +
                ", revisionNo=" + revisionNo +
                ", previousOrderId='" + previousOrderId + '\'' +
                ", originalOrderId='" + originalOrderId + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", clientOrderId='" + clientOrderId + '\'' +
                ", portfolioId='" + portfolioId + '\'' +
                ", contractIds=" + contractIds +
                ", deliveryAreaId=" + deliveryAreaId +
                ", side=" + side +
                ", orderType=" + orderType +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", timeInForce=" + timeInForce +
                ", expireTime=" + expireTime +
                ", text='" + text + '\'' +
                ", state=" + state +
                ", action=" + action +
                ", clipSize=" + clipSize +
                ", clipPriceChange=" + clipPriceChange +
                ", remainingQuantity=" + remainingQuantity +
                ", errors=" + errors +
                '}';
    }
}
