package Problem_Solving.Algorithms;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Diagonal_Difference {


    class Result {

        /*
         * Complete the 'diagonalDifference' function below.
         *
         * The function is expected to return an INTEGER.
         * The function accepts 2D_INTEGER_ARRAY arr as parameter.
         */

        public static int diagonalDifference(List<List<Integer>> arr) {
            int counter1 = 0;
            int counter2 = 0;
            for (int i = 0; i < arr.size(); i++) {
                for (int j = i; j <= i; j++) {
                    if(i==j)
                        counter1 += arr.get(i).get(j);

                }}
            for (int k = 0; k < arr.size() ; k++) {
                for (int l = 0; l < arr.size(); l++) {
                    if(arr.size()-k==l+1)
                        counter2 += arr.get(k).get(l);


                }}
            int result=Math.abs(counter2-counter1);
            return Math.abs(result) ;


        }

    }







    public class Solution {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            int n = Integer.parseInt(bufferedReader.readLine().trim());

            List<List<Integer>> arr = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                String[] arrRowTempItems = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                List<Integer> arrRowItems = new ArrayList<>();

                for (int j = 0; j < n; j++) {
                    int arrItem = Integer.parseInt(arrRowTempItems[j]);
                    arrRowItems.add(arrItem);
                }

                arr.add(arrRowItems);
            }

            int result = Result.diagonalDifference(arr);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();

            bufferedReader.close();
            bufferedWriter.close();
        }
    }

}
