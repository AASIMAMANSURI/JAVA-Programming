
//  Write a program which will read text and count all occurrence of a particular word and also
// reverse that word.
import java.util.Scanner;

class occurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the String ");
        String text = sc.nextLine().toLowerCase();
        
        System.out.println("enter the word to count the frequency and reverse the word ");
        String word = sc.nextLine().toLowerCase();

        String[] words = text.split("\s+");
        
        int count = 0;
        for (String wr : words) {
            if (wr.equals(word)) {

                count++;
            }
        }

        StringBuilder rev = new StringBuilder(word);
        rev.reverse();
        System.out.println("the total accornce of the words : " + count + "\n reversed word : " + rev);

    }
}


// output:
// enter the String 
// aasima yamin yamin yamin
// enter the word to count the frequency and reverse the word
// yamin
// the total accornce of the words : 3
//  reversed word : nimay
// PS D:\JAVA\collection> 