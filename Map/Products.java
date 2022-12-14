package Map;

import java.security.KeyStore;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Products {
    public static void main(String[] args) {
        Map<String, Integer> products = new HashMap<>();
        products.put("Olma", 2000);
        products.put("Non", 3000);
        products.put("Anjir", 1500);
        products.put("Qulpinay", 15000);
        // for (String key:products.keySet()) {
        System.out.println(Collections.max(products.keySet())+":"+products.get(Collections.max(products.keySet())));
        int sum = 0;
        for (String key : products.keySet()) {
            sum += products.get(key);        }
        System.out.println("Avarage :" + sum / products.size());
        System.out.println(Collections.min(products.keySet())+":"+products.get(Collections.min(products.keySet())));

        //}

    }
}
