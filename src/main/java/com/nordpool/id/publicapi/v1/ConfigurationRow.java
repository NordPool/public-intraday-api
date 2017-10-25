
package com.nordpool.id.publicapi.v1;

import java.util.List;
import com.nordpool.id.publicapi.v1.portfolio.Portfolio;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * Copyright 2017 Nord Pool.
 * This library is intended to aid integration with Nord Pool’s Intraday API and comes without any warranty. Users of this library are responsible for separately testing and ensuring that it works according to their own standards.
 * Please send feedback to idapi@nordpoolgroup.com.
 * <p>
 * Configuration row. See documentation from: https://developers.nordpoolgroup.com/docs/configuration
 * 
 */
public class ConfigurationRow {

    private String userUUID;
    /**
     * Throttling limits
     * <p>
     * An array of throttling limits
     * 
     */
    private List<Long> throttlingLimit = null;
    /**
     * Portfolios
     * <p>
     * An array of portfolios which are accessible for the logged in user.
     * 
     */
    private List<Portfolio> portfolios = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ConfigurationRow() {
    }

    /**
     * 
     * @param portfolios
     * @param userUUID
     * @param throttlingLimit
     */
    public ConfigurationRow(String userUUID, List<Long> throttlingLimit, List<Portfolio> portfolios) {
        super();
        this.userUUID = userUUID;
        this.throttlingLimit = throttlingLimit;
        this.portfolios = portfolios;
    }

    public String getUserUUID() {
        return userUUID;
    }

    public void setUserUUID(String userUUID) {
        this.userUUID = userUUID;
    }

    public ConfigurationRow withUserUUID(String userUUID) {
        this.userUUID = userUUID;
        return this;
    }

    /**
     * Throttling limits
     * <p>
     * An array of throttling limits
     * 
     */
    public List<Long> getThrottlingLimit() {
        return throttlingLimit;
    }

    /**
     * Throttling limits
     * <p>
     * An array of throttling limits
     * 
     */
    public void setThrottlingLimit(List<Long> throttlingLimit) {
        this.throttlingLimit = throttlingLimit;
    }

    public ConfigurationRow withThrottlingLimit(List<Long> throttlingLimit) {
        this.throttlingLimit = throttlingLimit;
        return this;
    }

    /**
     * Portfolios
     * <p>
     * An array of portfolios which are accessible for the logged in user.
     * 
     */
    public List<Portfolio> getPortfolios() {
        return portfolios;
    }

    /**
     * Portfolios
     * <p>
     * An array of portfolios which are accessible for the logged in user.
     * 
     */
    public void setPortfolios(List<Portfolio> portfolios) {
        this.portfolios = portfolios;
    }

    public ConfigurationRow withPortfolios(List<Portfolio> portfolios) {
        this.portfolios = portfolios;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("userUUID", userUUID).append("throttlingLimit", throttlingLimit).append("portfolios", portfolios).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(portfolios).append(userUUID).append(throttlingLimit).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ConfigurationRow) == false) {
            return false;
        }
        ConfigurationRow rhs = ((ConfigurationRow) other);
        return new EqualsBuilder().append(portfolios, rhs.portfolios).append(userUUID, rhs.userUUID).append(throttlingLimit, rhs.throttlingLimit).isEquals();
    }

}
