package IO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class InputOutput {
    public static void main(String[] args) {
        writeSimple();
        readSimple();

        writeSimpleTryWithResource();
        readSimpleTryWithResource();



    }

    public static void writeSimple() {
        FileWriter fw = null;
        try {
            fw = new FileWriter("myFile.txt");
            fw.write("My first File Input stream.");
        } catch (IOException e) {
            System.err.println("Something is wrong");
        } finally {
            try {
                fw.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }

    public static void writeSimpleTryWithResource() {

        try (FileWriter fw = new FileWriter("mySecondFile.txt");) {

            fw.write("My Second File Input stream.");
        } catch (IOException e) {
            System.err.println("Something is wrong");
        }

    }

    public static void readSimple() {
        FileReader fr = null;
        try {
            fr = new FileReader("myFile.txt");
            int i;
            while ((i = fr.read()) != -1) {
                System.out.print((char) i);
            }

        } catch (IOException e) {
            System.err.println("Something is wrong");
        } finally {
            try {
                fr.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        System.err.println("++++++++++++++++++++");

    }
    public static void readSimpleTryWithResource(){
        try (FileReader fr = new FileReader("mySecondFile.txt")) {
            int i;
            while ((i = fr.read()) != -1) {
                System.out.print((char) i);
            }

        } catch (IOException e) {
            System.err.println("Something is wrong");
        }

    }
}
