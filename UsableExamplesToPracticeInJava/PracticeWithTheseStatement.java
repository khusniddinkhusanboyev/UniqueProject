package UsableExamplesToPracticeInJava;

import java.util.*;

public class PracticeWithTheseStatement {
    public static void main(String[] args) {

    }
    //PrimeNumbers
    public static boolean isPrime(int number){
        if (number==1){
            return false;
        }
        for (int i = 2; i <=number/2 ; i++) {
            if (number%i==0){
                return false;
            }
        }
        return true;
    }

    //unmodifiable Lists Using Collections
    public static List<String> unmodifiableList(){
        //there are twice way for creating unmodifiableLists
        List<String> list= List.of();

        Collections.unmodifiableList(new ArrayList<>());
        Collections.unmodifiableCollection(new ArrayList<>());

        Collections.unmodifiableMap( new HashMap<>());
        Collections.unmodifiableSet(new HashSet<>());

        return null;
    }

    //override following methods to add non-doublecate Objects to the SET


}
