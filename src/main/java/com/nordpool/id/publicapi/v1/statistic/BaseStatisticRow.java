/**
 * Copyright 2021 Nord Pool.
 * This library is intended to aid integration with Nord Pool’s Intraday API and comes without any warranty. Users of this library are responsible for separately testing and ensuring that it works according to their own standards.
 * Please send feedback to idapi@nordpoolgroup.com.
 */


package com.nordpool.id.publicapi.v1.statistic;

import java.time.ZonedDateTime;
import com.nordpool.id.publicapi.v1.base.BaseRow;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Capacity information between areas
 * 
 */
public class BaseStatisticRow
    extends BaseRow
{

    private Long deliveryAreaId;
    /**
     * Unique identifier for a contract
     * 
     */
    private String contractId;

    /**
     * No args constructor for use in serialization
     * 
     */
    public BaseStatisticRow() {
    }

    /**
     * 
     * @param contractId
     * @param deliveryAreaId
     * @param updatedAt
     */
    public BaseStatisticRow(Long deliveryAreaId, String contractId, ZonedDateTime updatedAt) {
        super(updatedAt);
        this.deliveryAreaId = deliveryAreaId;
        this.contractId = contractId;
    }

    public Long getDeliveryAreaId() {
        return deliveryAreaId;
    }

    public void setDeliveryAreaId(Long deliveryAreaId) {
        this.deliveryAreaId = deliveryAreaId;
    }

    public BaseStatisticRow withDeliveryAreaId(Long deliveryAreaId) {
        this.deliveryAreaId = deliveryAreaId;
        return this;
    }

    /**
     * Unique identifier for a contract
     * 
     */
    public String getContractId() {
        return contractId;
    }

    /**
     * Unique identifier for a contract
     * 
     */
    public void setContractId(String contractId) {
        this.contractId = contractId;
    }

    public BaseStatisticRow withContractId(String contractId) {
        this.contractId = contractId;
        return this;
    }

    @Override
    public BaseStatisticRow withUpdatedAt(ZonedDateTime updatedAt) {
        super.withUpdatedAt(updatedAt);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).appendSuper(super.toString()).append("deliveryAreaId", deliveryAreaId).append("contractId", contractId).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().appendSuper(super.hashCode()).append(contractId).append(deliveryAreaId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BaseStatisticRow) == false) {
            return false;
        }
        BaseStatisticRow rhs = ((BaseStatisticRow) other);
        return new EqualsBuilder().appendSuper(super.equals(other)).append(contractId, rhs.contractId).append(deliveryAreaId, rhs.deliveryAreaId).isEquals();
    }

}
