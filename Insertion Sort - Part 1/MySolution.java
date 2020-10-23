import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    static void show(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if(i < arr.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
    static void insertionSort1(int n, int[] arr) {
        for(int i = n - 1; i >= 0; i--) {
            int num = arr[i];
            int k = i;
            for(int j = i - 1; j >= 0; j--) {
                if (num < arr[j]) {
                    arr[k--] = arr[j];
                    show(arr);
                }
            }
            if(k != i) {
                arr[k] = num;
                show(arr);
            }
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        insertionSort1(n, arr);

        scanner.close();
    }
}
