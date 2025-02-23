package edu.ksu.cs1322.lab2;

public class StockItem {
    private String description;
    private float price;
    private int quantity;
    private static int idCounter = 0;
    private int id;

    public StockItem(String description, float price, int quantity) {
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.id = ++idCounter;
    }

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public float getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void lowerQuantity(int amount) {
        this.quantity -= amount;
    }

    public void raiseQuantity(int amount) {
        this.quantity += amount;
    }
}
