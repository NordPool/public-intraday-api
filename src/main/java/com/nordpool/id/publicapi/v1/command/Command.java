/**
 * Copyright 2021 Nord Pool.
 * This library is intended to aid integration with Nord Pool’s Intraday API and comes without any warranty. Users of this library are responsible for separately testing and ensuring that it works according to their own standards.
 * Please send feedback to idapi@nordpoolgroup.com.
 */


package com.nordpool.id.publicapi.v1.command;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Command to send via Websocket
 * 
 */
public class Command {

    private CommandType type;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Command() {
    }

    /**
     * 
     * @param type
     */
    public Command(CommandType type) {
        super();
        this.type = type;
    }

    public CommandType getType() {
        return type;
    }

    public void setType(CommandType type) {
        this.type = type;
    }

    public Command withType(CommandType type) {
        this.type = type;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("type", type).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(type).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Command) == false) {
            return false;
        }
        Command rhs = ((Command) other);
        return new EqualsBuilder().append(type, rhs.type).isEquals();
    }

}
