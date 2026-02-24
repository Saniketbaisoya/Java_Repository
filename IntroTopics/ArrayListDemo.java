import java.util.ArrayList;

public class ArrayListDemo {
    
    public static void main(String[] args){

        ArrayList<Integer> arr = new ArrayList<>();

        ArrayList<String> arr2 = new ArrayList<>();

        // add elements
        arr2.add("Java");
        arr2.add("JavaScript");
        arr2.add("Swift");

        // specific index pr
        arr2.add(1, "C++");

        System.out.println(arr2);
        System.out.println(arr2.size());

        // access
        String str = arr2.get(1);
        System.out.println(str);

        // update 
        arr2.set(2, "C++");
        System.out.println(arr2);

        // remove
        arr2.remove(2);
        System.out.println(arr2);

        System.out.println(arr2.size());
        
    }
}
