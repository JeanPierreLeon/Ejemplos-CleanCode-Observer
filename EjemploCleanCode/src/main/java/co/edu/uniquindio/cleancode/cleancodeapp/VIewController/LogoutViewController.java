package co.edu.uniquindio.cleancode.cleancodeapp.VIewController;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class LogoutViewController {

    @FXML
    void Cerrarsesion(ActionEvent event) {
        try {
            System.out.println("Sesión cerrada exitosamente");

            // Volver a la pantalla de inicio de sesión
            Parent root = FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/co/edu/uniquindio/cleancode/cleancodeapp/Login.fxml")));
            Scene scene = new Scene(root);
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(scene);
            stage.setTitle("Iniciar sesión");
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

