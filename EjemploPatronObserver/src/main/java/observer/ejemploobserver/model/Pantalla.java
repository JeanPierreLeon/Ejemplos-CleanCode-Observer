package observer.ejemploobserver.model;

import observer.ejemploobserver.services.Observer;

public class Pantalla implements Observer {
    @Override
    public String update(String tipo) {

        String msj = "";
        if (tipo.equals("temperatura")) {
            msj = "Se han actualizado los datos de la pantalla de temperatura";
        }

        return msj;

    }
}