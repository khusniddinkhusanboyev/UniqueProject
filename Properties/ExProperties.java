package Properties;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ExProperties {
    public static void main(String[] args) throws IOException {
        System.out.println("File: ");
        getProperties();
    }
    public static void getProperties() throws IOException {
        Properties prop=new Properties();
        prop.load(new FileInputStream("C:\\UniquePojectFolder\\UniqueProject\\src\\IO\\myConfig.properties"));

        prop.list(System.out);
       System.out.println(prop.getProperty("FileName"));
    }
}
