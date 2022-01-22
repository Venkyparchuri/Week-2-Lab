package pattern.factory;

public class MemoryCheck implements Notification {

	@Override
	public void notifyUser() {
		System.out.println("Checking whether memory card is present");

	}

}
