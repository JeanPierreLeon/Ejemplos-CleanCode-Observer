package observer.ejemploobserver.model;

import observer.ejemploobserver.services.Observable;
import observer.ejemploobserver.services.Observer;

import java.util.ArrayList;
import java.util.List;

public class EstacionMeteorologica implements Observable {
    private float temperatura;
    private float humedad;
    private float presion;
    private List<Observer> observers = new ArrayList<>();

    public String setTemperatura(float temperatura) {
        this.temperatura = temperatura;

        return notifyObservers("temperatura");

    }

    public String setHumedad(float humedad) {
        this.humedad = humedad;
        return notifyObservers("humedad");
    }

    public String setPresion(float presion) {
        this.presion = presion;
        return notifyObservers("presion");
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public String notifyObservers(String tipo) {

        String msj = "";

        for(Observer observer: observers){
            msj += observer.update(tipo) + "\n";
        }

        return msj;
    }


}
