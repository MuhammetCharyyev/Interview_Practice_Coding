package Array;

import java.util.HashSet;

public class Intersection {

    public static void main(String[] args) {

        int [] arr1 = {1,2,3,4};
        int [] arr2 = {4,5,6,7,3};
        //find common elements in two arrays
printCommon(arr1, arr2);


    }

    private static void printCommon(int[] arr1, int[] arr2) {

        HashSet<Integer> hs = new HashSet<>();

        for (int i = 0; i < arr1.length; i++) {
            hs.add(arr1[i]);
        }

        for (int i = 0; i < arr2.length; i++) {
            if (hs.contains(arr2[i])) {
                System.out.println(arr2[i]);

            }
        }
    }


}
