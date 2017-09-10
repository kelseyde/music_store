package com.example.kelseyde.musicstore;


public class Guitar extends Instrument implements Playable {

    public Guitar(String type, int buyPrice, int sellPrice) {
        super(type, buyPrice, sellPrice);
    }

    public String play() {
        return "Strum strum strum!";
    }

}
