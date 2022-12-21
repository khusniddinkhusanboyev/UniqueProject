import jdk.dynalink.linker.ConversionComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DummyChalenge {
    public static void main(String[] args) {
        ArrayList<String> strings=new ArrayList<>();
        strings.add("Xusniddin");
        strings.add("Abror");
        strings.add("Sanjar");
        strings.add("Hasanboy");
        strings.add("Doniyor");
        Comparator<String> names=new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                int number=o1.compareToIgnoreCase(o2);
                    if (number<0){
                        return -1;
                    } else if (number>0) {
                        return 1;
                    }else {
                        return 0;
            }
            }
        };
        for (int i = 0; i < strings.size(); i++) {
            for (int j = i; j < strings.size(); j++) {
                System.out.println(names.compare(strings.get(i),strings.get(j)));
            }
        }
        System.out.println(strings);
    }
}
