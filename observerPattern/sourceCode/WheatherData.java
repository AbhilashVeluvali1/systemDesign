package observerPattern.sourceCode;

import java.util.ArrayList;
import java.util.List;

public class WheatherData implements Subject {
    private List<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;
    public WheatherData() {
        this.observers = new ArrayList<Observer>();
    }

    public void registerObserver(Observer observer){
        observers.add(observer);
    }
    public void removerObserver(Observer observer) {

    }
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
