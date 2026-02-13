package IntroTopics;

import java.util.Scanner;

public class input {
    public static void main(String [] args){

        // initializing the Scanner class by creating an object...
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your input : ");

        /**
         * Now major glti yha yeah thi ki mai container ka java identifier input object ke identifier pr hi rkh diya
         * Jb hmm input lete hai toh kisi bhi type ka input hmm le sbhi functions present hai inside the input object 
         * And jis container mai input lege usko same DataType ka constraint dena hoga....
         */
        // int input = input.nextInt();

        // correct way to take the input....
        int number = input.nextInt();

        float myFloat = input.nextFloat();

        double myDouble = input.nextDouble();

        String str = input.next();

        // Yha do different ke bech concatination hua hai, yha number assigned nhi hua...
        System.out.println("The data is : " + number);

    }
}
