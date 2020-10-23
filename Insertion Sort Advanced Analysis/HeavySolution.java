import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Main {
    static long insertionSort(int[] arr) {
        long sum = 0;

        for (int i = 1; i < arr.length; i++) {
            int num = arr[i], j = i - 1;
            while (j >= 0 && num < arr[j]) {
                arr[j + 1] = arr[j];
                sum++;
                j--;
            }
            arr[j + 1] = num;
        }
        return sum;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();

            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }

            System.out.println(insertionSort(arr));
        }

        scanner.close();
    }
}
