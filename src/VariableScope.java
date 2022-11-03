public class VariableScope {
    //-write a method called rollDice()
    //the parameter is the number of dice to roll
    //the method returns an array filled with each
    //individual roll result
    public static int [] rollDice(int n){
        int [] rolls = new int[n];

        for(int i = 0; i < n; i++)
            rolls[i] = (int)(Math.random() * 6 + 1);

        return rolls;
    }

    //-write another method called printDice()
    //where the parameter is an int array
    //in which each value is a die roll.
    //The method doesn't return, but prints in format:
    //Die 1: 4
    //Die 2: 6
    //Die 3: 1
    public static void printDice(int [] rolls) {
        for (int i = 0; i < rolls.length; i++)
            System.out.println("Die " + (i+1) + ": " + rolls[i]);
    }

    public static void main(String [] args) {

        //save the returned value from the method call
        int [] rolls = rollDice(5);
        for (int r: rolls)
            System.out.print(r + " ");
        System.out.println();

        printDice(rolls);

        System.out.println();

        //you can directly pass rollDice to printDice
        printDice( rollDice(5) );

        System.out.println();
        //you can pass any int array to printDice;
        int [] rolls2 = {4, 6, 1};
        printDice(rolls2);

        //this variable n is separate from the parameter n for rollDice
        int n = 10;

        System.out.println();

        int a = 7;
        double b = 6.4;
        boolean c = true;
        String d = "dinosaur";

        doSomething(a, b, c, d);

        //when you pass primitive data types (int, double, boolean)
        //OR Strings (not primitive but they act like primitives),
        //a copy of the data is passed and the original values
        //stay the same
        //-if the method changes the values, those changes won't be
        //seen in the original data
        System.out.println("in main():");
        System.out.println("a is " + a);
        System.out.println("b is " + b);
        System.out.println("c is " + c);
        System.out.println("d is " + d);

        //arrays and other objects (as opposed to primitive types) CAN
        //be changed by methods, and those changes will be seen throughout
        //the program
        int [] numbers = {1, 2, 3};

        System.out.println("numbers[0] before calling " +
                "doSomethingElse: " + numbers[0]);
        doSomethingElse(numbers);
        System.out.println("numbers[0] after calling " +
                "doSomethingElse: " + numbers[0]);

        //a is 7
        changeNum(a);
        System.out.println(a);

        //save over the original value with the returned value
        a = changeNum(a);
        System.out.println(a);

        int [] numbers2 = {4, 1, 2, 5, 0, 8, 4, 7};
        insertionSort(numbers2);

    }

    //insertion sort
    //similar to physically sorting a hand of cards
    //-moving from left to right, pick up a card (current) and
    //assume the cards that are behind current are already sorted
    //-see how many cards are greater than current and move each of
    //those up by one position, then insert current into the opening
    public static void insertionSort(int [] nums) {
        for (int i = 1; i < nums.length; i++) {
            //save nums[i] to current to use as a temp variable
            //so other numbers can be moved into position i
            int current = nums[i];

            //j represents the position whose value potentially
            //moves up
            int j = i-1;

            //keep looking behind the current position as long as
            //there's a valid index and the value is bigger than current
            while(j >= 0 && nums[j] > current) {
                //move the value at j to position j+1
                nums[j+1] = nums[j];

                j--;
            }

            //after the loop, all the numbers that need to be moved have
            //been moved and the position j+1 is where current goes
            nums[j+1] = current;

            //print the progress of the sort
            for (int n: nums)
                System.out.print(n + " ");
            System.out.println();


        }

    }

    public static int changeNum(int a) {
        a = a * 2;
        return a;
    }

    public static void doSomething(int a, double b, boolean e, String f){
        a = 0;
        b = -1.5;
        e = false;
        f = "duck";

        //c was declared in main so it isn't accessible in other methods
        //c = false

        System.out.println("in doSomething():");
        System.out.println("a is " + a);
        System.out.println("b is " + b);
        System.out.println("e is " + e);
        System.out.println("f is " + f);
    }

    public static void doSomethingElse(int [] n) {
        n[0] = 0;
    }
}
