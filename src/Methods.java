public class Methods {
    public static void main(String [] args) {

        //write code that will calculate the sum
        //of numbers between 2 provided numbers
        //ex: 4 and 8 --> 4 + 5 + 6 + 7 + 8

        int small = 4;
        int big = 8;
        int sum = 0;
        for (int i = small; i <= big; i++) {
            sum += i;
        }
        System.out.println("sum from 4 to 8 is " + sum);

        //to do the same thing later, you would need to rewrite the code
        //with different values for small and big

        //methods (or functions) let us define reusable code

        //when you call a method that returns data, you should
        //either save the returned value or print it, otherwise
        //there's no visible effect
        sumBetween(4, 8);

        //5 and 10 are arguments - values passed to the method
        //the data type and the quantity of arguments need to match
        //the parameters defined in the method
        System.out.println("sum from 5 to 10 is " +sumBetween(5, 10));

        // sumBetween(5.5, 10) - 5.5 is a double, which isn't a valid int
        sumBetween((int)5.5, 10); //the first argument is cast as an int
        //sumBetween(4); - mismatch in quantity of arguments

        int sum10_20 = sumBetween(10, 20);
        System.out.println("sum from 10 to 20 is " + sum10_20);

        System.out.println("5! is " + factorial(5));

        //find the sum between numbers of 5! and 10!
        //method calls that return values can be passed to other
        //method calls
        //-method calls can be treated like variables
        int anotherSum = sumBetween(factorial(5), factorial(8));
        System.out.println("sum between 5! and 10! is " + anotherSum);

        print("wow john is very smart probably");
        //print(4); //not a string
        print(""+4);//concatenate other data types to an empty string

        duckDuckGoose();
        print("coin flip is heads: " + coinFlipIsHeads());

        //methods with a boolean return can be used directly
        //in if statements and while loops
        if (coinFlipIsHeads() == true)
            print("heads");
        else
            print("tails");
    }

    //-for now, all methods will start with public static
    //-int is the return type - the method needs to return a value
    //of this type
    //-void is a valid return type, which means the method doesn't
    //return anything
    //-sumBetween is the method name
    //small and big are parameters - parameters are like variable
    //that get used in the method
    public static int sumBetween(int small, int big) {

        //treat the parameters like they already have values
        int sum = 0;
        for (int i = small; i <= big; i++)
            sum += i;
        //whatever the returned value is has to match
        //the method's defined return type
        return sum;
    }

    //calculate and return the factorial of n
    //-factorial is n * (n-1) * (n-2) * ... * 1
    public static int factorial(int n) {
        int prod = 1;
        for (int i = 1; i <= n ; i++)
            prod *= i;
        return prod;
    }

    public static void print(String s) {
        //return -1; void methods don't return anything
        System.out.println(s);
    }

    //methods don't need to have parameters
    public static void duckDuckGoose() {
        //print some random number of "duck" and then print "goose"
        int rand = (int)(Math.random() * 10);
        for (int i = 0; i < rand; i++) {
            //you can call methods from other methods
            print("duck");
        }
        print("goose");

    }

    //return true if a coin flip results in heads
    //return false if it results in tails
    public static boolean coinFlipIsHeads() {
        double r = Math.random();
        //as soon as a method reaches a return statement, nothing
        //else in the method runs
        //-the first return statement that's reached is run
        //-a method can only return one value
        if (r < 0.5) {
            return true;
        }
        return false;
    }
}