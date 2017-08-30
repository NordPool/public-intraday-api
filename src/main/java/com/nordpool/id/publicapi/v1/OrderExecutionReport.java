/*
 * Copyright 2017 Nord Pool.
 * This library is intended to aid integration with Nord Pool’s Intraday API and comes without any warranty. Users of this library are responsible for separately testing and ensuring that it works according to their own standards.
 * Please send feedback to idapi@nordpoolgroup.com.
 */

package com.nordpool.id.publicapi.v1;

import com.nordpool.id.publicapi.v1.base.BaseRow;
import com.nordpool.id.publicapi.v1.order.OrderExecutionEntry;
import com.nordpool.id.publicapi.v1.order.error.Error;
import com.nordpool.id.publicapi.v1.order.error.ErrorType;

import java.util.List;
import java.util.Objects;

public class OrderExecutionReport extends BaseRow {
    private String requestId;
    private String memberId;
    private ErrorType errorType;
    private List<Error> errors;
    private List<OrderExecutionEntry> orders;

    public OrderExecutionReport() {
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getMemberId() {

        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public ErrorType getErrorType() {
        return errorType;
    }

    public void setErrorType(ErrorType errorType) {
        this.errorType = errorType;
    }

    public List<Error> getErrors() {
        return errors;
    }

    public void setErrors(List<Error> errors) {
        this.errors = errors;
    }

    public List<OrderExecutionEntry> getOrders() {
        return orders;
    }

    public void setOrders(List<OrderExecutionEntry> orders) {
        this.orders = orders;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OrderExecutionReport)) return false;
        if (!super.equals(o)) return false;
        OrderExecutionReport that = (OrderExecutionReport) o;
        return Objects.equals(getRequestId(), that.getRequestId()) &&
                Objects.equals(getMemberId(), that.getMemberId()) &&
                getErrorType() == that.getErrorType() &&
                Objects.equals(getErrors(), that.getErrors()) &&
                Objects.equals(getOrders(), that.getOrders());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getRequestId(), getMemberId(), getErrorType(), getErrors(), getOrders());
    }

    @Override
    public String toString() {
        return "OrderExecutionReport{" +
                "requestId='" + requestId + '\'' +
                ", memberId='" + memberId + '\'' +
                ", errorType=" + errorType +
                ", errors=" + errors +
                ", orders=" + orders +
                "} " + super.toString();
    }
}
