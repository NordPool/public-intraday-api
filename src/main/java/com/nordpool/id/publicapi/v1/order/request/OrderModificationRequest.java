/**
 * Copyright 2017 Nord Pool.
 * This library is intended to aid integration with Nord Pool’s Intraday API and comes without any warranty. Users of this library are responsible for separately testing and ensuring that it works according to their own standards.
 * Please send feedback to idapi@nordpoolgroup.com.
 */


package com.nordpool.id.publicapi.v1.order.request;

import java.util.List;
import com.nordpool.id.publicapi.v1.order.OrderModification;
import com.nordpool.id.publicapi.v1.order.OrderModificationType;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class OrderModificationRequest {

    /**
     * Unique identifier for this request, provided by the client to track their own requests
     * 
     */
    private String requestId;
    private OrderModificationType orderModificationType;
    private String userId;
    private List<OrderModification> orders = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public OrderModificationRequest() {
    }

    /**
     * 
     * @param requestId
     * @param orders
     * @param orderModificationType
     * @param userId
     */
    public OrderModificationRequest(String requestId, OrderModificationType orderModificationType, String userId, List<OrderModification> orders) {
        super();
        this.requestId = requestId;
        this.orderModificationType = orderModificationType;
        this.userId = userId;
        this.orders = orders;
    }

    /**
     * Unique identifier for this request, provided by the client to track their own requests
     * 
     */
    public String getRequestId() {
        return requestId;
    }

    /**
     * Unique identifier for this request, provided by the client to track their own requests
     * 
     */
    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public OrderModificationRequest withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    public OrderModificationType getOrderModificationType() {
        return orderModificationType;
    }

    public void setOrderModificationType(OrderModificationType orderModificationType) {
        this.orderModificationType = orderModificationType;
    }

    public OrderModificationRequest withOrderModificationType(OrderModificationType orderModificationType) {
        this.orderModificationType = orderModificationType;
        return this;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public OrderModificationRequest withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    public List<OrderModification> getOrders() {
        return orders;
    }

    public void setOrders(List<OrderModification> orders) {
        this.orders = orders;
    }

    public OrderModificationRequest withOrders(List<OrderModification> orders) {
        this.orders = orders;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("requestId", requestId).append("orderModificationType", orderModificationType).append("userId", userId).append("orders", orders).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(orders).append(orderModificationType).append(userId).append(requestId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OrderModificationRequest) == false) {
            return false;
        }
        OrderModificationRequest rhs = ((OrderModificationRequest) other);
        return new EqualsBuilder().append(orders, rhs.orders).append(orderModificationType, rhs.orderModificationType).append(userId, rhs.userId).append(requestId, rhs.requestId).isEquals();
    }

}
