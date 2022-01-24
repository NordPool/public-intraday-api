/**
 * Copyright 2022 Nord Pool.
 * This library is intended to aid integration with Nord Pool’s Intraday API and comes without any warranty. Users of this library are responsible for separately testing and ensuring that it works according to their own standards.
 * Please send feedback to idapi@nordpoolgroup.com.
 */


package com.nordpool.id.publicapi.v1.area;

import java.time.ZonedDateTime;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Delivery area portfolio
 * 
 */
public class DeliveryAreaPortfolio {

    private Integer areaId;
    @JsonDeserialize(using = com.nordpool.id.publicapi.v1.serialize.DateDeserializer.class)
    @JsonSerialize(using = com.nordpool.id.publicapi.v1.serialize.DateSerializer.class)
    private ZonedDateTime validFrom;
    @JsonDeserialize(using = com.nordpool.id.publicapi.v1.serialize.DateDeserializer.class)
    @JsonSerialize(using = com.nordpool.id.publicapi.v1.serialize.DateSerializer.class)
    private ZonedDateTime validTo;

    /**
     * No args constructor for use in serialization
     * 
     */
    public DeliveryAreaPortfolio() {
    }

    /**
     * 
     * @param areaId
     * @param validFrom
     * @param validTo
     */
    public DeliveryAreaPortfolio(Integer areaId, ZonedDateTime validFrom, ZonedDateTime validTo) {
        super();
        this.areaId = areaId;
        this.validFrom = validFrom;
        this.validTo = validTo;
    }

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public DeliveryAreaPortfolio withAreaId(Integer areaId) {
        this.areaId = areaId;
        return this;
    }

    public ZonedDateTime getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(ZonedDateTime validFrom) {
        this.validFrom = validFrom;
    }

    public DeliveryAreaPortfolio withValidFrom(ZonedDateTime validFrom) {
        this.validFrom = validFrom;
        return this;
    }

    public ZonedDateTime getValidTo() {
        return validTo;
    }

    public void setValidTo(ZonedDateTime validTo) {
        this.validTo = validTo;
    }

    public DeliveryAreaPortfolio withValidTo(ZonedDateTime validTo) {
        this.validTo = validTo;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("areaId", areaId).append("validFrom", validFrom).append("validTo", validTo).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(areaId).append(validFrom).append(validTo).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DeliveryAreaPortfolio) == false) {
            return false;
        }
        DeliveryAreaPortfolio rhs = ((DeliveryAreaPortfolio) other);
        return new EqualsBuilder().append(areaId, rhs.areaId).append(validFrom, rhs.validFrom).append(validTo, rhs.validTo).isEquals();
    }

}
