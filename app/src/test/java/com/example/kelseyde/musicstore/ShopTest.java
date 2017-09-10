package com.example.kelseyde.musicstore;

import org.junit.Before;
import org.junit.Test;
import java.util.ArrayList;
import static org.junit.Assert.*;

public class ShopTest {

    Shop shop;
    ArrayList<Item> stock;
    Guitar guitar1;
    Guitar guitar2;
    Piano piano1;
    Piano piano2;
    Trumpet trumpet1;
    Drums drums1;

    @Before
    public void before() {
        stock = new ArrayList<Item>();
        guitar1 = new Guitar("Classical", 75, 100);
        guitar2 = new Guitar("Electric", 100, 110);
        piano1 = new Piano("Keyboard", 60, 80);
        piano2 = new Piano("Grand", 200, 300);
        trumpet1 = new Trumpet("Brass", 90, 100);
        drums1 = new Drums("Snare", 40, 60);
        stock.add(guitar1);
        stock.add(guitar2);
        stock.add(piano1);
        stock.add(piano2);
        stock.add(trumpet1);
        stock.add(drums1);
        shop = new Shop("Music Store", 1000, stock);
    }

    @Test
    public void testBuyItem(){
        Guitar guitar3 = new Guitar("Hybrid", 100, 120);
        shop.buyItem(guitar3);
        assertEquals(900, shop.getCash());
        assertEquals(7, shop.getStock().size());
    }

    @Test
    public void testSellItem() {
        shop.sellItem(piano1);
        assertEquals(1080, shop.getCash());
        assertEquals(5, shop.getStock().size());
    }

    @Test
    public void testCanFilterByStock() {
        ArrayList<Item> result = shop.filterByClass("Guitar");
        assertEquals(2, result.size());
    }






}