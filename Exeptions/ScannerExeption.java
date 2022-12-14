package Exeptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ScannerExeption {

    public static void main(String[] args) {
       while (true){
           System.out.print(throwExeptionByIf());
           System.out.println();
           System.out.println(throwByTryCatch());
       }

    }
    public static String throwExeptionByIf(){
    Scanner scanner=new Scanner(System.in);
        System.out.print("Input details: ");
    var info=scanner.next();
    boolean bool=true;
        for (int i = 0; i < info.length(); i++) {
            if (!Character.isDigit(info.charAt(i))){
                bool=false;
                break;
            }
        }
        if (bool){
            return "result: "+info;
        }
        return "0";
    }
   public static int throwByTryCatch(){
        Scanner scanner=new Scanner(System.in);
        try {
            return scanner.nextInt();
        }catch (InputMismatchException | NumberFormatException nfex){
            return 0;
        }
   }
}

