/*
 * Copyright 2017 Nord Pool.
 * This library is intended to aid integration with Nord Pool’s Intraday API and comes without any warranty. Users of this library are responsible for separately testing and ensuring that it works according to their own standards.
 * Please send feedback to idapi@nordpoolgroup.com.
 */

package com.nordpool.id.publicapi.v1.heartbeat;

import java.util.List;
import java.util.Objects;

public class HeartbeatMessage {
    private List<HeartbeatItem> heartbeat;
    private Long timestamp;

    public HeartbeatMessage() {
    }

    public List<HeartbeatItem> getHeartbeat() {
        return heartbeat;
    }

    public void setHeartbeat(List<HeartbeatItem> heartbeat) {
        this.heartbeat = heartbeat;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof HeartbeatMessage)) return false;
        HeartbeatMessage that = (HeartbeatMessage) o;
        return Objects.equals(heartbeat, that.heartbeat) &&
                Objects.equals(timestamp, that.timestamp);
    }

    @Override
    public int hashCode() {
        return Objects.hash(heartbeat, timestamp);
    }

    @Override
    public String toString() {
        return "HeartbeatMessage{" +
                "heartbeat=" + heartbeat +
                ", timestamp=" + timestamp +
                '}';
    }
}
