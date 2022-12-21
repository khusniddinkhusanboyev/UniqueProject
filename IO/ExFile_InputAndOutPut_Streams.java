package IO;

import java.io.*;

public class ExFile_InputAndOutPut_Streams {
    public static void main(String[] args) throws IOException {
        //Byte Stream Reader
       var inputFile=new FileInputStream("C:\\UniquePojectFolder\\UniqueProject\\src\\IO\\files\\FileInputStream.txt");
       var readFile=new FileOutputStream(new File("C:\\UniquePojectFolder\\UniqueProject\\src\\IO\\files\\FileOutputStream.txt"));

            int i;
            while ((i=inputFile.read())!=-1){
                readFile.write(i);
            }

       FileWriter charBasedFileWriter=new FileWriter("C:\\UniquePojectFolder\\UniqueProject\\src\\IO\\files\\FileInputStream.txt");
            FileReader charBasedFileReader=new FileReader("C:\\UniquePojectFolder\\UniqueProject\\src\\IO\\files\\FileOutputStream.txt");
        int j;
        while ((j=charBasedFileReader.read())!=-1){
            charBasedFileWriter.write(j);

        }
    }
}
