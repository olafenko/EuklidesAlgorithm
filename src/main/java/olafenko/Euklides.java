package olafenko;

import java.util.ArrayList;
import java.util.Scanner;

public class Euklides {





    public void run(){
        Scanner scanner = new Scanner(System.in);

        EuklidesAlgorithm(scanner);



    }



    public void EuklidesAlgorithm(Scanner scanner){

        System.out.println("Enter two numbers which greatest common divisor u want to get: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();


        ArrayList<Integer> commonDivisor = new ArrayList<>();

        int searchRange;

        if (a > b) {
            searchRange = b;
        } else {
            searchRange = a;
        }

        for (int i = 1; i<= searchRange; i++){

            if (a%i == 0 && b%i ==0){
                commonDivisor.add(i);
            }

        }

        Integer greatestCommonDivisor = commonDivisor.get(commonDivisor.size() - 1);

        System.out.println("Biggest common divider of " + a + " and " + b + " is: " + greatestCommonDivisor);

    }



}
