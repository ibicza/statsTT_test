package com.ibicza.statsTT.DTO.ttjson;

import com.fasterxml.jackson.annotation.*;

public class IncomePlusWalletTransaction {
    private Object transactionsList;

    @JsonProperty("TransactionsList")
    public Object getTransactionsList() { return transactionsList; }
    @JsonProperty("TransactionsList")
    public void setTransactionsList(Object value) { this.transactionsList = value; }
}
