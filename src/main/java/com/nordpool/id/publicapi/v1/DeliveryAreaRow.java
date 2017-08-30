/*
 * Copyright 2017 Nord Pool.
 * This library is intended to aid integration with Nord Pool’s Intraday API and comes without any warranty. Users of this library are responsible for separately testing and ensuring that it works according to their own standards.
 * Please send feedback to idapi@nordpoolgroup.com.
 */

package com.nordpool.id.publicapi.v1;

import com.nordpool.id.publicapi.v1.base.BaseRow;

import java.util.List;
import java.util.Objects;

public class DeliveryAreaRow extends BaseRow {
    private Long deliveryAreaId;
    private String eicCode;
    private String currencyCode;
    private String areaCode;
    private String timeZone;
    private String countryIsoCode;
    private List<String> productTypes;
    private Boolean deleted;

    public DeliveryAreaRow() {
    }

    public Long getDeliveryAreaId() {
        return deliveryAreaId;
    }

    public void setDeliveryAreaId(Long deliveryAreaId) {
        this.deliveryAreaId = deliveryAreaId;
    }

    public String getEicCode() {
        return eicCode;
    }

    public void setEicCode(String eicCode) {
        this.eicCode = eicCode;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DeliveryAreaRow)) return false;
        if (!super.equals(o)) return false;
        DeliveryAreaRow deliveryAreaRow = (DeliveryAreaRow) o;
        return Objects.equals(deliveryAreaId, deliveryAreaRow.deliveryAreaId) &&
                Objects.equals(eicCode, deliveryAreaRow.eicCode) &&
                Objects.equals(currencyCode, deliveryAreaRow.currencyCode) &&
                Objects.equals(areaCode, deliveryAreaRow.areaCode) &&
                Objects.equals(timeZone, deliveryAreaRow.timeZone) &&
                Objects.equals(countryIsoCode, deliveryAreaRow.countryIsoCode) &&
                Objects.equals(productTypes, deliveryAreaRow.productTypes) &&
                Objects.equals(deleted, deliveryAreaRow.deleted);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), deliveryAreaId, eicCode, currencyCode, areaCode, timeZone, countryIsoCode, productTypes, deleted);
    }

    @Override
    public String toString() {
        return "DeliveryAreaRow{" +
                "deliveryAreaId=" + deliveryAreaId +
                ", eicCode=" + eicCode +
                ", currencyCode='" + currencyCode + '\'' +
                ", areaCode='" + areaCode + '\'' +
                ", timeZone='" + timeZone + '\'' +
                ", countryIsoCode='" + countryIsoCode + '\'' +
                ", productTypes=" + productTypes +
                ", deleted=" + deleted +
                "} " + super.toString();
    }
}
