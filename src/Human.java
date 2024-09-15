import java.util.ArrayList;
import java.util.List;

public class Human extends Actor{

    public List<Product> order = new ArrayList<Product>();

    public Human(String name) {
        super(name);
        order = new ArrayList<>();
        setMakeOrder(false);
        setTakeOrder(false);
    }

    public Human(String name, List<Product> products) {
        super(name);
        order.addAll(products);
        setMakeOrder(true);
        setTakeOrder(false);
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setMakeOrder(boolean fag) {
        this.isMakeOrder= fag;

    }

    @Override
    public void setTakeOrder(boolean fag) {
        this.isMakeOrder= fag;

    }

    @Override
    public boolean isMakeOrder() {
        return isMakeOrder;
    }

    @Override
    public boolean isTakeOrder() {
        return isTakeOrder;
    }

    public void saveOrder(Product product){
        order.add(product);
        setMakeOrder(true);
    }

    public void saveOrder(List<Product> products){
        order.addAll(products);
        setMakeOrder(true);
    }

    @Override
    public String toString() {
        return name;
    }

}
