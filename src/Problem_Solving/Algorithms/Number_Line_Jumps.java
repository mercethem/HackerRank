package Problem_Solving.Algorithms;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Number_Line_Jumps {


    class Result {

        /*
         * Complete the 'kangaroo' function below.
         *
         * The function is expected to return a STRING.
         * The function accepts following parameters:
         *  1. INTEGER x1
         *  2. INTEGER v1
         *  3. INTEGER x2
         *  4. INTEGER v2
         */

        public static String kangaroo(int x1, int v1, int x2, int v2) {
            // Write your code here
            String kabak = new String();
            for (int i = 1; i <= 10000; i++) {

                long way1=0;
                long way2=0;
                way1=(x1+(v1*i));
                way2=(x2+(v2*i));
                if (way1==way2) {
                    kabak = "YES";
                    break;
                } else{
                    kabak = "NO";
                }
            }
            return kabak;
        }
    }
    public class Solution {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            int x1 = Integer.parseInt(firstMultipleInput[0]);

            int v1 = Integer.parseInt(firstMultipleInput[1]);

            int x2 = Integer.parseInt(firstMultipleInput[2]);

            int v2 = Integer.parseInt(firstMultipleInput[3]);

            String result = Result.kangaroo(x1, v1, x2, v2);

            bufferedWriter.write(result);
            bufferedWriter.newLine();

            bufferedReader.close();
            bufferedWriter.close();
        }
    }

}
