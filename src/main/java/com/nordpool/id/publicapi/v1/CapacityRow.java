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
    private Integer eventSequenceNo;
    private boolean internal;
    @JsonSerialize(
            using = DateSerializer.class
    )
    @JsonDeserialize(
            using = DateDeserializer.class
    )
    private ZonedDateTime publicationTime;
    private Long deliveryAreaFrom;
    private Long deliveryAreaTo;
    private Long deliveryStart;
    private Long deliveryEnd;
    private Integer inCapacity;
    private Integer outCapacity;

    public CapacityRow() {
    }

    public Integer getEventSequenceNo() {
        return eventSequenceNo;
    }

    public void setEventSequenceNo(Integer eventSequenceNo) {
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

    public Long getDeliveryAreaFrom() {
        return deliveryAreaFrom;
    }

    public void setDeliveryAreaFrom(Long deliveryAreaFrom) {
        this.deliveryAreaFrom = deliveryAreaFrom;
    }

    public Long getDeliveryAreaTo() {
        return deliveryAreaTo;
    }

    public void setDeliveryAreaTo(Long deliveryAreaTo) {
        this.deliveryAreaTo = deliveryAreaTo;
    }

    public Long getDeliveryStart() {
        return deliveryStart;
    }

    public void setDeliveryStart(Long deliveryStart) {
        this.deliveryStart = deliveryStart;
    }

    public Long getDeliveryEnd() {
        return deliveryEnd;
    }

    public void setDeliveryEnd(Long deliveryEnd) {
        this.deliveryEnd = deliveryEnd;
    }

    public Integer getInCapacity() {
        return inCapacity;
    }

    public void setInCapacity(Integer inCapacity) {
        this.inCapacity = inCapacity;
    }

    public Integer getOutCapacity() {
        return outCapacity;
    }

    public void setOutCapacity(Integer outCapacity) {
        this.outCapacity = outCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CapacityRow)) return false;
        if (!super.equals(o)) return false;
        CapacityRow that = (CapacityRow) o;
        return internal == that.internal &&
                Objects.equals(eventSequenceNo, that.eventSequenceNo) &&
                Objects.equals(publicationTime, that.publicationTime) &&
                Objects.equals(deliveryAreaFrom, that.deliveryAreaFrom) &&
                Objects.equals(deliveryAreaTo, that.deliveryAreaTo) &&
                Objects.equals(deliveryStart, that.deliveryStart) &&
                Objects.equals(deliveryEnd, that.deliveryEnd) &&
                Objects.equals(inCapacity, that.inCapacity) &&
                Objects.equals(outCapacity, that.outCapacity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), eventSequenceNo, internal, publicationTime, deliveryAreaFrom, deliveryAreaTo, deliveryStart, deliveryEnd, inCapacity, outCapacity);
    }

    @Override
    public String toString() {
        return "CapacityRow{" +
                "eventSequenceNo=" + eventSequenceNo +
                ", internal=" + internal +
                ", publicationTime=" + publicationTime +
                ", deliveryAreaFrom=" + deliveryAreaFrom +
                ", deliveryAreaTo=" + deliveryAreaTo +
                ", deliveryStart=" + deliveryStart +
                ", deliveryEnd=" + deliveryEnd +
                ", inCapacity=" + inCapacity +
                ", outCapacity=" + outCapacity +
                "} " + super.toString();
    }
}
