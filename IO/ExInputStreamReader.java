package IO;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ExInputStreamReader{
    public static void main(String[] args) throws IOException {
        BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
        System.err.print("Malumot kriting : ");
        int i;
        System.out.println();
        System.out.print("Siz kiritgan malumot: ");
        while ((i=reader.read())!=-1){
            System.out.print((char) i);
        }

    }
}
