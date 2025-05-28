/**
 * Copyright 2022 Nord Pool.
 * This library is intended to aid integration with Nord Pool’s Intraday API and comes without any warranty. Users of this library are responsible for separately testing and ensuring that it works according to their own standards.
 * Please send feedback to idapi@nordpoolgroup.com.
 */


package com.nordpool.id.publicapi.v1.order;

import java.time.ZonedDateTime;
import java.util.List;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.jetbrains.annotations.Nullable;

public class OrderEntry {

    /**
     * Id for the order, provided by the client to track their own orders
     * 
     */
    private String clientOrderId;
    /**
     * The portfolio id of the current order
     * 
     */
    private String portfolioId;
    /**
     * The contract ids that the current order should be placed on. For limit orders, only one value is allowed, for custom block orders all the contracts that the block spans should be included
     * 
     */
    private List<String> contractIds = null;
    private Long deliveryAreaId;
    /**
     * BUY/SELL
     * 
     */
    private OrderSide side;
    /**
     * LIMIT, ICEBERG, USER_DEFINED_BLOCK
     * 
     */
    private OrderType orderType;
    private Long unitPrice;
    private Long quantity;
    /**
     * IOC, FOK, AON, GTD, GFS
     * 
     */
    private TimeInForce timeInForce;
    /**
     * 'AON' (All or None): The order must be filled completely or not at all. The order stays in the order book until it is executed or removed by the system or user. This execution restriction can be used only in combination with User Defined Block Orders. 'NON': No restrictions.
     * 
     */
    private ExecutionRestriction executionRestriction;
    @JsonDeserialize(using = com.nordpool.id.publicapi.v1.serialize.DateDeserializer.class)
    @JsonSerialize(using = com.nordpool.id.publicapi.v1.serialize.DateSerializer.class)
    private ZonedDateTime expireTime;
    @Nullable
    private String text;
    /**
     * ACTI - Active, IACT - Closed, matched(will never be reopened), HIBE - Deactivated(can be reopened)
     * 
     */
    private OrderState state;
    @Nullable
    private Long clipSize;
    @Nullable
    private Long clipPriceChange;

    /**
     * No args constructor for use in serialization
     * 
     */
    public OrderEntry() {
    }

    /**
     * 
     * @param unitPrice
     * @param orderType
     * @param side
     * @param clipSize
     * @param quantity
     * @param clientOrderId
     * @param contractIds
     * @param clipPriceChange
     * @param portfolioId
     * @param executionRestriction
     * @param expireTime
     * @param deliveryAreaId
     * @param text
     * @param state
     * @param timeInForce
     */
    public OrderEntry(String clientOrderId, String portfolioId, List<String> contractIds, Long deliveryAreaId, OrderSide side, OrderType orderType, Long unitPrice, Long quantity, TimeInForce timeInForce, ExecutionRestriction executionRestriction, ZonedDateTime expireTime, String text, OrderState state, Long clipSize, Long clipPriceChange) {
        super();
        this.clientOrderId = clientOrderId;
        this.portfolioId = portfolioId;
        this.contractIds = contractIds;
        this.deliveryAreaId = deliveryAreaId;
        this.side = side;
        this.orderType = orderType;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.timeInForce = timeInForce;
        this.executionRestriction = executionRestriction;
        this.expireTime = expireTime;
        this.text = text;
        this.state = state;
        this.clipSize = clipSize;
        this.clipPriceChange = clipPriceChange;
    }

    /**
     * Id for the order, provided by the client to track their own orders
     * 
     */
    public String getClientOrderId() {
        return clientOrderId;
    }

    /**
     * Id for the order, provided by the client to track their own orders
     * 
     */
    public void setClientOrderId(String clientOrderId) {
        this.clientOrderId = clientOrderId;
    }

    public OrderEntry withClientOrderId(String clientOrderId) {
        this.clientOrderId = clientOrderId;
        return this;
    }

    /**
     * The portfolio id of the current order
     * 
     */
    public String getPortfolioId() {
        return portfolioId;
    }

