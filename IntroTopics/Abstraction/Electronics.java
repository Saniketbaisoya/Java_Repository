

public class Electronics extends Product{

    public Electronics(String name, double price){
        super(name, price);
    }

    @Override
    public double calculateDiscount(){
        return price * 0.1;
    }

    @Override
    public double calculateTax(){
        return price * 0.15;
    }

    @Override
    public double calculateShippingCost(){
        return 10;
    }

    public void getAllData(){
        System.out.println("The discount for the " + this.name + " is: " +this.calculateDiscount());
        System.out.println("The tax for the " + this.name + " is: " +this.calculateTax());
        System.out.println("The shipping cost for the " + this.name + " is: " +this.calculateShippingCost());
    }
    // public static void main(String[] args) {
    //     Electronics macbook = new Electronics("Macbook", 100000);
    //     macbook.getAllData();
    // }
}
