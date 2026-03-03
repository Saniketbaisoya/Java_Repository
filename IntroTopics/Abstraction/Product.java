

/**
 * Now yeah Product class ek abstract class hai
 * Yani isse kbhi bhi object create nhi hoga
 * Now iss product class ke andr hmare pass 3 abstract methods hai
 * Jinki function body kbhi bhi exists nhi krti
 * Lekin kbhi bhi iss abstract class se inhert class(child-class) create hogi
 * Toh child class mai hmme sare abstracted methods ko declare krna hoga
 * Yani same functions mai hi declare krege in child class 
 * Yani override krege inko taki inhi same functions mai hmm child class ke according, logic likh ske
 */
abstract public class Product {
    protected String name;
    protected double price;

    public Product(String name, double price){
        this.name = name;
        this.price = price;
    }

    abstract double calculateDiscount();
    abstract double calculateTax();
    abstract double calculateShippingCost();
    
}
