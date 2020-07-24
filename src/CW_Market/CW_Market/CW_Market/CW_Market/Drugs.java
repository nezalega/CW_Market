package CW_Market;

public class Drugs extends Product {

    double quantity;
    double cost;

    public double getQuantityDrugs() {
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

 //   void discount() {

    }



