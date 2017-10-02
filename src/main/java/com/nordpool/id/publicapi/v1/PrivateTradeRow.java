/*
 * Copyright 2017 Nord Pool.
 * This library is intended to aid integration with Nord Pool’s Intraday API and comes without any warranty. Users of this library are responsible for separately testing and ensuring that it works according to their own standards.
 * Please send feedback to idapi@nordpoolgroup.com.
 */

package com.nordpool.id.publicapi.v1;

import com.nordpool.id.publicapi.v1.base.BaseTradeRow;
import com.nordpool.id.publicapi.v1.trade.leg.PrivateTradeLeg;

import java.util.List;
import java.util.Objects;

public class PrivateTradeRow extends BaseTradeRow {
    private List<PrivateTradeLeg> legs;
    private Long cancellationFee;
    private String cancellationDeadLine;
    private Long revisionNo;

    public PrivateTradeRow() {
    }

    public List<PrivateTradeLeg> getLegs() {
        return legs;
    }

    public void setLegs(List<PrivateTradeLeg> legs) {
        this.legs = legs;
    }

    public Long getCancellationFee() {
        return cancellationFee;
    }

    public void setCancellationFee(Long cancellationFee) {
        this.cancellationFee = cancellationFee;
    }

    public String getCancellationDeadLine() {
        return cancellationDeadLine;
    }

    public void setCancellationDeadLine(String cancellationDeadLine) {
        this.cancellationDeadLine = cancellationDeadLine;
    }

    public Long getRevisionNo() {
        return revisionNo;
    }

    public void setRevisionNo(Long revisionNo) {
        this.revisionNo = revisionNo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PrivateTradeRow)) return false;
        if (!super.equals(o)) return false;
        PrivateTradeRow that = (PrivateTradeRow) o;
        return Objects.equals(legs, that.legs) &&
                Objects.equals(cancellationFee, that.cancellationFee) &&
                Objects.equals(cancellationDeadLine, that.cancellationDeadLine) &&
                Objects.equals(revisionNo, that.revisionNo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), legs, cancellationFee, cancellationDeadLine, revisionNo);
    }

    @Override
    public String toString() {
        return "PrivateTradeRow{" +
                "legs=" + legs +
                ", cancellationFee=" + cancellationFee +
                ", cancellationDeadLine='" + cancellationDeadLine + '\'' +
                ", revisionNo=" + revisionNo +
                "} " + super.toString();
    }
}
