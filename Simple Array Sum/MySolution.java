import java.io.*;

public class Solution {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int[] arr = new int[scanner.nextInt()];

        for(int i=0; i<arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        
        System.out.println(Arrays.stream(arr).sum());
    }
}
