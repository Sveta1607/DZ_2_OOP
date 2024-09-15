import java.util.List;

public class Main {

    public static void main(String[] args) {

        Human ivan = new Human("Иван");
        Human petr = new Human("Петр");
        Human oly = new Human("Ольга");
        Human yra = new Human("Юрий");
        Human dima = new Human("Дима");
        Human geny = new Human("Женя");
        Human masha = new Human("Мария");

        Market berezka = new Market();

        berezka.acceptToMarket(List.of(ivan, petr, oly, yra, geny, dima));

        berezka.giveOrders(ivan, List.of(Product.APPLE, Product.JUICE, Product.WATTER));
        berezka.giveOrders(petr, List.of(Product.APPLE, Product.POTATO, Product.MEAT));
        berezka.giveOrder(oly, Product.APPLE);
        berezka.giveOrder(yra, Product.APPLE);

        berezka.update();

        berezka.releaseFromMarket(petr);
        berezka.releaseFromMarket(oly);

        berezka.acceptToMarket(masha);
        berezka.giveOrder(masha, Product.POTATO);

        berezka.update();

        berezka.releaseFromMarket();

        berezka.update();

    }
}