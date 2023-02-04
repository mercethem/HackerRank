package Java;

public class Substring_Comparisons {

    public static String getSmallestAndLargest(String s, int k) {
        String lexicographically = s.substring(0,k);
        String smallest = lexicographically;
        String largest = lexicographically;

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'
        for(int i =1; i<=s.length()-k; i++ ) {
            lexicographically = s.substring(i,i+k);
            if(lexicographically.compareTo(largest) >  0) {
                largest = lexicographically;
            }
            if(lexicographically.compareTo(smallest) <  0){
                smallest = lexicographically;
            }
        }
        return smallest + "\n" + largest;
    }


}
