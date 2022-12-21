import java.io.*;

public class Snowing {
    public static void main(String[] args) {
       write();
       read();
    }
    public static void write(){
        try( FileWriter newFile=new FileWriter("Snowing.txt")) {
            for (int i = 0; i <100 ; i++) {
                if (i%2!=0){
                    newFile.write(i);
                }
                 }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void read(){
        try( FileReader newFile=new FileReader("Snowing.txt")) {
            int i;
            while ((i=newFile.read())!=-1){
                System.err.print(i+" : ");

                }
            } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
