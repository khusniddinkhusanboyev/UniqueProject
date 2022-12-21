package Planet;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Integer,Planet> stringIntegerMap=new HashMap<>();
        stringIntegerMap.put(1,new Planet("Neptun",465));
        stringIntegerMap.put(2,new Planet("Mars",258));
        stringIntegerMap.put(3,new Planet("Yer",365));
        stringIntegerMap.put(3,new Planet("Yr",365));

        System.out.println(stringIntegerMap.size()+" : "+stringIntegerMap);

        Map<Integer,Planet> map=new HashMap<>();
        map.put(4,new Planet("Sasda",645));
        map.put(8,new Planet("Sdsadsa",64));

        var list=(Map<Integer,Planet>)Arrays.asList();



    }

}