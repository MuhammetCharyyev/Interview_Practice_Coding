package Array;

public class EvenPosition {

    public static void main(String[] args) {

        int[] nums = {1, 4, 5, 6, 7, 8, 9};

        for (int i = 2; i < nums.length; i += 2) {//print only even indexes
            System.out.println(nums[i]);

        }
    }


}
