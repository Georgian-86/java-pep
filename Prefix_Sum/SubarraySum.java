package Prefix_Sum;
import java.util.HashMap;
public class SubarraySum {
    public static void main(String[] args) {

        // Count subarrays whose sum of the elements is divisible by a given number k
        int[] arr = {7, 4, 2, 6, 1, 10};
        int k = 2;
        int n = arr.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                if (sum % k == 0) {
                    count++;
                }
            }
        }
        System.out.println("Count of subarrays whose sum is divisible by " + k + " is: " + count);

        // Optimized approach using prefix sums and a hashmap

        HashMap<Integer, Integer> prefixSumCount = new HashMap<>();
        prefixSumCount.put(0, 1); 
        int prefixSum = 0;
        count = 0;
        for (int i = 0; i < n; i++) {
            prefixSum += arr[i];
            int mod = ((prefixSum % k) + k) % k; 
            if (prefixSumCount.containsKey(mod)) {
                count += prefixSumCount.get(mod);
                prefixSumCount.put(mod, prefixSumCount.get(mod) + 1);
            } else {
                prefixSumCount.put(mod, 1);
            }
        }
        System.out.println("Optimized count of subarrays whose sum is divisible by " + k + " is: " + count);

    }
}

// There are 8 batteries but only 4 of them works you have to uset them for a flashlight which needs 2 working batteries to work. To gurantee that the flashlight works how many batteries you need to take at least
