/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sergiohurtado
 */
public class AbonoAnual extends Abono{

    public AbonoAnual(Ciudadano c) {
        super.setElAbonado(c);
    }
    
    public float coste(){
        if(super.getElAbonado().isEmpadronado()){
            return TipoAbono.AY.getCoste();
        }else{
            return TipoAbono.AN.getCoste();
        }
    }

    @Override
    float costePrimerCuatrimestre() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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
