package Integer;

public class SumOfDigits {

    public static void main(String[] args) {

        int num = 1220;

        int sum = 0; int digits = 0;

        while (num >0){
            digits = num%10; //extracting last digit as remaining
            sum = sum+digits; //0+4
            num = num/10; //122

        }
        System.out.println(sum);

    }

}
