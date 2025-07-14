/**
 * Copyright 2022 Nord Pool.
 * This library is intended to aid integration with Nord Pool’s Intraday API and comes without any warranty. Users of this library are responsible for separately testing and ensuring that it works according to their own standards.
 * Please send feedback to idapi@nordpoolgroup.com.
 */


package com.nordpool.id.publicapi.v1.order;

import java.time.ZonedDateTime;
import java.util.List;
import java.util.UUID;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.nordpool.id.publicapi.v1.order.error.Error;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.jspecify.annotations.Nullable;

public class OrderExecutionEntry {

    private Long eventSequenceNo;
    private String marketId;
    private String tenantId;
    private String userId;
    private String orderId;
    private Long revisionNo;
    /**
     * Id of the previous order in this modification chain. When an order is modified and its priority changes, or partially matched, a new order Id is assigned.
     * 
     */
    @Nullable
    private String previousOrderId;
    /**
     * The original order id in this modification chain.
     * 
     */
    private String originalOrderId;
    @JsonDeserialize(using = com.nordpool.id.publicapi.v1.serialize.DateDeserializer.class)
    @JsonSerialize(using = com.nordpool.id.publicapi.v1.serialize.DateSerializer.class)
    private ZonedDateTime createdAt;
    @JsonDeserialize(using = com.nordpool.id.publicapi.v1.serialize.DateDeserializer.class)
    @JsonSerialize(using = com.nordpool.id.publicapi.v1.serialize.DateSerializer.class)
    private ZonedDateTime updatedAt;
    /**
     * Id for the order, provided by the client to track their own orders
     * 
     */
    private String clientOrderId;
    /**
     * Basket id for the order
     *
     */
    @Nullable
    private UUID linkedBasketId;
    /**
     * The portfolio id of the current order
     * 
     */
    private String portfolioId;
    /**
     * The contract ids for current order
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
     * If timeInForce is set to GTD (Good Till Date), the expireTime will determine when the order expires
     * 
     */
    @JsonDeserialize(using = com.nordpool.id.publicapi.v1.serialize.DateDeserializer.class)
    @JsonSerialize(using = com.nordpool.id.publicapi.v1.serialize.DateSerializer.class)
    private ZonedDateTime expireTime;

    private String text;
    /**
     * ACTI - Active, IACT - Closed, matched(will never be reopened), HIBE - Deactivated(can be reopened)
     * 
     */
    private OrderState state;
    /**
     * Action
     * 
     */
    private OrderAction action;
    private OrderActionIssuer actionIssuer;
    @Nullable
    private Long clipSize;
    @Nullable
    private Long clipPriceChange;
    @Nullable
    private Long remainingQuantity;
    @Nullable
    private List<Error> errors = null;
    /**
     * 'AON' (All or None): The order must be filled completely or not at all. The order stays in the order book until it is executed or removed by the system or user. This execution restriction can be used only in combination with User Defined Block Orders. 'NON': No restrictions.
     * 
     */
    private ExecutionRestriction executionRestriction;

    /**
     * No args constructor for use in serialization
     * 
     */
    public OrderExecutionEntry() {
    }

    /**
     * 
     * @param remainingQuantity
     * @param orderType
     * @param clipSize
     * @param orderId
     * @param marketId
     * @param createdAt
     * @param executionRestriction
     * @param originalOrderId
     * @param action
     * @param actionIssuer
     * @param revisionNo
     * @param text
     * @param state
     * @param timeInForce
     * @param updatedAt
     * @param unitPrice
     * @param side
     * @param quantity
     * @param clientOrderId
     * @param linkedBasketId
     * @param contractIds
     * @param eventSequenceNo
     * @param userId
     * @param clipPriceChange
     * @param portfolioId
     * @param expireTime
     * @param tenantId
     * @param deliveryAreaId
     * @param previousOrderId
     * @param errors
     */
    public OrderExecutionEntry(Long eventSequenceNo, String marketId, String tenantId, String userId, String orderId, Long revisionNo, String previousOrderId, String originalOrderId, ZonedDateTime createdAt, ZonedDateTime updatedAt, String clientOrderId, UUID linkedBasketId, String portfolioId, List<String> contractIds, Long deliveryAreaId, OrderSide side, OrderType orderType, Long unitPrice, Long quantity, TimeInForce timeInForce, ZonedDateTime expireTime, String text, OrderState state, OrderAction action, OrderActionIssuer actionIssuer, Long clipSize, Long clipPriceChange, Long remainingQuantity, List<Error> errors, ExecutionRestriction executionRestriction) {
        super();
        this.eventSequenceNo = eventSequenceNo;
        this.marketId = marketId;
        this.tenantId = tenantId;
        this.userId = userId;
        this.orderId = orderId;
        this.revisionNo = revisionNo;
        this.previousOrderId = previousOrderId;
        this.originalOrderId = originalOrderId;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.clientOrderId = clientOrderId;
        this.linkedBasketId = linkedBasketId;
        this.portfolioId = portfolioId;
        this.contractIds = contractIds;
        this.deliveryAreaId = deliveryAreaId;
        this.side = side;
        this.orderType = orderType;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
        this.timeInForce = timeInForce;
        this.expireTime = expireTime;
        this.text = text;
        this.state = state;
        this.action = action;
        this.actionIssuer = actionIssuer;
        this.clipSize = clipSize;
        this.clipPriceChange = clipPriceChange;
        this.remainingQuantity = remainingQuantity;
        this.errors = errors;
        this.executionRestriction = executionRestriction;
    }

