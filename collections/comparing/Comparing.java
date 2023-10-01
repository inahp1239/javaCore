package collections.comparing;


// The compareTo method compares the two strings character by character.
// It compares the ASCII (or Unicode) values of the corresponding characters in the two strings.
// The difference between 'H' (ASCII 72) and 'h' (ASCII 104) is -32. This is why s1.compareTo(s2) returns -32.

// In general, the compareTo method returns:

// A negative integer if the calling string (s1 in this case) comes before the argument string (s2) in lexicographic order.
// Zero if the two strings are equal.
// A positive integer if the calling string comes after the argument string in lexicographic order.
// Since 'H' comes before 'h' in lexicographic order, the result is a negative integer.


// a = b  :-  0;
// a > b  :-  1;
// a < b  :- -1;


// compareTo() method is worked on only objects not on primitive types ;

public class Comparing {
    public static void main(String[] args){


        Integer a = 15;
        Integer b = 10;

        System.out.println(a.compareTo(b));  // o/p :- 1

        String s1 = "Hello";
        String s2 = "hello";

        System.out.println(s1.compareTo(s2));  // o/p :- -32 
        // because difference between 'H' (ASCII 72) and 'h' (ASCII 104) is -32. This is why s1.compareTo(s2) returns -32.

    }
}
