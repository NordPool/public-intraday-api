/**
 * Copyright 2022 Nord Pool.
 * This library is intended to aid integration with Nord Pool’s Intraday API and comes without any warranty. Users of this library are responsible for separately testing and ensuring that it works according to their own standards.
 * Please send feedback to idapi@nordpoolgroup.com.
 */


package com.nordpool.id.publicapi.v1.order.request;

import java.util.List;
import com.nordpool.id.publicapi.v1.order.OrderEntry;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class OrderEntryRequest {

    /**
     * Unique identifier for this request, provided by the client to track their own requests
     * 
     */
    private String requestId;
    /**
     * Should the message be completely rejected if only some of the entered orders cause errors.
     * 
     */
    private Boolean rejectPartially;

    private Boolean linkedBasket;
    /**
     * List of orders
     *
     */
    private List<OrderEntry> orders = null;

    /**
     * No args constructor for use in serialization
     *
     */
    public OrderEntryRequest() {
    }

    /**
     *
     * @param requestId
     * @param rejectPartially
     * @param orders
     */
    public OrderEntryRequest(String requestId, Boolean rejectPartially, Boolean linkedBasket, List<OrderEntry> orders) {
        super();
        this.requestId = requestId;
        this.rejectPartially = rejectPartially;
        this.orders = orders;
        this.linkedBasket = linkedBasket;
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

    public OrderEntryRequest withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * Should the message be completely rejected if only some of the entered orders cause errors.
     *
     */
    public Boolean getRejectPartially() {
        return rejectPartially;
    }

    /**
     * Should the message be completely rejected if only some of the entered orders cause errors.
     *
     */
    public void setRejectPartially(Boolean rejectPartially) {
        this.rejectPartially = rejectPartially;
    }

    public OrderEntryRequest withRejectPartially(Boolean rejectPartially) {
        this.rejectPartially = rejectPartially;
        return this;
    }

    public Boolean getLinkedBasket() {
        return linkedBasket;
    }

    public void setLinkedBasket(Boolean linkedBasket) {
        this.linkedBasket = linkedBasket;
    }

    public OrderEntryRequest withLinkedBasket(Boolean linkedBasket) {
        this.linkedBasket = linkedBasket;
        return this;
    }

    /**
     * List of orders
     *
     */
    public List<OrderEntry> getOrders() {
        return orders;
    }

    /**
     * List of orders
     *
     */
    public void setOrders(List<OrderEntry> orders) {
        this.orders = orders;
    }

    public OrderEntryRequest withOrders(List<OrderEntry> orders) {
        this.orders = orders;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("requestId", requestId).append("rejectPartially", rejectPartially).append("linkedBasked", linkedBasket).append("orders", orders).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(rejectPartially).append(linkedBasket).append(orders).append(requestId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OrderEntryRequest) == false) {
            return false;
        }
        OrderEntryRequest rhs = ((OrderEntryRequest) other);
        return new EqualsBuilder().append(rejectPartially, rhs.rejectPartially).append(linkedBasket, rhs.linkedBasket).append(orders, rhs.orders).append(requestId, rhs.requestId).isEquals();
    }

}
