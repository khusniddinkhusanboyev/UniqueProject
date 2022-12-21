package Planet;

import java.util.Objects;

class Planet {
    private String name;
    private int orbitalPeriod;
    public Planet(String name, int orbitalPeriod) {
        this.name = name;
        this.orbitalPeriod = orbitalPeriod;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Planet planet = (Planet) o;
        return orbitalPeriod == planet.orbitalPeriod && Objects.equals(name, planet.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, orbitalPeriod);
    }

    @Override
    public String toString() {
        return "Planet{" +
                "name='" + name + '\'' +
                ", orbitalPeriod=" + orbitalPeriod +
                '}';
    }
}
