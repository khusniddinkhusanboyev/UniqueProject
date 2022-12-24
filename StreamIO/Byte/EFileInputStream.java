package StreamIO.Byte;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class EFileInputStream {
    public static void main(String[] args) throws IOException {
        write();
    }
    public static byte[] read() throws IOException {
        try(FileInputStream fis=new FileInputStream("mySecondFile.txt")){
           return fis.readAllBytes();
        }
    }
    public static void write() throws IOException{
        try(FileOutputStream fout=new FileOutputStream("primeNumbers.txt")){
            fout.write(read());
        }
    }
}
