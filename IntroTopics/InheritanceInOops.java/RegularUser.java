

public class RegularUser extends  User{
    RegularUser(String userName, String email){
        super(userName, email);
    }

    public void browseProducts(){
        System.out.println("Customer is browsing the products !!");
    }

    public static void main(String[] args) {
        RegularUser user = new RegularUser("sanket", "sanket@gmail.com");
        user.logIn();
    }
}
