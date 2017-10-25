
package com.nordpool.id.publicapi.v1.command;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Copyright 2017 Nord Pool.
 * This library is intended to aid integration with Nord Pool’s Intraday API and comes without any warranty. Users of this library are responsible for separately testing and ensuring that it works according to their own standards.
 * Please send feedback to idapi@nordpoolgroup.com.
 * <p>
 * 
 * 
 */
public class TokenRefreshCommand {

    private String oldToken;
    private String newToken;
    private CommandType type;

    /**
     * No args constructor for use in serialization
     * 
     */
    public TokenRefreshCommand() {
    }

    /**
     * 
     * @param newToken
     * @param oldToken
     * @param type
     */
    public TokenRefreshCommand(String oldToken, String newToken, CommandType type) {
        super();
        this.oldToken = oldToken;
        this.newToken = newToken;
        this.type = type;
    }

    public String getOldToken() {
        return oldToken;
    }

    public void setOldToken(String oldToken) {
        this.oldToken = oldToken;
    }

    public TokenRefreshCommand withOldToken(String oldToken) {
        this.oldToken = oldToken;
        return this;
    }

    public String getNewToken() {
        return newToken;
    }

    public void setNewToken(String newToken) {
        this.newToken = newToken;
    }

    public TokenRefreshCommand withNewToken(String newToken) {
        this.newToken = newToken;
        return this;
    }

    public CommandType getType() {
        return type;
    }

    public void setType(CommandType type) {
        this.type = type;
    }

    public TokenRefreshCommand withType(CommandType type) {
        this.type = type;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("oldToken", oldToken).append("newToken", newToken).append("type", type).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(oldToken).append(newToken).append(type).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TokenRefreshCommand) == false) {
            return false;
        }
        TokenRefreshCommand rhs = ((TokenRefreshCommand) other);
        return new EqualsBuilder().append(oldToken, rhs.oldToken).append(newToken, rhs.newToken).append(type, rhs.type).isEquals();
    }

}
