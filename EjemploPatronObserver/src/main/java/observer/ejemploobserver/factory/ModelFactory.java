package observer.ejemploobserver.factory;

import observer.ejemploobserver.model.DispositivoMovil;
import observer.ejemploobserver.model.EstacionCentral;
import observer.ejemploobserver.model.EstacionMeteorologica;
import observer.ejemploobserver.model.Pantalla;

public class ModelFactory {

    private static ModelFactory modelFactory;
    private EstacionMeteorologica estacionMeteorologica = new EstacionMeteorologica();


    public static ModelFactory getInstance() {
        if(modelFactory == null) {
            modelFactory = new ModelFactory();
        }
        return modelFactory;
    }

    public String actualizarTemperatura(String temperatura) {
        
        /*Se Agregan los observadores*/
        estacionMeteorologica.addObserver(new Pantalla());
        /*estacionMeteorologica.addObserver(new DispositivoMovil());
        estacionMeteorologica.addObserver(new EstacionCentral());*/


        return estacionMeteorologica.setTemperatura(Float.parseFloat(temperatura));
    }
}
