package Array;

import java.util.Arrays;

public class SecondMaxElement {
    public static void main(String[] args) {
        int temp, size;
        int[] array = {50, 20, 30, 40};

        //option without Arrays.sort:
//                size = array.length;
//
//        for(int i = 0; i<size; i++ ){
//            for(int j = i+1; j<size; j++){
//
//                if(array[i]>array[j]){
//                    temp = array[i];
//                    array[i] = array[j];
//                    array[j] = temp;
//                }
//            }
//        }

        Arrays.sort(array);
        System.out.println("The second largest number is: "+array[array.length-2]);
    }
}

