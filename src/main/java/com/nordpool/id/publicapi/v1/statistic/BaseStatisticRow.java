package com.nordpool.id.publicapi.v1.statistic;

import com.nordpool.id.publicapi.v1.base.BaseRow;

/**
 * Created by Tesla Intraday Team on 31/08/2017.
 */
public class BaseStatisticRow extends BaseRow {
    private long deliveryAreaId;
    private String contractId;

    public BaseStatisticRow() {
    }


    public long getDeliveryAreaId() {
        return deliveryAreaId;
    }

    public String getContractId() {
        return contractId;
    }


    public void setDeliveryAreaId(long deliveryAreaId) {
        this.deliveryAreaId = deliveryAreaId;
    }

    public void setContractId(String contractId) {
        this.contractId = contractId;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BaseStatisticRow)) return false;
        if (!super.equals(o)) return false;

        BaseStatisticRow that = (BaseStatisticRow) o;

        if (getDeliveryAreaId() != that.getDeliveryAreaId()) return false;
        return getContractId().equals(that.getContractId());
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (int) (getDeliveryAreaId() ^ (getDeliveryAreaId() >>> 32));
        result = 31 * result + getContractId().hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "BaseStatisticRow{" +
                "deliveryAreaId=" + deliveryAreaId +
                ", contractId='" + contractId + '\'' +
                '}';
    }
}
