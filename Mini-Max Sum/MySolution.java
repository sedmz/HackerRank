import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    static void miniMaxSum(long[] arr) {
        long sum = Arrays.stream(arr).sum();

        long max = 0, min = Long.MAX_VALUE;
        for(long n : arr) {
            max = Math.max(max, n);
            min = Math.min(min, n);
        }
        
        System.out.print(sum - max + " ");
        System.out.println(sum - min);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        long[] arr = new long[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
