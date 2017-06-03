/*
 * Copyright 2017 Nord Pool.
 * This library is intended to aid integration with Nord Pool’s Intraday API and comes without any warranty. Users of this library are responsible for separately testing and ensuring that it works according to their own standards.
 * Please send feedback to idapi@nordpoolgroup.com.
 */

package com.nordpool.id.publicapi.v1.trade.request;

import java.util.Objects;

public class TradeRecallRequest {
    private String tradeId;
    private String revisionNo;

    public TradeRecallRequest() {
    }

    private TradeRecallRequest(Builder builder) {
        setTradeId(builder.tradeId);
        setRevisionNo(builder.revisionNo);
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public String getTradeId() {
        return tradeId;
    }

    public void setTradeId(String tradeId) {
        this.tradeId = tradeId;
    }

    public String getRevisionNo() {
        return revisionNo;
    }

    public void setRevisionNo(String revisionNo) {
        this.revisionNo = revisionNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TradeRecallRequest)) return false;
        TradeRecallRequest that = (TradeRecallRequest) o;
        return Objects.equals(tradeId, that.tradeId) &&
                Objects.equals(revisionNo, that.revisionNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tradeId, revisionNo);
    }

    @Override
    public String toString() {
        return "TradeRecallRequest{" +
                "tradeId='" + tradeId + '\'' +
                ", revisionNo='" + revisionNo + '\'' +
                '}';
    }


    public static final class Builder {
        private String tradeId;
        private String revisionNo;

        private Builder() {
        }

        public Builder withTradeId(String val) {
            tradeId = val;
            return this;
        }

        public Builder withRevisionNo(String val) {
            revisionNo = val;
            return this;
        }

        public TradeRecallRequest build() {
            return new TradeRecallRequest(this);
        }
    }
}
