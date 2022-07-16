package Array;

import java.util.Arrays;

public class NegativeFirst {

    public static void main(String[] args) {

        int[] numbers = {-1, -3, 5, 6, 8,-2};
        int[] newArray = new int[numbers.length];// create new array to store negative first

        rearrange(numbers, newArray);

        System.out.println(Arrays.toString(newArray));
    }

    public static void rearrange(int[] numbers, int[] newArray) {
        int j = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < 0) {
                newArray[j] = numbers[i];
                j++;
            }

        }

        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i] > 0){
                newArray[j]=numbers[i];
                j++;
            }
        }


    }

}
