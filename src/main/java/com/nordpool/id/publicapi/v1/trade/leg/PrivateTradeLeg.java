/*
 * Copyright 2017 Nord Pool.
 * This library is intended to aid integration with Nord Pool’s Intraday API and comes without any warranty. Users of this library are responsible for separately testing and ensuring that it works according to their own standards.
 * Please send feedback to idapi@nordpoolgroup.com.
 */

package com.nordpool.id.publicapi.v1.trade.leg;

import com.nordpool.id.publicapi.v1.order.OrderAction;
import com.nordpool.id.publicapi.v1.order.OrderState;
import com.nordpool.id.publicapi.v1.order.OrderType;
import com.nordpool.id.publicapi.v1.order.TimeInForce;

import java.util.Objects;

public class PrivateTradeLeg extends BaseTradeLeg {

    private String refOrderId;
    private Long deliveryStart;
    private Long deliveryEnd;
    private OrderState orderState;
    private OrderType orderType;
    private String text;
    private OrderAction orderAction;
    private TimeInForce timeInForce;

    public PrivateTradeLeg() {
    }

    public String getRefOrderId() {
        return refOrderId;
    }

    public void setRefOrderId(String refOrderId) {
        this.refOrderId = refOrderId;
    }

    public Long getDeliveryStart() {
        return deliveryStart;
    }

    public void setDeliveryStart(Long deliveryStart) {
        this.deliveryStart = deliveryStart;
    }

    public Long getDeliveryEnd() {
        return deliveryEnd;
    }

    public void setDeliveryEnd(Long deliveryEnd) {
        this.deliveryEnd = deliveryEnd;
    }

    public OrderState getOrderState() {
        return orderState;
    }

    public void setOrderState(OrderState orderState) {
        this.orderState = orderState;
    }

    public OrderType getOrderType() {
        return orderType;
    }

    public void setOrderType(OrderType orderType) {
        this.orderType = orderType;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public OrderAction getOrderAction() {
        return orderAction;
    }

    public void setOrderAction(OrderAction orderAction) {
        this.orderAction = orderAction;
    }

    public TimeInForce getTimeInForce() {
        return timeInForce;
    }

    public void setTimeInForce(TimeInForce timeInForce) {
        this.timeInForce = timeInForce;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PrivateTradeLeg)) return false;
        if (!super.equals(o)) return false;
        PrivateTradeLeg that = (PrivateTradeLeg) o;

        return Objects.equals(refOrderId, that.refOrderId) &&
                Objects.equals(deliveryStart, that.deliveryStart) &&
                Objects.equals(deliveryEnd, that.deliveryEnd) &&
                orderState == that.orderState &&
                orderType == that.orderType &&
                Objects.equals(text, that.text) &&
                orderAction == that.orderAction &&
                timeInForce == that.timeInForce;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), refOrderId, deliveryStart, deliveryEnd, orderState, orderType, text, orderAction, timeInForce);
    }

    @Override
    public String toString() {
        return "PrivateTradeLeg{" +
                "refOrderId='" + refOrderId + '\'' +
                ", deliveryStart=" + deliveryStart +
                ", deliveryEnd=" + deliveryEnd +
                ", orderState=" + orderState +
                ", orderType=" + orderType +
                ", text='" + text + '\'' +
                ", orderAction=" + orderAction +
                ", timeInForce=" + timeInForce +
                "} " + super.toString();
    }
}
