package com.nordpool.id.publicapi.v1.statistic;

import java.math.BigDecimal;

/**
 * Created by Tesla Intraday Team on 08/08/2017.
 */
public enum Tendency {
    UP,
    DOWN,
    EQUAL;

    private Tendency() {
    }

    public static Tendency define(Long current, Long last) {
        if (current != null && last != null) {
            if (current.compareTo(last) > 0) {
                return UP;
            } else {
                return current.compareTo(last) < 0 ? DOWN : EQUAL;
            }
        } else {
            return null;
        }
    }
}
