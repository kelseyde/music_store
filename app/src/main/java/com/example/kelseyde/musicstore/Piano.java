package com.example.kelseyde.musicstore;


public class Piano extends Instrument implements Playable {

    public Piano(String type, int buyPrice, int sellPrice) {
        super(type, buyPrice, sellPrice);
    }

    public String play() {
        return "Chime chime chime!";
    }

}
