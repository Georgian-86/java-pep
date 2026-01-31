package Prefix_Sum;

import java.util.Scanner;

// [3, 4, 6, 4, 6] you are given an array of that keeps track of your monthly expenses. 
// find total expense from month 2 to month 5 (both inclusive) using prefix sum technique

public class prefixArray {
    public static void main(String[] args) {
        int arr[] = {3, 4, 6, 4, 6};
        int l, r;
        Scanner sc = new Scanner(System.in);
        l = sc.nextInt();
        r = sc.nextInt();

        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            prefix[i] = prefix[i - 1] + arr[i];
        }

        int expense = prefix[r] - prefix[l - 1];
        sc.close();

        System.out.println("total expense: " + expense);
    }

}

