/**
 * Copyright 2022 Nord Pool.
 * This library is intended to aid integration with Nord Pool’s Intraday API and comes without any warranty. Users of this library are responsible for separately testing and ensuring that it works according to their own standards.
 * Please send feedback to idapi@nordpoolgroup.com.
 */


package com.nordpool.id.publicapi.v1;

import java.time.ZonedDateTime;
import java.util.List;
import com.nordpool.id.publicapi.v1.base.BaseRow;
import com.nordpool.id.publicapi.v1.order.OrderExecutionEntry;
import com.nordpool.id.publicapi.v1.order.error.Error;
import com.nordpool.id.publicapi.v1.order.error.ErrorType;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * In response to an order creation or modification request described in Creating and modifying orders and for any order updates, the Intraday Platform will send an Order Execution Report message.
 * 
 */
public class OrderExecutionReport
    extends BaseRow
{

    /**
     * Unique identifier for this request, provided by the client to track their own requests
     * 
     */
    private String requestId;
    /**
     * Technical field about message originator.
     * 
     */
    private ErrorType errorType;
    /**
     * An array of objects that contain fields errorCode and errorMessage.
     * 
     */
    private List<Error> errors = null;
    /**
     * Order execution entries
     * 
     */
    private List<OrderExecutionEntry> orders = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public OrderExecutionReport() {
    }

    /**
     * 
     * @param requestId
     * @param errorType
     * @param orders
     * @param errors
     * @param updatedAt
     */
    public OrderExecutionReport(String requestId, ErrorType errorType, List<Error> errors, List<OrderExecutionEntry> orders, ZonedDateTime updatedAt) {
        super(updatedAt);
        this.requestId = requestId;
        this.errorType = errorType;
        this.errors = errors;
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

    public OrderExecutionReport withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    /**
     * Technical field about message originator.
     * 
     */
    public ErrorType getErrorType() {
        return errorType;
    }

    /**
     * Technical field about message originator.
     * 
     */
    public void setErrorType(ErrorType errorType) {
        this.errorType = errorType;
    }

    public OrderExecutionReport withErrorType(ErrorType errorType) {
        this.errorType = errorType;
        return this;
    }

    /**
     * An array of objects that contain fields errorCode and errorMessage.
     * 
     */
    public List<Error> getErrors() {
        return errors;
    }

    /**
     * An array of objects that contain fields errorCode and errorMessage.
     * 
     */
    public void setErrors(List<Error> errors) {
        this.errors = errors;
    }

    public OrderExecutionReport withErrors(List<Error> errors) {
        this.errors = errors;
        return this;
    }

    /**
     * Order execution entries
     * 
     */
    public List<OrderExecutionEntry> getOrders() {
        return orders;
    }

    /**
     * Order execution entries
     * 
     */
    public void setOrders(List<OrderExecutionEntry> orders) {
        this.orders = orders;
    }

    public OrderExecutionReport withOrders(List<OrderExecutionEntry> orders) {
        this.orders = orders;
        return this;
    }

    @Override
    public OrderExecutionReport withUpdatedAt(ZonedDateTime updatedAt) {
        super.withUpdatedAt(updatedAt);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).appendSuper(super.toString()).append("requestId", requestId).append("errorType", errorType).append("errors", errors).append("orders", orders).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().appendSuper(super.hashCode()).append(orders).append(requestId).append(errorType).append(errors).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OrderExecutionReport) == false) {
            return false;
        }
        OrderExecutionReport rhs = ((OrderExecutionReport) other);
        return new EqualsBuilder().appendSuper(super.equals(other)).append(orders, rhs.orders).append(requestId, rhs.requestId).append(errorType, rhs.errorType).append(errors, rhs.errors).isEquals();
    }

}
