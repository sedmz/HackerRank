import java.util.*;

public class Solution {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();

        long sum = 0;
        for (int i = 0; i < N; i++) {
            sum += scanner.nextInt();
        }
        System.out.println(sum);
    }
}
