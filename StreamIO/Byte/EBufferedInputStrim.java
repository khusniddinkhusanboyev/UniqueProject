package StreamIO.Byte;

import java.io.*;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class EBufferedInputStrim {
    public static void main(String[] args) throws IOException {
        write();
    }
    public static byte[] read() throws IOException {
        try(var bis=new BufferedInputStream(new FileInputStream("C:\\UniquePojectFolder\\UniqueProject\\bufferedInputStream.txt"))) {
            return bis.readAllBytes();
        }
    }
    public static void write() throws IOException{
        try(var bout=new BufferedOutputStream(new FileOutputStream("myFile.txt"))){
            int lengthOffile=read().length;
            bout.write(read());
            System.out.println(lengthOffile);
        }
    }

}
