/*
 * Copyright 2017 Nord Pool.
 * This library is intended to aid integration with Nord Pool’s Intraday API and comes without any warranty. Users of this library are responsible for separately testing and ensuring that it works according to their own standards.
 * Please send feedback to idapi@nordpoolgroup.com.
 */

package com.nordpool.id.publicapi.v1;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.nordpool.id.publicapi.v1.area.DeliveryAreaState;
import com.nordpool.id.publicapi.v1.base.BaseRow;
import com.nordpool.id.publicapi.v1.contract.ContractState;
import com.nordpool.id.publicapi.v1.contract.ProductType;
import com.nordpool.id.publicapi.v1.serialize.DateDeserializer;
import com.nordpool.id.publicapi.v1.serialize.DateSerializer;

import java.time.ZonedDateTime;
import java.util.List;
import java.util.Objects;

public class ContractRow extends BaseRow {
    private String contractId;
    private String contractName;
    private ContractState state;
    private Long durationSeconds;
    private Long resolutionSeconds;
    private Boolean predefined;
    private Boolean deleted;
    @JsonSerialize(using = DateSerializer.class)
    @JsonDeserialize(using = DateDeserializer.class)
    private ZonedDateTime dlvryStart;
    @JsonSerialize(using = DateSerializer.class)
    @JsonDeserialize(using = DateDeserializer.class)
    private ZonedDateTime dlvryEnd;
    private List<DeliveryAreaState> dlvryAreaState;
    private String marketId;

    // Fields suggested by UI
    private String shortDisplayName;
    private String mediumDisplayName;
    private ProductType productType;
    private String productId;

    public ContractRow() {
    }

    public String getContractId() {
        return contractId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId;
    }

    public String getContractName() {
        return contractName;
    }

    public void setContractName(String contractName) {
        this.contractName = contractName;
    }

    public ContractState getState() {
        return state;
    }

    public void setState(ContractState state) {
        this.state = state;
    }

    public Long getDurationSeconds() {
        return durationSeconds;
    }

    public void setDurationSeconds(Long durationSeconds) {
        this.durationSeconds = durationSeconds;
    }

    public Long getResolutionSeconds() {
        return resolutionSeconds;
    }

    public void setResolutionSeconds(Long resolutionSeconds) {
        this.resolutionSeconds = resolutionSeconds;
    }

    public Boolean getPredefined() {
        return predefined;
    }

    public void setPredefined(Boolean predefined) {
        this.predefined = predefined;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public ZonedDateTime getDlvryStart() {
        return dlvryStart;
    }

    public void setDlvryStart(ZonedDateTime dlvryStart) {
        this.dlvryStart = dlvryStart;
    }

    public ZonedDateTime getDlvryEnd() {
        return dlvryEnd;
    }

    public void setDlvryEnd(ZonedDateTime dlvryEnd) {
        this.dlvryEnd = dlvryEnd;
    }

    public List<DeliveryAreaState> getDlvryAreaState() {
        return dlvryAreaState;
    }

    public void setDlvryAreaState(List<DeliveryAreaState> dlvryAreaState) {
        this.dlvryAreaState = dlvryAreaState;
    }

    public String getMarketId() {
        return marketId;
    }

    public void setMarketId(String marketId) {
        this.marketId = marketId;
    }

    public String getShortDisplayName() {
        return shortDisplayName;
    }

    public void setShortDisplayName(String shortDisplayName) {
        this.shortDisplayName = shortDisplayName;
    }

    public String getMediumDisplayName() {
        return mediumDisplayName;
    }

    public void setMediumDisplayName(String mediumDisplayName) {
        this.mediumDisplayName = mediumDisplayName;
    }

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ContractRow)) return false;
        if (!super.equals(o)) return false;
        ContractRow that = (ContractRow) o;
        return Objects.equals(contractId, that.contractId) &&
                Objects.equals(contractName, that.contractName) &&
                state == that.state &&
                Objects.equals(durationSeconds, that.durationSeconds) &&
                Objects.equals(resolutionSeconds, that.resolutionSeconds) &&
                Objects.equals(predefined, that.predefined) &&
                Objects.equals(deleted, that.deleted) &&
                Objects.equals(dlvryStart, that.dlvryStart) &&
                Objects.equals(dlvryEnd, that.dlvryEnd) &&
                Objects.equals(dlvryAreaState, that.dlvryAreaState) &&
                Objects.equals(marketId, that.marketId) &&
                Objects.equals(shortDisplayName, that.shortDisplayName) &&
                Objects.equals(mediumDisplayName, that.mediumDisplayName) &&
                productType == that.productType &&
                Objects.equals(productId, that.productId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), contractId, contractName, state, durationSeconds, resolutionSeconds, predefined, deleted, dlvryStart, dlvryEnd, dlvryAreaState, marketId, shortDisplayName, mediumDisplayName, productType, productId);
    }

    @Override
    public String toString() {
        return "ContractRow{" +
                "contractId='" + contractId + '\'' +
                ", contractName='" + contractName + '\'' +
                ", state=" + state +
                ", durationSeconds=" + durationSeconds +
                ", resolutionSeconds=" + resolutionSeconds +
                ", predefined=" + predefined +
                ", deleted=" + deleted +
                ", dlvryStart=" + dlvryStart +
                ", dlvryEnd=" + dlvryEnd +
                ", dlvryAreaState=" + dlvryAreaState +
                ", marketId='" + marketId + '\'' +
                ", shortDisplayName='" + shortDisplayName + '\'' +
                ", mediumDisplayName='" + mediumDisplayName + '\'' +
                ", productType=" + productType +
                ", productId='" + productId + '\'' +
                "} " + super.toString();
    }
}
