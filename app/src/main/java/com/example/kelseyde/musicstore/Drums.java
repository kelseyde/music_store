package com.example.kelseyde.musicstore;


public class Drums extends Instrument implements Playable {

    public Drums(String type, int buyPrice, int sellPrice) {
        super(type, buyPrice, sellPrice);
    }

    public String play() {
        return "Bang Bang Bang!";
    }





}
