package com.entities;

import java.util.List;

public class Cart {
    private List<BuyItem> items;

    // добавить количество товара в корзину
    public void addItem(Goods goods, Integer amount){

    }

    public List<BuyItem> getItems() {
        return items;
    }

    public void setItems(List<BuyItem> items) {
        this.items = items;
    }
}
