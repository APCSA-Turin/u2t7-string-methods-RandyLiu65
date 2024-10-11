package U2T7;
import java.util.Scanner;

public class Main {
    public static void main(String args []) {

        String wrd1;
        String wrd2;
        String longWrd;
        String shortWrd;


        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first string: ");
        wrd1 = scan.nextLine();
        System.out.print("Enter second string: ");
        wrd2 = scan.nextLine();

        if (wrd1.length() > wrd2.length()) {
            System.out.println(wrd1 + " is longer");
            longWrd = wrd1;
            shortWrd = wrd2;
        } else {
            System.out.println(wrd2 + " is longer");
            longWrd = wrd2;
            shortWrd = wrd1;
        }


        System.out.println("First half: " + wrd1.substring(0,(wrd1.length()/2)));
        System.out.println("Second half: " + wrd1.substring((wrd1.length()/2), wrd1.length()));
        System.out.println("First half: " + wrd2.substring(0,(wrd2.length()/2)));
        System.out.println("Second half: " + wrd2.substring((wrd2.length()/2), wrd2.length()));

        if (longWrd.indexOf(shortWrd) != -1) {
            System.out.println(shortWrd + " is found in " + longWrd + " at index " + longWrd.indexOf(shortWrd));
        } else {
            System.out.println(shortWrd + " is NOT found in " + longWrd);
        }

        scan.close();

    }
}