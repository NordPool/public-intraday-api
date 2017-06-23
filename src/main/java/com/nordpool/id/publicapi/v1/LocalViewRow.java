/*
 * Copyright 2017 Nord Pool.
 * This library is intended to aid integration with Nord Pool’s Intraday API and comes without any warranty. Users of this library are responsible for separately testing and ensuring that it works according to their own standards.
 * Please send feedback to idapi@nordpoolgroup.com.
 */

package com.nordpool.id.publicapi.v1;

import com.nordpool.id.publicapi.v1.base.BaseRow;
import com.nordpool.id.publicapi.v1.order.Order;

import java.util.List;
import java.util.Objects;

public class LocalViewRow extends BaseRow {
    private List<Order> buyOrders;
    private List<Order> sellOrders;

    private String contractId;

    private Long deliveryAreaId;
    private String orderExecutionRestriction;

    public LocalViewRow() {
    }

    public List<Order> getBuyOrders() {
        return buyOrders;
    }

    public void setBuyOrders(List<Order> buyOrders) {
        this.buyOrders = buyOrders;
    }

    public List<Order> getSellOrders() {
        return sellOrders;
    }

    public void setSellOrders(List<Order> sellOrders) {
        this.sellOrders = sellOrders;
    }

    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId;
    }

    public Long getDeliveryAreaId() {
        return deliveryAreaId;
    }

    public void setDeliveryAreaId(Long deliveryAreaId) {
        this.deliveryAreaId = deliveryAreaId;
    }

    public String getOrderExecutionRestriction() {
        return orderExecutionRestriction;
    }

    public void setOrderExecutionRestriction(String orderExecutionRestriction) {
        this.orderExecutionRestriction = orderExecutionRestriction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LocalViewRow)) return false;
        if (!super.equals(o)) return false;
        LocalViewRow that = (LocalViewRow) o;
        return Objects.equals(buyOrders, that.buyOrders) &&
                Objects.equals(sellOrders, that.sellOrders) &&
                Objects.equals(contractId, that.contractId) &&
                Objects.equals(deliveryAreaId, that.deliveryAreaId) &&
                Objects.equals(orderExecutionRestriction, that.orderExecutionRestriction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), buyOrders, sellOrders, contractId, deliveryAreaId, orderExecutionRestriction);
    }

    @Override
    public String toString() {
        return "LocalViewRow{" +
                "buyOrders=" + buyOrders +
                ", sellOrders=" + sellOrders +
                ", contractId='" + contractId + '\'' +
                ", deliveryAreaId=" + deliveryAreaId +
                ", orderExecutionRestriction='" + orderExecutionRestriction + '\'' +
                "} " + super.toString();
    }
}
