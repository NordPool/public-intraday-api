/**
 * Copyright 2021 Nord Pool.
 * This library is intended to aid integration with Nord Pool’s Intraday API and comes without any warranty. Users of this library are responsible for separately testing and ensuring that it works according to their own standards.
 * Please send feedback to idapi@nordpoolgroup.com.
 */


package com.nordpool.id.publicapi.v1.portfolio;

import java.time.ZonedDateTime;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.nordpool.id.publicapi.v1.area.DeliveryAreaPortfolio;
import com.nordpool.id.publicapi.v1.contract.ContractState;
import com.nordpool.id.publicapi.v1.market.MarketPortfolio;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class Portfolio {

    /**
     * Portfolio Id
     * <p>
     * Portfolio unique identifier created by the trading platform.
     * 
     */
    private String id;
    /**
     * Name
     * <p>
     * Portfolio name in a human readable format.
     * 
     */
    private String name;
    /**
     * Short name
     * <p>
     * Portfolio short name
     * 
     */
    private String shortName;
    /**
     * Company Id
     * <p>
     * Company unique identifier that portfolios are assigned to.
     * 
     */
    private String companyId;
    /**
     * READ: user can view private orders and private trades, WRITE: user can view private orders and private trades. Also, user can place and modify orders and trades.
     * 
     */
    private PortfolioPermission permission;
    @JsonDeserialize(using = com.nordpool.id.publicapi.v1.serialize.DateDeserializer.class)
    @JsonSerialize(using = com.nordpool.id.publicapi.v1.serialize.DateSerializer.class)
    private ZonedDateTime validFrom;
    @JsonDeserialize(using = com.nordpool.id.publicapi.v1.serialize.DateDeserializer.class)
    @JsonSerialize(using = com.nordpool.id.publicapi.v1.serialize.DateSerializer.class)
    private ZonedDateTime validTo;
    /**
     * Deleted
     * <p>
     * If false: update information with the contents received. If true: delete entity indicated in the message
     * 
     */
    private Boolean deleted;
    /**
     * ACTI: Active, IACT: Expired(will never be reopened), HIBE: Closed(can be reopened)
     * 
     */
    private ContractState state;
    /**
     * Currency
     * <p>
     * Currency used for the portfolio
     * 
     */
    private String currency;
    /**
     * Areas
     * <p>
     * List of areas in which the portfolio is valid
     * 
     */
    private List<DeliveryAreaPortfolio> areas = null;
    /**
     * Markets
     * <p>
     * List of markets where given portfolio can trade
     * 
     */
    private List<MarketPortfolio> markets = null;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Portfolio() {
    }

    /**
     * 
     * @param companyId
     * @param markets
     * @param deleted
     * @param name
     * @param permission
     * @param currency
     * @param areas
     * @param id
     * @param validFrom
     * @param state
     * @param shortName
     * @param validTo
     */
    public Portfolio(String id, String name, String shortName, String companyId, PortfolioPermission permission, ZonedDateTime validFrom, ZonedDateTime validTo, Boolean deleted, ContractState state, String currency, List<DeliveryAreaPortfolio> areas, List<MarketPortfolio> markets) {
        super();
        this.id = id;
        this.name = name;
        this.shortName = shortName;
        this.companyId = companyId;
        this.permission = permission;
        this.validFrom = validFrom;
        this.validTo = validTo;
        this.deleted = deleted;
        this.state = state;
        this.currency = currency;
        this.areas = areas;
        this.markets = markets;
    }

    /**
     * Portfolio Id
     * <p>
     * Portfolio unique identifier created by the trading platform.
     * 
     */
    public String getId() {
        return id;
    }

    /**
     * Portfolio Id
     * <p>
     * Portfolio unique identifier created by the trading platform.
     * 
     */
    public void setId(String id) {
        this.id = id;
    }

    public Portfolio withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Name
     * <p>
     * Portfolio name in a human readable format.
     * 
     */
    public String getName() {
        return name;
    }

    /**
     * Name
     * <p>
     * Portfolio name in a human readable format.
     * 
     */
    public void setName(String name) {
        this.name = name;
    }

    public Portfolio withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Short name
     * <p>
     * Portfolio short name
     * 
     */
    public String getShortName() {
        return shortName;
    }

    /**
     * Short name
     * <p>
     * Portfolio short name
     * 
     */
    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public Portfolio withShortName(String shortName) {
        this.shortName = shortName;
        return this;
    }

    /**
     * Company Id
     * <p>
     * Company unique identifier that portfolios are assigned to.
     * 
     */
    public String getCompanyId() {
        return companyId;
    }

    /**
     * Company Id
     * <p>
     * Company unique identifier that portfolios are assigned to.
     * 
     */
    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public Portfolio withCompanyId(String companyId) {
        this.companyId = companyId;
        return this;
    }

    /**
     * READ: user can view private orders and private trades, WRITE: user can view private orders and private trades. Also, user can place and modify orders and trades.
     * 
     */
    public PortfolioPermission getPermission() {
        return permission;
    }

    /**
     * READ: user can view private orders and private trades, WRITE: user can view private orders and private trades. Also, user can place and modify orders and trades.
     * 
     */
    public void setPermission(PortfolioPermission permission) {
        this.permission = permission;
    }

    public Portfolio withPermission(PortfolioPermission permission) {
        this.permission = permission;
        return this;
    }

    public ZonedDateTime getValidFrom() {
        return validFrom;
    }

    public void setValidFrom(ZonedDateTime validFrom) {
        this.validFrom = validFrom;
    }

    public Portfolio withValidFrom(ZonedDateTime validFrom) {
        this.validFrom = validFrom;
        return this;
    }

    public ZonedDateTime getValidTo() {
        return validTo;
    }

    public void setValidTo(ZonedDateTime validTo) {
        this.validTo = validTo;
    }

    public Portfolio withValidTo(ZonedDateTime validTo) {
        this.validTo = validTo;
        return this;
    }

    /**
     * Deleted
     * <p>
     * If false: update information with the contents received. If true: delete entity indicated in the message
     * 
     */
    public Boolean getDeleted() {
        return deleted;
    }

    /**
     * Deleted
     * <p>
     * If false: update information with the contents received. If true: delete entity indicated in the message
     * 
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public Portfolio withDeleted(Boolean deleted) {
        this.deleted = deleted;
        return this;
    }

    /**
     * ACTI: Active, IACT: Expired(will never be reopened), HIBE: Closed(can be reopened)
     * 
     */
    public ContractState getState() {
        return state;
    }

    /**
     * ACTI: Active, IACT: Expired(will never be reopened), HIBE: Closed(can be reopened)
     * 
     */
    public void setState(ContractState state) {
        this.state = state;
    }

    public Portfolio withState(ContractState state) {
        this.state = state;
        return this;
    }

    /**
     * Currency
     * <p>
     * Currency used for the portfolio
     * 
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * Currency
     * <p>
     * Currency used for the portfolio
     * 
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Portfolio withCurrency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
     * Areas
     * <p>
     * List of areas in which the portfolio is valid
     * 
     */
    public List<DeliveryAreaPortfolio> getAreas() {
        return areas;
    }

    /**
     * Areas
     * <p>
     * List of areas in which the portfolio is valid
     * 
     */
    public void setAreas(List<DeliveryAreaPortfolio> areas) {
        this.areas = areas;
    }

    public Portfolio withAreas(List<DeliveryAreaPortfolio> areas) {
        this.areas = areas;
        return this;
    }

    /**
     * Markets
     * <p>
     * List of markets where given portfolio can trade
     * 
     */
    public List<MarketPortfolio> getMarkets() {
        return markets;
    }

    /**
     * Markets
     * <p>
     * List of markets where given portfolio can trade
     * 
     */
    public void setMarkets(List<MarketPortfolio> markets) {
        this.markets = markets;
    }

    public Portfolio withMarkets(List<MarketPortfolio> markets) {
        this.markets = markets;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("name", name).append("shortName", shortName).append("companyId", companyId).append("permission", permission).append("validFrom", validFrom).append("validTo", validTo).append("deleted", deleted).append("state", state).append("currency", currency).append("areas", areas).append("markets", markets).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(permission).append(areas).append(validFrom).append(companyId).append(markets).append(deleted).append(name).append(currency).append(id).append(state).append(shortName).append(validTo).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Portfolio) == false) {
            return false;
        }
        Portfolio rhs = ((Portfolio) other);
        return new EqualsBuilder().append(permission, rhs.permission).append(areas, rhs.areas).append(validFrom, rhs.validFrom).append(companyId, rhs.companyId).append(markets, rhs.markets).append(deleted, rhs.deleted).append(name, rhs.name).append(currency, rhs.currency).append(id, rhs.id).append(state, rhs.state).append(shortName, rhs.shortName).append(validTo, rhs.validTo).isEquals();
    }

}
