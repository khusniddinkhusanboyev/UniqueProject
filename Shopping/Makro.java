package Shopping;

import java.util.HashMap;
import java.util.Map;

public class Makro extends SumerMarke {

    public Makro(String name, String region, String district) {
        super(name, region, district);
    }

    Map<String,Double> products=new HashMap<>();
    public void addProduct(String name,double price){
        products.put(name,price);
    }


    public void getListOfProducts() {

        System.err.println("Market: " + getName());
        for (String productName : products.keySet()) {
            System.out.println("  " + productName + " : " + products.get(productName));
        }
    }
}
