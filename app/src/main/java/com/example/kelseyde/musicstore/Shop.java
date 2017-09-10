package com.example.kelseyde.musicstore;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Shop {

    private String name;
    private int cash;
    private ArrayList<Item> stock;

    public Shop(String name, int cash, ArrayList<Item> stock) {
        this.name = name;
        this.cash = cash;
        this.stock = stock;
    }

    //getters and setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

    public ArrayList<Item> getStock() {
        return stock;
    }

    public void setStock(ArrayList<Item> stock) {
        this.stock = stock;
    }

    //methods

    public int calculateTotalPossibleProfit() {
        int totalProfit = 0;
        for (Item item : stock) {
            totalProfit += item.calculateMarkup();
        }
        return totalProfit;
    }

    public void buyItem(Item item) {
        cash -= item.getBuyPrice();
        stock.add(item);
    }

    public void sellItem(Item item) {
        for (int i = stock.size() - 1; i > 0; i--) {
            if (stock.get(i) == item) {
                stock.remove(i);
                cash += item.getSellPrice();
            }
        }
    }

    public ArrayList<Item> filterByClass(String targetClass) {
        ArrayList<Item> filteredStock = new ArrayList<Item>();
        for (Item item : stock){
            if (item.getClass().getName() == targetClass){
                filteredStock.add(item);
            }
        }
        return filteredStock;
    }

}
