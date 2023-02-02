package Java;

import java.io.*;
import java.util.*;

public class String_Reverse {

    public class Solution {

        public static void main(String[] args) {

            Scanner sc=new Scanner(System.in);
            String A=sc.next();
            /* Enter your code here. Print output to STDOUT. */
            StringBuffer sb=new StringBuffer(A);
            boolean ans= sb.reverse().toString().equals(A);
            if(ans==true){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
        }
    }




}
