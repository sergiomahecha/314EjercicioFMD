
import java.util.Comparator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sergiohurtado
 */
public class ComparadorDni implements Comparator<Abono>{

    @Override
    public int compare(Abono o1, Abono o2) {
        return o1.getElAbonado().getDni().compareTo(o2.getElAbonado().getDni());
    }
    
}
