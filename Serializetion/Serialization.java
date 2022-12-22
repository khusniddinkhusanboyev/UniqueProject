package Serializetion;

import java.awt.*;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class Serialization {
    public static void main(String[] args) throws IOException {
        deleteFile("empSerial.ser");
        deleteFile("empSerial.serialization");
    }
    public static void deleteFile(String fileName){
        File file=new File("C:\\UniquePojectFolder\\UniqueProject\\src\\Serializetion\\");
        String[] files= file.list();
        System.out.println(Arrays.toString(files));
        for (String anotherFile:files ) {
            File file1=new File("C:\\UniquePojectFolder\\UniqueProject\\src\\Serializetion\\"+anotherFile);
            if (anotherFile.equalsIgnoreCase(fileName)){
                file1.delete();
            }
        }

    }

    public static File createNewFile(String fileName){
        File file=new File("C:\\UniquePojectFolder\\UniqueProject\\src\\Serializetion\\"+fileName);
        return file;
    }
    public static void createAndWriteObject() throws IOException {
        Employee c= new Employee("Xusniddin","E123");
        FileOutputStream fs=new FileOutputStream(createNewFile("empSerial.txt"));
        ObjectOutputStream os=new ObjectOutputStream(fs);
        os.writeObject(c);
        os.close();
        System.err.println("Success");
    }
}
