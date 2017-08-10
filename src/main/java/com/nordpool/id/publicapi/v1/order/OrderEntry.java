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

public class OrderEntry {
    private String clientOrderId;
    private String portfolioId;
    private List<String> contractIds;
    private Long deliveryAreaId;
    private OrderSide side;
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
    private OrderState state;
    private Long clipSize;
    private Long clipPriceChange;

    public OrderEntry() {
    }

    private OrderEntry(Builder builder) {
        setClientOrderId(builder.clientOrderId);
        setPortfolioId(builder.portfolioId);
        setContractIds(builder.contractIds);
        setDeliveryAreaId(builder.deliveryAreaId);
        setSide(builder.side);
        setOrderType(builder.orderType);
        setUnitPrice(builder.unitPrice);
        setQuantity(builder.quantity);
        setTimeInForce(builder.timeInForce);
        setExecutionRestriction(builder.executionRestriction);
        setExpireTime(builder.expireTime);
        setText(builder.text);
        setState(builder.state);
        setClipSize(builder.clipSize);
        setClipPriceChange(builder.clipPriceChange);
    }

    public static Builder newBuilder(OrderEntry copy) {
        Builder builder = new Builder();
        builder.clientOrderId = copy.clientOrderId;
        builder.portfolioId = copy.portfolioId;
        builder.contractIds = copy.contractIds;
        builder.deliveryAreaId = copy.deliveryAreaId;
        builder.side = copy.side;
        builder.orderType = copy.orderType;
        builder.unitPrice = copy.unitPrice;
        builder.quantity = copy.quantity;
        builder.timeInForce = copy.timeInForce;
        builder.executionRestriction = copy.executionRestriction;
        builder.expireTime = copy.expireTime;
        builder.text = copy.text;
        builder.state = copy.state;
        builder.clipSize = copy.clipSize;
        builder.clipPriceChange = copy.clipPriceChange;
        return builder;
    }

    public ExecutionRestriction getExecutionRestriction() {
        return executionRestriction;
    }

    public void setExecutionRestriction(ExecutionRestriction executionRestriction) {
        this.executionRestriction = executionRestriction;
    }

    public static Builder newBuilder() {
        return new Builder();
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OrderEntry)) return false;
        OrderEntry that = (OrderEntry) o;
        return Objects.equals(clientOrderId, that.clientOrderId) &&
                Objects.equals(portfolioId, that.portfolioId) &&
                Objects.equals(contractIds, that.contractIds) &&
                Objects.equals(deliveryAreaId, that.deliveryAreaId) &&
                side == that.side &&
                orderType == that.orderType &&
                Objects.equals(unitPrice, that.unitPrice) &&
                Objects.equals(quantity, that.quantity) &&
                timeInForce == that.timeInForce &&
                executionRestriction == that.executionRestriction &&
                Objects.equals(expireTime, that.expireTime) &&
                Objects.equals(text, that.text) &&
                state == that.state &&
                Objects.equals(clipSize, that.clipSize) &&
                Objects.equals(clipPriceChange, that.clipPriceChange);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clientOrderId, portfolioId, contractIds, deliveryAreaId, side, executionRestriction, orderType, unitPrice, quantity, timeInForce, expireTime, text, state, clipSize, clipPriceChange);
    }

    @Override
    public String toString() {
        return "OrderEntry{" +
                "clientOrderId='" + clientOrderId + '\'' +
                ", portfolioId='" + portfolioId + '\'' +
                ", contractIds=" + contractIds +
                ", deliveryAreaId=" + deliveryAreaId +
                ", side=" + side +
                ", orderType=" + orderType +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", timeInForce=" + timeInForce +
                ", executionRestriction=" + executionRestriction +
                ", expireTime=" + expireTime +
                ", text='" + text + '\'' +
                ", state=" + state +
                ", clipSize=" + clipSize +
                ", clipPriceChange=" + clipPriceChange +
                '}';
    }


    public static final class Builder {
        private String clientOrderId;
        private String portfolioId;
        private List<String> contractIds;
        private Long deliveryAreaId;
        private OrderSide side;
        private OrderType orderType;
        private Long unitPrice;
        private Long quantity;
        private TimeInForce timeInForce;
        private ExecutionRestriction executionRestriction;
        private ZonedDateTime expireTime;
        private String text;
        private OrderState state;
        private Long clipSize;
        private Long clipPriceChange;

        private Builder() {
        }

        public Builder withClientOrderId(String val) {
            clientOrderId = val;
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

        public Builder withDeliveryAreaId(Long val) {
            deliveryAreaId = val;
            return this;
        }

        public Builder withSide(OrderSide val) {
            side = val;
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

        /**
         * Sets the {@code executionRestriction} and returns a reference to this Builder so that the methods can be chained together.
         *
         * @param val the {@code executionRestriction} to set
         * @return a reference to this Builder
         */
        public Builder withExecutionRestriction(ExecutionRestriction val) {
            executionRestriction = val;
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

        public Builder withState(OrderState val) {
            state = val;
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

        public OrderEntry build() {
            return new OrderEntry(this);
        }
    }
}
