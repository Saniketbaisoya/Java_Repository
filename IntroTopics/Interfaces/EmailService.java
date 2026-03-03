

public class EmailService implements NotificationService{
    
    private String email;

    public EmailService(String email){
        this.email = email;
    }

    @Override
    public void sendNotification(String message){
        System.out.println("Sending email notification to: "+ email);
    }

    @Override
    public void subscribeTopic(String topic){
        System.out.println("subscribed " + email + " to email notification for topics");
    }
}
