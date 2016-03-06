
package uni.sistemas.controller;

import uni.sistemas.entity.Promedio;
import uni.sistemas.model.PromedioModel;

public class PromedioController {
    //Creando el Constructor
    PromedioModel pm;
    public PromedioController() {
        pm = new PromedioModel();
    }
    //Iniziando Metodos
    
    public void procesarPromedio(Promedio p){
        pm.calcularPractica(p);
        pm.calcularPromedio(p);
    }
    
    
    
}
