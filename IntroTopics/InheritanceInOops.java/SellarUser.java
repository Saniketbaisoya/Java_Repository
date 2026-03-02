

public class SellarUser extends User{
    
    SellarUser(String userName, String email){
        super(userName, email);
    }

    public void addProducts(){
        System.out.println("Sellar adding a new product !!");
    }

    @Override
    public void showDashboard(){
       System.out.println("Sellar personalized dashboard !!");
    }

    public static void main(String[] args) {
        SellarUser user = new SellarUser("sellar", "sellar@gmail.com");
        user.showDashboard();
    }
}
