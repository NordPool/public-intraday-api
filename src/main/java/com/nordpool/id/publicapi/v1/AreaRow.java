/*
 * Copyright 2017 Nord Pool.
 * This library is intended to aid integration with Nord Pool’s Intraday API and comes without any warranty. Users of this library are responsible for separately testing and ensuring that it works according to their own standards.
 * Please send feedback to idapi@nordpoolgroup.com.
 */

package com.nordpool.id.publicapi.v1;

import com.nordpool.id.publicapi.v1.base.BaseRow;

import java.util.List;
import java.util.Objects;

public class AreaRow extends BaseRow {
    private Long deliveryAreaId;
    private String currencyCode;
    private String areaCode;
    private String timeZone;
    private String countryIsoCode;
    private List<String> productTypes;
    private Boolean deleted;
    private Long marketAreaId;

    public AreaRow() {
    }

    public Long getDeliveryAreaId() {
        return deliveryAreaId;
    }

    public void setDeliveryAreaId(Long deliveryAreaId) {
        this.deliveryAreaId = deliveryAreaId;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public String getCountryIsoCode() {
        return countryIsoCode;
    }

    public void setCountryIsoCode(String countryIsoCode) {
        this.countryIsoCode = countryIsoCode;
    }

    public List<String> getProductTypes() {
        return productTypes;
    }

    public void setProductTypes(List<String> productTypes) {
        this.productTypes = productTypes;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public Long getMarketAreaId() {
        return marketAreaId;
    }

    public void setMarketAreaId(Long marketAreaId) {
        this.marketAreaId = marketAreaId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof AreaRow)) return false;
        if (!super.equals(o)) return false;
        AreaRow areaRow = (AreaRow) o;
        return Objects.equals(deliveryAreaId, areaRow.deliveryAreaId) &&
                Objects.equals(currencyCode, areaRow.currencyCode) &&
                Objects.equals(areaCode, areaRow.areaCode) &&
                Objects.equals(timeZone, areaRow.timeZone) &&
                Objects.equals(countryIsoCode, areaRow.countryIsoCode) &&
                Objects.equals(productTypes, areaRow.productTypes) &&
                Objects.equals(deleted, areaRow.deleted) &&
                Objects.equals(marketAreaId, areaRow.marketAreaId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), deliveryAreaId, currencyCode, areaCode, timeZone, countryIsoCode, productTypes, deleted, marketAreaId);
    }

    @Override
    public String toString() {
        return "AreaRow{" +
                "deliveryAreaId=" + deliveryAreaId +
                ", currencyCode='" + currencyCode + '\'' +
                ", areaCode='" + areaCode + '\'' +
                ", timeZone='" + timeZone + '\'' +
                ", countryIsoCode='" + countryIsoCode + '\'' +
                ", productTypes=" + productTypes +
                ", deleted=" + deleted +
                ", marketAreaId=" + marketAreaId +
                "} " + super.toString();
    }
}
