

/**
 * Now yha NotificationService ek interface hai 
 * Yani is interface ke logic ko implement krege in other class
 * So that ki inke methods/functions ko use ske....
 */
interface NotificationService {
    
    public void sendNotification(String messsage);
    public void subscribeTopic(String topic);

}
