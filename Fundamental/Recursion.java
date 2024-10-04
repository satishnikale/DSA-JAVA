public class Recursion {
    public static void decreasingOrder(int n){
        if(n == 0){
            return;
        }
        System.out.print(n + " ");
        decreasingOrder(n-1);
    }
    public static void increasingOrder(int n){
        if(n == 0){
            return;
        }
        increasingOrder(n-1);
        System.out.print(n + " ");
    }
    public static int factorial(int n){
        if(n == 0){
            return 1;
        }
        int fact = n * factorial(n-1);
        return fact;
    }
    public static int sumOfNumbers(int n){
        if(n == 0){
            return 0;
        }

        int totalSum = n + sumOfNumbers(n-1);
        return totalSum;
    }
    public static int nthFibonacci(int n){
        if (n == 1 || n == 0){
            return n;
        }
        int first = nthFibonacci(n-1);
        int second = nthFibonacci(n-2);

        return first + second;

    }
    public static void main(String[] args) {
        
        System.out.println(nthFibonacci(5));

    }
}