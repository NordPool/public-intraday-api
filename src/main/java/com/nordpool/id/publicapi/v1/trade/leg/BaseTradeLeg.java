/*
 * Copyright 2017 Nord Pool.
 * This library is intended to aid integration with Nord Pool’s Intraday API and comes without any warranty. Users of this library are responsible for separately testing and ensuring that it works according to their own standards.
 * Please send feedback to idapi@nordpoolgroup.com.
 */

package com.nordpool.id.publicapi.v1.trade.leg;

import com.nordpool.id.publicapi.v1.order.OrderSide;

import java.util.Objects;

public abstract class BaseTradeLeg {
    private String contractId;
    private OrderSide side;
    private long unitPrice;
    private long quantity;
    private long deliveryAreaId;

    public BaseTradeLeg() {
    }

    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId;
    }

    public OrderSide getSide() {
        return side;
    }

    public void setSide(OrderSide side) {
        this.side = side;
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

    public long getDeliveryAreaId() {
        return deliveryAreaId;
    }

    public void setDeliveryAreaId(long deliveryAreaId) {
        this.deliveryAreaId = deliveryAreaId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BaseTradeLeg)) return false;
        BaseTradeLeg that = (BaseTradeLeg) o;
        return unitPrice == that.unitPrice &&
                quantity == that.quantity &&
                deliveryAreaId == that.deliveryAreaId &&
                Objects.equals(contractId, that.contractId) &&
                side == that.side;
    }

    @Override
    public int hashCode() {
        return Objects.hash(contractId, side, unitPrice, quantity, deliveryAreaId);
    }

    @Override
    public String toString() {
        return "BaseTradeLeg{" +
                "contractId='" + contractId + '\'' +
                ", side=" + side +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", deliveryAreaId=" + deliveryAreaId +
                '}';
    }
}
