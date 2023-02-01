package Problem_Solving.Algorithms;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Sales_By_Match {


    class Result {

        /*
         * Complete the 'sockMerchant' function below.
         *
         * The function is expected to return an INTEGER.
         * The function accepts following parameters:
         *  1. INTEGER n
         *  2. INTEGER_ARRAY ar
         */

        public static int sockMerchant(int n, List<Integer> ar) {
            // Write your code here

            int counter=0;
            for (int i = 0; i < ar.size(); i++) {
                for (int j = i+1; j < ar.size(); j++) {
                    if(ar.get(i)==ar.get(j)){
                        counter++;
                        ar.remove(j);
                        break;
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

            int n = Integer.parseInt(bufferedReader.readLine().trim());

            String[] arTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> ar = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                int arItem = Integer.parseInt(arTemp[i]);
                ar.add(arItem);
            }

            int result = Result.sockMerchant(n, ar);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();

            bufferedReader.close();
            bufferedWriter.close();
        }
    }

}
