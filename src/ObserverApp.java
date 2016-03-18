import org.observerpattern.observer.User;
import org.observerpattern.subject.Product;

public class ObserverApp {

	public static void main(String[] args) {
		User user1 = new User("Mafalda");
		User user2 = new User("Isabel");
		User user3 = new User("Bia");

		Product prod = new Product("XPTO", 10.50, false);

		// Subscribe notification
		prod.registerObserver(user1);
		prod.registerObserver(user2);
		prod.registerObserver(user3);

		// Make a promotion
		prod.setPrice(5.50);
		prod.setPromotion(true);

		// Finish promotion
		prod.setPrice(10.50);
		prod.setPromotion(false);

	}

}
