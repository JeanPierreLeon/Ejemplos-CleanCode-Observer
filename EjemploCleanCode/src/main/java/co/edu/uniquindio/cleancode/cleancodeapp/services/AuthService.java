package co.edu.uniquindio.cleancode.cleancodeapp.services;

import co.edu.uniquindio.cleancode.cleancodeapp.model.Usuario;

public interface AuthService {

    Usuario login(String username, String password);
}
