/**
 * Copyright 2017 Nord Pool.
 * This library is intended to aid integration with Nord Pool’s Intraday API and comes without any warranty. Users of this library are responsible for separately testing and ensuring that it works according to their own standards.
 * Please send feedback to idapi@nordpoolgroup.com.
 */


package com.nordpool.id.publicapi.v1.order;

import java.time.ZonedDateTime;
import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;


/**
 * 
 * 
 */
public class OrderModification {

    private Long revisionNo;
    /**
     * UUID for the order, provided by the client to track their own orders
     * 
     */
    private UUID clientOrderId;
    private String orderId;
    private String portfolioId;
    private List<String> contractIds = null;
    /**
     * LIMIT, ICEBERG, USER_DEFINED_BLOCK
     * 
     */
    private OrderType orderType;
    private Long unitPrice;
    private Long quantity;
    /**
     * IOC, FOK, AON, NON, GTD, GFS
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
    private String text;
    private Long clipSize;
    private Long clipPriceChange;
    private Long deliveryAreaId;
    /**
     * BUY/SELL
     * 
     */
    private OrderSide side;
    /**
     * ACTI - Active, IACT - Closed, matched(will never be reopened), HIBE - Deactivated(can be reopened)
     * 
     */
    private OrderState state;

    /**
     * No args constructor for use in serialization
     * 
     */
    public OrderModification() {
    }

    /**
     * 
     * @param unitPrice
     * @param orderType
     * @param clipSize
     * @param side
     * @param quantity
     * @param orderId
     * @param clientOrderId
     * @param contractIds
     * @param clipPriceChange
     * @param portfolioId
     * @param executionRestriction
     * @param expireTime
     * @param revisionNo
     * @param deliveryAreaId
     * @param text
     * @param state
     * @param timeInForce
     */
    public OrderModification(Long revisionNo, UUID clientOrderId, String orderId, String portfolioId, List<String> contractIds, OrderType orderType, Long unitPrice, Long quantity, TimeInForce timeInForce, ExecutionRestriction executionRestriction, ZonedDateTime expireTime, String text, Long clipSize, Long clipPriceChange, Long deliveryAreaId, OrderSide side, OrderState state) {
        super();
        this.revisionNo = revisionNo;
        this.clientOrderId = clientOrderId;
        this.orderId = orderId;
        this.portfolioId = portfolioId;
        this.contractIds = contractIds;
        this.orderType = orderType;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.timeInForce = timeInForce;
        this.executionRestriction = executionRestriction;
        this.expireTime = expireTime;
        this.text = text;
        this.clipSize = clipSize;
        this.clipPriceChange = clipPriceChange;
        this.deliveryAreaId = deliveryAreaId;
        this.side = side;
        this.state = state;
    }

    public Long getRevisionNo() {
        return revisionNo;
    }

    public void setRevisionNo(Long revisionNo) {
        this.revisionNo = revisionNo;
    }

    public OrderModification withRevisionNo(Long revisionNo) {
        this.revisionNo = revisionNo;
        return this;
    }

    /**
     * UUID for the order, provided by the client to track their own orders
     * 
     */
    public UUID getClientOrderId() {
        return clientOrderId;
    }

    /**
     * UUID for the order, provided by the client to track their own orders
     * 
     */
    public void setClientOrderId(UUID clientOrderId) {
        this.clientOrderId = clientOrderId;
    }

    public OrderModification withClientOrderId(UUID clientOrderId) {
        this.clientOrderId = clientOrderId;
        return this;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public OrderModification withOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    public String getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
    }

