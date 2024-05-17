package observer.ejemploobserver.ObserverViewController;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import observer.ejemploobserver.controller.ObserverController;


public class ObserverViewController {

    ObserverController observerController;

    @FXML
    void initialize() {
        observerController = new ObserverController();
    }

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button btnTemperatura;

    @FXML
    private TextField txtTemperatura;

    @FXML
    private TextArea txtObservadoresNotificados;

    @FXML
    void onCambioTemperatura(ActionEvent event) {
        if (!txtTemperatura.getText().isEmpty()) {
            txtObservadoresNotificados.setText(observerController.actualizarTemperatura(txtTemperatura.getText()));
        }
    }


}
