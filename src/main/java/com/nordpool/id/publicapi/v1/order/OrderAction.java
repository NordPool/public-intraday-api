/*
 * Copyright 2017 Nord Pool.
 * This library is intended to aid integration with Nord Pool’s Intraday API and comes without any warranty. Users of this library are responsible for separately testing and ensuring that it works according to their own standards.
 * Please send feedback to idapi@nordpoolgroup.com.
 */

package com.nordpool.id.publicapi.v1.order;

public enum OrderAction {
    USER_ADDED,
    USER_HIBERNATED,
    USER_MODIFIED,
    USER_DELETED,
    SYSTEM_HIBERNATED,
    SYSTEM_MODIFIED,
    SYSTEM_DELETED,
    PARTIAL_EXECUTION,
    FULL_EXECUTION,
    ICEBERG_SLICE_ADDED;

    private OrderAction() {
    }
}
