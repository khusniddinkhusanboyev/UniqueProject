package Shopping;


import java.util.HashMap;
import java.util.Map;

public class Tong extends SumerMarke{

    public Tong(String name, String region, String district) {
        super(name, region, district);
    }

    Map<String,Double> tproducts=new HashMap<>();
    public void addProduct(String name,double price){
        tproducts.put(name,price);
    }


    public void getListOfProducts(){

        System.err.println("Market: "+getName());
        for(String productName: tproducts.keySet()){
            System.out.println("  "+productName+" : "+tproducts.get(productName));
        }
    }


}
