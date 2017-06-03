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
import com.sun.org.apache.xpath.internal.operations.Bool;

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
    private Boolean deleted;


    public OrderExecutionEntry() {
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
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

        if (eventSequenceNo != that.eventSequenceNo) return false;
        if (revisionNo != that.revisionNo) return false;
        if (deliveryAreaId != that.deliveryAreaId) return false;
        if (unitPrice != that.unitPrice) return false;
        if (quantity != that.quantity) return false;
        if (tenantId != null ? !tenantId.equals(that.tenantId) : that.tenantId != null) return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (orderId != null ? !orderId.equals(that.orderId) : that.orderId != null) return false;
        if (previousOrderId != null ? !previousOrderId.equals(that.previousOrderId) : that.previousOrderId != null)
            return false;
        if (originalOrderId != null ? !originalOrderId.equals(that.originalOrderId) : that.originalOrderId != null)
            return false;
        if (createdAt != null ? !createdAt.equals(that.createdAt) : that.createdAt != null) return false;
        if (updatedAt != null ? !updatedAt.equals(that.updatedAt) : that.updatedAt != null) return false;
        if (clientOrderId != null ? !clientOrderId.equals(that.clientOrderId) : that.clientOrderId != null)
            return false;
        if (portfolioId != null ? !portfolioId.equals(that.portfolioId) : that.portfolioId != null) return false;
        if (contractIds != null ? !contractIds.equals(that.contractIds) : that.contractIds != null) return false;
        if (side != that.side) return false;
        if (orderType != that.orderType) return false;
        if (timeInForce != that.timeInForce) return false;
        if (expireTime != null ? !expireTime.equals(that.expireTime) : that.expireTime != null) return false;
        if (text != null ? !text.equals(that.text) : that.text != null) return false;
        if (state != that.state) return false;
        if (action != that.action) return false;
        if (clipSize != null ? !clipSize.equals(that.clipSize) : that.clipSize != null) return false;
        if (clipPriceChange != null ? !clipPriceChange.equals(that.clipPriceChange) : that.clipPriceChange != null)
            return false;
        if (remainingQuantity != null ? !remainingQuantity.equals(that.remainingQuantity) : that.remainingQuantity != null)
            return false;
        if (errors != null ? !errors.equals(that.errors) : that.errors != null) return false;
        return deleted != null ? deleted.equals(that.deleted) : that.deleted == null;
    }

    @Override
    public int hashCode() {
        int result = (int) (eventSequenceNo ^ (eventSequenceNo >>> 32));
        result = 31 * result + (tenantId != null ? tenantId.hashCode() : 0);
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        result = 31 * result + (orderId != null ? orderId.hashCode() : 0);
        result = 31 * result + (int) (revisionNo ^ (revisionNo >>> 32));
        result = 31 * result + (previousOrderId != null ? previousOrderId.hashCode() : 0);
        result = 31 * result + (originalOrderId != null ? originalOrderId.hashCode() : 0);
        result = 31 * result + (createdAt != null ? createdAt.hashCode() : 0);
        result = 31 * result + (updatedAt != null ? updatedAt.hashCode() : 0);
        result = 31 * result + (clientOrderId != null ? clientOrderId.hashCode() : 0);
        result = 31 * result + (portfolioId != null ? portfolioId.hashCode() : 0);
        result = 31 * result + (contractIds != null ? contractIds.hashCode() : 0);
        result = 31 * result + (int) (deliveryAreaId ^ (deliveryAreaId >>> 32));
        result = 31 * result + (side != null ? side.hashCode() : 0);
        result = 31 * result + (orderType != null ? orderType.hashCode() : 0);
        result = 31 * result + (int) (unitPrice ^ (unitPrice >>> 32));
        result = 31 * result + (int) (quantity ^ (quantity >>> 32));
        result = 31 * result + (timeInForce != null ? timeInForce.hashCode() : 0);
        result = 31 * result + (expireTime != null ? expireTime.hashCode() : 0);
        result = 31 * result + (text != null ? text.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + (action != null ? action.hashCode() : 0);
        result = 31 * result + (clipSize != null ? clipSize.hashCode() : 0);
        result = 31 * result + (clipPriceChange != null ? clipPriceChange.hashCode() : 0);
        result = 31 * result + (remainingQuantity != null ? remainingQuantity.hashCode() : 0);
        result = 31 * result + (errors != null ? errors.hashCode() : 0);
        result = 31 * result + (deleted != null ? deleted.hashCode() : 0);
        return result;
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
                ", deleted=" + deleted +
                '}';
    }
}
