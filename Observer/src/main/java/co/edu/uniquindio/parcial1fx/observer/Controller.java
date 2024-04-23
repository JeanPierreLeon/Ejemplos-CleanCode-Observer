package co.edu.uniquindio.parcial1fx.observer;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import co.edu.uniquindio.parcial1fx.observer.investor.Investor;
import co.edu.uniquindio.parcial1fx.observer.Market.Observer;
import co.edu.uniquindio.parcial1fx.observer.Market.Stock;

public class Controller {
    @FXML
    private Label outputLabel;

    @FXML
    private TextField notificationTextField;

    private Stock apple;
    private Observer investor1;
    private Observer investor2;

    public void initialize() {
        // Creamos una acción y algunos inversores
        apple = new Stock("Nike", 140);
        investor1 = new Investor("Inversionita 1");
      //  investor2 = new Investor("Inversionita 2");

        // Los inversores se suscriben a la acción
        apple.addObserver(investor1);
     //   apple.addObserver(investor2);

        // Actualizar el texto del label con la información de la acción
        updateOutputLabel();
    }

    public void onHelloButtonClick(ActionEvent actionEvent) {
        // Cambiamos el precio de la acción y notificamos a los inversores
     //   apple.setPrice(155.0);
     //   apple.setPrice(160.0);
        apple.removeObserver(investor2);
        apple.setPrice(165.0);

        // Mostrar las notificaciones en el TextField
        showNotifications();
    }

    private void updateOutputLabel() {
        outputLabel.setText("Empresa: " + apple.getSymbol() + ", Precio de la accion esta a : " + apple.getPrice());
    }

    private void showNotifications() {
        // Recorrer las notificaciones y mostrarlas en el TextField
        for (String notification : ((Investor)investor1).getNotifications()) {
            notificationTextField.appendText(notification + "\n");
        }
    }
}