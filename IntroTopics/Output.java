package IntroTopics;

public class Output {
    public static void main(String [] args){
        /**
         * Now System is class , out is field, println is a method inside out
         * println mai n -> \n joki cursor ko next line mai bhi lekr ayega after print whole things from the println
         * print mai koi n nhi hai jiski vje se next line mai cursor nhi gya, 1. print hone ke baad 2. print hogya
         */
        System.out.println("1. println");
        System.out.println("2. println");

        System.out.print("1. print ");
        System.out.print("2. print ");

        System.out.println();
        // System.out.printf(format, arguments);
        System.out.printf("Java is %d interesting", 100);


    }
}
