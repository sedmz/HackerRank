import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {
    static String timeConversion(String s) {
        String type = s.substring(s.length()-2, s.length());
        String time[] = s.substring(0, s.length()-2).split(":");
        int hour = Integer.parseInt(time[0]);
        int min = Integer.parseInt(time[1]);
        int sec = Integer.parseInt(time[2]);

        
        if(hour == 12) {
          if (type.equals("AM")) {
              hour = 0;
          }
        } else if(type.equals("PM")) {
            hour += 12;
        }
        

        return String.format("%02d:%02d:%02d", hour, min, sec);
    }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
