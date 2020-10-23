import java.util.*;

public class Solution {
    static Scanner scanner = new Scanner(System.in);

    static int[] compareTriplets(List<Integer> a, List<Integer> b) {
        int[] points = {0,0};
        for(int i = 0; i < a.size(); i++) {
            if(a.get(i) > b.get(i)) {
                points[0]++;
            } else if (a.get(i) < b.get(i)) {
                points[1]++;
            }
        }

        return points;
    }

    static List<Integer> input() {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < 3; i++) {
            list.add(scanner.nextInt());
        }
        return list;
    }

    public static void main(String[] args) {
        List<Integer> a = input();
        List<Integer> b = input();

        int[] result = compareTriplets(a, b);
        Arrays.stream(result).forEach(x -> System.out.print(x + " "));
    }
}
