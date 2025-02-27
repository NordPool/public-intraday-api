/**
 * Copyright 2022 Nord Pool.
 * This library is intended to aid integration with Nord Pool’s Intraday API and comes without any warranty. Users of this library are responsible for separately testing and ensuring that it works according to their own standards.
 * Please send feedback to idapi@nordpoolgroup.com.
 */

package com.nordpool.id.publicapi.v1;

import java.time.ZonedDateTime;
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
     * message title
     *
     */
    private String messageTitle;

    /**
     * message body
     *
     */
    private String messageBody;

    /**
     * valid from
     *
     */
    @JsonDeserialize(using = com.nordpool.id.publicapi.v1.serialize.DateDeserializer.class)
    @JsonSerialize(using = com.nordpool.id.publicapi.v1.serialize.DateSerializer.class)
    private ZonedDateTime validFrom;

    /**
     * valid to
     *
     */
    @JsonDeserialize(using = com.nordpool.id.publicapi.v1.serialize.DateDeserializer.class)
    @JsonSerialize(using = com.nordpool.id.publicapi.v1.serialize.DateSerializer.class)
    private ZonedDateTime validTo;

    /**
     * created
     *
     */
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
     * @param id
     * @param messageTitle
     * @param messageBody
     * @param validFrom
     * @param validTo
     * @param created
     */
    public OperationalMessage(UUID id, String messageTitle, String messageBody, ZonedDateTime validFrom, ZonedDateTime validTo, ZonedDateTime created) {
        super();
        this.id = id;
        this.messageTitle = messageTitle;
        this.messageBody = messageBody;
        this.validFrom = validFrom;
        this.validTo = validTo;
        this.created = created;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public OperationalMessage withId(UUID id) {
        this.id = id;
        return this;
    }

    public String getMessageTitle() {
        return messageTitle;
    }

    public void setMessageTitle(String messageTitle) {
        this.messageTitle = messageTitle;
    }

    public OperationalMessage withMessageTitle(String messageTitle) {
        this.messageTitle = messageTitle;
        return this;
    }

    public String getMessageBody() {
        return messageBody;
    }

    public void setMessageBody(String messageBody) {
        this.messageBody = messageBody;
    }

    public OperationalMessage withMessageBody(String messageBody) {
        this.messageBody = messageBody;
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
        return new ToStringBuilder(this)
                .append("id", id)
                .append("messageTitle", messageTitle)
                .append("messageBody", messageBody)
                .append("validFrom", validFrom)
                .append("validTo", validTo)
                .append("created", created)
                .toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder()
                .append(created)
                .append(id)
                .append(validFrom)
                .append(messageTitle)
                .append(messageBody)
                .append(validTo)
                .toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof OperationalMessage)) {
            return false;
        }
        OperationalMessage rhs = (OperationalMessage) other;
        return new EqualsBuilder()
                .append(created, rhs.created)
                .append(id, rhs.id)
                .append(validFrom, rhs.validFrom)
                .append(messageTitle, rhs.messageTitle)
                .append(messageBody, rhs.messageBody)
                .append(validTo, rhs.validTo)
                .isEquals();
    }
}
