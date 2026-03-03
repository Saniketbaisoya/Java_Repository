

public class OnlineStore {
    
    public static void main(String[] args) {
        
        Electronics macbook = new Electronics("Macbook M5", 100000);
        Clothing jeans = new Clothing("Jeans", 100);

        macbook.getAllData();
        System.out.println();
        jeans.getAllData();
    }
}
