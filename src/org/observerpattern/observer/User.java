package org.observerpattern.observer;

public class User implements Observer {

	private String name;

	/**
	 * @param name
	 */
	public User(String name) {
		super();
		this.name = name;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void update(double price, boolean promotion) {
		if (promotion) {
			System.out
					.println("Hi "
							+ name
							+ ", there is a big promotion on our product! Now it is only "
							+ price + "€!");
		} else {
			System.out
					.println("Hi "
							+ name
							+ ", the promotion on our product finished! Now you can buy it for "
							+ price + "€!");
		}

	}

}
