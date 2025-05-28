/**
 * Copyright 2022 Nord Pool.
 * This library is intended to aid integration with Nord Pool’s Intraday API and comes without any warranty. Users of this library are responsible for separately testing and ensuring that it works according to their own standards.
 * Please send feedback to idapi@nordpoolgroup.com.
 */


package com.nordpool.id.publicapi.v1.trade.request;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

public class TradeRecallRequest {

    private String tradeId;
    private String revisionNo;
    private String requestId;

    /**
     * No args constructor for use in serialization
     * 
     */
    public TradeRecallRequest() {
    }

    /**
     * 
     * @param revisionNo
     * @param tradeId
     */
    public TradeRecallRequest(String tradeId, String revisionNo, String requestId) {
        super();
        this.tradeId = tradeId;
        this.revisionNo = revisionNo;
        this.requestId = requestId;
    }

    public String getTradeId() {
        return tradeId;
    }

    public void setTradeId(String tradeId) {
        this.tradeId = tradeId;
    }

    public TradeRecallRequest withTradeId(String tradeId) {
        this.tradeId = tradeId;
        return this;
    }

    public String getRevisionNo() {
        return revisionNo;
    }

    public void setRevisionNo(String revisionNo) {
        this.revisionNo = revisionNo;
    }

    public TradeRecallRequest withRevisionNo(String revisionNo) {
        this.revisionNo = revisionNo;
        return this;
    }

    public String getRequestId() { return requestId; }

    public void setRequestId(String requestId) { this.requestId = requestId; }

    public TradeRecallRequest withRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("tradeId", tradeId).append("revisionNo", revisionNo).append("requestId", requestId).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(tradeId).append(revisionNo).append(requestId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof TradeRecallRequest) == false) {
            return false;
        }
        TradeRecallRequest rhs = ((TradeRecallRequest) other);
        return new EqualsBuilder().append(tradeId, rhs.tradeId).append(revisionNo, rhs.revisionNo).append(requestId, rhs.requestId).isEquals();
    }

}
