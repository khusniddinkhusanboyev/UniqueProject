package IO;

import java.io.*;
import java.sql.ClientInfoStatus;

public class ExBufferedStartedWithu {
    public static void main(String[] args) throws IOException {
        FileReader reader = new FileReader("buffer.txt");
        BufferedReader br = new BufferedReader(reader);
        while ((br.ready())) {
            var line = br.readLine().toLowerCase();
            if (line.startsWith("u")) {
                System.out.println(line);


            }
        }


    }
    }

