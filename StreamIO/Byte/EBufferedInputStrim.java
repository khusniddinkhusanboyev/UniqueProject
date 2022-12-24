package StreamIO.Byte;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class EBufferedInputStrim {
    public static void main(String[] args) {
        try(var fis=new BufferedInputStream(new FileInputStream("bufferedInputStream.txt"))) {

            Integer remBytes=fis.available();
            System.out.println("Files: "+remBytes);

        }catch (IOException ex){
            System.out.println(ex);
        }
    }

}
