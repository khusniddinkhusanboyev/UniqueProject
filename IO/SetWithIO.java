package IO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class SetWithIO {
    public static void main(String[] args) {
        Set<String> file=new HashSet<>();
        file.add("Xusniddin");
        file.add("Alisher");
        file.add("Adham");
        file.add("Bekhzod");
        file.add("Mahmudjon");


        writeSetToFile(file);
       // writeSetToFile(file1);
        readFiles();
    }
    public static void writeSetToFile(Set<String> set){
        try( FileWriter fileWriter=new FileWriter("Undablicate.txt")) {
            int count=1;
            for (String word:set ) {
                fileWriter.write((count++)+" : "+word+" \n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
    public static void readFiles(){
        try( FileReader fileReader=new FileReader("Undablicate.txt")) {
            int i;
            while ((i=fileReader.read())!=-1) {
                System.out.print((char)i);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
