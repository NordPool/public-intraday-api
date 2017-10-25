
package com.nordpool.id.publicapi.v1.heartbeat;

import java.util.List;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Copyright 2017 Nord Pool.
 * This library is intended to aid integration with Nord Pool’s Intraday API and comes without any warranty. Users of this library are responsible for separately testing and ensuring that it works according to their own standards.
 * Please send feedback to idapi@nordpoolgroup.com.
 * <p>
 * The Intraday Platform uses Heartbeat Ping messages to inform a client that the server is alive and to let the client perform consistency checking of the data received.
 * 
 */
public class HeartbeatMessage {

    private Long timestamp;
    private List<HeartbeatItem> heartbeat = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public HeartbeatMessage() {
    }

    /**
     * 
     * @param heartbeat
     * @param timestamp
     */
    public HeartbeatMessage(Long timestamp, List<HeartbeatItem> heartbeat) {
        super();
        this.timestamp = timestamp;
        this.heartbeat = heartbeat;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public HeartbeatMessage withTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    public List<HeartbeatItem> getHeartbeat() {
        return heartbeat;
    }

    public void setHeartbeat(List<HeartbeatItem> heartbeat) {
        this.heartbeat = heartbeat;
    }

    public HeartbeatMessage withHeartbeat(List<HeartbeatItem> heartbeat) {
        this.heartbeat = heartbeat;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("timestamp", timestamp).append("heartbeat", heartbeat).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(heartbeat).append(timestamp).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof HeartbeatMessage) == false) {
            return false;
        }
        HeartbeatMessage rhs = ((HeartbeatMessage) other);
        return new EqualsBuilder().append(heartbeat, rhs.heartbeat).append(timestamp, rhs.timestamp).isEquals();
    }

}
