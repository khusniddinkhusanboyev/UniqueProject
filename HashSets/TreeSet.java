package HashSets;

import java.util.Set;

public class TreeSet {
    public static void main(String[] args) {
        Set<Integer> numbers=new java.util.TreeSet<>();
        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }
        Set<Integer> newNumbers=new java.util.TreeSet<>();

        for (int number:numbers ) {
            if (number<7){
                newNumbers.add(number);

            }
        }
        System.out.println(newNumbers);

    }
}
