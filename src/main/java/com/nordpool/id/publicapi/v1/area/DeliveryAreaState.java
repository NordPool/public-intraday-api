
package com.nordpool.id.publicapi.v1.area;

import java.time.ZonedDateTime;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.nordpool.id.publicapi.v1.contract.ContractState;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Copyright 2017 Nord Pool.
 * This library is intended to aid integration with Nord Pool’s Intraday API and comes without any warranty. Users of this library are responsible for separately testing and ensuring that it works according to their own standards.
 * Please send feedback to idapi@nordpoolgroup.com.
 * <p>
 * A contract can be available in many delivery areas, and for each delivery area it can have different opening and closing times. So for each area state, openAt and closeAt times are defined.
 * 
 */
public class DeliveryAreaState {

    private Long dlvryAreaId;
    /**
     * ACTI: Active, IACT: Expired(will never be reopened), HIBE: Closed(can be reopened)
     * 
     */
    private ContractState state;
    @JsonDeserialize(using = com.nordpool.id.publicapi.v1.serialize.DateDeserializer.class)
    @JsonSerialize(using = com.nordpool.id.publicapi.v1.serialize.DateSerializer.class)
    private ZonedDateTime openAt;
    @JsonDeserialize(using = com.nordpool.id.publicapi.v1.serialize.DateDeserializer.class)
    @JsonSerialize(using = com.nordpool.id.publicapi.v1.serialize.DateSerializer.class)
    private ZonedDateTime closedAt;

    /**
     * No args constructor for use in serialization
     * 
     */
    public DeliveryAreaState() {
    }

    /**
     * 
     * @param dlvryAreaId
     * @param state
     * @param closedAt
     * @param openAt
     */
    public DeliveryAreaState(Long dlvryAreaId, ContractState state, ZonedDateTime openAt, ZonedDateTime closedAt) {
        super();
        this.dlvryAreaId = dlvryAreaId;
        this.state = state;
        this.openAt = openAt;
        this.closedAt = closedAt;
    }

    public Long getDlvryAreaId() {
        return dlvryAreaId;
    }

    public void setDlvryAreaId(Long dlvryAreaId) {
        this.dlvryAreaId = dlvryAreaId;
    }

    public DeliveryAreaState withDlvryAreaId(Long dlvryAreaId) {
        this.dlvryAreaId = dlvryAreaId;
        return this;
    }

    /**
     * ACTI: Active, IACT: Expired(will never be reopened), HIBE: Closed(can be reopened)
     * 
     */
    public ContractState getState() {
        return state;
    }

    /**
     * ACTI: Active, IACT: Expired(will never be reopened), HIBE: Closed(can be reopened)
     * 
     */
    public void setState(ContractState state) {
        this.state = state;
    }

    public DeliveryAreaState withState(ContractState state) {
        this.state = state;
        return this;
    }

    public ZonedDateTime getOpenAt() {
        return openAt;
    }

    public void setOpenAt(ZonedDateTime openAt) {
        this.openAt = openAt;
    }

    public DeliveryAreaState withOpenAt(ZonedDateTime openAt) {
        this.openAt = openAt;
        return this;
    }

    public ZonedDateTime getClosedAt() {
        return closedAt;
    }

    public void setClosedAt(ZonedDateTime closedAt) {
        this.closedAt = closedAt;
    }

    public DeliveryAreaState withClosedAt(ZonedDateTime closedAt) {
        this.closedAt = closedAt;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("dlvryAreaId", dlvryAreaId).append("state", state).append("openAt", openAt).append("closedAt", closedAt).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(dlvryAreaId).append(state).append(closedAt).append(openAt).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DeliveryAreaState) == false) {
            return false;
        }
        DeliveryAreaState rhs = ((DeliveryAreaState) other);
        return new EqualsBuilder().append(dlvryAreaId, rhs.dlvryAreaId).append(state, rhs.state).append(closedAt, rhs.closedAt).append(openAt, rhs.openAt).isEquals();
    }

}
