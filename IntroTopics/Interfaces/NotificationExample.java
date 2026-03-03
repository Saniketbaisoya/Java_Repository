

public class NotificationExample {
    
    public static void main(String[] args) {
        
        // NotificationService emailService = new NotificationService(); ❌
        NotificationService emailService = new EmailService("user@example.com");
        NotificationService smsService = new SMSservice("8377886895");

        emailService.sendNotification("hello this is an email notification");
        smsService.sendNotification("Hello this is an sms notification");

        emailService.subscribeTopic("news");
        smsService.subscribeTopic("alert");
    }


}
