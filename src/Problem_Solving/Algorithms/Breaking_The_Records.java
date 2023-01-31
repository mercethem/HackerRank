package Problem_Solving.Algorithms;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Breaking_The_Records {


    class Result {

        /*
         * Complete the 'breakingRecords' function below.
         *
         * The function is expected to return an INTEGER_ARRAY.
         * The function accepts INTEGER_ARRAY scores as parameter.
         */

        public static List<Integer> breakingRecords(List<Integer> scores) {
            // Write your code here

            int highestScoreRecord=scores.get(0);
            int lowestScoreRecord=scores.get(0);
            int highestScoreRecordCounter=0;
            int lowestScoreRecordCounter=0;

            List<Integer> list = new ArrayList<Integer>();

            for (int i = 1; i < scores.size(); i++) {
                if(scores.get(i)>highestScoreRecord){
                    highestScoreRecord = scores.get(i);
                    highestScoreRecordCounter++;
                }

            }
            list.add(highestScoreRecordCounter);

            for (int i = 1; i < scores.size(); i++) {
                if(scores.get(i)<lowestScoreRecord){
                    lowestScoreRecord = scores.get(i);
                    lowestScoreRecordCounter++;
                }

            }
            list.add(lowestScoreRecordCounter);

            return list;
        }

    }

    public class Solution {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            int n = Integer.parseInt(bufferedReader.readLine().trim());

            String[] scoresTemp = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

            List<Integer> scores = new ArrayList<>();

            for (int i = 0; i < n; i++) {
                int scoresItem = Integer.parseInt(scoresTemp[i]);
                scores.add(scoresItem);
            }

            List<Integer> result = Result.breakingRecords(scores);

            for (int i = 0; i < result.size(); i++) {
                bufferedWriter.write(String.valueOf(result.get(i)));

                if (i != result.size() - 1) {
                    bufferedWriter.write(" ");
                }
            }

            bufferedWriter.newLine();

            bufferedReader.close();
            bufferedWriter.close();
        }
    }

}
