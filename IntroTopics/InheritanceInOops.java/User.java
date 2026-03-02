

abstract public class User {
    
    private String userName;
    private String email;

    User(String userName, String email){
        this.userName = userName;
        this.email = email;
    }

    public void logIn(){
        System.out.println("User SuccessFully Login !!");
    }

    public void showDashboard(){
        System.out.println(this.userName+" "+this.email);
    }
}
