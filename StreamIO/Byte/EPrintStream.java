package StreamIO.Byte;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;

public class EPrintStream {
    public static void main(String[] args) throws IOException {
        write();
    }
    public static byte[] read() throws IOException {
        try(FileInputStream stream=new FileInputStream("bufferedInputStream.txt")) {
          return   stream.readAllBytes();
        }
    }
    public static void write() throws IOException {
        try(PrintStream ps=new PrintStream("buffer.txt")){
            ps.write(read());
            System.err.println("Success");
        }
    }
}
