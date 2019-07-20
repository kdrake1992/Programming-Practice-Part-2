import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Storehouse {

    private Map<String, Integer> prices =  new HashMap<String, Integer>();
    private Map<String, Integer> stocks =  new HashMap<String, Integer>();

    public void addProduct(String product, int price, int stock) {
        this.prices.put(product, price);
        this.stocks.put(product, stock);
    }

    public boolean take(String product) {
        if(this.stocks.containsKey(product)) {
            if (this.stocks.get(product) != 0) {
                this.stocks.replace(product, this.stocks.get(product) - 1);
                return true;
            }
        }

        return false;

    }

    public int price (String product) {
        if(this.prices.containsKey(product)) {
            return this.prices.get(product);
        }
        else {
            return -99;
        }
    }

    public int stock(String product) {
        if(this.stocks.containsKey(product)) {
            return this.stocks.get(product);
        }
        else {
            return 0;
        }
    }

    public Set<String> products() {
        return this.stocks.keySet();
    }

}
