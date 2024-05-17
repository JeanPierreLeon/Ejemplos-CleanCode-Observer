package observer.ejemploobserver.services;

public interface Observable {
    void addObserver(Observer observer);
    void deleteObserver(Observer observer);
    String notifyObservers(String tipo);
}
