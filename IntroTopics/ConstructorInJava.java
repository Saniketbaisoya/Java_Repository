public class ConstructorInJava {
    
    // private field
    private String name;

    // ek constructor ko create kra manually jo private name field ki value dega
    // Now yeah contructor call tb hoga jb ek object create hoga dynamically....
    ConstructorInJava(){
        name = "PW Skills";
        System.out.println("Constructor Called !!");
    }

    public static void main(String[] args) {
        
        ConstructorInJava obj = new ConstructorInJava();
        System.out.println("The obj name is: " + obj.name);
    }
}
