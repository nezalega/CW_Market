package CW_Market;

import java.util.Scanner;

public class Program {

      Scanner scan = new Scanner (System.in);
      int MAX_DEALS = scan.nextInt();
      public static final int MAX_PRODUCTS = 2;

    private Deal[] deals;

    public static void main(String[] args) {
        System.out.println ("Введите максимальное количество сделок: ");
        new Program().pusk();
    }

    private void pusk() {
        input();
        System.out.println("=============================");
        output();
    }

    private void output() {
        for (Deal deal : deals) {
                   System.out.println("    " + deal.getBuyer().getName() + " купил у " + deal.getSeller().getName());

            for (Product product : deal.getProducts()) {
                System.out.println("        " + product.getName() + " " + product.getQuantity() + " x "
                        + product.getCost() + " = " + product.getPrice());
            }

            System.out.println("Итого: " + deal.getSum());
            System.out.println("----------------------------");
        }
    }

    private void input() {
        deals = new Deal[MAX_DEALS];

        for (int i = 0; i < deals.length; i++) {
            System.out.print((i + 1) + " из " + deals.length + ": ");
            deals[i] = inputDeal();
        }
    }

    private Deal inputDeal() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Введите сделку ->");

        System.out.print("  Продавец -> ");
        Call seller = inputCall(scan);

        System.out.print("  Покупатель -> ");
        Call buyer = inputCall(scan);

        Product[] products = new Product[MAX_PRODUCTS];
        for (int i = 0; i < products.length; i++) {
            products[i] = inputProduct(scan);
        }

        Deal deal = new Deal(buyer, seller, products);
        return deal;
    }

    private Product inputProduct(Scanner scan) {
        System.out.println("  Введите продукт ->");
        String name = enter(scan, "    Название");
        String cost = enter(scan, "    Стоимость");
        String qty = enter(scan, "    Количество");

        Product product = null;

        switch (1) {

            default:
                product = new Product();
                break;
        }

        product.setName(name);
        product.setCost(Double.valueOf(cost));
        product.setQuantity(Integer.valueOf(qty));

        return product;
    }

    private Call inputCall(Scanner scan) {
        String callName = enter(scan, "Введите имя");
        Call call = new Call();
        call.setName(callName);
        return call;
    }

    private String enter (Scanner txt, String message) {
        System.out.print(message + ": ");
        return txt.next();
    }

}