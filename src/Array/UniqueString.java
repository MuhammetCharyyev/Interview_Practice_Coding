package Array;

import java.util.Arrays;

public class UniqueString {
    public static void main(String[] args) {

        String[] words = {"Layan", "Layan", "Oleksandr", "Olga"};

        for (String each : words) {
            int count = 0;
            for (String element : words) {
                if(element.equals(each)){
                    count++;
                }
            }

            if(count == 1){   //UNIQUE
       //  if(count == 2){  //DUPLICATES
                System.out.println(each);
            }

//RESULT :    Oleksandr
            //Olga
        }
    }
}
