package StreamIO.Byte;

import java.io.*;

public class EDataInputStreams {
    public static void main(String[] args) throws IOException {
        write();
    }
    public static byte[] read() throws IOException {
        try(DataInputStream dis=new DataInputStream(new FileInputStream("buffer.txt"))){
          return dis.readAllBytes();
        }
    }
    public static void write() throws IOException{
        try(DataOutputStream dout=new DataOutputStream(new FileOutputStream("Snowing.txt"))){
            dout.write(read());
            System.err.println("success");
        }
    }
}
