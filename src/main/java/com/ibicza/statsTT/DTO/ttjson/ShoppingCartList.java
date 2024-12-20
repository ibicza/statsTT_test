package com.ibicza.statsTT.DTO.ttjson;

import com.fasterxml.jackson.annotation.*;

public class ShoppingCartList {
    private Object shoppingCart;

    @JsonProperty("ShoppingCart")
    public Object getShoppingCart() { return shoppingCart; }
    @JsonProperty("ShoppingCart")
    public void setShoppingCart(Object value) { this.shoppingCart = value; }
}
