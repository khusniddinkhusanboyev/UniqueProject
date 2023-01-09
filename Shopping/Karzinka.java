package Shopping;

import java.util.HashMap;
import java.util.Map;

public class Karzinka extends SumerMarke{

    public Karzinka(String name, String region, String district) {
        super(name, region, district);
    }

    Map<String,Double> kproducts=new HashMap<>();
    public void addProduct(String name,double price){
        kproducts.put(name,price);
    }


    public void getListOfProducts() {

        System.err.println("Market: " + getName());
        for (String productName : kproducts.keySet()) {
            System.out.println("  " + productName + " : " + kproducts.get(productName));
        }
    }


}
