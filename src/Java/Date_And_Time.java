

package Java;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Date_And_Time {


    class Result {

        /*
         * Complete the 'findDay' function below.
         *
         * The function is expected to return a STRING.
         * The function accepts following parameters:
         *  1. INTEGER month
         *  2. INTEGER day
         *  3. INTEGER year
         */

        public static String findDay(int month, int day, int year) {
            Calendar cal = Calendar.getInstance();

            if(month==1){
                cal.set(year,0,day);
            }else{
                cal.set(year,month-1,day);
            }

            int dow = cal.get(Calendar.DAY_OF_WEEK);

            switch (dow) {
                case 1:
                    return "SUNDAY";
                case 2:
                    return "MONDAY";
                case 3:
                    return "TUESDAY";
                case 4:
                    return "WEDNESDAY";
                case 5:
                    return "THURSDAY";
                case 6:
                    return "FRIDAY";
                case 7:
                    return "SATURDAY";
            }
            return null;
        }

    }


}
