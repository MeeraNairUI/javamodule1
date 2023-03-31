package observer.subject;

import observer.iface.WeatherObserver;

public abstract class Observable {
	public abstract void addObserver(WeatherObserver weatherObserver);
	public abstract void removeObserver(WeatherObserver weatherObserver);
	public abstract void doNotify(); // update


}
