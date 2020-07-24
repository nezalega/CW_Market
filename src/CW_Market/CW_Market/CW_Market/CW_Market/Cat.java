package CW_Market;


class Cat extends Product {

    public Cat() {
        super();
    }

    public Cat (String name, double cost, int quantity){

        super(name, cost, quantity);
    }
    @Override
    public double discount() {
        int koef;
        if (getCost() > 5) {
            koef = 4;
        } else
            koef = 1;

        return (getPrice() * (100 - koef) / 100);
}}