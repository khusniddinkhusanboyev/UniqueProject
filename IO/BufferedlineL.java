package IO;

import java.io.*;

public class BufferedlineL {
    public static void main(String[] args) {
        try(var bwriter=new BufferedWriter(new  FileWriter("bufferWriter.txt"));
            var breader=new BufferedReader(new FileReader("buffer.txt"))) {
        while (breader.ready()){
            var line=breader.readLine().toLowerCase();
            if (line.startsWith("l")){
                System.out.println(line);
                bwriter.write(line);
            }
        }

        }catch (IOException ex){
            System.out.println(ex);
        }
    }
}
