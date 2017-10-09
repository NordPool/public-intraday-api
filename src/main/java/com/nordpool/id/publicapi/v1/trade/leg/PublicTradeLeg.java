/*
 * Copyright 2017 Nord Pool.
 * This library is intended to aid integration with Nord Pool’s Intraday API and comes without any warranty. Users of this library are responsible for separately testing and ensuring that it works according to their own standards.
 * Please send feedback to idapi@nordpoolgroup.com.
 */

package com.nordpool.id.publicapi.v1.trade.leg;

import java.util.Objects;

public class PublicTradeLeg extends BaseTradeLeg {
    private String tenantId;
    private LegOwnershipEnum ownership;

    public PublicTradeLeg() {
    }

    public String getTenantId() {
        return tenantId;
    }

    public void setTenantId(String tenantId) {
        this.tenantId = tenantId;
    }

    public LegOwnershipEnum getOwnership() {
        return ownership;
    }

    public void setOwnership(LegOwnershipEnum ownership) {
        this.ownership = ownership;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PublicTradeLeg)) return false;
        if (!super.equals(o)) return false;
        PublicTradeLeg that = (PublicTradeLeg) o;
        return Objects.equals(tenantId, that.tenantId) &&
                ownership == that.ownership;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), tenantId, ownership);
    }

    @Override
    public String toString() {
        return "PublicTradeLeg{" +
                "tenantId='" + tenantId + '\'' +
                ", ownership=" + ownership +
                "} " + super.toString();
    }
}
