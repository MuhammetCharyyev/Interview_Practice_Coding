package Array;

import java.util.Scanner;

public class SumArrayScanner {

    public static void main(String[] args) {
        int sum = 0;//variable for sum of array data
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter size of array");
        int size = scanner.nextInt();//field for insertion of size of array

        int[] array = new int[size]; //creation of array with customized above size

        System.out.println("enter elements");//entering elements as per size

        for (int i = 0; i < size; i++){
            array[i] = scanner.nextInt();//field for insertion of elements
        }

        for (int i : array) {
            sum += i;//sum of all elements of inserted array
        }

        System.out.println(sum);
    }

}
