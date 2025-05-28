/**
 * Copyright 2022 Nord Pool.
 * This library is intended to aid integration with Nord Pool’s Intraday API and comes without any warranty. Users of this library are responsible for separately testing and ensuring that it works according to their own standards.
 * Please send feedback to idapi@nordpoolgroup.com.
 */


package com.nordpool.id.publicapi.v1.order.error;

import java.io.Serializable;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class Error implements Serializable
{

    private ErrorCode errorCode;
    private String errorMessage;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Error() {
    }

    /**
     * 
     * @param errorMessage
     * @param errorCode
     */
    public Error(ErrorCode errorCode, String errorMessage) {
        super();
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
    }

    public ErrorCode getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(ErrorCode errorCode) {
        this.errorCode = errorCode;
    }

    public Error withErrorCode(ErrorCode errorCode) {
        this.errorCode = errorCode;
        return this;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public Error withErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("errorCode", errorCode).append("errorMessage", errorMessage).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(errorMessage).append(errorCode).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Error) == false) {
            return false;
        }
        Error rhs = ((Error) other);
        return new EqualsBuilder().append(errorMessage, rhs.errorMessage).append(errorCode, rhs.errorCode).isEquals();
    }

}
