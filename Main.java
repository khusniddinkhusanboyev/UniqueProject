public class Main {
    public static void main(String[] args) {
        //System.out.println(factorial(5));
        System.out.println(tailRecursionFactorial(5));

    }
    public static int factorial(int n){
        if (n!=0){
            System.out.println(n);
            return n*factorial(n-1);
        }else {
            return 1;
        }
        }
    public static int tailRecursionFactorial(int n){

        return tailRecursion(n,1);
    }

    public static int tailRecursion(int n,int accumulator){
        if (n!=0){
            System.out.println(n);
            return tailRecursion(n-1,n*accumulator);

        }else {
            return accumulator;
        }

    }
}
