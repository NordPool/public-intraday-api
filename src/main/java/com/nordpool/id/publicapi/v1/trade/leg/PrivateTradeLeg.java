/**
 * Copyright 2018 Nord Pool.
 * This library is intended to aid integration with Nord Pool’s Intraday API and comes without any warranty. Users of this library are responsible for separately testing and ensuring that it works according to their own standards.
 * Please send feedback to idapi@nordpoolgroup.com.
 */


package com.nordpool.id.publicapi.v1.trade.leg;

import com.nordpool.id.publicapi.v1.order.OrderAction;
import com.nordpool.id.publicapi.v1.order.OrderSide;
import com.nordpool.id.publicapi.v1.order.OrderState;
import com.nordpool.id.publicapi.v1.order.OrderType;
import com.nordpool.id.publicapi.v1.order.TimeInForce;
import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;

public class PrivateTradeLeg
    extends BaseTradeLeg
{

    private String portfolioId;
    private String refOrderId;
    private String userId;
    private Long deliveryStart;
    private Long deliveryEnd;
    /**
     * ACTI - Active, IACT - Closed, matched(will never be reopened), HIBE - Deactivated(can be reopened)
     * 
     */
    private OrderState orderState;
    /**
     * LIMIT, ICEBERG, USER_DEFINED_BLOCK
     * 
     */
    private OrderType orderType;
    private String text;
    /**
     * Action
     * 
     */
    private OrderAction orderAction;
    /**
     * IOC, FOK, AON, GTD, GFS
     * 
     */
    private TimeInForce timeInForce;
    private String clientOrderId;

    /**
     * No args constructor for use in serialization
     * 
     */
    public PrivateTradeLeg() {
    }

    /**
     * 
     * @param unitPrice
     * @param orderType
     * @param aggressor
     * @param side
     * @param quantity
     * @param deliveryStart
     * @param deliveryEnd
     * @param refOrderId
     * @param clientOrderId
     * @param userId
     * @param orderAction
     * @param orderState
     * @param portfolioId
     * @param contractId
     * @param deliveryAreaId
     * @param text
     * @param timeInForce
     */
    public PrivateTradeLeg(String portfolioId, String refOrderId, String userId, Long deliveryStart, Long deliveryEnd, OrderState orderState, OrderType orderType, String text, OrderAction orderAction, TimeInForce timeInForce, String clientOrderId, String contractId, OrderSide side, Long unitPrice, Long quantity, Long deliveryAreaId, Boolean aggressor) {
        super(contractId, side, unitPrice, quantity, deliveryAreaId, aggressor);
        this.portfolioId = portfolioId;
        this.refOrderId = refOrderId;
        this.userId = userId;
        this.deliveryStart = deliveryStart;
        this.deliveryEnd = deliveryEnd;
        this.orderState = orderState;
        this.orderType = orderType;
        this.text = text;
        this.orderAction = orderAction;
        this.timeInForce = timeInForce;
        this.clientOrderId = clientOrderId;
    }

    public String getPortfolioId() {
        return portfolioId;
    }

    public void setPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
    }

    public PrivateTradeLeg withPortfolioId(String portfolioId) {
        this.portfolioId = portfolioId;
        return this;
    }

    public String getRefOrderId() {
        return refOrderId;
    }

    public void setRefOrderId(String refOrderId) {
        this.refOrderId = refOrderId;
    }

    public PrivateTradeLeg withRefOrderId(String refOrderId) {
        this.refOrderId = refOrderId;
        return this;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public PrivateTradeLeg withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    public Long getDeliveryStart() {
        return deliveryStart;
    }

    public void setDeliveryStart(Long deliveryStart) {
        this.deliveryStart = deliveryStart;
    }

    public PrivateTradeLeg withDeliveryStart(Long deliveryStart) {
        this.deliveryStart = deliveryStart;
        return this;
    }

    public Long getDeliveryEnd() {
        return deliveryEnd;
    }

    public void setDeliveryEnd(Long deliveryEnd) {
        this.deliveryEnd = deliveryEnd;
    }

    public PrivateTradeLeg withDeliveryEnd(Long deliveryEnd) {
        this.deliveryEnd = deliveryEnd;
        return this;
    }

    /**
     * ACTI - Active, IACT - Closed, matched(will never be reopened), HIBE - Deactivated(can be reopened)
     * 
     */
    public OrderState getOrderState() {
        return orderState;
    }

    /**
     * ACTI - Active, IACT - Closed, matched(will never be reopened), HIBE - Deactivated(can be reopened)
     * 
     */
    public void setOrderState(OrderState orderState) {
        this.orderState = orderState;
    }

    public PrivateTradeLeg withOrderState(OrderState orderState) {
        this.orderState = orderState;
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

    public PrivateTradeLeg withOrderType(OrderType orderType) {
        this.orderType = orderType;
        return this;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public PrivateTradeLeg withText(String text) {
        this.text = text;
        return this;
    }

    /**
     * Action
     * 
     */
    public OrderAction getOrderAction() {
        return orderAction;
    }

    /**
     * Action
     * 
     */
    public void setOrderAction(OrderAction orderAction) {
        this.orderAction = orderAction;
    }

    public PrivateTradeLeg withOrderAction(OrderAction orderAction) {
        this.orderAction = orderAction;
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

    public PrivateTradeLeg withTimeInForce(TimeInForce timeInForce) {
        this.timeInForce = timeInForce;
        return this;
    }

    public String getClientOrderId() {
        return clientOrderId;
    }

    public void setClientOrderId(String clientOrderId) {
        this.clientOrderId = clientOrderId;
    }

    public PrivateTradeLeg withClientOrderId(String clientOrderId) {
        this.clientOrderId = clientOrderId;
        return this;
    }

    @Override
    public PrivateTradeLeg withContractId(String contractId) {
        super.withContractId(contractId);
        return this;
    }

    @Override
    public PrivateTradeLeg withSide(OrderSide side) {
        super.withSide(side);
        return this;
    }

    @Override
    public PrivateTradeLeg withUnitPrice(Long unitPrice) {
        super.withUnitPrice(unitPrice);
        return this;
    }

    @Override
    public PrivateTradeLeg withQuantity(Long quantity) {
        super.withQuantity(quantity);
        return this;
    }

    @Override
    public PrivateTradeLeg withDeliveryAreaId(Long deliveryAreaId) {
        super.withDeliveryAreaId(deliveryAreaId);
        return this;
    }

    @Override
    public PrivateTradeLeg withAggressor(Boolean aggressor) {
        super.withAggressor(aggressor);
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).appendSuper(super.toString()).append("portfolioId", portfolioId).append("refOrderId", refOrderId).append("userId", userId).append("deliveryStart", deliveryStart).append("deliveryEnd", deliveryEnd).append("orderState", orderState).append("orderType", orderType).append("text", text).append("orderAction", orderAction).append("timeInForce", timeInForce).append("clientOrderId", clientOrderId).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().appendSuper(super.hashCode()).append(orderType).append(portfolioId).append(deliveryStart).append(deliveryEnd).append(refOrderId).append(clientOrderId).append(text).append(userId).append(timeInForce).append(orderAction).append(orderState).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof PrivateTradeLeg) == false) {
            return false;
        }
        PrivateTradeLeg rhs = ((PrivateTradeLeg) other);
        return new EqualsBuilder().appendSuper(super.equals(other)).append(orderType, rhs.orderType).append(portfolioId, rhs.portfolioId).append(deliveryStart, rhs.deliveryStart).append(deliveryEnd, rhs.deliveryEnd).append(refOrderId, rhs.refOrderId).append(clientOrderId, rhs.clientOrderId).append(text, rhs.text).append(userId, rhs.userId).append(timeInForce, rhs.timeInForce).append(orderAction, rhs.orderAction).append(orderState, rhs.orderState).isEquals();
    }

}
