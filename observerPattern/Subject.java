package observerPattern;

public interface Subject {
    public void rejisterObserver(Observer observer);

    public void removerObserver(Observer observer);

    public void notifyObservers();
}
