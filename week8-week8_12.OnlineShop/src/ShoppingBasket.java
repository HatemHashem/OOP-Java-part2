import java.util.HashMap;
import java.util.Map;

public class ShoppingBasket {
    private Map<String, Purchase> itemsInBasket;

    public ShoppingBasket() {
        itemsInBasket = new HashMap<String, Purchase>();
    }

    public void add(String product, int price) {
        if (itemsInBasket.containsKey(product)) {
            itemsInBasket.get(product).increaseAmount();
        } else {
            itemsInBasket.put(product, new Purchase(product, 1, price));
        }
    }

    public int price() {
        int price = 0;
        for (Purchase purchase : itemsInBasket.values()) {
            price += purchase.price();


        }
        return price;
    }

    public void print() {
        for (String item : itemsInBasket.keySet()) {
            System.out.println(itemsInBasket.get(item));
        }
    }
}
