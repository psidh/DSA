public class Recursion {

    public static void main(String[] args) {
        int number = 1234;

        int result = factorial(number);
        int result2 = adding1ton(number);
        int result3 = sumOfDgits(number);
        int result4 = productsOfDgits(number);

//        System.out.println("Factorial of " + number + " is: " + result);
//        System.out.println("Addition of " + number + " is: " + result2);
//        System.out.println("Sum of  digits of " + number + " is: " + result3);
//        System.out.println("Product of  digits of " + number + " is: " + result4);

    }


    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
    static int adding1ton(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + adding1ton(n - 1);
        }
    }

    static int sumOfDgits(int n){

        if(n < 10){
            return n;
        } else {
            return n%10 + sumOfDgits(n/10);

        }
    }

    static int productsOfDgits(int n){

        if(n < 10){
            return n;
        } else {
            return n%10 * productsOfDgits(n/10);
        }
    }


}


// n-- and --n are different
// first n--, first n is passed and then n-1
// first --n, first n-1 and then n-1 is passed
