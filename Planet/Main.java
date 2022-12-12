package Planet;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Planet> planets =new HashSet<>();
        planets.add(new Planet("Earth", 365));
        planets.add(new Planet("Mars", 268));
        planets.add(new Planet("Jupiter", 654));
        planets.add(new Planet("Mars", 268));
        System.out.println(planets.size()) ;
    }
}