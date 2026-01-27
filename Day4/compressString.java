package Day4;

import java.util.Scanner;

public class compressString {
    public static void main(String[] args) {
        // WAP to compress a string
        // Input: "aaabbcddd"
        // Output: "a3b2c1d3"

        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        StringBuilder sb = new StringBuilder("");
        int count=0;
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                count++;
            }else{
                sb.append(s.charAt(i-1)+(""+count));
            }
        }

        scanner.close();
        
    }
}
