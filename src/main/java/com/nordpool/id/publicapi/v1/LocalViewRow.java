/**
 * Copyright 2019 Nord Pool.
 * This library is intended to aid integration with Nord Pool’s Intraday API and comes without any warranty. Users of this library are responsible for separately testing and ensuring that it works according to their own standards.
 * Please send feedback to idapi@nordpoolgroup.com.
 */


package com.nordpool.id.publicapi.v1;

import java.time.ZonedDateTime;
import java.util.List;
import com.nordpool.id.publicapi.v1.base.BaseRow;
import com.nordpool.id.publicapi.v1.order.Order;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class LocalViewRow
    extends BaseRow
{

    /**
     * Basic data for BUY orders
     * 
     */
    private List<Order> buyOrders = null;
    /**
     * Basic data for SELL orders
     * 
     */
    private List<Order> sellOrders = null;
    /**
     * ID of the contract that this order belongs to
     * 
     */
    private String contractId;
    private Long deliveryAreaId;
    private String marketId;
    private String tenantId;

    /**
     * No args constructor for use in serialization
     * 
     */
    public LocalViewRow() {
    }

    /**
     * 
     * @param sellOrders
     * @param contractId
     * @param buyOrders
     * @param deliveryAreaId
     * @param updatedAt
     * @param marketId
     * @param tenantId
     */
    public LocalViewRow(List<Order> buyOrders, List<Order> sellOrders, String contractId, Long deliveryAreaId, ZonedDateTime updatedAt, String marketId, String tenantId) {
        super(updatedAt);
        this.buyOrders = buyOrders;
        this.sellOrders = sellOrders;
        this.contractId = contractId;
        this.deliveryAreaId = deliveryAreaId;
        this.marketId = marketId;
        this.tenantId = tenantId;
    }

    /**
     * Basic data for BUY orders
     * 
     */
    public List<Order> getBuyOrders() {
        return buyOrders;
    }

    /**
     * Basic data for BUY orders
     * 
     */
    public void setBuyOrders(List<Order> buyOrders) {
        this.buyOrders = buyOrders;
    }

    public LocalViewRow withBuyOrders(List<Order> buyOrders) {
        this.buyOrders = buyOrders;
        return this;
    }

    /**
     * Basic data for SELL orders
     * 
     */
    public List<Order> getSellOrders() {
        return sellOrders;
    }

    /**
     * Basic data for SELL orders
     * 
     */
    public void setSellOrders(List<Order> sellOrders) {
        this.sellOrders = sellOrders;
    }

    public LocalViewRow withSellOrders(List<Order> sellOrders) {
        this.sellOrders = sellOrders;
        return this;
    }

    /**
     * ID of the contract that this order belongs to
     * 
     */
    public String getContractId() {
        return contractId;
    }

    /**
     * ID of the contract that this order belongs to
     * 
     */
    public void setContractId(String contractId) {
        this.contractId = contractId;
    }

    public LocalViewRow withContractId(String contractId) {
        this.contractId = contractId;
        return this;
    }

    public Long getDeliveryAreaId() {
        return deliveryAreaId;
    }

    public void setDeliveryAreaId(Long deliveryAreaId) {
        this.deliveryAreaId = deliveryAreaId;
    }

    public LocalViewRow withDeliveryAreaId(Long deliveryAreaId) {
        this.deliveryAreaId = deliveryAreaId;
        return this;
    }

    public String getMarketId() {
        return marketId;
    }

    public void setMarketId(String marketId) {
        this.marketId = marketId;
    }

    public LocalViewRow withMarketId(String marketId) {
        this.marketId = marketId;
        return this;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public LocalViewRow withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    @Override
    public LocalViewRow withUpdatedAt(ZonedDateTime updatedAt) {
        super.withUpdatedAt(updatedAt);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).appendSuper(super.toString()).append("buyOrders", buyOrders).append("sellOrders", sellOrders).append("contractId", contractId).append("deliveryAreaId", deliveryAreaId).append("tenantId", tenantId).append("marketId", marketId).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().appendSuper(super.hashCode()).append(contractId).append(buyOrders).append(deliveryAreaId).append(sellOrders).append(marketId).append(tenantId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof LocalViewRow) == false) {
            return false;
        }
        LocalViewRow rhs = ((LocalViewRow) other);
        return new EqualsBuilder().appendSuper(super.equals(other)).append(contractId, rhs.contractId).append(buyOrders, rhs.buyOrders).append(deliveryAreaId, rhs.deliveryAreaId).append(sellOrders, rhs.sellOrders).append(marketId, rhs.marketId).append(tenantId, rhs.tenantId).isEquals();
    }

}
