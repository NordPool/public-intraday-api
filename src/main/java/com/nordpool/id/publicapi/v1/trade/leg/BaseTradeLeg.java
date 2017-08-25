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
    private Long unitPrice;
    private Long quantity;
    private Long deliveryAreaId;
    private Boolean aggressor;

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

    public Long getDeliveryAreaId() {
        return deliveryAreaId;
    }

    public void setDeliveryAreaId(Long deliveryAreaId) {
        this.deliveryAreaId = deliveryAreaId;
    }

    public Boolean getAggressor() {
        return aggressor;
    }

    public void isAggressor(Boolean aggressor) {
        this.aggressor = aggressor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BaseTradeLeg)) return false;
        BaseTradeLeg that = (BaseTradeLeg) o;
        return Objects.equals(contractId, that.contractId) &&
                side == that.side &&
                Objects.equals(unitPrice, that.unitPrice) &&
                Objects.equals(quantity, that.quantity) &&
                Objects.equals(deliveryAreaId, that.deliveryAreaId) &&
                Objects.equals(aggressor, that.aggressor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(contractId, side, unitPrice, quantity, deliveryAreaId, aggressor);
    }

    @Override
    public String toString() {
        return "BaseTradeLeg{" +
                "contractId='" + contractId + '\'' +
                ", side=" + side +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", deliveryAreaId=" + deliveryAreaId +
                ", aggressor=" + aggressor +
                '}';
    }
}
