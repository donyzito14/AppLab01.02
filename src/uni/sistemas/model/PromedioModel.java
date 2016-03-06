
package uni.sistemas.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import uni.sistemas.entity.Promedio;

public class PromedioModel {
    //creando constructor 
    public PromedioModel() {
    }
    //creando metodos para operaciones
    public void calcularPractica(Promedio p){
        ArrayList a = new ArrayList();
        a.add(p.getP1());
        a.add(p.getP2());
        a.add(p.getP3());
        a.add(p.getP4());
        Comparator<Integer> comparador = Collections.reverseOrder();
        Collections.sort(a, comparador);
        double x = 0;
        for (int i = 0;i < 3;i++){
            Double obj = null;
            obj = (Double ) a.get(i);       
            x += obj;    
        }
        p.setP(x/3);
    
        
             
    }
    public void calcularPromedio(Promedio p){
        double ep = p.getEp() * 0.25;
        double ef = p.getEf() * 0.5;
        double practicas = p.getP() * 0.25;
        p.setPf(ef+ep+practicas);
        
    }
    
    
    
}
