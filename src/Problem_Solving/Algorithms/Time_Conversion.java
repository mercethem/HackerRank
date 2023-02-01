package Problem_Solving.Algorithms;

import java.io.*;

public class Time_Conversion {


    class Result {

        /*
         * Complete the 'timeConversion' function below.
         *
         * The function is expected to return a STRING.
         * The function accepts STRING s as parameter.
         */

        public static String timeConversion(String s) {
            // Write your code here
            // Write your code here
            String hours = s.substring(0, 2);
            String minutes = s.substring(3, 5);
            String seconds = s.substring(6, 8);
            String pmAm = s.substring(8, 10);

            StringBuilder out = new StringBuilder();

            if ("PM".equals(pmAm) && Integer.parseInt(hours) < 12) {
                out.append(Integer.toString(Integer.parseInt(hours) + 12) + ":");

            } else if ("AM".equals(pmAm) && Integer.parseInt(hours) >= 12) {
                String appendTwelve = "12".equals(hours) ? "0" + Integer.toString(Integer.parseInt(hours) - 12) + ":" : Integer.toString(Integer.parseInt(hours) - 12) + ":";
                out.append(appendTwelve);

            } else {
                out.append(hours + ":");
            }

            out.append(minutes + ":");
            out.append(seconds);

            return out.toString();

        }

    }

    public class Solution {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            String s = bufferedReader.readLine();

            String result = Result.timeConversion(s);

            bufferedWriter.write(result);
            bufferedWriter.newLine();

            bufferedReader.close();
            bufferedWriter.close();
        }
    }

}
