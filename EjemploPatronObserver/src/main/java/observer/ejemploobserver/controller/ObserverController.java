package observer.ejemploobserver.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import observer.ejemploobserver.factory.ModelFactory;

public class ObserverController {

    ModelFactory modelFactory;

    public ObserverController() {
        modelFactory = ModelFactory.getInstance();
    }

    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    public String actualizarTemperatura(String temperatura) {
        return modelFactory.actualizarTemperatura(temperatura);
    }
}