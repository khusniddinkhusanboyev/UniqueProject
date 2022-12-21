package IO;

import java.io.File;

public class CheckFileExsistOrNot {
    public static void main(String[] args) {
        System.out.print("Is this exist: "+checkFileExistOrNot("1_file.txt"));
    }
    public static boolean checkFileExistOrNot(String name){
        File file=new File("C:\\UniquePojectFolder\\UniqueProject\\src\\IO\\files\\");
        String[] files= file.list();
        boolean flag=false;
        for (int i = 0; i < files.length; i++) {
            if (name.equals(files[i])){
                flag= true;
            }
        }
        return flag;
    }
}
