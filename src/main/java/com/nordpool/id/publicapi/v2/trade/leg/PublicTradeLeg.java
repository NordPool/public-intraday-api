package com.nordpool.id.publicapi.v2.trade.leg;

import com.nordpool.id.publicapi.v1.order.OrderSide;

public class PublicTradeLeg
    extends BaseTradeLeg
{
    /**
     * No args constructor for use in serialization
     * 
     */
    public PublicTradeLeg() {
    }

    /**
     * 
     * @param unitPrice
     * @param aggressor
     * @param side
     * @param quantity
     * @param ownership
     * @param contractId
     * @param deliveryAreaId
     * @param marketId
     * @param tenantId
     */
    public PublicTradeLeg(String contractId, OrderSide side, Long unitPrice, Long quantity, Long deliveryAreaId, Boolean aggressor) {
        super(contractId, side, unitPrice, quantity, deliveryAreaId, aggressor);
    }
}
