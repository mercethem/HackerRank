package Problem_Solving.Algorithms;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;


public class Mini_Max_Sum {

    class Result {

        /*
         * Complete the 'miniMaxSum' function below.
         *
         * The function accepts INTEGER_ARRAY arr as parameter.
         */

        public static void miniMaxSum(List<Integer> arr) {
            // Write your code here
            Long max = 0l;
            Long min = Long.MAX_VALUE;

            Long sum = 0l;

            for(int i = 0; i < arr.size(); i++) {

                sum = 0l;

                for(int j = 0; j < arr.size(); j++) {

                    if(i == j) {
                        continue;
                    }

                    sum += Long.valueOf(arr.get(j));
                }

                if(sum > max) {
                    max = sum;
                }

                if(sum < min) {
                    min = sum;
                }

            }

            System.out.println(min + " " + max);

        }

    }

    public class Solution {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());

            Result.miniMaxSum(arr);

            bufferedReader.close();
        }
    }

}