    public OrderModification withPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
        return this;
    }

    public List<String> getContractIds() {
        return contractIds;
    }

    public void setContractIds(List<String> contractIds) {
        this.contractIds = contractIds;
    }

    public OrderModification withContractIds(List<String> contractIds) {
        this.contractIds = contractIds;
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

    public OrderModification withOrderType(OrderType orderType) {
        this.orderType = orderType;
        return this;
    }

    public Long getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Long unitPrice) {
        this.unitPrice = unitPrice;
    }

    public OrderModification withUnitPrice(Long unitPrice) {
        this.unitPrice = unitPrice;
        return this;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public OrderModification withQuantity(Long quantity) {
        this.quantity = quantity;
        return this;
    }

    /**
     * IOC, FOK, AON, NON, GTD, GFS
     * 
     */
    public TimeInForce getTimeInForce() {
        return timeInForce;
    }

    /**
     * IOC, FOK, AON, NON, GTD, GFS
     * 
     */
    public void setTimeInForce(TimeInForce timeInForce) {
        this.timeInForce = timeInForce;
    }

    public OrderModification withTimeInForce(TimeInForce timeInForce) {
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

    public OrderModification withExecutionRestriction(ExecutionRestriction executionRestriction) {
        this.executionRestriction = executionRestriction;
        return this;
    }

    public ZonedDateTime getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(ZonedDateTime expireTime) {
        this.expireTime = expireTime;
    }

    public OrderModification withExpireTime(ZonedDateTime expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public OrderModification withText(String text) {
        this.text = text;
        return this;
    }

    public Long getClipSize() {
        return clipSize;
    }

    public void setClipSize(Long clipSize) {
        this.clipSize = clipSize;
    }

    public OrderModification withClipSize(Long clipSize) {
        this.clipSize = clipSize;
        return this;
    }

    public Long getClipPriceChange() {
        return clipPriceChange;
    }

    public void setClipPriceChange(Long clipPriceChange) {
        this.clipPriceChange = clipPriceChange;
    }

    public OrderModification withClipPriceChange(Long clipPriceChange) {
        this.clipPriceChange = clipPriceChange;
        return this;
    }

    public Long getDeliveryAreaId() {
        return deliveryAreaId;
    }

    public void setDeliveryAreaId(Long deliveryAreaId) {
        this.deliveryAreaId = deliveryAreaId;
    }

    public OrderModification withDeliveryAreaId(Long deliveryAreaId) {
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

    public OrderModification withSide(OrderSide side) {
        this.side = side;
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

    public OrderModification withState(OrderState state) {
        this.state = state;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("revisionNo", revisionNo).append("clientOrderId", clientOrderId).append("orderId", orderId).append("portfolioId", portfolioId).append("contractIds", contractIds).append("orderType", orderType).append("unitPrice", unitPrice).append("quantity", quantity).append("timeInForce", timeInForce).append("executionRestriction", executionRestriction).append("expireTime", expireTime).append("text", text).append("clipSize", clipSize).append("clipPriceChange", clipPriceChange).append("deliveryAreaId", deliveryAreaId).append("side", side).append("state", state).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(unitPrice).append(orderType).append(clipSize).append(side).append(quantity).append(orderId).append(clientOrderId).append(contractIds).append(clipPriceChange).append(portfolioId).append(executionRestriction).append(expireTime).append(revisionNo).append(deliveryAreaId).append(text).append(state).append(timeInForce).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OrderModification) == false) {
            return false;
        }
        OrderModification rhs = ((OrderModification) other);
        return new EqualsBuilder().append(unitPrice, rhs.unitPrice).append(orderType, rhs.orderType).append(clipSize, rhs.clipSize).append(side, rhs.side).append(quantity, rhs.quantity).append(orderId, rhs.orderId).append(clientOrderId, rhs.clientOrderId).append(contractIds, rhs.contractIds).append(clipPriceChange, rhs.clipPriceChange).append(portfolioId, rhs.portfolioId).append(executionRestriction, rhs.executionRestriction).append(expireTime, rhs.expireTime).append(revisionNo, rhs.revisionNo).append(deliveryAreaId, rhs.deliveryAreaId).append(text, rhs.text).append(state, rhs.state).append(timeInForce, rhs.timeInForce).isEquals();
    }

}
