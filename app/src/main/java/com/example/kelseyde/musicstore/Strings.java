package com.example.kelseyde.musicstore;


public class Strings extends Item {
    private String description;

    public Strings(String description, int buyPrice, int sellPrice) {
        super(buyPrice, sellPrice);
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
}
