package com.example.kelseyde.musicstore;


public abstract class Item {

    private int buyPrice;
    private int sellPrice;

    public Item(int buyPrice, int sellPrice) {
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }

    //getters and setters

    public int getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(int buyPrice) {
        this.buyPrice = buyPrice;
    }

    public int getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(int sellPrice) {
        this.sellPrice = sellPrice;
    }

    //methods

    public int calculateMarkup() {
        int markup = ( buyPrice - sellPrice );
        return markup;
    }

}
