package IO;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Serial;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class HashSetWithIO {
    public static void main(String[] args) {
        String paragraph = "One of the original design goals for Java was to keep the language as simple as possible.\n" +
                "James Gosling, the language’s creator, took some unnecessarily complicated features of\n" +
                "C++ and tossed them out the window. The result was a language that was elegant and\n" +
                "sleek. Some people said the language was too sleek. So, after several years of discussion\n" +
                "and squabbling, Java became a bit more complicated. By the year 2004, Java had enum\n" +
                "types, enhanced for loops, static import, and other interesting new features. But the\n" +
                "most talked-about new feature was the introduction of generics:";
        String Paragrph11 = "In those days, an ArrayList could store almost anything you wanted to put in it: a\n" +
                "number, an Account, a Room, a String — anything. The ArrayList class was versatile,\n" +
                "but with this versatility came some headaches. If you could put anything into an\n" +
                "ArrayList, you couldn’t easily predict what you would get out of an ArrayList. In particular, you couldn’t easily write code that assumed you had stored certain types of values in the ArrayList. Here’s an example:";
        String[] words=paragraph.split(" ");
        String[] words1=Paragrph11.split(" ");
        System.err.println(writeToSetAndFile(words));
        System.err.println(writeToSetAndFile(words1));
        var Sets=writeToSetAndFile(words);

        System.out.println(Sets.addAll(writeToSetAndFile(words1)));

        System.out.println(Sets);
    }
    public static Set<String> writeToSetAndFile(String[] words){
        HashSet<String> nonDoublicate;
        try( FileWriter fileWriter=new FileWriter("C:\\UniquePojectFolder\\UniqueProject\\src\\IO\\files\\HashSet.txt");) {
            nonDoublicate=new HashSet<>();
            for (String word:words) {
                nonDoublicate.add(word);
                fileWriter.write(word+"; ");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return nonDoublicate;
    }
}
