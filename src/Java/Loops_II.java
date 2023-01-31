package Java;

import java.util.*;
import java.io.*;
import java.lang.*;

public class Loops_II {


    class Solution{
        public static void main(String []argh){
            Scanner in = new Scanner(System.in);
            int t=in.nextInt();

            for(int i=0;i<t;i++){

                int a = in.nextInt();
                int b = in.nextInt();
                int n = in.nextInt();
                // System.out.println("a: "+ a +" b: " + b + " n: "+ n);
                for(int j=1; j<=n; j++){
                    int counter = a;
                    counter += (Math.pow(2, j) * b) - b;
                    System.out.print(counter + " ");
                }
                System.out.println();
            }

            in.close();
        }
    }

}
