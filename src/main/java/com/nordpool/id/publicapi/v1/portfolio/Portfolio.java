/*
 * Copyright 2017 Nord Pool.
 * This library is intended to aid integration with Nord Pool’s Intraday API and comes without any warranty. Users of this library are responsible for separately testing and ensuring that it works according to their own standards.
 * Please send feedback to idapi@nordpoolgroup.com.
 */

package com.nordpool.id.publicapi.v1.portfolio;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.nordpool.id.publicapi.v1.area.DeliveryAreaPortfolio;
import com.nordpool.id.publicapi.v1.contract.ContractState;
import com.nordpool.id.publicapi.v1.market.MarketPortfolio;
import com.nordpool.id.publicapi.v1.serialize.DateDeserializer;
import com.nordpool.id.publicapi.v1.serialize.DateSerializer;

import java.time.ZonedDateTime;
import java.util.List;
import java.util.Objects;

public class Portfolio {
    private String id;
    private String name;
    private String shortName;
    private String companyId;
    private PortfolioPermission permission;

    @JsonSerialize(
            using = DateSerializer.class
    )
    @JsonDeserialize(
            using = DateDeserializer.class
    )
    private ZonedDateTime validFrom;

    @JsonSerialize(
            using = DateSerializer.class
    )
    @JsonDeserialize(
            using = DateDeserializer.class
    )
    private ZonedDateTime validTo;

    private boolean deleted;
    private ContractState state;
    private String currency;
    private List<DeliveryAreaPortfolio> areas;
    private List<MarketPortfolio> markets;

    public Portfolio() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public PortfolioPermission getPermission() {
        return permission;
    }

    public void setPermission(PortfolioPermission permission) {
        this.permission = permission;
    }

    public ZonedDateTime getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(ZonedDateTime validFrom) {
        this.validFrom = validFrom;
    }

    public ZonedDateTime getValidTo() {
        return validTo;
    }

    public void setValidTo(ZonedDateTime validTo) {
        this.validTo = validTo;
    }

    public boolean isDeleted() {
        return deleted;
    }

    public void setDeleted(boolean deleted) {
        this.deleted = deleted;
    }

    public ContractState getState() {
        return state;
    }

    public void setState(ContractState state) {
        this.state = state;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public List<DeliveryAreaPortfolio> getAreas() {
        return areas;
    }

    public void setAreas(List<DeliveryAreaPortfolio> areas) {
        this.areas = areas;
    }

    public List<MarketPortfolio> getMarkets() {
        return markets;
    }

    public void setMarkets(List<MarketPortfolio> markets) {
        this.markets = markets;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Portfolio)) return false;
        Portfolio portfolio = (Portfolio) o;
        return deleted == portfolio.deleted &&
                Objects.equals(id, portfolio.id) &&
                Objects.equals(name, portfolio.name) &&
                Objects.equals(shortName, portfolio.shortName) &&
                Objects.equals(companyId, portfolio.companyId) &&
                permission == portfolio.permission &&
                Objects.equals(validFrom, portfolio.validFrom) &&
                Objects.equals(validTo, portfolio.validTo) &&
                state == portfolio.state &&
                Objects.equals(currency, portfolio.currency) &&
                Objects.equals(areas, portfolio.areas) &&
                Objects.equals(markets, portfolio.markets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, shortName, companyId, permission, validFrom, validTo, deleted, state, currency, areas, markets);
    }

    @Override
    public String toString() {
        return "Portfolio{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", shortName='" + shortName + '\'' +
                ", companyId='" + companyId + '\'' +
                ", permission=" + permission +
                ", validFrom=" + validFrom +
                ", validTo=" + validTo +
                ", deleted=" + deleted +
                ", state=" + state +
                ", currency='" + currency + '\'' +
                ", areas=" + areas +
                ", markets=" + markets +
                '}';
    }
}
