package Problem_Solving.Algorithms;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Plus_Minus {

    class Result {

        /*
         * Complete the 'plusMinus' function below.
         *
         * The function accepts INTEGER_ARRAY arr as parameter.
         */

        public static void plusMinus(List<Integer> arr) {
            double positiveCounter = 0;
            double negativeCounter = 0;
            double neutralCounter = 0;

            for (int i = 0; i < arr.size(); i++) {
                if ( arr.get(i)>0){
                    positiveCounter++;
                } else if (arr.get(i)==0){
                    neutralCounter++;
                } else {
                    negativeCounter++;
                }
            }
            System.out.println((double)(positiveCounter/arr.size()*1.0));
            System.out.println((double)(negativeCounter/arr.size()*1.0));
            System.out.println((double)(neutralCounter/arr.size()*1.0));


        }

    }

    public class Solution {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            int n = Integer.parseInt(bufferedReader.readLine().trim());

            String[] arrTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> arr = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                int arrItem = Integer.parseInt(arrTemp[i]);
                arr.add(arrItem);
            }

            Result.plusMinus(arr);

            bufferedReader.close();
        }
    }

}
