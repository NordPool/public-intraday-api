/*
 * Copyright 2017 Nord Pool.
 * This library is intended to aid integration with Nord Pool’s Intraday API and comes without any warranty. Users of this library are responsible for separately testing and ensuring that it works according to their own standards.
 * Please send feedback to idapi@nordpoolgroup.com.
 */

package com.nordpool.id.publicapi.v1.heartbeat;

import java.util.Objects;

public class HeartbeatItem {
    private String topic;
    private Long lastSequenceNumber;

    public HeartbeatItem() {
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public Long getLastSequenceNumber() {
        return lastSequenceNumber;
    }

    public void setLastSequenceNumber(Long lastSequenceNumber) {
        this.lastSequenceNumber = lastSequenceNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof HeartbeatItem)) return false;
        HeartbeatItem that = (HeartbeatItem) o;
        return Objects.equals(topic, that.topic) &&
                Objects.equals(lastSequenceNumber, that.lastSequenceNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(topic, lastSequenceNumber);
    }

    @Override
    public String toString() {
        return "HeartbeatItem{" +
                "topic='" + topic + '\'' +
                ", lastSequenceNumber=" + lastSequenceNumber +
                '}';
    }
}
