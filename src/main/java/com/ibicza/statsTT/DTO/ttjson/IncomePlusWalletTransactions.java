package com.ibicza.statsTT.DTO.ttjson;

import com.fasterxml.jackson.annotation.*;

public class IncomePlusWalletTransactions {
    private IncomePlusWalletTransaction incomePlusWalletTransaction;

    @JsonProperty("Income Plus Wallet Transaction")
    public IncomePlusWalletTransaction getIncomePlusWalletTransaction() { return incomePlusWalletTransaction; }
    @JsonProperty("Income Plus Wallet Transaction")
    public void setIncomePlusWalletTransaction(IncomePlusWalletTransaction value) { this.incomePlusWalletTransaction = value; }
}
