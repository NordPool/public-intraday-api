/**
 * Copyright 2022 Nord Pool.
 * This library is intended to aid integration with Nord Pool’s Intraday API and comes without any warranty. Users of this library are responsible for separately testing and ensuring that it works according to their own standards.
 * Please send feedback to idapi@nordpoolgroup.com.
 */


package com.nordpool.id.publicapi.v1;

import java.time.ZonedDateTime;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.nordpool.id.publicapi.v1.base.BaseRow;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonIgnoreProperties({"updatedAt"})
public class DeliveryAreaRow
    extends BaseRow
{

    private Long deliveryAreaId;
    /**
     * Delivery area EIC (Energy Identification Code)
     * 
     */
    private String eicCode;
    /**
     * Currency code used in the area
     * 
     */
    private String currencyCode;
    /**
     * Delivery area code
     * 
     */
    private String areaCode;
    /**
     * Time zone used in the area
     * 
     */
    private String timeZone;
    /**
     * Country ISO code
     * 
     */
    private String countryIsoCode;
    /**
     * Product types available in the area
     * 
     */
    private List<String> productTypes = null;
    /**
     * If false: update information with the contents received, If true: delete entity indicated in the message
     * 
     */
    private Boolean deleted;

    /**
     * No args constructor for use in serialization
     * 
     */
    public DeliveryAreaRow() {
    }

    /**
     * 
     * @param areaCode
     * @param deleted
     * @param countryIsoCode
     * @param eicCode
     * @param timeZone
     * @param deliveryAreaId
     * @param productTypes
     * @param currencyCode
     * @param updatedAt
     */
    public DeliveryAreaRow(Long deliveryAreaId, String eicCode, String currencyCode, String areaCode, String timeZone, String countryIsoCode, List<String> productTypes, Boolean deleted, ZonedDateTime updatedAt) {
        super(updatedAt);
        this.deliveryAreaId = deliveryAreaId;
        this.eicCode = eicCode;
        this.currencyCode = currencyCode;
        this.areaCode = areaCode;
        this.timeZone = timeZone;
        this.countryIsoCode = countryIsoCode;
        this.productTypes = productTypes;
        this.deleted = deleted;
    }

    public Long getDeliveryAreaId() {
        return deliveryAreaId;
    }

    public void setDeliveryAreaId(Long deliveryAreaId) {
        this.deliveryAreaId = deliveryAreaId;
    }

    public DeliveryAreaRow withDeliveryAreaId(Long deliveryAreaId) {
        this.deliveryAreaId = deliveryAreaId;
        return this;
    }

    /**
     * Delivery area EIC (Energy Identification Code)
     * 
     */
    public String getEicCode() {
        return eicCode;
    }

    /**
     * Delivery area EIC (Energy Identification Code)
     * 
     */
    public void setEicCode(String eicCode) {
        this.eicCode = eicCode;
    }

    public DeliveryAreaRow withEicCode(String eicCode) {
        this.eicCode = eicCode;
        return this;
    }

    /**
     * Currency code used in the area
     * 
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * Currency code used in the area
     * 
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public DeliveryAreaRow withCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
        return this;
    }

    /**
     * Delivery area code
     * 
     */
    public String getAreaCode() {
        return areaCode;
    }

    /**
     * Delivery area code
     * 
     */
    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public DeliveryAreaRow withAreaCode(String areaCode) {
        this.areaCode = areaCode;
        return this;
    }

    /**
     * Time zone used in the area
     * 
     */
    public String getTimeZone() {
        return timeZone;
    }

    /**
     * Time zone used in the area
     * 
     */
    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public DeliveryAreaRow withTimeZone(String timeZone) {
        this.timeZone = timeZone;
        return this;
    }

    /**
     * Country ISO code
     * 
     */
    public String getCountryIsoCode() {
        return countryIsoCode;
    }

    /**
     * Country ISO code
     * 
     */
    public void setCountryIsoCode(String countryIsoCode) {
        this.countryIsoCode = countryIsoCode;
    }

    public DeliveryAreaRow withCountryIsoCode(String countryIsoCode) {
        this.countryIsoCode = countryIsoCode;
        return this;
    }

    /**
     * Product types available in the area
     * 
     */
    public List<String> getProductTypes() {
        return productTypes;
    }

    /**
     * Product types available in the area
     * 
     */
    public void setProductTypes(List<String> productTypes) {
        this.productTypes = productTypes;
    }

    public DeliveryAreaRow withProductTypes(List<String> productTypes) {
        this.productTypes = productTypes;
        return this;
    }

    /**
     * If false: update information with the contents received, If true: delete entity indicated in the message
     * 
     */
    public Boolean getDeleted() {
        return deleted;
    }

    /**
     * If false: update information with the contents received, If true: delete entity indicated in the message
     * 
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public DeliveryAreaRow withDeleted(Boolean deleted) {
        this.deleted = deleted;
        return this;
    }

    @Override
    public DeliveryAreaRow withUpdatedAt(ZonedDateTime updatedAt) {
        super.withUpdatedAt(updatedAt);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).appendSuper(super.toString()).append("deliveryAreaId", deliveryAreaId).append("eicCode", eicCode).append("currencyCode", currencyCode).append("areaCode", areaCode).append("timeZone", timeZone).append("countryIsoCode", countryIsoCode).append("productTypes", productTypes).append("deleted", deleted).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().appendSuper(super.hashCode()).append(areaCode).append(deleted).append(countryIsoCode).append(eicCode).append(timeZone).append(deliveryAreaId).append(productTypes).append(currencyCode).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof DeliveryAreaRow) == false) {
            return false;
        }
        DeliveryAreaRow rhs = ((DeliveryAreaRow) other);
        return new EqualsBuilder().appendSuper(super.equals(other)).append(areaCode, rhs.areaCode).append(deleted, rhs.deleted).append(countryIsoCode, rhs.countryIsoCode).append(eicCode, rhs.eicCode).append(timeZone, rhs.timeZone).append(deliveryAreaId, rhs.deliveryAreaId).append(productTypes, rhs.productTypes).append(currencyCode, rhs.currencyCode).isEquals();
    }

}
