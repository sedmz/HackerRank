import java.util.*;

public class Solution {
    static final Scanner scanner = new Scanner(System.in);
    static int N;

    static void plusMinus(int[] arr) {
        Arrays.stream(arr).forEach(num -> System.out.println(num / (double) N));
    }

    public static void main(String[] args) {
        N = scanner.nextInt();
        int[] cnt = {0, 0, 0};

        for (int i = 0; i < N; i++) {
            int num = scanner.nextInt();

            if (num > 0) {
                cnt[0]++;
            } else if (num < 0) {
                cnt[1]++;
            } else {
                cnt[2]++;
            }
        }

        plusMinus(cnt);

        scanner.close();
    }
}
