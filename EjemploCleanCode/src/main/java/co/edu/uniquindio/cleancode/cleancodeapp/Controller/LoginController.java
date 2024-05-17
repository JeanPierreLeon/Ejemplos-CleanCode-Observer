package co.edu.uniquindio.cleancode.cleancodeapp.Controller;

import co.edu.uniquindio.cleancode.cleancodeapp.model.Usuario;
import co.edu.uniquindio.cleancode.cleancodeapp.services.AuthService;

public class LoginController implements AuthService {
    @Override
    public Usuario login(String username, String password) {
        // Lógica de autenticación
        // La autenticación siempre es exitosa si se ingresan ambos campos
        if (!username.isEmpty() && !password.isEmpty()) {
            return new Usuario(username, password);
        } else {
            return null;

        }
    }
}



