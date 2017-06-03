/*
 * Copyright 2017 Nord Pool.
 * This library is intended to aid integration with Nord Pool’s Intraday API and comes without any warranty. Users of this library are responsible for separately testing and ensuring that it works according to their own standards.
 * Please send feedback to idapi@nordpoolgroup.com.
 */

package com.nordpool.id.publicapi.v1.order.request;

import com.nordpool.id.publicapi.v1.order.OrderModification;
import com.nordpool.id.publicapi.v1.order.OrderModificationType;

import java.util.List;
import java.util.Objects;

public class OrderModificationRequest {
    private String requestId;
    private OrderModificationType orderModificationType;
    private String userId;
    private List<OrderModification> orders;

    public OrderModificationRequest() {
    }

    private OrderModificationRequest(Builder builder) {
        setRequestId(builder.requestId);
        setOrderModificationType(builder.orderModificationType);
        setUserId(builder.userId);
        setOrders(builder.orders);
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public OrderModificationType getOrderModificationType() {
        return orderModificationType;
    }

    public void setOrderModificationType(OrderModificationType orderModificationType) {
        this.orderModificationType = orderModificationType;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public List<OrderModification> getOrders() {
        return orders;
    }

    public void setOrders(List<OrderModification> orders) {
        this.orders = orders;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OrderModificationRequest)) return false;
        OrderModificationRequest that = (OrderModificationRequest) o;
        return Objects.equals(requestId, that.requestId) &&
                orderModificationType == that.orderModificationType &&
                Objects.equals(userId, that.userId) &&
                Objects.equals(orders, that.orders);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, orderModificationType, userId, orders);
    }


    public static final class Builder {
        private String requestId;
        private OrderModificationType orderModificationType;
        private String userId;
        private List<OrderModification> orders;

        private Builder() {
        }

        public Builder withRequestId(String val) {
            requestId = val;
            return this;
        }

        public Builder withOrderModificationType(OrderModificationType val) {
            orderModificationType = val;
            return this;
        }

        public Builder withUserId(String val) {
            userId = val;
            return this;
        }

        public Builder withOrders(List<OrderModification> val) {
            orders = val;
            return this;
        }

        public OrderModificationRequest build() {
            return new OrderModificationRequest(this);
        }
    }
}
