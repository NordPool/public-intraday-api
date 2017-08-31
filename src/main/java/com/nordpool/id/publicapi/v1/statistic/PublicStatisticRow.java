/*
 * Copyright 2017 Nord Pool.
 * This library is intended to aid integration with Nord Pool’s Intraday API and comes without any warranty. Users of this library are responsible for separately testing and ensuring that it works according to their own standards.
 * Please send feedback to idapi@nordpoolgroup.com.
 */

package com.nordpool.id.publicapi.v1.statistic;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.nordpool.id.publicapi.v1.serialize.DateDeserializer;

import java.time.ZonedDateTime;
import java.util.Objects;

public class PublicStatisticRow extends BaseStatisticRow {
    private Long lastPrice;
    private Long lastQuantity;

    @JsonDeserialize(
            using = DateDeserializer.class
    )
    private ZonedDateTime lastTradeTime;

    private Long highestPrice;
    private Long lowestPrice;
    private Long vwap;
    private Long turnover;
    private Long dayAheadPrice;
    private Tendency tendency;


    public PublicStatisticRow() {
    }

    public Long getLastPrice() {
        return lastPrice;
    }

    public void setLastPrice(Long lastPrice) {
        this.lastPrice = lastPrice;
    }

    public Long getLastQuantity() {
        return lastQuantity;
    }

    public void setLastQuantity(Long lastQuantity) {
        this.lastQuantity = lastQuantity;
    }

    public ZonedDateTime getLastTradeTime() {
        return lastTradeTime;
    }

    public void setLastTradeTime(ZonedDateTime lastTradeTime) {
        this.lastTradeTime = lastTradeTime;
    }

    public Long getHighestPrice() {
        return highestPrice;
    }

    public void setHighestPrice(Long highestPrice) {
        this.highestPrice = highestPrice;
    }

    public Long getLowestPrice() {
        return lowestPrice;
    }

    public void setLowestPrice(Long lowestPrice) {
        this.lowestPrice = lowestPrice;
    }

    public Long getVwap() {
        return vwap;
    }

    public void setVwap(Long vwap) {
        this.vwap = vwap;
    }

    public Long getTurnover() {
        return turnover;
    }

    public void setTurnover(Long turnover) {
        this.turnover = turnover;
    }

    public Long getDayAheadPrice() {
        return dayAheadPrice;
    }

    public void setDayAheadPrice(Long dayAheadPrice) {
        this.dayAheadPrice = dayAheadPrice;
    }

    public Tendency getTendency() {
        return tendency;
    }

    public void setTendency(Tendency tendency) {
        this.tendency = tendency;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(),
                                    lastPrice,
                                    lastQuantity,
                                    highestPrice,
                                    lowestPrice,
                                    vwap,
                                    turnover,
                                    dayAheadPrice,
                                    tendency);
    }


    @Override
    public String toString() {
        return "PublicStatisticRow{" +
                "lastPrice=" + lastPrice +
                ", lastQuantity=" + lastQuantity +
                ", lastTradeTime=" + lastTradeTime +
                ", highestPrice=" + highestPrice +
                ", lowestPrice=" + lowestPrice +
                ", vwap=" + vwap +
                ", turnover=" + turnover +
                ", dayAheadPrice=" + dayAheadPrice +
                ", tendency=" + tendency +
                '}';
    }
}
