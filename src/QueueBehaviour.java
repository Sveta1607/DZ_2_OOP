import java.util.List;

public interface QueueBehaviour {

    void takeInQueue(Actor actor); // Поступил в очередь
    void takeOrders(); //сделать заказ
    void giveOrders(Human actor, List<Product> products); //забрать заказ
    void releaseFromQueue(Human actor); //выйти из очереди



}
