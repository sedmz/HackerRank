import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    static String space = "                                                                                                    ";
    static String sharp = "####################################################################################################";

    static void staircase(int n) {
        for(int i = 0; i < n; i++) {
            System.out.print(space.substring(0, n - i - 1));
            System.out.print(sharp.substring(0, i + 1));
            System.out.println();
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        scanner.close();
    }
}
