import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    static boolean[][] dp;

    static boolean isLowerCase(char ch) {
        return ch >= 'a' && ch <= 'z';
    }

    static boolean isInRange(int i, int j) {
        return i < dp.length && j < dp[0].length;
    }

    static String abbreviation(String a, String b) {
        dp = new boolean[b.length() + 1][a.length() + 1];

        dp[0][0] = true;
        for(int j = 0; j < dp[0].length - 1; j++) {
            for(int i = dp.length - 1; i >= 0; i--) {
                if(dp[i][j] == false) {
                    continue;
                }

                if(isInRange(i + 1, j + 1) && dp[i + 1][j + 1] == false) {
                    if(Character.toUpperCase(a.charAt(j)) == b.charAt(i)) {
                        dp[i + 1][j + 1] = true;
                    }
                    if(isLowerCase(a.charAt(j))) {
                        dp[i][j + 1] = true;
                    }
                } else if(isInRange(i, j + 1)) {
                    if(isLowerCase(a.charAt(j))) {
                        dp[i][j + 1] = true;
                    }
                }
            }
        }

        if(dp[b.length()][a.length()] == true) {
            return "YES";
        }
        return "NO";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String a = scanner.nextLine();

            String b = scanner.nextLine();

            String result = abbreviation(a, b);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
