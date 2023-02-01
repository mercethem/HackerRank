package Problem_Solving.Algorithms;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Divisible_Sum_Pairs {


    class Result {

        /*
         * Complete the 'divisibleSumPairs' function below.
         *
         * The function is expected to return an INTEGER.
         * The function accepts following parameters:
         *  1. INTEGER n
         *  2. INTEGER k
         *  3. INTEGER_ARRAY ar
         */

        public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
            // Write your code here
            int temp;
            int counter=0;
            for (int i = 0; i < ar.size(); i++) {
                for (int j = i+1; j < ar.size(); j++) {
                    temp = ar.get(i)+ar.get(j);
                    if(temp%k==0){
                        counter++;
                    }
                }
            }
            return counter;
        }

    }

    public class Solution {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            int n = Integer.parseInt(firstMultipleInput[0]);

            int k = Integer.parseInt(firstMultipleInput[1]);

            String[] arTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> ar = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                int arItem = Integer.parseInt(arTemp[i]);
                ar.add(arItem);
            }

            int result = Result.divisibleSumPairs(n, k, ar);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();

            bufferedReader.close();
            bufferedWriter.close();
        }
    }

}
