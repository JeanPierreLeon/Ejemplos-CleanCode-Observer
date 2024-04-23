package co.edu.uniquindio.parcial1fx.observer;

import co.edu.uniquindio.parcial1fx.observer.investor.Investor;
import co.edu.uniquindio.parcial1fx.observer.Market.Observer;
import co.edu.uniquindio.parcial1fx.observer.Market.Stock;

public class Main {
    public static void main(String[] args) {
        // Creamos una acción y algunos inversores
        Stock apple = new Stock("AAPL", 150.0);
        Observer investor1 = new Investor("Inversor 1");
        Observer investor2 = new Investor("Inversor 2");

        // Los inversores se suscriben a la acción
        apple.addObserver(investor1);
        apple.addObserver(investor2);

        // Cambiamos el precio de la acción y notificamos a los inversores
        apple.setPrice(155.0);
        apple.setPrice(160.0);

        // Los inversores cancelan su suscripción
        apple.removeObserver(investor2);

        // Cambiamos el precio de la acción nuevamente
        apple.setPrice(165.0);
    }
}