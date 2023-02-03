package Problem_Solving.Algorithms;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class A_Very_Big_Sum {

    class Result {

        /*
         * Complete the 'aVeryBigSum' function below.
         *
         * The function is expected to return a LONG_INTEGER.
         * The function accepts LONG_INTEGER_ARRAY ar as parameter.
         */

        public static long aVeryBigSum(List<Long> ar) {
            long sum = 0;
            for (int i = 0; i < ar.size(); i++) {
                sum += ar.get(i);
            }
            return sum;
        }
    }

    public class Solution {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            int arCount = Integer.parseInt(bufferedReader.readLine().trim());

            String[] arTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Long> ar = new ArrayList<>();

            for (int i = 0; i < arCount; i++) {
                long arItem = Long.parseLong(arTemp[i]);
                ar.add(arItem);
            }

            long result = Result.aVeryBigSum(ar);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();

            bufferedReader.close();
            bufferedWriter.close();
        }
    }
}
