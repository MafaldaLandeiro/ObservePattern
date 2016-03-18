package org.observerpattern.subject;

import org.observerpattern.observer.Observer;

public interface Subject {
	public void registerObserver(Observer observer);

	public void removeObserver(Observer observer);

	public void notifyObservers();
}
