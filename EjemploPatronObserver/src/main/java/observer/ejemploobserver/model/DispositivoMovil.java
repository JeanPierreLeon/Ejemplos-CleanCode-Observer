package observer.ejemploobserver.model;

import observer.ejemploobserver.services.Observer;

public class DispositivoMovil implements Observer {
    @Override
    public String update(String tipo) {
        String msj = "";

        if (tipo.equals("temperatura")) {
            msj = "Se han actualizado los datos del dispositivo movil de temperatura";
        }
        return msj;
    }
}