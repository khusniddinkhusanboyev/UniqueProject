package Shopping;

public class Main {
    public static void main(String[] args) {
        Tong tong=new Tong("Tong","Namangan","Norin");
        tong.addProduct("Olma",2500.0);
        tong.addProduct("Anor",1500.0);
        tong.addProduct("banana",1800.0);
        tong.getListOfProducts();

        System.out.println();

        Makro makro=new Makro("Makro","Andijon","Andijon");
        makro.addProduct("Non",3000.0);
        makro.addProduct("Yog'",18000.0);
        makro.addProduct("Kartoshka",5000.0);
        makro.getListOfProducts();


        Karzinka karzinka=new Karzinka("Karzinka","Andijon","YangiBozor");
        karzinka.addProduct("Piyoz",4000.0);
        karzinka.addProduct("Karam",2000.0);
        karzinka.addProduct("Sholg'om",1500.0);
        karzinka.getListOfProducts();
    }
}
