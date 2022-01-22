package pattern.factory;

public class FactoryCheck {
	 public Notification createNotification(String channel)
	    {
	        if (channel == null || channel.isEmpty())
	            return null;
	        if ("battery".equals(channel)) {
	            return new BatteryCheck();
	        }
	        else if ("memory".equals(channel)) {
	            return new MemoryCheck();
	        }
	        else if ("lens".equals(channel)) {
	            return new LensCheck();
	        }
	        return null;
	    }
}
