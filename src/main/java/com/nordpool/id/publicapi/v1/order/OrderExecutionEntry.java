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
import java.util.List;
import java.util.Objects;

public class OrderExecutionEntry {
    private long eventSequenceNo;
    private String tenantId;
    private String userId;
    private String orderId;
    private long revisionNo;
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
    private String clientOrderId;
    private String portfolioId;
    private List<String> contractIds;
    private long deliveryAreaId;
    private OrderSide side;
    private OrderType orderType;
    private long unitPrice;
    private long quantity;
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

    public long getEventSequenceNo() {
        return eventSequenceNo;
    }

    public void setEventSequenceNo(long eventSequenceNo) {
        this.eventSequenceNo = eventSequenceNo;
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

    public long getRevisionNo() {
        return revisionNo;
    }

    public void setRevisionNo(long revisionNo) {
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

    public String getClientOrderId() {
        return clientOrderId;
    }

    public void setClientOrderId(String clientOrderId) {
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

    public long getDeliveryAreaId() {
        return deliveryAreaId;
    }

    public void setDeliveryAreaId(long deliveryAreaId) {
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

    public long getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(long unitPrice) {
        this.unitPrice = unitPrice;
    }

    public long getQuantity() {
        return quantity;
    }

    public void setQuantity(long quantity) {
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
        return eventSequenceNo == that.eventSequenceNo &&
                revisionNo == that.revisionNo &&
                deliveryAreaId == that.deliveryAreaId &&
                unitPrice == that.unitPrice &&
                quantity == that.quantity &&
                Objects.equals(tenantId, that.tenantId) &&
                Objects.equals(userId, that.userId) &&
                Objects.equals(orderId, that.orderId) &&
                Objects.equals(previousOrderId, that.previousOrderId) &&
                Objects.equals(originalOrderId, that.originalOrderId) &&
                Objects.equals(createdAt, that.createdAt) &&
                Objects.equals(updatedAt, that.updatedAt) &&
                Objects.equals(clientOrderId, that.clientOrderId) &&
                Objects.equals(portfolioId, that.portfolioId) &&
                Objects.equals(contractIds, that.contractIds) &&
                side == that.side &&
                orderType == that.orderType &&
                timeInForce == that.timeInForce &&
                Objects.equals(expireTime, that.expireTime) &&
                Objects.equals(text, that.text) &&
                state == that.state &&
                action == that.action &&
                Objects.equals(clipSize, that.clipSize) &&
                Objects.equals(clipPriceChange, that.clipPriceChange) &&
                Objects.equals(remainingQuantity, that.remainingQuantity) &&
                Objects.equals(errors, that.errors);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventSequenceNo, tenantId, userId, orderId, revisionNo, previousOrderId, originalOrderId, createdAt, updatedAt, clientOrderId, portfolioId, contractIds, deliveryAreaId, side, orderType, unitPrice, quantity, timeInForce, expireTime, text, state, action, clipSize, clipPriceChange, remainingQuantity, errors);
    }

    @Override
    public String toString() {
        return "OrderExecutionEntry{" +
                "eventSequenceNo=" + eventSequenceNo +
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
