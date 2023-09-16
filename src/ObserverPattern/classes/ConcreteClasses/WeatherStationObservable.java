package ObserverPattern.classes.ConcreteClasses;

import ObserverPattern.interfaces.IObservable;
import ObserverPattern.interfaces.IObserver;

import java.util.ArrayList;
import java.util.List;

public class WeatherStationObservable implements IObservable {
    List<IObserver> observerList;
    int temperature;

    public WeatherStationObservable(int temperature) {
        this.observerList = new ArrayList<>();
        this.temperature = temperature;
    }

    @Override
    public void add(IObserver observer) {
        this.observerList.add(observer);
    }

    @Override
    public void remove(IObserver observer) {
        this.observerList.remove(observer);
    }

    @Override
    public void notifier() {
        for (IObserver observer : observerList)
            observer.update();
    }

    public int getTemperature() {
        return this.temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        notifier();
    }
}
