package Serializetion;

import java.io.Serializable;

public class Employee implements Serializable {
    private String name;
    private String postCard;

    public Employee(String name, String postCard) {
        this.name = name;
        this.postCard = postCard;
    }
}
