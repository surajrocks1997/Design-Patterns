package ObserverPattern;

import ObserverPattern.classes.ConcreteClasses.PhoneDisplayObserver;
import ObserverPattern.classes.ConcreteClasses.WeatherStationObservable;
import ObserverPattern.classes.ConcreteClasses.WindowDisplayObserver;
import ObserverPattern.interfaces.IObserver;

public class Main {
    public static void main(String[] args) {
        WeatherStationObservable weatherStation = new WeatherStationObservable(25);

        IObserver phoneDisplay1 = new PhoneDisplayObserver(weatherStation);
        IObserver phoneDisplay2 = new PhoneDisplayObserver(weatherStation);
        IObserver phoneDisplay3 = new PhoneDisplayObserver(weatherStation);
        IObserver windowDisplay1 = new WindowDisplayObserver(weatherStation);

        weatherStation.add(phoneDisplay1);
        weatherStation.add(phoneDisplay2);
        weatherStation.add(phoneDisplay3);
        weatherStation.add(windowDisplay1);

        weatherStation.setTemperature(26);
        weatherStation.setTemperature(22);
    }
}
