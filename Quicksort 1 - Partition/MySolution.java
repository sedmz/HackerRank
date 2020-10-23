import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    static void quickSort(int left, int right) {
        if (left >= right)
            return;

        int pivot = left, index = pivot + 1;
        for(int i = left + 1; i <= right; i++) {
            if (arr[i] < arr[pivot]) {
                int tmp = arr[i];
                arr[i] = arr[index];
                arr[index++] = tmp;
            }
        }

        index--;
        int tmp = arr[pivot];
        arr[pivot] = arr[index];
        arr[index] = tmp;

        quickSort(left, index - 1);
        quickSort(index + 1, right);
    }

    private static final Scanner scanner = new Scanner(System.in);
    public static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        quickSort(0, arr.length - 1);

        for (int i = 0; i < arr.length; i++) {
            bufferedWriter.write(String.valueOf(arr[i]));

            if (i != arr.length - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
