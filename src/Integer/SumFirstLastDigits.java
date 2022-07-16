package Integer;

public class SumFirstLastDigits {

    public static void main(String[] args) {

        int number = 123;

        int lastDigit = number%10; //extracting last digit as remaining

        int firstDigit = number;

        while (firstDigit>=10){
            firstDigit = firstDigit /10;


        }

        System.out.println(lastDigit + firstDigit);

    }

}
