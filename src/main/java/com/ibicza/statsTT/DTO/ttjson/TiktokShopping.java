package com.ibicza.statsTT.DTO.ttjson;

import com.fasterxml.jackson.annotation.*;

public class TiktokShopping {
    private CommunicationHistory communicationHistory;
    private CurrentPaymentInformation currentPaymentInformation;
    private CustomerSupportHistory customerSupportHistory;
    private OrderDisputeHistory orderDisputeHistory;
    private OrderHistory orderHistory;
    private ProductBrowsingHistory productBrowsingHistory;
    private ProductReviewHistory productReviewHistory;
    private ReturnAndRefundHistory returnAndRefundHistory;
    private SavedAddressInformation savedAddressInformation;
    private ShoppingCartList shoppingCartList;
    private Vouchers vouchers;

    @JsonProperty("Communication History")
    public CommunicationHistory getCommunicationHistory() { return communicationHistory; }
    @JsonProperty("Communication History")
    public void setCommunicationHistory(CommunicationHistory value) { this.communicationHistory = value; }

    @JsonProperty("Current Payment Information")
    public CurrentPaymentInformation getCurrentPaymentInformation() { return currentPaymentInformation; }
    @JsonProperty("Current Payment Information")
    public void setCurrentPaymentInformation(CurrentPaymentInformation value) { this.currentPaymentInformation = value; }

    @JsonProperty("Customer Support History")
    public CustomerSupportHistory getCustomerSupportHistory() { return customerSupportHistory; }
    @JsonProperty("Customer Support History")
    public void setCustomerSupportHistory(CustomerSupportHistory value) { this.customerSupportHistory = value; }

    @JsonProperty("Order Dispute History")
    public OrderDisputeHistory getOrderDisputeHistory() { return orderDisputeHistory; }
    @JsonProperty("Order Dispute History")
    public void setOrderDisputeHistory(OrderDisputeHistory value) { this.orderDisputeHistory = value; }

    @JsonProperty("Order History")
    public OrderHistory getOrderHistory() { return orderHistory; }
    @JsonProperty("Order History")
    public void setOrderHistory(OrderHistory value) { this.orderHistory = value; }

    @JsonProperty("Product Browsing History")
    public ProductBrowsingHistory getProductBrowsingHistory() { return productBrowsingHistory; }
    @JsonProperty("Product Browsing History")
    public void setProductBrowsingHistory(ProductBrowsingHistory value) { this.productBrowsingHistory = value; }

    @JsonProperty("Product Review History")
    public ProductReviewHistory getProductReviewHistory() { return productReviewHistory; }
    @JsonProperty("Product Review History")
    public void setProductReviewHistory(ProductReviewHistory value) { this.productReviewHistory = value; }

    @JsonProperty("Return and Refund History")
    public ReturnAndRefundHistory getReturnAndRefundHistory() { return returnAndRefundHistory; }
    @JsonProperty("Return and Refund History")
    public void setReturnAndRefundHistory(ReturnAndRefundHistory value) { this.returnAndRefundHistory = value; }

    @JsonProperty("Saved Address Information")
    public SavedAddressInformation getSavedAddressInformation() { return savedAddressInformation; }
    @JsonProperty("Saved Address Information")
    public void setSavedAddressInformation(SavedAddressInformation value) { this.savedAddressInformation = value; }

    @JsonProperty("Shopping Cart List")
    public ShoppingCartList getShoppingCartList() { return shoppingCartList; }
    @JsonProperty("Shopping Cart List")
    public void setShoppingCartList(ShoppingCartList value) { this.shoppingCartList = value; }

    @JsonProperty("Vouchers")
    public Vouchers getVouchers() { return vouchers; }
    @JsonProperty("Vouchers")
    public void setVouchers(Vouchers value) { this.vouchers = value; }
}
