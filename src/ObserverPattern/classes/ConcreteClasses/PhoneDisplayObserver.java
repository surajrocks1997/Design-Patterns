package ObserverPattern.classes.ConcreteClasses;

import ObserverPattern.interfaces.IObserver;

public class PhoneDisplayObserver implements IObserver {

    WeatherStationObservable observable;

    public PhoneDisplayObserver(WeatherStationObservable observable) {
        this.observable = observable;
    }

    @Override
    public void update() {
        System.out.println(this.observable.getTemperature());
    }
}
