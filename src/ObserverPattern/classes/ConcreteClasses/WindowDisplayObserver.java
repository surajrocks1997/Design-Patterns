package ObserverPattern.classes.ConcreteClasses;

import ObserverPattern.interfaces.IObserver;

public class WindowDisplayObserver implements IObserver {

    WeatherStationObservable weatherStation;

    public WindowDisplayObserver(WeatherStationObservable weatherStation) {
        this.weatherStation = weatherStation;
    }

    @Override
    public void update() {
        System.out.println(this.weatherStation.getTemperature());
    }
}
