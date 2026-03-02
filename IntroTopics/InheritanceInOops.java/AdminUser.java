

public class AdminUser extends User{
    AdminUser(String userName, String email){
        super(userName, email);
    }

    public static void manageProducts(){
        System.out.println("Admin manages the products !!");
    }

    public static void main(String[] args) {
        AdminUser au = new AdminUser("riya", "riya98@gmail.com");
        au.logIn();
        au.showDashboard();
    }
}
