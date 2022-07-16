package Integer;

public class CountNumberOfInteger {

    public static void main(String[] args) {

//        int number = 1234;
//
//        int count = 0;
//
//        while(number!=0){
//
//           number =  number/10;
//           count++;
//        }
        System.out.println(countNumber(210));
    }

        static int countNumber(int n){

            if(n==0){
                return 0;

        }
            return 1+countNumber(n/10);


    }

}
