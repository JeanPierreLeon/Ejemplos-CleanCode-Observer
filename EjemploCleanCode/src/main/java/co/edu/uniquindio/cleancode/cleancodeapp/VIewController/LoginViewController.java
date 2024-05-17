package co.edu.uniquindio.cleancode.cleancodeapp.VIewController;

import co.edu.uniquindio.cleancode.cleancodeapp.Controller.LoginController;
import co.edu.uniquindio.cleancode.cleancodeapp.model.Usuario;
import co.edu.uniquindio.cleancode.cleancodeapp.services.AuthService;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginViewController {
LoginController loginController = new LoginController();
    @FXML
    private TextField usernameField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private Label resultadologin;



    @FXML
    void login(ActionEvent event) {
        String username = usernameField.getText();
        String password = passwordField.getText();
        Usuario user = loginController.login(username, password);
        if (user != null) {
            resultadologin.setText("Logeado Correctamente");
        } else {
            resultadologin.setText("Logeado Incorrectamente");
        }
    }
}
