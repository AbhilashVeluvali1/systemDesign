package observerPattern.stockTradingPlatform;

import java.util.ArrayList;
import java.util.List;

public class StockPriceSubject implements Subject {
    private List<Observer> observers;
    private float price;

    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }
    public StockPriceSubject() {
        observers = new ArrayList<>();
    }

    public void registerObserver(Observer observer) {
        System.out.println("Observer is registered: " + observer);
        observers.add(observer);
    }
    public void removeObserver(Observer observer) {
        System.out.println("Observer is removed: " + observer);
        observers.remove(observer);
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.onStockPriceChange(price);
        }
    }

    public void stockPriceChange(float price) {
        this.price = price;
        notifyObservers();
    }
}
