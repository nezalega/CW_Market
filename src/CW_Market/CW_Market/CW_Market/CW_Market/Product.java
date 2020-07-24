package CW_Market;

import CW_Market.Date_regExp.ProducerInfo;

@ProducerInfo(company = "China", name = "prodShop", number = 1, productTypes = { "bakaleia", "himia" })

public class Product {

    private String name;
    private double cost;
    private int quantity;

    public Product() {
        super();
    }

    public Product(String name, double cost, int quantity){

        super();
        this.name = name;
        this.cost = cost;
        this.quantity = quantity;
    }

    public Product(String productName, double price) {
        this.name = name;
        this.cost = cost;
    }
    public double getPrice() {
        return quantity * cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public double oneprice() {
        return (cost * quantity);
    }

    public double discount() {
        int koef = 5;
        return (oneprice() * (100 - koef) / 100);
    }
}



