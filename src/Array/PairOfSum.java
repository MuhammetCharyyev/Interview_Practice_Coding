package Array;

public class PairOfSum {

    public static void main(String[] args) {

        int [] numbers = {10, 20, 30, 40, 50};
        int givenSum = 50;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i+1; j < numbers.length; j++) {

                //here 1st iteration is: i=10, j=20/ if (20 == 50 - 10) ->false
                //2d iteration: i=10, j=30/ if (30 == 50 - 10) ->false
                //3d iteration: i=10, j=40/ if (40 == 50 - 10) ->true->print
                if(numbers[j] == givenSum - numbers[i]) {
                    System.out.println(i+" , "+j);
                    //will be printed ->
                    //0 , 3     1 , 2 -> indexes of elements which are give the sum 50
                }
            }
        }
    }

}
