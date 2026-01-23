
package Day_2;

import java.util.Scanner;

public class noOfWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String str = scanner.nextLine();
        String[] words = str.split(" ");
        int wordCount = words.length;
        System.out.println("Total number of words: " + wordCount);


        // WAP to count total no of words in a string input by user Without using split function
        System.out.println("Enter a string:");
        String input = scanner.nextLine();
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == ' ') {
                count++;
            }
        }
        System.out.println("Total number of words: " + (count + 1));



        scanner.close();
    }
}
