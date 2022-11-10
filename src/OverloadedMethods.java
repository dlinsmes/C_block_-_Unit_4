public class OverloadedMethods {

    public static void main(String [] args) {
        //string methods
        //length() - int - number of chars in the string
        //equals(String s) - boolean - checks if s is the same
        //as the calling (other) string
        //substring(int beginning) - String - gives part of
        //the string starting at the index indicated by beginning
        //substring(int beginning, int end) - String - part of
        //the string up until (but not including) end as an index

        //indexOf(String s) - int - returns index of the first
        //occurrence of the substring s in the original string,
        //returns -1 if s isn't in the string

        System.out.println("index of a in banana");
        System.out.println( "banana".indexOf("a") );

        //returns the beginning index of where the substring
        //is
        System.out.println("index of na in banana");
        System.out.println( "banana".indexOf("na") );

        //-1 when the substring isn't in the string
        System.out.println("index of c in banana");
        System.out.println( "banana".indexOf("c") );

        System.out.println();
        //compareTo(String s) - returns int
        //used for sequencing strings (alphabetizing)
        //a.compareTo(b)
        //returns negative when a is before b
        //-postive when a comes after b
        //-zero when a is the same as b

        //returns negative because apple comes before banana
        System.out.println("apple".compareTo("banana"));

        //returns positive because apple comes before banana
        System.out.println("banana".compareTo("apple"));

        //returns positive because apple is the same as apple
        System.out.println("apple".compareTo("apple"));

        System.out.println();
        //the actual number doesn't matter - just look at
        //the neg/pos sign
        System.out.println("banana".compareTo("bat"));

        //all uppercase letters come sequentially before
        //all lowercase letters (don't need to know)
        System.out.println("Z".compareTo("a"));
        System.out.println("z".compareTo("a"));

        System.out.println();

        //overloaded methods
        //methods that have the same name, but a different
        //set of parameters

        //substring() is an overloaded method
        //-one version has one int param
        //-another version has two int params
        System.out.println("max(8, 4)");
        System.out.println(max(8, 4));

        System.out.println("max(8, 4, 6)");
        System.out.println(max(8, 4, 6));

        System.out.println("max(8, 10, 4, 6)");
        System.out.println(max(8, 10, 4, 6));


        print(9);

    }

    //return the value of whichever param is bigger
    public static int max(int a, int b) {
        if (a > b)
            return a;
        else
            return b;
    }

    //this is overloaded because it has the same method name
    //but now 3 ints as params
    public static int max(int a, int b, int c) {
        if (a > b && a > c)
            return a;
        else if (b > a && b > c)
            return b;
        else
            return c;
    }

    //this doesn't work because the parameter quantity and
    //types match the original
    //-when you call a method, java only looks at the method name,
    //and values passed to match up to which method you're calling
    //method signature - the method name and the types and quantity
    //of parameters
    //overloaded methods must have different signatures
//    public static int max(int c, int d) {
//        return -1;
//    }

    //this works because the type of parameter changed
    public static int max(double c, int d) {
        return -1;
    }

    public static int max(int a, int b, int c, int d) {
        int maxOf3 = max(a, b, c); //calls the version with 3 params
        int maxOf4 = max(maxOf3, d);   //calls the version with 2 params

        return maxOf4;
    }

    //overload print to take different types for params
    public static void print(String s) {
        System.out.println(s);
    }
    public static void print(int s) {
        System.out.println(s);
    }
    public static void print(double s) {
        System.out.println(s);
    }
    public static void print(boolean s) {
        System.out.println(s);
    }
}
