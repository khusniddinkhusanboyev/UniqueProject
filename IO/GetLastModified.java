package IO;

import java.io.File;
import java.util.Date;

public class GetLastModified {
    public static void main(String[] args) {
        System.out.println("Last modified: "+getLastModified());
    }
    public static Date getLastModified(){
        File file=new File("C:\\UniquePojectFolder\\UniqueProject\\src\\IO\\files\\1_file.txt");
        Date date=new Date(file.lastModified());
       return date;
    }
}
