package com.nordpool.id.publicapi.v1.throttlinglimit;

public class MarketOrderLimits {
    private String market;
    private Long current10s;
    private Long current1h;
    private Long limit10s;
    private Long limit1h;

    public String getMarket() {
        return market;
    }

    public void setMarket(String market) {
        this.market = market;
    }

    public Long getCurrent10s() {
        return current10s;
    }

    public void setCurrent10s(Long current10s) {
        this.current10s = current10s;
    }

    public Long getCurrent1h() {
        return current1h;
    }

    public void setCurrent1h(Long current1h) {
        this.current1h = current1h;
    }

    public Long getLimit10s() {
        return limit10s;
    }

    public void setLimit10s(Long limit10s) {
        this.limit10s = limit10s;
    }

    public Long getLimit1h() {
        return limit1h;
    }

    public void setLimit1h(Long limit1h) {
        this.limit1h = limit1h;
    }
}
