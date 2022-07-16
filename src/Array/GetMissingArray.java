package Array;

import java.util.Arrays;

public class GetMissingArray {

    public static void main(String[] args) {

        int[] array = {1,2,3,4,6}; // find missed 5
        int missingNum = getMissingNum (array, 6); //6-size of new Array
        System.out.println(Arrays.toString (array)+ missingNum);

    }

    private static int getMissingNum(int[] array, int n) {//method to find missed int

        int actualSum = 0;
        int expectedSum = (n* (n+1)/2);// ->21

        for (int i : array) {
            actualSum+=i;//will sum all elements in array ->16
        }
       return expectedSum - actualSum;//21-16 =5
    }

}
