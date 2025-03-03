/**
 * Copyright 2023 Nord Pool.
 * This library is intended to aid integration with Nord Pool’s Intraday API and comes without any warranty. Users of this library are responsible for separately testing and ensuring that it works according to their own standards.
 * Please send feedback to idapi@nordpoolgroup.com.
 */

package com.nordpool.id.publicapi.v2.trade.leg;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import com.nordpool.id.publicapi.v1.order.OrderSide;
import org.jetbrains.annotations.Nullable;

public class BaseTradeLeg {
    /**
     * Contract Id for the order
     * 
     */
    private String contractId;
    
    /**
     * BUY/SELL
     * 
     */
    private OrderSide side;

    private Long unitPrice;

    private Long quantity;
    
    private Long deliveryAreaId;

    /**
     * true if leg is the aggressor, null if the information is unavailable (for XBID trades)
     * 
     */
    private Boolean aggressor;

    /**
     * No args constructor for use in serialization
     * 
     */
    public BaseTradeLeg() {
    }

    /**
     * 
     * @param unitPrice
     * @param aggressor
     * @param side
     * @param quantity
     * @param contractId
     * @param deliveryAreaId
     */
    public BaseTradeLeg(String contractId, OrderSide side, Long unitPrice, Long quantity, Long deliveryAreaId, Boolean aggressor) {
        super();
        this.contractId = contractId;
        this.side = side;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.deliveryAreaId = deliveryAreaId;
        this.aggressor = aggressor;
    }

    public String getContractId() {
        return this.contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId;
    }

    public OrderSide getSide() {
        return this.side;
    }

    public void setSide(OrderSide side) {
        this.side = side;
    }

    public Long getUnitPrice() {
        return this.unitPrice;
    }

    public void setUnitPrice(Long unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Long getQuantity() {
        return this.quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public Long getDeliveryAreaId() {
        return this.deliveryAreaId;
    }

    public void setDeliveryAreaId(Long deliveryAreaId) {
        this.deliveryAreaId = deliveryAreaId;
    }

    public Boolean isAggressor() {
        return this.aggressor;
    }

    public Boolean getAggressor() {
        return this.aggressor;
    }

    public void setAggressor(Boolean aggressor) {
        this.aggressor = aggressor;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("contractId", contractId).append("side", side).append("unitPrice", unitPrice).append("quantity", quantity).append("deliveryAreaId", deliveryAreaId).append("aggressor", aggressor).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(unitPrice).append(aggressor).append(side).append(quantity).append(contractId).append(deliveryAreaId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BaseTradeLeg) == false) {
            return false;
        }
        BaseTradeLeg rhs = ((BaseTradeLeg) other);
        return new EqualsBuilder().append(unitPrice, rhs.unitPrice).append(aggressor, rhs.aggressor).append(side, rhs.side).append(quantity, rhs.quantity).append(contractId, rhs.contractId).append(deliveryAreaId, rhs.deliveryAreaId).isEquals();
    }
}
