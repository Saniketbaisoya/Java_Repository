

public class Clothing extends Product{
    
    public Clothing(String name, double price){
        super(name, price);
    }

    @Override
    double calculateDiscount(){
        return price * 0.2;
    }

    @Override
    double calculateTax(){
        return price * 0.08;
    }

    @Override
    double calculateShippingCost(){
        return 10;
    }

    public void getAllData(){
        System.out.println("The discount for the " + name + " is: " +this.calculateDiscount());
        System.out.println("The tax for the " + name + " is: " +this.calculateTax());
        System.out.println("The shipping cost for the " + name + " is: " +this.calculateShippingCost());
    }

    // public static void main(String[] args) {
    //     Clothing jeans = new Clothing("Jeans", 100);
    //     jeans.getAllData();
    // }
}
