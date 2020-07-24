package CW_Market.Date_regExp;

import CW_Market.Product;

public class PC extends Product {

    double quantity;
    double cost;

    public double getQuantityPC() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    @Override
    public double getCost() {
        return cost;
    }

    @Override
    public void setCost(double cost) {
        this.cost = cost;
    }

}
