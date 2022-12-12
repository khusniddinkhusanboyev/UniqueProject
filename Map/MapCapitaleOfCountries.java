package Map;

import java.util.*;

public class MapCapitaleOfCountries {
    public static void main(String[] args) {
        HashMap<String,String> hashMap=new HashMap<>();
        hashMap.put("Uzbekistan","Tashkent");
        hashMap.put("Tojigiston","Dushanbe");
        hashMap.put("Qozog'iston","Olmata");
        hashMap.put("Rossiya","Moskva");
        hashMap.put("Qirg'iziton","Bishkekkkkkkkkk");
        hashMap.put("Fransiya","Patij");
        hashMap.put("Xitoy","Tokiyo");
        hashMap.put("Brasilya","Madrid");
        hashMap.put("yaponiya","pekin");
        hashMap.put("Turkiya","Anqara");


        Set<Integer> numbers=new TreeSet<>();
        numbers.add(new Random().nextInt(50));
        numbers.add(new Random().nextInt(50));
        numbers.add(new Random().nextInt(50));
        numbers.add(new Random().nextInt(50));
        numbers.add(new Random().nextInt(50));
        numbers.add(new Random().nextInt(50));
        numbers.add(new Random().nextInt(50));
        numbers.add(new Random().nextInt(50));
        System.out.println(numbers);

      Set<String> names=new TreeSet<>();
      names.add("Xusniddin");
      names.add("Xusanboyev");

      Set<String> names1=new HashSet<>(names);
      names1.add("Abror");
        System.out.println(names1);


        Set<String> num=new TreeSet<>();
        num.add("Monday");
        num.add("Twothday");
        num.add("Wenesday");
        num.add("Payshanba");
        num.add("Friday");
        num.add("Saturday");
        num.add("Sunday");

        System.out.println(num);
      /*  for (int i = 0; i < 100; i++) {
            num.add(random.nextInt(50));
        }


        for (int i = 0; i < 100; i++) {

        }*/

        System.out.println(num.size());
        System.out.println(num);
        System.out.println("Longest name"+findCapital(hashMap));




    }
    public static Map.Entry findCapital(HashMap<String,String> countries){
        Map.Entry<String,String> temp= Map.entry("", "");
        for (String capitalKey:countries.keySet()) {
           if (countries.get(capitalKey).length()>temp.getValue().length()){
               temp=Map.entry(capitalKey, countries.get(capitalKey));
           }
        }
        return temp;
    }
}
