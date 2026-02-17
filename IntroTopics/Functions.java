public class Functions {
    
    public static void main(String[] args) {
        
        System.out.println("Let's get started !!");
        // call the function....
        greetingCustomer();

        // sum function ko call kr rhe hai with arguments 10 and 20.....
        int res1 = sum(10, 20);
        System.out.println(res1);
    }

    // Declare a function....
    public static void greetingCustomer(){

        System.out.println("Hello to you !!");
        System.out.println("Hope you're having a good day !!");
    }

    public static int sum(int a, int b){
        return a + b;
    }
}
