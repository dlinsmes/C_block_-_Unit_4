public class Recursion {
    public static void main(String[] args) {
        System.out.println("2^3 is " + exponent(2, 3));
        System.out.println("2^0 is " + exponent(2, 0));

        System.out.println("2^3 is " + expRecursive(2, 3));

        countDownFrom(10);
        System.out.println();
        countUpTo(3);
        System.out.println();

        for (int i = 1; i <= 46; i++)
            System.out.println(fibonacciR(i));

        System.out.println();

//        for (int i = 1; i <= 46; i++)
//            System.out.println(fibonacciI(i));


    }

    public static int exponent(int base, int pow) {
        int total = 1;
        for (int i = 0; i < pow; i++) {
            total *= base;
        }
        return total;
    }

    //a recursive method is a method that contains a call to itself
    //-recursive methods are used when you can take a large problem
    //and solve it one piece at a time


    // 2^3 = 2 * 2 * 2
    //     = 2 * 2^2
    // 2^2 = 2 * 2^1
    // 2^1 = 2 * 2^0
    // 2^0 = 1
    public static int expRecursive(int base, int pow) {
        //in recursion, the base case is the smallest version of the problem
        //where the solution is easily defined
        //-the base case should NOT make a recursive method call, otherwise
        //the method will run indefinitely until a stack overflow error
        if (pow == 0)
            return 1;

            //recursive case - solve one small step of the problem, then call
            //the method again, but with a modified argument
            //-the argument should be modified in a way so that it eventually
            //reaches the base case
        else {
            return base * expRecursive(base, pow - 1);
        }
    }

    //if n is 5, print 5 4 3 2 1 0
    public static void countDownFrom(int n) {
        //base case - regardless of n's value, 0 is always printed
        if (n == 0)
            System.out.print("0 ");
        else {
            System.out.print(n + " ");
            countDownFrom(n - 1);
        }
    }

    public static void countUpTo(int n) {
        if (n == 0)
            System.out.print("0 ");
        else {
            countUpTo(n - 1);
            //the print statement can't run until the recursive call
            //has completed
            //-0 (the base case) is the first number printed
            System.out.print(n + " ");
        }
    }

    //fibonacci numbers
    // 1 1 2 3 5 8 13 21
    // after 1 and 1, every following digit is the sum of the previous 2 digits
    // f(1) = 1
    // f(2) = 1
    // f(3) = f(1) + f(2) = 2
    // f(n) = f(n-2) + f(n-1)

    //return the nth fibonacci number in the sequence
    public static int fibonacciR(int n) {
        if (n == 1 || n == 2)
            return 1;
        else
            return fibonacciR(n-2) + fibonacciR(n-1);
    }

    //write an iterative (looped) version of the same method
    //i.e. don't use recursion
    public static int fibonacciI(int n) {
        int prev2 = 0;
        int prev1 = 0;
        int current = 1;
        for (int i = 2; i <= n; i++) {
            prev2 = prev1;
            prev1 = current;
            current = prev2 + prev1;
        }
        return current;

    }

}