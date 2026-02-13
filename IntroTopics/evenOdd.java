package IntroTopics;

import java.util.Scanner;

public class evenOdd {
    public static void main(String[] args) {

        // first initialize the input object by class....
        Scanner input = new Scanner(System.in);

        // then add a statement for better understand....
        System.out.print("Enter your number to check: ");

        // then take input....
        int num = input.nextInt();

        // then logic....
        if(num % 2 == 0){
            System.out.println("Number is even");
        }else{
            System.out.println("Number is odd");
        }
    }
}
