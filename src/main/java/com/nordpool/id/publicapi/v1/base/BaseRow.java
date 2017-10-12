
package com.nordpool.id.publicapi.v1.base;

import java.time.ZonedDateTime;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Copyright 2017 Nord Pool.
 * This library is intended to aid integration with Nord Pool’s Intraday API and comes without any warranty. Users of this library are responsible for separately testing and ensuring that it works according to their own standards.
 * Please send feedback to idapi@nordpoolgroup.com.
 * <p>
 * Class with base fields for UI models
 * 
 */
public class BaseRow {

    /**
     * Last modification time (status change) of data
     * 
     */
    @JsonDeserialize(using = com.nordpool.id.publicapi.v1.serialize.DateDeserializer.class)
    @JsonSerialize(using = com.nordpool.id.publicapi.v1.serialize.DateSerializer.class)
    private ZonedDateTime updatedAt;

    /**
     * No args constructor for use in serialization
     * 
     */
    public BaseRow() {
    }

    /**
     * 
     * @param updatedAt
     */
    public BaseRow(ZonedDateTime updatedAt) {
        super();
        this.updatedAt = updatedAt;
    }

    /**
     * Last modification time (status change) of data
     * 
     */
    public ZonedDateTime getUpdatedAt() {
        return updatedAt;
    }

    /**
     * Last modification time (status change) of data
     * 
     */
    public void setUpdatedAt(ZonedDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public BaseRow withUpdatedAt(ZonedDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("updatedAt", updatedAt).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(updatedAt).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BaseRow) == false) {
            return false;
        }
        BaseRow rhs = ((BaseRow) other);
        return new EqualsBuilder().append(updatedAt, rhs.updatedAt).isEquals();
    }

}
