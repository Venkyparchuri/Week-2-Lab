package pattern.factory;

public class BatteryCheck implements Notification {

	@Override
	public void notifyUser() {
		System.out.println("Checking whether battery is full or not");

	}

}
