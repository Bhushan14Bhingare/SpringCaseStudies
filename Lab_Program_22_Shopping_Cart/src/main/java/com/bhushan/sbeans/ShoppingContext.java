package com.bhushan.sbeans;





public final class ShoppingContext {

    private final ShoppingService shoppingService;

    public ShoppingContext(ShoppingService shoppingService) {
        this.shoppingService = shoppingService;
    }

    public void addItem(String item,double price){
        shoppingService.addItem(item, price);
    }

    public void viewCart(){
        shoppingService.viewCart();
    }

    public void checkout(){
        shoppingService.checkOut();
    }
}