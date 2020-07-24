package CW_Market;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Deal {

    private final Date date = new Date();

    private final Call buyer;

    private final Call seller;

    private final Product[] products;
    private double fullPrice;


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

    public static void ExpDate() {

        SimpleDateFormat Time = new SimpleDateFormat("yyyy MMM dd");
        Calendar calendar = new GregorianCalendar();
        calendar.add(Calendar.DAY_OF_MONTH, 10);
        System.out.println("Deadline date: " + Time.format(calendar.getTime()));

    }

    public Date getDate() {
        return date;
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

    {
            }}


