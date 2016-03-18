package org.observerpattern.subject;

import java.util.ArrayList;
import java.util.List;

import org.observerpattern.observer.Observer;

public class Product implements Subject {

	private List<Observer> observers = new ArrayList<Observer>();
	private String name;
	private double price;
	private boolean promotion;

	/**
	 * @param name
	 * @param price
	 * @param promotion
	 */
	public Product(String name, double price, boolean promotion) {
		super();
		this.name = name;
		this.price = price;
		this.promotion = promotion;
	}

	/**
	 * @return the observers
	 */
	public List<Observer> getObservers() {
		return observers;
	}

	/**
	 * @param observers
	 *            the observers to set
	 */
	public void setObservers(List<Observer> observers) {
		this.observers = observers;
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

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price
	 *            the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * @return the promotion
	 */
	public boolean isPromotion() {
		return promotion;
	}

	/**
	 * @param promotion
	 *            the promotion to set
	 */
	public void setPromotion(boolean promotion) {
		this.promotion = promotion;
		notifyObservers();
	}

	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);

	}

	@Override
	public void removeObserver(Observer observer) {
		observers.remove(observer);

	}

	@Override
	public void notifyObservers() {
		System.out
				.println("---Notifying to all the users when product has a promotion---");
		for (Observer ob : observers) {
			ob.update(this.price);
		}

	}

}
