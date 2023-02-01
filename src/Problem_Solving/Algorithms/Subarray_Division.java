package Problem_Solving.Algorithms;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Subarray_Division {


    class Result {

        /*
         * Complete the 'birthday' function below.
         *
         * The function is expected to return an INTEGER.
         * The function accepts following parameters:
         *  1. INTEGER_ARRAY s
         *  2. INTEGER d
         *  3. INTEGER m
         */

        public static int birthday(List<Integer> s, int d, int m) {
            // Write your code here d'den m kadar olacak
            int counter=0;
            int add=0;
            for(int i=1; i<s.size()-(m-2);i++){
                add=0;
                for (int j = i-1; j <m+i-1 ; j++) {
                    add += s.get(j);
                }

                if(add==d){
                    counter++;
                }
            }
            return counter;
        }

    }

    public class Solution {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            int n = Integer.parseInt(bufferedReader.readLine().trim());

            String[] sTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> s = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                int sItem = Integer.parseInt(sTemp[i]);
                s.add(sItem);
            }

            String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            int d = Integer.parseInt(firstMultipleInput[0]);

            int m = Integer.parseInt(firstMultipleInput[1]);

            int result = Result.birthday(s, d, m);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();

            bufferedReader.close();
            bufferedWriter.close();
        }
    }

}
