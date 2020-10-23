import java.util.*;

class Result {
    public static int diagonalDifference(List<List<Integer>> arr) {
        int N = arr.size();        
        int[] sum = {0, 0};

        for(int i = 0; i < N; i++) {
            sum[0] += arr.get(i).get(i);
            sum[1] += arr.get(i).get(N - i - 1);
        }
        return Math.abs(sum[0] - sum[1]);
    }
}

public class Solution {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();

        List<List<Integer>> arr = new ArrayList<>();
        for(int i = 0; i < N; i++) {
            List<Integer> list = new ArrayList<>();
            for(int j = 0; j < N; j++) {
                list.add(scanner.nextInt());
            }
            arr.add(list);
        }

        int result = Result.diagonalDifference(arr);
        System.out.println(result);
    }
}
