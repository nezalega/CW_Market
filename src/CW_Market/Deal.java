package CW_Market;

public class Deal {

    private final Call buyer;

    private final Call seller;

    private final Product[] products;

    public Deal(Call buyer, Call seller, Product[] products) {
        super();
        this.buyer = buyer;
        this.seller = seller;
        this.products = products;
    }

    public double getSum() {
        double result = 0;
        for (Product product : products) {
            result += product.getPrice();
        }
        return result;
    }

    public Call getBuyer() {
        return buyer;
    }

    public Call getSeller() {
        return seller;
    }

    public Product[] getProducts() {
        return products;
    }
}

