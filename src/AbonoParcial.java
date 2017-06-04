/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sergio
 */
public class AbonoParcial extends Abono{

    public AbonoParcial(Ciudadano c, Meses mes) {
        super.setElAbonado(c);
        super.setMesDeAlta(mes);
    }

    @Override
    float costePrimerCuatrimestre() {
        if
    }

    @Override
    float costeSegundoCuatrimestre() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    float costeTercerCuatrimestre() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
