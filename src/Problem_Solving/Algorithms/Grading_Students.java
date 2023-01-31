package Problem_Solving.Algorithms;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Grading_Students {


    class Result {

        /*
         * Complete the 'gradingStudents' function below.
         *
         * The function is expected to return an INTEGER_ARRAY.
         * The function accepts INTEGER_ARRAY grades as parameter.
         */

        public static List<Integer> gradingStudents(List<Integer> grades) {
            // Write your code here
            List<Integer> result = new ArrayList<>();
            for(int i=0;i<grades.size();i++) {
                int graduateScore=grades.get(i);
                int rank = graduateScore % 5;
                if(((5 - rank)<3) && graduateScore>37){
                    result.add(graduateScore + (5 - rank));
                } else {
                    result.add(graduateScore);
                }
            }

            return result;


        }

    }

    public class Solution {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

            int gradesCount = Integer.parseInt(bufferedReader.readLine().trim());

            List<Integer> grades = new ArrayList<>();

            for (int i = 0; i < gradesCount; i++) {
                int gradesItem = Integer.parseInt(bufferedReader.readLine().trim());
                grades.add(gradesItem);
            }

            List<Integer> result = Result.gradingStudents(grades);

            for (int i = 0; i < result.size(); i++) {
                bufferedWriter.write(String.valueOf(result.get(i)));

                if (i != result.size() - 1) {
                    bufferedWriter.write("\n");
                }
            }

            bufferedWriter.newLine();

            bufferedReader.close();
            bufferedWriter.close();
        }
    }

}
