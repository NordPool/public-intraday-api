/**
 * Copyright 2022 Nord Pool.
 * This library is intended to aid integration with Nord Pool’s Intraday API and comes without any warranty. Users of this library are responsible for separately testing and ensuring that it works according to their own standards.
 * Please send feedback to idapi@nordpoolgroup.com.
 */


package com.nordpool.id.publicapi.v1;

import java.time.ZonedDateTime;
import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Operational Message
 * 
 */
public class OperationalMessage {

    /**
     * id
     * 
     */
    private UUID id;
    /**
     * tenant
     * 
     */
    private String tenant;
    /**
     * Delivery areas
     * <p>
     * Delivery areas
     * 
     */
    private List<String> areas = null;
    /**
     * message
     * 
     */
    private String message;
    /**
     * Is active
     * 
     */
    private Boolean isActive;
    @JsonDeserialize(using = com.nordpool.id.publicapi.v1.serialize.DateDeserializer.class)
    @JsonSerialize(using = com.nordpool.id.publicapi.v1.serialize.DateSerializer.class)
    private ZonedDateTime validFrom;
    @JsonDeserialize(using = com.nordpool.id.publicapi.v1.serialize.DateDeserializer.class)
    @JsonSerialize(using = com.nordpool.id.publicapi.v1.serialize.DateSerializer.class)
    private ZonedDateTime validTo;
    @JsonDeserialize(using = com.nordpool.id.publicapi.v1.serialize.DateDeserializer.class)
    @JsonSerialize(using = com.nordpool.id.publicapi.v1.serialize.DateSerializer.class)
    private ZonedDateTime created;

    /**
     * No args constructor for use in serialization
     * 
     */
    public OperationalMessage() {
    }

    /**
     * 
     * @param created
     * @param areas
     * @param id
     * @param validFrom
     * @param message
     * @param isActive
     * @param tenant
     * @param validTo
     */
    public OperationalMessage(UUID id, String tenant, List<String> areas, String message, Boolean isActive, ZonedDateTime validFrom, ZonedDateTime validTo, ZonedDateTime created) {
        super();
        this.id = id;
        this.tenant = tenant;
        this.areas = areas;
        this.message = message;
        this.isActive = isActive;
        this.validFrom = validFrom;
        this.validTo = validTo;
        this.created = created;
    }

    /**
     * id
     * 
     */
    public UUID getId() {
        return id;
    }

    /**
     * id
     * 
     */
    public void setId(UUID id) {
        this.id = id;
    }

    public OperationalMessage withId(UUID id) {
        this.id = id;
        return this;
    }

    /**
     * tenant
     * 
     */
    public String getTenant() {
        return tenant;
    }

    /**
     * tenant
     * 
     */
    public void setTenant(String tenant) {
        this.tenant = tenant;
    }

    public OperationalMessage withTenant(String tenant) {
        this.tenant = tenant;
        return this;
    }

    /**
     * Delivery areas
     * <p>
     * Delivery areas
     * 
     */
    public List<String> getAreas() {
        return areas;
    }

    /**
     * Delivery areas
     * <p>
     * Delivery areas
     * 
     */
    public void setAreas(List<String> areas) {
        this.areas = areas;
    }

    public OperationalMessage withAreas(List<String> areas) {
        this.areas = areas;
        return this;
    }

    /**
     * message
     * 
     */
    public String getMessage() {
        return message;
    }

    /**
     * message
     * 
     */
    public void setMessage(String message) {
        this.message = message;
    }

    public OperationalMessage withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * Is active
     * 
     */
    public Boolean getIsActive() {
        return isActive;
    }

    /**
     * Is active
     * 
     */
    public void setIsActive(Boolean isActive) {
        this.isActive = isActive;
    }

    public OperationalMessage withIsActive(Boolean isActive) {
        this.isActive = isActive;
        return this;
    }

    public ZonedDateTime getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(ZonedDateTime validFrom) {
        this.validFrom = validFrom;
    }

    public OperationalMessage withValidFrom(ZonedDateTime validFrom) {
        this.validFrom = validFrom;
        return this;
    }

    public ZonedDateTime getValidTo() {
        return validTo;
    }

    public void setValidTo(ZonedDateTime validTo) {
        this.validTo = validTo;
    }

    public OperationalMessage withValidTo(ZonedDateTime validTo) {
        this.validTo = validTo;
        return this;
    }

    public ZonedDateTime getCreated() {
        return created;
    }

    public void setCreated(ZonedDateTime created) {
        this.created = created;
    }

    public OperationalMessage withCreated(ZonedDateTime created) {
        this.created = created;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("tenant", tenant).append("areas", areas).append("message", message).append("isActive", isActive).append("validFrom", validFrom).append("validTo", validTo).append("created", created).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(created).append(areas).append(id).append(validFrom).append(message).append(isActive).append(tenant).append(validTo).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OperationalMessage) == false) {
            return false;
        }
        OperationalMessage rhs = ((OperationalMessage) other);
        return new EqualsBuilder().append(created, rhs.created).append(areas, rhs.areas).append(id, rhs.id).append(validFrom, rhs.validFrom).append(message, rhs.message).append(isActive, rhs.isActive).append(tenant, rhs.tenant).append(validTo, rhs.validTo).isEquals();
    }

}
