package IO;

import java.io.*;

public class BufferedIO {
    public static void main(String[] args) throws IOException {
        bufferedIO();
    }
    public static void bufferedIO() throws IOException {
        BufferedWriter bw1=new BufferedWriter(new FileWriter("C:\\UniquePojectFolder\\UniqueProject\\src\\IO\\files\\1_file.txt"));
        bw1.write("Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the leap into electronic typesetting, remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
       bw1.close();
        BufferedReader br=new BufferedReader(new FileReader("C:\\UniquePojectFolder\\UniqueProject\\src\\IO\\files\\1_file.txt"));
       int count=0;
        while (br.ready()){
            String[] line=br.readLine().split(" ");
            for (String word: line) {
               String[] latter=word.split("");
                for (int i = 0; i < latter.length; i++) {
                    if (latter[i].equalsIgnoreCase("a")){
                    count++;
                        System.out.print(word+" \n");
                    }

                }
            }

        }
        br.close();
        System.out.println("A later comes "+count+" times");

    }

}
