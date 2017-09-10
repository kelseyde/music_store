package com.example.kelseyde.musicstore;


public class Trumpet extends Instrument implements Playable {

    public Trumpet(String type, int buyPrice, int sellPrice) {
        super(type, buyPrice, sellPrice);
    }

    public String play() {
        return "Honk honk honk!";
    }

}
