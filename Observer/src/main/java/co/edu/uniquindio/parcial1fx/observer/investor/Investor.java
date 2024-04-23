package co.edu.uniquindio.parcial1fx.observer.investor;

import co.edu.uniquindio.parcial1fx.observer.Market.Observer;
import co.edu.uniquindio.parcial1fx.observer.Market.Stock;

import java.util.ArrayList;
import java.util.List;

public class Investor implements Observer {
    private String name;
    private List<String> notifications;

    public Investor(String name) {
        this.name = name;
        this.notifications = new ArrayList<>();
    }

    @Override
    public void update(Stock stock) {
        String notification = "   El precio de la accion de " + stock.getSymbol() + " ha cambiado a " + stock.getPrice();
        notifications.add(notification);
    }

    public List<String> getNotifications() {
        return notifications;
    }
}