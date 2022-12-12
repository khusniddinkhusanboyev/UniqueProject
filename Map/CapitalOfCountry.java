package Map;

import java.util.HashMap;
import java.util.Map;

public class CapitalOfCountry {
    private String countryName;
    private String capitalName;
    private HashMap<String,String> capitals;

    public CapitalOfCountry(String countryName, String capitalName) {
        this.countryName = countryName;
        this.capitalName = capitalName;
        new HashMap<>().put(countryName,capitalName);
    }
    public Map<String, String> getCapitals() {
        return capitals;
    }
}
