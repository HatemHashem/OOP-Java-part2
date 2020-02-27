import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Storehouse {
    private Map<String, Integer> storeItemPrice;
    private Map<String, Integer> storeItemStock;

    public Storehouse() {
        storeItemPrice=new HashMap<String, Integer>();
        storeItemStock=new HashMap<String, Integer>();
    }

    public void addProduct(String product, int price, int stock){
        storeItemPrice.put(product,price);
        storeItemStock.put(product,stock);
    }

    public int price(String product){
        if(storeItemPrice.containsKey(product)){
            return storeItemPrice.get(product);
        }
        return -99;
    }
    public int stock(String product){
        if(storeItemStock.containsKey(product)){
            return storeItemStock.get(product);
        }
         return 0;
    }
    public boolean  take(String product){
        if(storeItemStock.containsKey(product)&&(storeItemStock.get(product))>0){
            storeItemStock.replace(product,storeItemStock.get(product)-1);
            return true;
        }
        return false;
    }
    public Set<String> products(){
       Set<String>storeHouseProducts=storeItemPrice.keySet();
        return storeHouseProducts;
    }
}
