package StreamIO.Character;

import java.io.*;

public class EBufferedWriter {
    public static void main(String[] args) throws IOException {
        write();
    }
    public static String read() throws IOException {
        try(BufferedReader br=new BufferedReader(new FileReader("buffer.txt"))){
           return br.readLine();
        }
    }
    public static void write()throws IOException{
        try(BufferedWriter writer=new BufferedWriter(new FileWriter("Undablicate.txt"))){
            writer.write(read());
        }
    }
}
