/**
 * Copyright 2022 Nord Pool.
 * This library is intended to aid integration with Nord Pool’s Intraday API and comes without any warranty. Users of this library are responsible for separately testing and ensuring that it works according to their own standards.
 * Please send feedback to idapi@nordpoolgroup.com.
 */


package com.nordpool.id.publicapi.v1;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.nordpool.id.publicapi.v1.base.BaseRow;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

import java.time.ZonedDateTime;


/**
 * Capacity information between areas
 * 
 */
public class AtcCapacityRow
    extends BaseRow
{

    private Integer eventSequenceNo;
    /**
     * true - capacity data produced by internal Nord Pool Matcher. false - capacity data came
     *
     */
    private Boolean internal;
    @JsonDeserialize(using = com.nordpool.id.publicapi.v1.serialize.DateDeserializer.class)
    @JsonSerialize(using = com.nordpool.id.publicapi.v1.serialize.DateSerializer.class)
    private ZonedDateTime publicationTime;
    private Long deliveryAreaFrom;
    private Long deliveryAreaTo;
    private Long deliveryStart;
    private Long deliveryEnd;
    private Integer capacity;
    private String border;

    /**
     * No args constructor for use in serialization
     *
     */
    public AtcCapacityRow() {
    }

    /**
     *
     * @param internal
     * @param deliveryAreaFrom
     * @param border
     * @param deliveryStart
     * @param deliveryEnd
     * @param publicationTime
     * @param capacity
     * @param eventSequenceNo
     * @param deliveryAreaTo
     * @param updatedAt
     */
    public AtcCapacityRow(Integer eventSequenceNo, Boolean internal, ZonedDateTime publicationTime, Long deliveryAreaFrom, Long deliveryAreaTo, Long deliveryStart, Long deliveryEnd, Integer capacity, String border, ZonedDateTime updatedAt) {
        super(updatedAt);
        this.eventSequenceNo = eventSequenceNo;
        this.internal = internal;
        this.publicationTime = publicationTime;
        this.deliveryAreaFrom = deliveryAreaFrom;
        this.deliveryAreaTo = deliveryAreaTo;
        this.deliveryStart = deliveryStart;
        this.deliveryEnd = deliveryEnd;
        this.capacity = capacity;
        this.border = border;
    }

    public Integer getEventSequenceNo() {
        return eventSequenceNo;
    }

    public void setEventSequenceNo(Integer eventSequenceNo) {
        this.eventSequenceNo = eventSequenceNo;
    }

    public AtcCapacityRow withEventSequenceNo(Integer eventSequenceNo) {
        this.eventSequenceNo = eventSequenceNo;
        return this;
    }

    /**
     * true - capacity data produced by internal Nord Pool Matcher. false - capacity data came
     * 
     */
    public Boolean getInternal() {
        return internal;
    }

    /**
     * true - capacity data produced by internal Nord Pool Matcher. false - capacity data came
     * 
     */
    public void setInternal(Boolean internal) {
        this.internal = internal;
    }

    public AtcCapacityRow withInternal(Boolean internal) {
        this.internal = internal;
        return this;
    }

    public ZonedDateTime getPublicationTime() {
        return publicationTime;
    }

    public void setPublicationTime(ZonedDateTime publicationTime) {
        this.publicationTime = publicationTime;
    }

    public AtcCapacityRow withPublicationTime(ZonedDateTime publicationTime) {
        this.publicationTime = publicationTime;
        return this;
    }

    public Long getDeliveryAreaFrom() {
        return deliveryAreaFrom;
    }

    public void setDeliveryAreaFrom(Long deliveryAreaFrom) {
        this.deliveryAreaFrom = deliveryAreaFrom;
    }

    public AtcCapacityRow withDeliveryAreaFrom(Long deliveryAreaFrom) {
        this.deliveryAreaFrom = deliveryAreaFrom;
        return this;
    }

    public Long getDeliveryAreaTo() {
        return deliveryAreaTo;
    }

    public void setDeliveryAreaTo(Long deliveryAreaTo) {
        this.deliveryAreaTo = deliveryAreaTo;
    }

    public AtcCapacityRow withDeliveryAreaTo(Long deliveryAreaTo) {
        this.deliveryAreaTo = deliveryAreaTo;
        return this;
    }

    public Long getDeliveryStart() {
        return deliveryStart;
    }

    public void setDeliveryStart(Long deliveryStart) {
        this.deliveryStart = deliveryStart;
    }

    public AtcCapacityRow withDeliveryStart(Long deliveryStart) {
        this.deliveryStart = deliveryStart;
        return this;
    }

    public Long getDeliveryEnd() {
        return deliveryEnd;
    }

    public void setDeliveryEnd(Long deliveryEnd) {
        this.deliveryEnd = deliveryEnd;
    }

    public AtcCapacityRow withDeliveryEnd(Long deliveryEnd) {
        this.deliveryEnd = deliveryEnd;
        return this;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public AtcCapacityRow withCapacity(Integer capacity) {
        this.capacity = capacity;
        return this;
    }

    public String getBorder() {
        return border;
    }

    public void setBorder(String border) {
        this.border = border;
    }

    public AtcCapacityRow withBorder(String border) {
        this.border = border;
        return this;
    }

    @Override
    public AtcCapacityRow withUpdatedAt(ZonedDateTime updatedAt) {
        super.withUpdatedAt(updatedAt);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).appendSuper(super.toString()).append("eventSequenceNo", eventSequenceNo).append("internal", internal).append("publicationTime", publicationTime).append("deliveryAreaFrom", deliveryAreaFrom).append("deliveryAreaTo", deliveryAreaTo).append("deliveryStart", deliveryStart).append("deliveryEnd", deliveryEnd).append("capacity", capacity).append("border", border).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().appendSuper(super.hashCode()).append(internal).append(deliveryAreaFrom).append(border).append(deliveryStart).append(deliveryEnd).append(publicationTime).append(capacity).append(eventSequenceNo).append(deliveryAreaTo).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof AtcCapacityRow) == false) {
            return false;
        }
        AtcCapacityRow rhs = ((AtcCapacityRow) other);
        return new EqualsBuilder().appendSuper(super.equals(other)).append(internal, rhs.internal).append(deliveryAreaFrom, rhs.deliveryAreaFrom).append(border, rhs.border).append(deliveryStart, rhs.deliveryStart).append(deliveryEnd, rhs.deliveryEnd).append(publicationTime, rhs.publicationTime).append(capacity, rhs.capacity).append(eventSequenceNo, rhs.eventSequenceNo).append(deliveryAreaTo, rhs.deliveryAreaTo).isEquals();
    }

}
