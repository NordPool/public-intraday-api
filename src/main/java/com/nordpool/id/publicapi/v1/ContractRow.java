/**
 * Copyright 2022 Nord Pool.
 * This library is intended to aid integration with Nord Pool’s Intraday API and comes without any warranty. Users of this library are responsible for separately testing and ensuring that it works according to their own standards.
 * Please send feedback to idapi@nordpoolgroup.com.
 */


package com.nordpool.id.publicapi.v1;

import java.time.ZonedDateTime;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.nordpool.id.publicapi.v1.area.DeliveryAreaState;
import com.nordpool.id.publicapi.v1.base.BaseRow;
import com.nordpool.id.publicapi.v1.contract.ProductType;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class ContractRow
    extends BaseRow
{

    /**
     * Unique identifier for a contract
     * 
     */
    private String contractId;
    /**
     * A more user friendly name for the contract (PH,QH,HH... etc)
     * 
     */
    private String contractName;
    private Long durationSeconds;
    private Long resolutionSeconds;
    /**
     * When a custom block order is entered, a new contract is created for that time interval if it does not already exist, in which case predefined would be false.
     * 
     */
    private Boolean predefined;
    /**
     * If false: update information with the contents received, If true: delete entity indicated in the message.
     * 
     */
    private Boolean deleted;
    @JsonDeserialize(using = com.nordpool.id.publicapi.v1.serialize.DateDeserializer.class)
    @JsonSerialize(using = com.nordpool.id.publicapi.v1.serialize.DateSerializer.class)
    private ZonedDateTime dlvryStart;
    @JsonDeserialize(using = com.nordpool.id.publicapi.v1.serialize.DateDeserializer.class)
    @JsonSerialize(using = com.nordpool.id.publicapi.v1.serialize.DateSerializer.class)
    private ZonedDateTime dlvryEnd;
    /**
     * A contract can be available in many delivery areas, and for each delivery area it can have different opening and closing times. So for each area state, openAt and closeAt times are defined.
     * 
     */
    private List<DeliveryAreaState> dlvryAreaState = null;
    /**
     * Id of the market that this contract belongs to, for example a code for XBID market.
     * 
     */
    private String marketId;
    /**
     * Short display name for contract
     * 
     */
    private String shortDisplayName;
    /**
     * Medium length display name for contract
     * 
     */
    private String mediumDisplayName;
    /**
     * Type of product that this contract belongs to
     * 
     */
    private ProductType productType;
    /**
     * Id of product that this contract belongs to
     * 
     */
    private String productId;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ContractRow() {
    }

    /**
     * 
     * @param resolutionSeconds
     * @param productId
     * @param durationSeconds
     * @param dlvryAreaState
     * @param predefined
     * @param dlvryStart
     * @param marketId
     * @param shortDisplayName
     * @param mediumDisplayName
     * @param deleted
     * @param dlvryEnd
     * @param contractId
     * @param contractName
     * @param productType
     * @param updatedAt
     */
    public ContractRow(String contractId, String contractName, Long durationSeconds, Long resolutionSeconds, Boolean predefined, Boolean deleted, ZonedDateTime dlvryStart, ZonedDateTime dlvryEnd, List<DeliveryAreaState> dlvryAreaState, String marketId, String shortDisplayName, String mediumDisplayName, ProductType productType, String productId, ZonedDateTime updatedAt) {
        super(updatedAt);
        this.contractId = contractId;
        this.contractName = contractName;
        this.durationSeconds = durationSeconds;
        this.resolutionSeconds = resolutionSeconds;
        this.predefined = predefined;
        this.deleted = deleted;
        this.dlvryStart = dlvryStart;
        this.dlvryEnd = dlvryEnd;
        this.dlvryAreaState = dlvryAreaState;
        this.marketId = marketId;
        this.shortDisplayName = shortDisplayName;
        this.mediumDisplayName = mediumDisplayName;
        this.productType = productType;
        this.productId = productId;
    }

    /**
     * Unique identifier for a contract
     * 
     */
    public String getContractId() {
        return contractId;
    }

    /**
     * Unique identifier for a contract
     * 
     */
    public void setContractId(String contractId) {
        this.contractId = contractId;
    }

    public ContractRow withContractId(String contractId) {
        this.contractId = contractId;
        return this;
    }

    /**
     * A more user friendly name for the contract (PH,QH,HH... etc)
     * 
     */
    public String getContractName() {
        return contractName;
    }

    /**
     * A more user friendly name for the contract (PH,QH,HH... etc)
     * 
     */
    public void setContractName(String contractName) {
        this.contractName = contractName;
    }

    public ContractRow withContractName(String contractName) {
        this.contractName = contractName;
        return this;
    }

    public Long getDurationSeconds() {
        return durationSeconds;
    }

    public void setDurationSeconds(Long durationSeconds) {
        this.durationSeconds = durationSeconds;
    }

    public ContractRow withDurationSeconds(Long durationSeconds) {
        this.durationSeconds = durationSeconds;
        return this;
    }

    public Long getResolutionSeconds() {
        return resolutionSeconds;
    }

    public void setResolutionSeconds(Long resolutionSeconds) {
        this.resolutionSeconds = resolutionSeconds;
    }

    public ContractRow withResolutionSeconds(Long resolutionSeconds) {
        this.resolutionSeconds = resolutionSeconds;
        return this;
    }

    /**
     * When a custom block order is entered, a new contract is created for that time interval if it does not already exist, in which case predefined would be false.
     * 
     */
    public Boolean getPredefined() {
        return predefined;
    }

    /**
     * When a custom block order is entered, a new contract is created for that time interval if it does not already exist, in which case predefined would be false.
     * 
     */
    public void setPredefined(Boolean predefined) {
        this.predefined = predefined;
    }

    public ContractRow withPredefined(Boolean predefined) {
        this.predefined = predefined;
        return this;
    }

    /**
     * If false: update information with the contents received, If true: delete entity indicated in the message.
     * 
     */
    public Boolean getDeleted() {
        return deleted;
    }

    /**
     * If false: update information with the contents received, If true: delete entity indicated in the message.
     * 
     */
    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public ContractRow withDeleted(Boolean deleted) {
        this.deleted = deleted;
        return this;
    }

    public ZonedDateTime getDlvryStart() {
        return dlvryStart;
    }

    public void setDlvryStart(ZonedDateTime dlvryStart) {
        this.dlvryStart = dlvryStart;
    }

    public ContractRow withDlvryStart(ZonedDateTime dlvryStart) {
        this.dlvryStart = dlvryStart;
        return this;
    }

    public ZonedDateTime getDlvryEnd() {
        return dlvryEnd;
    }

    public void setDlvryEnd(ZonedDateTime dlvryEnd) {
        this.dlvryEnd = dlvryEnd;
    }

    public ContractRow withDlvryEnd(ZonedDateTime dlvryEnd) {
        this.dlvryEnd = dlvryEnd;
        return this;
    }

    /**
     * A contract can be available in many delivery areas, and for each delivery area it can have different opening and closing times. So for each area state, openAt and closeAt times are defined.
     * 
     */
    public List<DeliveryAreaState> getDlvryAreaState() {
        return dlvryAreaState;
    }

    /**
     * A contract can be available in many delivery areas, and for each delivery area it can have different opening and closing times. So for each area state, openAt and closeAt times are defined.
     * 
     */
    public void setDlvryAreaState(List<DeliveryAreaState> dlvryAreaState) {
        this.dlvryAreaState = dlvryAreaState;
    }

    public ContractRow withDlvryAreaState(List<DeliveryAreaState> dlvryAreaState) {
        this.dlvryAreaState = dlvryAreaState;
        return this;
    }

    /**
     * Id of the market that this contract belongs to, for example a code for XBID market.
     * 
     */
    public String getMarketId() {
        return marketId;
    }

    /**
     * Id of the market that this contract belongs to, for example a code for XBID market.
     * 
     */
    public void setMarketId(String marketId) {
        this.marketId = marketId;
    }

    public ContractRow withMarketId(String marketId) {
        this.marketId = marketId;
        return this;
    }

    /**
     * Short display name for contract
     * 
     */
    public String getShortDisplayName() {
        return shortDisplayName;
    }

    /**
     * Short display name for contract
     * 
     */
    public void setShortDisplayName(String shortDisplayName) {
        this.shortDisplayName = shortDisplayName;
    }

    public ContractRow withShortDisplayName(String shortDisplayName) {
        this.shortDisplayName = shortDisplayName;
        return this;
    }

    /**
     * Medium length display name for contract
     * 
     */
    public String getMediumDisplayName() {
        return mediumDisplayName;
    }

    /**
     * Medium length display name for contract
     * 
     */
    public void setMediumDisplayName(String mediumDisplayName) {
        this.mediumDisplayName = mediumDisplayName;
    }

    public ContractRow withMediumDisplayName(String mediumDisplayName) {
        this.mediumDisplayName = mediumDisplayName;
        return this;
    }

    /**
     * Type of product that this contract belongs to
     * 
     */
    public ProductType getProductType() {
        return productType;
    }

    /**
     * Type of product that this contract belongs to
     * 
     */
    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public ContractRow withProductType(ProductType productType) {
        this.productType = productType;
        return this;
    }

    /**
     * Id of product that this contract belongs to
     * 
     */
    public String getProductId() {
        return productId;
    }

    /**
     * Id of product that this contract belongs to
     * 
     */
    public void setProductId(String productId) {
        this.productId = productId;
    }

    public ContractRow withProductId(String productId) {
        this.productId = productId;
        return this;
    }

    @Override
    public ContractRow withUpdatedAt(ZonedDateTime updatedAt) {
        super.withUpdatedAt(updatedAt);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).appendSuper(super.toString()).append("contractId", contractId).append("contractName", contractName).append("durationSeconds", durationSeconds).append("resolutionSeconds", resolutionSeconds).append("predefined", predefined).append("deleted", deleted).append("dlvryStart", dlvryStart).append("dlvryEnd", dlvryEnd).append("dlvryAreaState", dlvryAreaState).append("marketId", marketId).append("shortDisplayName", shortDisplayName).append("mediumDisplayName", mediumDisplayName).append("productType", productType).append("productId", productId).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().appendSuper(super.hashCode()).append(resolutionSeconds).append(productId).append(durationSeconds).append(dlvryAreaState).append(predefined).append(dlvryStart).append(marketId).append(shortDisplayName).append(mediumDisplayName).append(deleted).append(dlvryEnd).append(contractId).append(contractName).append(productType).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ContractRow) == false) {
            return false;
        }
        ContractRow rhs = ((ContractRow) other);
        return new EqualsBuilder().appendSuper(super.equals(other)).append(resolutionSeconds, rhs.resolutionSeconds).append(productId, rhs.productId).append(durationSeconds, rhs.durationSeconds).append(dlvryAreaState, rhs.dlvryAreaState).append(predefined, rhs.predefined).append(dlvryStart, rhs.dlvryStart).append(marketId, rhs.marketId).append(shortDisplayName, rhs.shortDisplayName).append(mediumDisplayName, rhs.mediumDisplayName).append(deleted, rhs.deleted).append(dlvryEnd, rhs.dlvryEnd).append(contractId, rhs.contractId).append(contractName, rhs.contractName).append(productType, rhs.productType).isEquals();
    }

}
