package IO;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class ExProperties {
    public static void main(String[] args) throws IOException {
        System.err.println("File Configuration: ");
        properties();
    }
    public static void properties() throws IOException {
        Properties properties=new Properties();

            properties.load(new FileInputStream("C:\\UniquePojectFolder\\UniqueProject\\src\\IO\\myConfig.properties"));
            properties.list(System.out);

            System.out.println(properties.getProperty("FileName"));
            System.out.println(properties.getProperty("Author_Name"));
            System.out.println(properties.getProperty("Website"));
            System.out.println(properties.getProperty("Topic"));

    }
}
