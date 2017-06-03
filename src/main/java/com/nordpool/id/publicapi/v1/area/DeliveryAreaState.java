/*
 * Copyright 2017 Nord Pool.
 * This library is intended to aid integration with Nord Pool’s Intraday API and comes without any warranty. Users of this library are responsible for separately testing and ensuring that it works according to their own standards.
 * Please send feedback to idapi@nordpoolgroup.com.
 */

package com.nordpool.id.publicapi.v1.area;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.nordpool.id.publicapi.v1.contract.ContractState;
import com.nordpool.id.publicapi.v1.serialize.DateDeserializer;
import com.nordpool.id.publicapi.v1.serialize.DateSerializer;

import java.time.ZonedDateTime;
import java.util.Objects;

public class DeliveryAreaState {
    private Long dlvryAreaId;
    private ContractState state;
    @JsonSerialize(
            using = DateSerializer.class
    )
    @JsonDeserialize(
            using = DateDeserializer.class
    )
    private ZonedDateTime openAt;
    @JsonSerialize(
            using = DateSerializer.class
    )
    @JsonDeserialize(
            using = DateDeserializer.class
    )
    private ZonedDateTime closedAt;

    public DeliveryAreaState() {
    }

    public Long getDlvryAreaId() {
        return dlvryAreaId;
    }

    public void setDlvryAreaId(Long dlvryAreaId) {
        this.dlvryAreaId = dlvryAreaId;
    }

    public ContractState getState() {
        return state;
    }

    public void setState(ContractState state) {
        this.state = state;
    }

    public ZonedDateTime getOpenAt() {
        return openAt;
    }

    public void setOpenAt(ZonedDateTime openAt) {
        this.openAt = openAt;
    }

    public ZonedDateTime getClosedAt() {
        return closedAt;
    }

    public void setClosedAt(ZonedDateTime closedAt) {
        this.closedAt = closedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DeliveryAreaState)) return false;
        DeliveryAreaState that = (DeliveryAreaState) o;
        return Objects.equals(dlvryAreaId, that.dlvryAreaId) &&
                state == that.state &&
                Objects.equals(openAt, that.openAt) &&
                Objects.equals(closedAt, that.closedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dlvryAreaId, state, openAt, closedAt);
    }

    @Override
    public String toString() {
        return "DeliveryAreaState{" +
                "dlvryAreaId=" + dlvryAreaId +
                ", state=" + state +
                ", openAt=" + openAt +
                ", closedAt=" + closedAt +
                '}';
    }
}
