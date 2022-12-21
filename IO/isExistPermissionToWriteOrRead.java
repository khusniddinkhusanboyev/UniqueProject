package IO;

import java.io.File;

public class isExistPermissionToWriteOrRead {
    public static void main(String[] args){
        System.out.println("For Files:\n "+isExistPermission("1_file.txt"));
    }

    public static String isExistPermission(String name) {
        File file = new File("C:\\UniquePojectFolder\\UniqueProject\\src\\IO\\files\\");
        String[] files = file.list();
        String write = "", read = "";
        for (String fileName : files) {
            if (name.equalsIgnoreCase(fileName)) {
                File file1 = new File("C:\\UniquePojectFolder\\UniqueProject\\src\\IO\\files\\" + name);
                if (file1.canWrite() && file1.canRead()) {
                    write="file1 can Write";
                    read="file1 can Read";
                }else {
                    write="file1 can't Write";
                    read="file1 can't Read";

                }
            }
        }
        return  read+"\n"+write;
    }
}



