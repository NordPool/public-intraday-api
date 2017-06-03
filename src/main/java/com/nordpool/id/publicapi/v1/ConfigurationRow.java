/*
 * Copyright 2017 Nord Pool.
 * This library is intended to aid integration with Nord Pool’s Intraday API and comes without any warranty. Users of this library are responsible for separately testing and ensuring that it works according to their own standards.
 * Please send feedback to idapi@nordpoolgroup.com.
 */

package com.nordpool.id.publicapi.v1;

import com.nordpool.id.publicapi.v1.portfolio.Portfolio;

import java.util.List;
import java.util.Objects;
import java.util.Set;

public class ConfigurationRow {
    private String userUUID;
    private List<Long> throttlingLimit;
    private Set<Portfolio> portfolios;

    public ConfigurationRow() {
    }

    public String getUserUUID() {
        return userUUID;
    }

    public void setUserUUID(String userUUID) {
        this.userUUID = userUUID;
    }

    public List<Long> getThrottlingLimit() {
        return throttlingLimit;
    }

    public void setThrottlingLimit(List<Long> throttlingLimit) {
        this.throttlingLimit = throttlingLimit;
    }

    public Set<Portfolio> getPortfolios() {
        return portfolios;
    }

    public void setPortfolios(Set<Portfolio> portfolios) {
        this.portfolios = portfolios;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ConfigurationRow)) return false;
        if (!super.equals(o)) return false;
        ConfigurationRow that = (ConfigurationRow) o;
        return throttlingLimit == that.throttlingLimit &&
                Objects.equals(userUUID, that.userUUID) &&
                Objects.equals(portfolios, that.portfolios);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), userUUID, throttlingLimit, portfolios);
    }

    @Override
    public String toString() {
        return "ConfigurationRow{" +
                "userUUID='" + userUUID + '\'' +
                ", throttlingLimit=" + throttlingLimit +
                ", portfolios=" + portfolios +
                "} " + super.toString();
    }
}
