/**
 * Copyright 2017 Nord Pool.
 * This library is intended to aid integration with Nord Pool’s Intraday API and comes without any warranty. Users of this library are responsible for separately testing and ensuring that it works according to their own standards.
 * Please send feedback to idapi@nordpoolgroup.com.
 */


package com.nordpool.id.publicapi.v1.trade.leg;

import com.nordpool.id.publicapi.v1.order.OrderSide;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class PublicTradeLeg
    extends BaseTradeLeg
{

    /**
     * OWN_BUY, OWN_SELL - the leg (order) is placed by current user and is on Buy or Sell side, respectively. COMPANY_BUY, COMPANY_SELL - the order was placed by different user from same Company.Order is on Buy or Sell side, respectively. OTHER - the order was placed by different company than user's.
     * 
     */
    private LegOwnershipEnum ownership;

    /**
     * No args constructor for use in serialization
     * 
     */
    public PublicTradeLeg() {
    }

    /**
     * 
     * @param unitPrice
     * @param aggressor
     * @param side
     * @param quantity
     * @param ownership
     * @param contractId
     * @param tenantId
     * @param deliveryAreaId
     */
    public PublicTradeLeg(LegOwnershipEnum ownership, String contractId, OrderSide side, Long unitPrice, Long quantity, Long deliveryAreaId, Boolean aggressor, String tenantId) {
        super(contractId, side, unitPrice, quantity, deliveryAreaId, aggressor, tenantId);
        this.ownership = ownership;
    }

    /**
     * OWN_BUY, OWN_SELL - the leg (order) is placed by current user and is on Buy or Sell side, respectively. COMPANY_BUY, COMPANY_SELL - the order was placed by different user from same Company.Order is on Buy or Sell side, respectively. OTHER - the order was placed by different company than user's.
     * 
     */
    public LegOwnershipEnum getOwnership() {
        return ownership;
    }

    /**
     * OWN_BUY, OWN_SELL - the leg (order) is placed by current user and is on Buy or Sell side, respectively. COMPANY_BUY, COMPANY_SELL - the order was placed by different user from same Company.Order is on Buy or Sell side, respectively. OTHER - the order was placed by different company than user's.
     * 
     */
    public void setOwnership(LegOwnershipEnum ownership) {
        this.ownership = ownership;
    }

    public PublicTradeLeg withOwnership(LegOwnershipEnum ownership) {
        this.ownership = ownership;
        return this;
    }

    @Override
    public PublicTradeLeg withContractId(String contractId) {
        super.withContractId(contractId);
        return this;
    }

    @Override
    public PublicTradeLeg withSide(OrderSide side) {
        super.withSide(side);
        return this;
    }

    @Override
    public PublicTradeLeg withUnitPrice(Long unitPrice) {
        super.withUnitPrice(unitPrice);
        return this;
    }

    @Override
    public PublicTradeLeg withQuantity(Long quantity) {
        super.withQuantity(quantity);
        return this;
    }

    @Override
    public PublicTradeLeg withDeliveryAreaId(Long deliveryAreaId) {
        super.withDeliveryAreaId(deliveryAreaId);
        return this;
    }

    @Override
    public PublicTradeLeg withAggressor(Boolean aggressor) {
        super.withAggressor(aggressor);
        return this;
    }

    @Override
    public PublicTradeLeg withTenantId(String tenantId) {
        super.withTenantId(tenantId);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).appendSuper(super.toString()).append("ownership", ownership).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().appendSuper(super.hashCode()).append(ownership).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PublicTradeLeg) == false) {
            return false;
        }
        PublicTradeLeg rhs = ((PublicTradeLeg) other);
        return new EqualsBuilder().appendSuper(super.equals(other)).append(ownership, rhs.ownership).isEquals();
    }

}
