/*
 * Copyright 2017 Nord Pool.
 * This library is intended to aid integration with Nord Pool’s Intraday API and comes without any warranty. Users of this library are responsible for separately testing and ensuring that it works according to their own standards.
 * Please send feedback to idapi@nordpoolgroup.com.
 */

package com.nordpool.id.publicapi.v1;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.nordpool.id.publicapi.v1.base.BaseRow;
import com.nordpool.id.publicapi.v1.serialize.DateDeserializer;
import com.nordpool.id.publicapi.v1.serialize.DateSerializer;

import java.time.ZonedDateTime;
import java.util.Objects;

public class CapacityRow extends BaseRow {
    private int eventSequenceNo;
    private boolean internal;
    @JsonSerialize(
            using = DateSerializer.class
    )
    @JsonDeserialize(
            using = DateDeserializer.class
    )
    private ZonedDateTime publicationTime;
    private long marketAreaFrom;
    private long marketAreaTo;
    private long deliveryStart;
    private long deliveryEnd;
    private int inCapacity;
    private int outCapacity;

    public CapacityRow() {
    }

    public int getEventSequenceNo() {
        return eventSequenceNo;
    }

    public void setEventSequenceNo(int eventSequenceNo) {
        this.eventSequenceNo = eventSequenceNo;
    }

    public boolean isInternal() {
        return internal;
    }

    public void setInternal(boolean internal) {
        this.internal = internal;
    }

    public ZonedDateTime getPublicationTime() {
        return publicationTime;
    }

    public void setPublicationTime(ZonedDateTime publicationTime) {
        this.publicationTime = publicationTime;
    }

    public long getMarketAreaFrom() {
        return marketAreaFrom;
    }

    public void setMarketAreaFrom(long marketAreaFrom) {
        this.marketAreaFrom = marketAreaFrom;
    }

    public long getMarketAreaTo() {
        return marketAreaTo;
    }

    public void setMarketAreaTo(long marketAreaTo) {
        this.marketAreaTo = marketAreaTo;
    }

    public long getDeliveryStart() {
        return deliveryStart;
    }

    public void setDeliveryStart(long deliveryStart) {
        this.deliveryStart = deliveryStart;
    }

    public long getDeliveryEnd() {
        return deliveryEnd;
    }

    public void setDeliveryEnd(long deliveryEnd) {
        this.deliveryEnd = deliveryEnd;
    }

    public int getInCapacity() {
        return inCapacity;
    }

    public void setInCapacity(int inCapacity) {
        this.inCapacity = inCapacity;
    }

    public int getOutCapacity() {
        return outCapacity;
    }

    public void setOutCapacity(int outCapacity) {
        this.outCapacity = outCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CapacityRow)) return false;
        if (!super.equals(o)) return false;
        CapacityRow that = (CapacityRow) o;
        return eventSequenceNo == that.eventSequenceNo &&
                internal == that.internal &&
                marketAreaFrom == that.marketAreaFrom &&
                marketAreaTo == that.marketAreaTo &&
                deliveryStart == that.deliveryStart &&
                deliveryEnd == that.deliveryEnd &&
                inCapacity == that.inCapacity &&
                outCapacity == that.outCapacity &&
                Objects.equals(publicationTime, that.publicationTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), eventSequenceNo, internal, publicationTime, marketAreaFrom, marketAreaTo, deliveryStart, deliveryEnd, inCapacity, outCapacity);
    }

    @Override
    public String toString() {
        return "CapacityRow{" +
                "eventSequenceNo=" + eventSequenceNo +
                ", internal=" + internal +
                ", publicationTime=" + publicationTime +
                ", marketAreaFrom=" + marketAreaFrom +
                ", marketAreaTo=" + marketAreaTo +
                ", deliveryStart=" + deliveryStart +
                ", deliveryEnd=" + deliveryEnd +
                ", inCapacity=" + inCapacity +
                ", outCapacity=" + outCapacity +
                "} " + super.toString();
    }
}
