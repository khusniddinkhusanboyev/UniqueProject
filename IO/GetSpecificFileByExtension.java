package IO;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;

public class GetSpecificFileByExtension {
    public static void main(String[] args) {
        System.out.println("File: "+getFileWithExtension());
    }
    public static String getFileWithExtension(){
        File file=new File("C:\\UniquePojectFolder\\UniqueProject\\src\\IO\\files\\");
        String[] files= file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                if (name.toLowerCase().endsWith(".txt")){
                    return true;
                }else {
                    return false;
                }
            }
        });
        /*for (String fileName:files ) {
            return fileName;
        }*/
            return Arrays.toString(files);
    }
}
