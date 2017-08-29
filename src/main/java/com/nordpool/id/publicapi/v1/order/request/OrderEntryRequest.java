/*
 * Copyright 2017 Nord Pool.
 * This library is intended to aid integration with Nord Pool’s Intraday API and comes without any warranty. Users of this library are responsible for separately testing and ensuring that it works according to their own standards.
 * Please send feedback to idapi@nordpoolgroup.com.
 */

package com.nordpool.id.publicapi.v1.order.request;

import com.nordpool.id.publicapi.v1.order.OrderEntry;

import java.util.List;
import java.util.Objects;

public class OrderEntryRequest {
    private String requestId;
    private boolean rejectPartially;
    private List<OrderEntry> orders;

    public OrderEntryRequest() {
    }

    private OrderEntryRequest(Builder builder) {
        setRequestId(builder.requestId);
        setRejectPartially(builder.rejectPartially);
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

    public boolean isRejectPartially() {
        return rejectPartially;
    }

    public void setRejectPartially(boolean rejectPartially) {
        this.rejectPartially = rejectPartially;
    }

    public List<OrderEntry> getOrders() {
        return orders;
    }

    public void setOrders(List<OrderEntry> orders) {
        this.orders = orders;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OrderEntryRequest)) return false;
        OrderEntryRequest that = (OrderEntryRequest) o;
        return rejectPartially == that.rejectPartially &&
                Objects.equals(requestId, that.requestId) &&
                Objects.equals(orders, that.orders);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requestId, rejectPartially, orders);
    }

    @Override
    public String toString() {
        return "OrderEntryRequest{" +
                "requestId='" + requestId + '\'' +
                ", rejectPartially=" + rejectPartially +
                ", orders=" + orders +
                '}';
    }


    public static final class Builder {
        private String requestId;
        private boolean rejectPartially;
        private List<OrderEntry> orders;

        private Builder() {
        }

        public Builder withRequestId(String val) {
            requestId = val;
            return this;
        }

        public Builder withRejectPartially(boolean val) {
            rejectPartially = val;
            return this;
        }

        public Builder withOrders(List<OrderEntry> val) {
            orders = val;
            return this;
        }

        public OrderEntryRequest build() {
            return new OrderEntryRequest(this);
        }
    }
}
