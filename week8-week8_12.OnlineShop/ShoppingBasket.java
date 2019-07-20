import java.util.HashMap;
import java.util.Map;

public class ShoppingBasket {

    private Map<String, Purchase> basket = new HashMap<String, Purchase>();

    public void add(String product, int price) {
        if (basket.containsKey(product)) {
            basket.get(product).increaseAmount();
        }

        else {
            Purchase addThis = new Purchase(product, 1, price);
            this.basket.put(product, addThis);
        }
    }

    public int price() {
        int price = 0;
        for (String s : basket.keySet()) {
            price += basket.get(s).price();
        }
       return price;
    }

    public void print() {
        for (String s : basket.keySet()) {
            System.out.println(basket.get(s).toString());
        }
    }
}
