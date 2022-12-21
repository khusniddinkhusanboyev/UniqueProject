package IO;

import java.io.File;
import java.util.Arrays;

public class GetListOfFiles {
    public static void main(String[] args) {
        System.err.print("All files: ");
        System.out.println(getAllFile());
    }
    public static String getAllFile(){
        File file=new File("C:\\UniquePojectFolder\\UniqueProject\\src\\IO\\files\\");
        String[] files= file.list();
        /*String name="";
        for (String nameOfFile:files) {
            name=(files.length!=0)? nameOfFile:"-1";
        }*/
        return Arrays.toString(files)+"\n";

    }
}
