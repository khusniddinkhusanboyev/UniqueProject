package IO.mthods;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class MethodUsing {

    public static void main(String[] args) throws IOException {
        try(var fileInputStream=new FileInputStream("C:\\UniquePojectFolder\\UniqueProject\\src\\IO\\files\\FileInputStream.txt")){
            System.out.println("Char- " + (char)fileInputStream.read());
            System.err.println("Char- " + (char)fileInputStream.read());

            fileInputStream.mark(0);

            fileInputStream.skip(1);

            System.out.println("skip() method comes to play");
            System.out.println("mark() method comes to play");
            System.err.println("char- "+(char)fileInputStream.read());
            System.err.println("char- "+(char)fileInputStream.read());

            boolean bool=fileInputStream.markSupported();
            if (fileInputStream.markSupported()){

                fileInputStream.reset();
                System.err.println("reset() invoked");
                System.err.println("char- "+(char)fileInputStream.read());
                System.err.println("char- "+(char)fileInputStream.read());

            }else System.out.println("reset() method is not supported");

            System.out.println("input.markSupported() supported"+
                    " reset() - "+bool);

        }
    }
}
