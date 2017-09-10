package com.example.kelseyde.musicstore;


public abstract class Instrument extends Item {

    private String type;

    public Instrument(String type, int buyPrice, int sellPrice) {
        super(buyPrice, sellPrice);
        this.type = type;
    }

    //getters and setters

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
