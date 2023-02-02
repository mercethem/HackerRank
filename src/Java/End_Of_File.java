package Java;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class End_Of_File {


    public class Solution {

        public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Scanner STDIN = new Scanner(System.in);
            int counter=0;

            while(STDIN.hasNextLine()){
                counter++;
                String str = STDIN.nextLine();
                System.out.println(counter+ " " + str);
            }
        }
    }

}
