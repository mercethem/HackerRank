package Problem_Solving.Algorithms;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Bill_Division {


    class Result {

        /*
         * Complete the 'bonAppetit' function below.
         *
         * The function accepts following parameters:
         *  1. INTEGER_ARRAY bill
         *  2. INTEGER k
         *  3. INTEGER b
         */

        public static void bonAppetit(List<Integer> bill, int k, int b) {
            // Write your code here
            int counterTotalSum=0;
            int counterAnnaSum=0;
            int annaFalsePart=0;
            int annaTruePart=0;
            int result;

            for (int i = 0; i < bill.size(); i++) {
                counterTotalSum += bill.get(i);
            }
            annaFalsePart = counterTotalSum/2;
            //result= annaFalsePart-b;

            for (int i = 0; i < bill.size(); i++) {
                if(i==k){
                    continue;
                }else{counterAnnaSum += bill.get(i);

                }

            }
            annaTruePart=counterAnnaSum/2;
            result = b-annaTruePart;
            if(b==annaTruePart){
                System.out.println("Bon Appetit");
            } else {
                System.out.println(result);
            }

        }

    }

    public class Solution {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            int n = Integer.parseInt(firstMultipleInput[0]);

            int k = Integer.parseInt(firstMultipleInput[1]);

            String[] billTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> bill = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                int billItem = Integer.parseInt(billTemp[i]);
                bill.add(billItem);
            }

            int b = Integer.parseInt(bufferedReader.readLine().trim());

            Result.bonAppetit(bill, k, b);

            bufferedReader.close();
        }
    }

}
