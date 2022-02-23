package com.entities;

import java.util.Map;

public class Shop {
    private Map<Buyer, Cart> carts;
    private Group root;

    // купить товары
    public void buyGoods(Goods goods, Integer amount){

    }

    // выбрать каталог товаров
    public Group getCatalog(){
        return null;
    }




    public Map<Buyer, Cart> getCarts() {
        return carts;
    }

    public void setCarts(Map<Buyer, Cart> carts) {
        this.carts = carts;
    }

    public Group getRoot() {
        return root;
    }

    public void setRoot(Group root) {
        this.root = root;
    }
}
