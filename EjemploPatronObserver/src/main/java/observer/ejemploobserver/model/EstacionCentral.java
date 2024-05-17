package observer.ejemploobserver.model;

import observer.ejemploobserver.services.Observer;

public class EstacionCentral implements Observer {
    @Override
    public String update(String tipo) {
        String msj = "";
        if (tipo.equals("temperatura")) {
        msj = "Se han actualizado los datos de la estación central de temperatura" + "\n";
        }

        return msj;

    }
}
