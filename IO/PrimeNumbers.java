package IO;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class PrimeNumbers {
    public static void main(String[] args) {
    writePimeNumber(100);
    readFile();
    }
    public static void writePimeNumber(int anyNumber){
        try(FileWriter fw=new FileWriter("primeNumbers.txt")) {
            for (int i = anyNumber; i>=1 ; i--) {
                if (isPrime(i)){
                    fw.write(i);
                }
            }
        }catch (IOException e){
            System.out.println("Something is wrong");
        }
    }

    public static void readFile(){
        try(FileReader fr=new FileReader("primeNumbers.txt")) {
            int i;
            while ((i= fr.read())!=-1){
                System.out.println(i);
            }
        }catch (IOException e){
            System.err.println("Something is wrong");
        }
    }
    public static boolean isPrime(int n){
        if (n==1){
            return false;
        }
        for (int i=2;i<=n/2;i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
}
