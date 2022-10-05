/**
 * Copyright 2022 Nord Pool.
 * This library is intended to aid integration with Nord Pool’s Intraday API and comes without any warranty. Users of this library are responsible for separately testing and ensuring that it works according to their own standards.
 * Please send feedback to idapi@nordpoolgroup.com.
 */


package com.nordpool.id.publicapi.v1.heartbeat;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class HeartbeatItem {

    /**
     * A topic that the current user is subscribed to
     * 
     */
    private String topic;
    private Long lastSequenceNumber;

    /**
     * No args constructor for use in serialization
     * 
     */
    public HeartbeatItem() {
    }

    /**
     * 
     * @param topic
     * @param lastSequenceNumber
     */
    public HeartbeatItem(String topic, Long lastSequenceNumber) {
        super();
        this.topic = topic;
        this.lastSequenceNumber = lastSequenceNumber;
    }

    /**
     * A topic that the current user is subscribed to
     * 
     */
    public String getTopic() {
        return topic;
    }

    /**
     * A topic that the current user is subscribed to
     * 
     */
    public void setTopic(String topic) {
        this.topic = topic;
    }

    public HeartbeatItem withTopic(String topic) {
        this.topic = topic;
        return this;
    }

    public Long getLastSequenceNumber() {
        return lastSequenceNumber;
    }

    public void setLastSequenceNumber(Long lastSequenceNumber) {
        this.lastSequenceNumber = lastSequenceNumber;
    }

    public HeartbeatItem withLastSequenceNumber(Long lastSequenceNumber) {
        this.lastSequenceNumber = lastSequenceNumber;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("topic", topic).append("lastSequenceNumber", lastSequenceNumber).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(topic).append(lastSequenceNumber).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof HeartbeatItem) == false) {
            return false;
        }
        HeartbeatItem rhs = ((HeartbeatItem) other);
        return new EqualsBuilder().append(topic, rhs.topic).append(lastSequenceNumber, rhs.lastSequenceNumber).isEquals();
    }

}