    public Long getEventSequenceNo() {
        return eventSequenceNo;
    }

    public void setEventSequenceNo(Long eventSequenceNo) {
        this.eventSequenceNo = eventSequenceNo;
    }

    public OrderExecutionEntry withEventSequenceNo(Long eventSequenceNo) {
        this.eventSequenceNo = eventSequenceNo;
        return this;
    }

    public String getMarketId() {
        return marketId;
    }

    public void setMarketId(String marketId) {
        this.marketId = marketId;
    }

    public OrderExecutionEntry withMarketId(String marketId) {
        this.marketId = marketId;
        return this;
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public OrderExecutionEntry withTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public OrderExecutionEntry withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public OrderExecutionEntry withOrderId(String orderId) {
        this.orderId = orderId;
        return this;
    }

    public Long getRevisionNo() {
        return revisionNo;
    }

    public void setRevisionNo(Long revisionNo) {
        this.revisionNo = revisionNo;
    }

    public OrderExecutionEntry withRevisionNo(Long revisionNo) {
        this.revisionNo = revisionNo;
        return this;
    }

    /**
     * Id of the previous order in this modification chain. When an order is modified and its priority changes, or partially matched, a new order Id is assigned.
     * 
     */
    public String getPreviousOrderId() {
        return previousOrderId;
    }

    /**
     * Id of the previous order in this modification chain. When an order is modified and its priority changes, or partially matched, a new order Id is assigned.
     * 
     */
    public void setPreviousOrderId(String previousOrderId) {
        this.previousOrderId = previousOrderId;
    }

    public OrderExecutionEntry withPreviousOrderId(String previousOrderId) {
        this.previousOrderId = previousOrderId;
        return this;
    }

    /**
     * The original order id in this modification chain.
     * 
     */
    public String getOriginalOrderId() {
        return originalOrderId;
    }

    /**
     * The original order id in this modification chain.
     * 
     */
    public void setOriginalOrderId(String originalOrderId) {
        this.originalOrderId = originalOrderId;
    }

    public OrderExecutionEntry withOriginalOrderId(String originalOrderId) {
        this.originalOrderId = originalOrderId;
        return this;
    }

    public ZonedDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(ZonedDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public OrderExecutionEntry withCreatedAt(ZonedDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    public ZonedDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(ZonedDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public OrderExecutionEntry withUpdatedAt(ZonedDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
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

    public OrderExecutionEntry withClientOrderId(String clientOrderId) {
        this.clientOrderId = clientOrderId;
        return this;
    }

    public UUID getLinkedBasketId() {
        return linkedBasketId;
    }

    public void setLinkedBasketId(UUID linkedBasketId) {
        this.linkedBasketId = linkedBasketId;
    }

    public OrderExecutionEntry withLinkedBasketId(UUID linkedBasketId) {
        this.linkedBasketId = linkedBasketId;
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

    public OrderExecutionEntry withPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
        return this;
    }

    /**
     * The contract ids for current order
     * 
     */
    public List<String> getContractIds() {
        return contractIds;
    }

    /**
     * The contract ids for current order
     * 
     */
    public void setContractIds(List<String> contractIds) {
        this.contractIds = contractIds;
    }

    public OrderExecutionEntry withContractIds(List<String> contractIds) {
        this.contractIds = contractIds;
        return this;
    }

    public Long getDeliveryAreaId() {
        return deliveryAreaId;
    }

    public void setDeliveryAreaId(Long deliveryAreaId) {
        this.deliveryAreaId = deliveryAreaId;
    }

    public OrderExecutionEntry withDeliveryAreaId(Long deliveryAreaId) {
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

    public OrderExecutionEntry withSide(OrderSide side) {
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

    public OrderExecutionEntry withOrderType(OrderType orderType) {
        this.orderType = orderType;
        return this;
    }

    public Long getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(Long unitPrice) {
        this.unitPrice = unitPrice;
    }

    public OrderExecutionEntry withUnitPrice(Long unitPrice) {
        this.unitPrice = unitPrice;
        return this;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public OrderExecutionEntry withQuantity(Long quantity) {
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

    public OrderExecutionEntry withTimeInForce(TimeInForce timeInForce) {
        this.timeInForce = timeInForce;
        return this;
    }

    /**
     * If timeInForce is set to GTD (Good Till Date), the expireTime will determine when the order expires
     * 
     */
    public ZonedDateTime getExpireTime() {
        return expireTime;
    }

    /**
     * If timeInForce is set to GTD (Good Till Date), the expireTime will determine when the order expires
     * 
     */
    public void setExpireTime(ZonedDateTime expireTime) {
        this.expireTime = expireTime;
    }

    public OrderExecutionEntry withExpireTime(ZonedDateTime expireTime) {
        this.expireTime = expireTime;
        return this;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public OrderExecutionEntry withText(String text) {
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

    public OrderExecutionEntry withState(OrderState state) {
        this.state = state;
        return this;
    }

    /**
     * Action
     * 
     */
    public OrderAction getAction() {
        return action;
    }

    /**
     * Action
     * 
     */
    public void setAction(OrderAction action) {
        this.action = action;
    }

    public OrderExecutionEntry withAction(OrderAction action) {
        this.action = action;
        return this;
    }

    public OrderActionIssuer getActionIssuer() {
        return actionIssuer;
    }

    public void setActionIssuer(OrderActionIssuer actionIssuer) {
        this.actionIssuer = actionIssuer;
    }

    public OrderExecutionEntry withActionIssuer(OrderActionIssuer actionIssuer) {
        this.actionIssuer = actionIssuer;
        return this;
    }

    public Long getClipSize() {
        return clipSize;
    }

    public void setClipSize(Long clipSize) {
        this.clipSize = clipSize;
    }

    public OrderExecutionEntry withClipSize(Long clipSize) {
        this.clipSize = clipSize;
        return this;
    }

    public Long getClipPriceChange() {
        return clipPriceChange;
    }

    public void setClipPriceChange(Long clipPriceChange) {
        this.clipPriceChange = clipPriceChange;
    }

    public OrderExecutionEntry withClipPriceChange(Long clipPriceChange) {
        this.clipPriceChange = clipPriceChange;
        return this;
    }

    public Long getRemainingQuantity() {
        return remainingQuantity;
    }

    public void setRemainingQuantity(Long remainingQuantity) {
        this.remainingQuantity = remainingQuantity;
    }

    public OrderExecutionEntry withRemainingQuantity(Long remainingQuantity) {
        this.remainingQuantity = remainingQuantity;
        return this;
    }

    public List<Error> getErrors() {
        return errors;
    }

    public void setErrors(List<Error> errors) {
        this.errors = errors;
    }

    public OrderExecutionEntry withErrors(List<Error> errors) {
        this.errors = errors;
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

    public OrderExecutionEntry withExecutionRestriction(ExecutionRestriction executionRestriction) {
        this.executionRestriction = executionRestriction;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("eventSequenceNo", eventSequenceNo).append("marketId", marketId).append("tenantId", tenantId).append("userId", userId).append("orderId", orderId).append("revisionNo", revisionNo).append("previousOrderId", previousOrderId).append("originalOrderId", originalOrderId).append("createdAt", createdAt).append("updatedAt", updatedAt).append("clientOrderId", clientOrderId).append("portfolioId", portfolioId).append("contractIds", contractIds).append("deliveryAreaId", deliveryAreaId).append("side", side).append("orderType", orderType).append("unitPrice", unitPrice).append("quantity", quantity).append("timeInForce", timeInForce).append("expireTime", expireTime).append("text", text).append("state", state).append("action", action).append("actionIssuer", actionIssuer).append("clipSize", clipSize).append("clipPriceChange", clipPriceChange).append("remainingQuantity", remainingQuantity).append("errors", errors).append("executionRestriction", executionRestriction).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(remainingQuantity).append(orderType).append(clipSize).append(orderId).append(marketId).append(createdAt).append(executionRestriction).append(originalOrderId).append(action).append(actionIssuer).append(revisionNo).append(text).append(state).append(timeInForce).append(updatedAt).append(unitPrice).append(side).append(quantity).append(clientOrderId).append(contractIds).append(eventSequenceNo).append(userId).append(clipPriceChange).append(portfolioId).append(expireTime).append(tenantId).append(deliveryAreaId).append(previousOrderId).append(errors).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof OrderExecutionEntry) == false) {
            return false;
        }
        OrderExecutionEntry rhs = ((OrderExecutionEntry) other);
        return new EqualsBuilder().append(remainingQuantity, rhs.remainingQuantity).append(orderType, rhs.orderType).append(clipSize, rhs.clipSize).append(orderId, rhs.orderId).append(marketId, rhs.marketId).append(createdAt, rhs.createdAt).append(executionRestriction, rhs.executionRestriction).append(originalOrderId, rhs.originalOrderId).append(action, rhs.action).append(actionIssuer, rhs.actionIssuer).append(revisionNo, rhs.revisionNo).append(text, rhs.text).append(state, rhs.state).append(timeInForce, rhs.timeInForce).append(updatedAt, rhs.updatedAt).append(unitPrice, rhs.unitPrice).append(side, rhs.side).append(quantity, rhs.quantity).append(clientOrderId, rhs.clientOrderId).append(contractIds, rhs.contractIds).append(eventSequenceNo, rhs.eventSequenceNo).append(userId, rhs.userId).append(clipPriceChange, rhs.clipPriceChange).append(portfolioId, rhs.portfolioId).append(expireTime, rhs.expireTime).append(tenantId, rhs.tenantId).append(deliveryAreaId, rhs.deliveryAreaId).append(previousOrderId, rhs.previousOrderId).append(errors, rhs.errors).isEquals();
    }

}
