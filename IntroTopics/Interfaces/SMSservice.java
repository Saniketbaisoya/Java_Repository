

public class SMSservice implements NotificationService{
    private String phoneNumber;

    public SMSservice(String phoneNumber){
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void sendNotification(String message){
        System.out.println("Sending notification to: " + phoneNumber);
    }
    
    @Override
    public void subscribeTopic(String topic){
        System.out.println("subscribed " + phoneNumber + " to email notification for topics: " + topic);
    }

}
