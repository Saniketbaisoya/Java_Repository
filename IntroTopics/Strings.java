public class Strings {
    public static void main(String[] args){
        // first way to declare the String in Java....
        // This is String literals
        String first = "Java";
        String second = "Python";
        String third = "JS";

        // second way to declare the String in Java....
        // This is String with new key word
        String str = new String("Java");

        // Now .concat function ka use krke do strings ko aaps mai jod skte hain....
        // Now yeah work krta hai + ki trh voh bhi concat hi hai....
        System.out.println(first.concat(second));
        System.out.println(third);
        System.out.println(second.length());

        // comparing the two strings....
        // (==) and .equals()
        // (==) compare both string referencing to the object, yani do string object same object pr refer kr rhe hai ki nhi
        // now .equals dono string ke contents ko aaps mai match krta hai....
        System.out.println(first == second);
        System.out.println(first.equals(second));

        /**
         * Now jb string literal create hota hai
         * Toh heap memory mai String constant pool krke ek special memory hoti hai
         * Usme yeah as a object bnke iski assigned value stored hoti hai
         * And agr koi dusra literal string with same literal bna toh uske liye
         * New object create nhi hoga voh same object ko reference krega jiski value us string ki value se match hai 
         * -> here pool shared the memory....
         * -> string identifier Reference to the pool objects....
         * -> They use the pool because strings are immutable
        */
        
        String str1 = "Java";
        String str2 = "Java";
        System.out.println(str1 == str2); // true
        System.out.println(str1.equals(str2)); // true same content java

        /**
         * Now ab agr String hmari create hogi by (new) keyword toh sbse phele pool mai dekhege kya vha koi object with same content exists krta hai ki ni
         * If nhi krta hai toh sbse phele pool mai object create hoga and value milegi, 
         * If exists krta hai toh new keyword JVM ko force krega ki voh ek object heap mai bhi create kre
         * And heap mai object ki value milegi by copy from pool object....
         * Now if another String is create with same content then uss case mai pool mai toh already exists krta hai object 
         * But heap mai new force to JVM create a brand new object....
         * Now let's say if same content ke sth koi object exists krta hai main heap mai tb bhi new object bnega
         * Because new always force to JVM whether the object is exists or not you always create a new object
         * That's why heap objects can't be shareable with each other....
         * -> heap objects can't be shareable 
         * -> Create in pool if not exists with that content
         * -> Create always in heap if exists or not in both cases
         * -> string identifier always refer to the heap objects not in pool objects
         * -> If we want to refer to the pool object then we use .intern()...
         * -> ex: String s1 = new String("Java"), String s2 = new String("Java");
         *          s1 = s1.intern();
         *          s2 = s2.intern();
         *          System.out.println(s1 == s2); // true.
         * 
        */
        String str3 = new String("Java");
        String str4 = new String("Java");

        System.out.println(str3 == str4); // false refernce different
        System.out.println(str3.equals(str4)); // true content same
    }
}
