
package searching;
public class StringReview {
    public static void main(String[] args) {
        String x = "The quick brown fox";
        //          0123456789012345678
        // indexOF -> returns an int,start location of something
        int loc = x.indexOf("q");
        System.out.println("q is at location " + loc);
        loc = x.indexOf("o",13); // start looking from the position of 13
        System.out.println("starting at 13 the next o is at " + loc);
        loc = x.indexOf("q", 5); // will return -1 = location not found
        System.out.println("Starting at 5, the next q is at "+ loc);
        
        //charAt - reyturn a char 
        char c = x.charAt(13);
        System.out.println("The letter a position 13 is " + c);
        
        //length - returns an int
        int len = x.length();
        System.out.println(x + " is " + len + " letters long");
        
        //substring - returns an String, requires 1 or more ints
        String y = x.substring(10, 13); //13 not included = bro
        System.out.println("Hey " + y);
        y = x.substring(16); //16 to the end
        System.out.println("Crazy like a " + y);//fox
        
        //toLower and UpperCase
        //original string does not change
        System.out.println(x.toUpperCase());
        x = x.toLowerCase(); //re-assigning x to all lowercase
        //compareTO
        y = "jumped over the lazy dog.";
        int z = 0;
        z = x.compareTo(y);
        System.out.println("x vs y = " + z);
        
        //CompareTo does letter-math
        //calculates the alphabetical distance between the 1st letter of each string
        //"t" vs "j" - 10 letters apart in alphabet
        //positive means first things is further down the list
        System.out.print("Andy vs Bob\t");
        System.out.println("Andy".compareTo("Bob")); //-1
        
        System.out.print("Bob vs Bob\t");
        System.out.println("Bob".compareTo("Bob")); //0
        
        System.out.print("Dave vs Bob\t");
        System.out.println("Dave".compareTo("Bob"));//2
        
        System.out.print("Bib vs Bob\t");
        System.out.println("Bib".compareTo("Bob")); //-6
        
        //compareTo = 0 = exact match
    }
    
}
