/*
 * Copyright 2017 Nord Pool.
 * This library is intended to aid integration with Nord Pool’s Intraday API and comes without any warranty. Users of this library are responsible for separately testing and ensuring that it works according to their own standards.
 * Please send feedback to idapi@nordpoolgroup.com.
 */

package com.nordpool.id.publicapi.v1;

import com.nordpool.id.publicapi.v1.base.BaseTradeRow;
import com.nordpool.id.publicapi.v1.trade.leg.PublicTradeLeg;

import java.util.List;
import java.util.Objects;

public class PublicTradeRow extends BaseTradeRow {
    private List<PublicTradeLeg> legs;

    public PublicTradeRow() {
    }

    public List<PublicTradeLeg> getLegs() {
        return legs;
    }

    public void setLegs(List<PublicTradeLeg> legs) {
        this.legs = legs;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PublicTradeRow)) return false;
        if (!super.equals(o)) return false;
        PublicTradeRow that = (PublicTradeRow) o;
        return Objects.equals(legs, that.legs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), legs);
    }

    @Override
    public String toString() {
        return "PublicTradeRow{" +
                "legs=" + legs +
                "} " + super.toString();
    }
}
