package Array;

import static java.util.Arrays.binarySearch;

public class SearchBinary {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 50, 100};
        int searchElement = 100;//to find element in array

      int index =  searchBinaryElement(arr, 0, arr.length - 1, searchElement);
        // 0 is low element and arr.length-1 is high element

        System.out.println(index);

    }

    private static int searchBinaryElement(int[] arr, int low, int high, int searchElement) {
        if (high >= low) {
            int mid = low + (high - low) / 2;//find the middle element in array
            if (arr[mid] == searchElement)//if mid data in array is equal to search element
                return mid;//return this element
            if (searchElement > arr[mid]) {//search element on the right side of array
                return searchBinaryElement(arr, mid +1, high,  searchElement);
            }
            if (searchElement < arr[mid]) {//search element on the left side of array
                return searchBinaryElement(arr, low, mid - 1, searchElement);
            }
        }
        return -1;
    }

}
