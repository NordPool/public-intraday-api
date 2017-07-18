/*
 * Copyright 2017 Nord Pool.
 * This library is intended to aid integration with Nord Pool’s Intraday API and comes without any warranty. Users of this library are responsible for separately testing and ensuring that it works according to their own standards.
 * Please send feedback to idapi@nordpoolgroup.com.
 */

package com.nordpool.id.publicapi.v1.trade.leg;

import java.util.Objects;

public class PublicTradeLeg extends BaseTradeLeg {
    private LegOwnershipEnum ownership;

    public LegOwnershipEnum getOwnership() {
        return ownership;
    }

    public void setOwnership(LegOwnershipEnum ownership) {
        this.ownership = ownership;
    }

    public PublicTradeLeg() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PublicTradeLeg)) return false;
        if (!super.equals(o)) return false;
        PublicTradeLeg that = (PublicTradeLeg) o;
        return ownership == that.ownership;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), ownership);
    }

    @Override
    public String toString() {
        return "PublicTradeLeg{" +
                "ownership=" + ownership +
                "} " + super.toString();
    }
}
