package U2T7_P2_MoreStringMethods;

import java.util.Scanner;
public class WordGame {
    public static void main(String [] args) {

        int score = 0;
        int attempts = 0;
        String oldWrd;
        String newWrd;
    

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter first word: ");
        oldWrd = scan.nextLine();
        attempts++;

        while (score < 50) {
            System.out.print("Enter next word: ");
            newWrd = scan.nextLine();
            attempts++;
            if (newWrd.compareTo(oldWrd) > 0) {
                score += 2;
                System.out.println("+2 points: current word alphabetically after; SCORE: " + score);
            }
            if (newWrd.compareTo(oldWrd) < 0) {
                score -= 5;
                System.out.println("-5 points: current word alphabetically before; SCORE: " + score);
            }
            if (newWrd.compareTo(oldWrd) == 0) {
                score -= 10;
                System.out.println("-10 points: current word is the exact same as the one before; SCORE: " + score);
            }
            if (newWrd.substring(0,2).equals(oldWrd.substring(oldWrd.length()-2))) {
                score += 5;
                System.out.println("+5 points: last 2 letters of previous match first 2 letters of current; SCORE: " + score);
            }
                String firstLetter = oldWrd.substring(0, 1);
                if (newWrd.indexOf(firstLetter) != -1) {
                score += 3;
                System.out.println("+3 points: first letter of previous word found in current word; SCORE: " + score);
            }
            if (newWrd.length() == oldWrd.length()) {
                score += 8;
                System.out.println("+8 points: word count of new word same as previous word; SCORE: " + score);
            }
                
            oldWrd = newWrd;
        }

            System.out.println("You win! It took you " + attempts + " words! Try again for a lower word count :)");


            scan.close();
        }
    }
