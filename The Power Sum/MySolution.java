import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    static int powerSum(int X, int N) {
        Stack<Integer> sums = new Stack<>();
        Stack<Integer> nums = new Stack<>();
        sums.add(0);
        nums.add(0);

        int cnt = 0;
        while(!sums.isEmpty()) {
            int sum = sums.pop();
            int num = nums.pop();

            if(sum == X) {
                cnt++;
                continue;
            } else if(sum > X) {
                continue;
            }

            while(true) {
                int n = (int) Math.pow(++num, N);
                if (sum + n > X)
                    break;
                    
                sums.add(sum + n);
                nums.add(num);
            }
        }
        return cnt;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int X = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int result = powerSum(X, N);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
