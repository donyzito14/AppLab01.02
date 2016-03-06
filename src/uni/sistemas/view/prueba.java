
package uni.sistemas.view;

import uni.sistemas.entity.Promedio;
import uni.sistemas.model.PromedioModel;

public class prueba {
    public static void main(String[]args){
        Promedio p = new Promedio();
        PromedioModel pm = new PromedioModel();
        p.setP1(18);
        p.setP2(17);
        p.setP3(19);
        p.setP4(14);
        pm.calcularPractica(p);
        p.setEp(17);
        p.setEf(18);
        pm.calcularPromedio(p);
        System.out.println(""+p.getPf());
    }
    
}
