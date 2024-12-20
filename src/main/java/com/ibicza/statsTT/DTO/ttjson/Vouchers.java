package com.ibicza.statsTT.DTO.ttjson;

import com.fasterxml.jackson.annotation.*;

public class Vouchers {
    private Object vouchers;

    @JsonProperty("Vouchers")
    public Object getVouchers() { return vouchers; }
    @JsonProperty("Vouchers")
    public void setVouchers(Object value) { this.vouchers = value; }
}
