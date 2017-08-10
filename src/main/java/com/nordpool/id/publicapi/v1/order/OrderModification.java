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

public class OrderModification {
    private Long revisionNo;
    private String clientOrderId;
    private String orderId;
    private String portfolioId;
    private List<String> contractIds;
    private OrderType orderType;
    private Long unitPrice;
    private Long quantity;
    private TimeInForce timeInForce;
    private ExecutionRestriction executionRestriction;
    @JsonSerialize(
            using = DateSerializer.class
    )
    @JsonDeserialize(
            using = DateDeserializer.class
    )
    private ZonedDateTime expireTime;
    private String text;
    private Long clipSize;
    private Long clipPriceChange;

    public OrderModification() {
    }

    private OrderModification(Builder builder) {
        setRevisionNo(builder.revisionNo);
        setClientOrderId(builder.clientOrderId);
        setOrderId(builder.orderId);
        setPortfolioId(builder.portfolioId);
        setContractIds(builder.contractIds);
        setOrderType(builder.orderType);
        setUnitPrice(builder.unitPrice);
        setQuantity(builder.quantity);
        setTimeInForce(builder.timeInForce);
        setExpireTime(builder.expireTime);
        setText(builder.text);
        setClipSize(builder.clipSize);
        setClipPriceChange(builder.clipPriceChange);
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public Long getRevisionNo() {
        return revisionNo;
    }

    public void setRevisionNo(Long revisionNo) {
        this.revisionNo = revisionNo;
    }

    public String getClientOrderId() {
        return clientOrderId;
    }

    public void setClientOrderId(String clientOrderId) {
        this.clientOrderId = clientOrderId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
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

    public ExecutionRestriction getExecutionRestriction() {
        return executionRestriction;
    }

    public void setExecutionRestriction(ExecutionRestriction executionRestriction) {
        this.executionRestriction = executionRestriction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OrderModification)) return false;
        OrderModification that = (OrderModification) o;
        return Objects.equals(revisionNo, that.revisionNo) &&
                Objects.equals(clientOrderId, that.clientOrderId) &&
                Objects.equals(orderId, that.orderId) &&
                Objects.equals(portfolioId, that.portfolioId) &&
                Objects.equals(contractIds, that.contractIds) &&
                orderType == that.orderType &&
                Objects.equals(unitPrice, that.unitPrice) &&
                Objects.equals(quantity, that.quantity) &&
                timeInForce == that.timeInForce &&
                executionRestriction == that.executionRestriction &&
                Objects.equals(expireTime, that.expireTime) &&
                Objects.equals(text, that.text) &&
                Objects.equals(clipSize, that.clipSize) &&
                Objects.equals(clipPriceChange, that.clipPriceChange);
    }

    @Override
    public int hashCode() {
        return Objects.hash(revisionNo, clientOrderId, orderId, portfolioId, executionRestriction, contractIds, orderType, unitPrice, quantity, timeInForce, expireTime, text, clipSize, clipPriceChange);
    }

    @Override
    public String toString() {
        return "OrderModification{" +
                "revisionNo=" + revisionNo +
                ", clientOrderId='" + clientOrderId + '\'' +
                ", orderId='" + orderId + '\'' +
                ", portfolioId='" + portfolioId + '\'' +
                ", contractIds=" + contractIds +
                ", orderType=" + orderType +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", timeInForce=" + timeInForce +
                ", executionRestriction=" + executionRestriction +
                ", expireTime=" + expireTime +
                ", text='" + text + '\'' +
                ", clipSize=" + clipSize +
                ", clipPriceChange=" + clipPriceChange +
                '}';
    }


    public static final class Builder {
        private Long revisionNo;
        private String clientOrderId;
        private String orderId;
        private String portfolioId;
        private List<String> contractIds;
        private OrderType orderType;
        private Long unitPrice;
        private Long quantity;
        private TimeInForce timeInForce;
        private ZonedDateTime expireTime;
        private String text;
        private Long clipSize;
        private Long clipPriceChange;

        private Builder() {
        }

        public Builder withRevisionNo(Long val) {
            revisionNo = val;
            return this;
        }

        public Builder withClientOrderId(String val) {
            clientOrderId = val;
            return this;
        }

        public Builder withOrderId(String val) {
            orderId = val;
            return this;
        }

        public Builder withPortfolioId(String val) {
            portfolioId = val;
            return this;
        }

        public Builder withContractIds(List<String> val) {
            contractIds = val;
            return this;
        }

        public Builder withOrderType(OrderType val) {
            orderType = val;
            return this;
        }

        public Builder withUnitPrice(Long val) {
            unitPrice = val;
            return this;
        }

        public Builder withQuantity(Long val) {
            quantity = val;
            return this;
        }

        public Builder withTimeInForce(TimeInForce val) {
            timeInForce = val;
            return this;
        }

        public Builder withExpireTime(ZonedDateTime val) {
            expireTime = val;
            return this;
        }

        public Builder withText(String val) {
            text = val;
            return this;
        }

        public Builder withClipSize(Long val) {
            clipSize = val;
            return this;
        }

        public Builder withClipPriceChange(Long val) {
            clipPriceChange = val;
            return this;
        }

        public OrderModification build() {
            return new OrderModification(this);
        }
    }
}
