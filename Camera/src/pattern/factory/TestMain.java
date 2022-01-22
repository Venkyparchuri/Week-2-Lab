package pattern.factory;

public class TestMain {
	 public static void main(String[] args)
	    {
	        FactoryCheck notificationFactory = new FactoryCheck();
	        Notification notification = notificationFactory.createNotification("battery");
	        notification.notifyUser();
	    }
}