    /**
     * The portfolio id of the current order
     * 
     */
    public void setPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
    }

    public OrderEntry withPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
        return this;
    }

    /**
     * The contract ids that the current order should be placed on. For limit orders, only one value is allowed, for custom block orders all the contracts that the block spans should be included
     * 
     */
    public List<String> getContractIds() {
        return contractIds;
    }

    /**
     * The contract ids that the current order should be placed on. For limit orders, only one value is allowed, for custom block orders all the contracts that the block spans should be included
     * 
     */
    public void setContractIds(List<String> contractIds) {
        this.contractIds = contractIds;
    }

    public OrderEntry withContractIds(List<String> contractIds) {
        this.contractIds = contractIds;
        return this;
    }

    public Long getDeliveryAreaId() {
        return deliveryAreaId;
    }

    public void setDeliveryAreaId(Long deliveryAreaId) {
        this.deliveryAreaId = deliveryAreaId;
    }

    public OrderEntry withDeliveryAreaId(Long deliveryAreaId) {
        this.deliveryAreaId = deliveryAreaId;
        return this;
    }

    /**
     * BUY/SELL
     * 
     */
    public OrderSide getSide() {
        return side;
    }

    /**
     * BUY/SELL
     * 
     */
    public void setSide(OrderSide side) {
        this.side = side;
    }

    public OrderEntry withSide(OrderSide side) {
        this.side = side;
        return this;
    }

    /**
     * LIMIT, ICEBERG, USER_DEFINED_BLOCK
     * 
     */
    public OrderType getOrderType() {
        return orderType;
    }

    /**
     * LIMIT, ICEBERG, USER_DEFINED_BLOCK
     * 
     */
    public void setOrderType(OrderType orderType) {
        this.orderType = orderType;
    }

    public OrderEntry withOrderType(OrderType orderType) {
        this.orderType = orderType;
        return this;
    }

    public Long getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Long unitPrice) {
        this.unitPrice = unitPrice;
    }

    public OrderEntry withUnitPrice(Long unitPrice) {
        this.unitPrice = unitPrice;
        return this;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public OrderEntry withQuantity(Long quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     * IOC, FOK, AON, GTD, GFS
     * 
     */
    public TimeInForce getTimeInForce() {
        return timeInForce;
    }

    /**
     * IOC, FOK, AON, GTD, GFS
     * 
     */
    public void setTimeInForce(TimeInForce timeInForce) {
        this.timeInForce = timeInForce;
    }

    public OrderEntry withTimeInForce(TimeInForce timeInForce) {
        this.timeInForce = timeInForce;
        return this;
    }

    /**
     * 'AON' (All or None): The order must be filled completely or not at all. The order stays in the order book until it is executed or removed by the system or user. This execution restriction can be used only in combination with User Defined Block Orders. 'NON': No restrictions.
     * 
     */
    public ExecutionRestriction getExecutionRestriction() {
        return executionRestriction;
    }

    /**
     * 'AON' (All or None): The order must be filled completely or not at all. The order stays in the order book until it is executed or removed by the system or user. This execution restriction can be used only in combination with User Defined Block Orders. 'NON': No restrictions.
     * 
     */
    public void setExecutionRestriction(ExecutionRestriction executionRestriction) {
        this.executionRestriction = executionRestriction;
    }

    public OrderEntry withExecutionRestriction(ExecutionRestriction executionRestriction) {
        this.executionRestriction = executionRestriction;
        return this;
    }

    public ZonedDateTime getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(ZonedDateTime expireTime) {
        this.expireTime = expireTime;
    }

    public OrderEntry withExpireTime(ZonedDateTime expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public OrderEntry withText(String text) {
        this.text = text;
        return this;
    }

    /**
     * ACTI - Active, IACT - Closed, matched(will never be reopened), HIBE - Deactivated(can be reopened)
     * 
     */
    public OrderState getState() {
        return state;
    }

    /**
     * ACTI - Active, IACT - Closed, matched(will never be reopened), HIBE - Deactivated(can be reopened)
     * 
     */
    public void setState(OrderState state) {
        this.state = state;
    }

    public OrderEntry withState(OrderState state) {
        this.state = state;
        return this;
    }

    public Long getClipSize() {
        return clipSize;
    }

    public void setClipSize(Long clipSize) {
        this.clipSize = clipSize;
    }

    public OrderEntry withClipSize(Long clipSize) {
        this.clipSize = clipSize;
        return this;
    }

    public Long getClipPriceChange() {
        return clipPriceChange;
    }

    public void setClipPriceChange(Long clipPriceChange) {
        this.clipPriceChange = clipPriceChange;
    }

    public OrderEntry withClipPriceChange(Long clipPriceChange) {
        this.clipPriceChange = clipPriceChange;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("clientOrderId", clientOrderId).append("portfolioId", portfolioId).append("contractIds", contractIds).append("deliveryAreaId", deliveryAreaId).append("side", side).append("orderType", orderType).append("unitPrice", unitPrice).append("quantity", quantity).append("timeInForce", timeInForce).append("executionRestriction", executionRestriction).append("expireTime", expireTime).append("text", text).append("state", state).append("clipSize", clipSize).append("clipPriceChange", clipPriceChange).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(unitPrice).append(orderType).append(side).append(clipSize).append(quantity).append(clientOrderId).append(contractIds).append(clipPriceChange).append(portfolioId).append(executionRestriction).append(expireTime).append(deliveryAreaId).append(text).append(state).append(timeInForce).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OrderEntry) == false) {
            return false;
        }
        OrderEntry rhs = ((OrderEntry) other);
        return new EqualsBuilder().append(unitPrice, rhs.unitPrice).append(orderType, rhs.orderType).append(side, rhs.side).append(clipSize, rhs.clipSize).append(quantity, rhs.quantity).append(clientOrderId, rhs.clientOrderId).append(contractIds, rhs.contractIds).append(clipPriceChange, rhs.clipPriceChange).append(portfolioId, rhs.portfolioId).append(executionRestriction, rhs.executionRestriction).append(expireTime, rhs.expireTime).append(deliveryAreaId, rhs.deliveryAreaId).append(text, rhs.text).append(state, rhs.state).append(timeInForce, rhs.timeInForce).isEquals();
    }

}
