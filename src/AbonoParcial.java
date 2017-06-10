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
        if(super.getElAbonado().isEmpadronado()){
             super.setTipo(TipoAbono.PY);
        }else{
            super.setTipo(TipoAbono.PN);
        }
    }

    @Override
    float costePrimerCuatrimestre() {
        if(super.getMesDeAlta().getNumeroMes()<=4){
            return super.getMesDeAlta().getMensualidades()*super.getTipo().getCoste();
        }else{
            return 0;
        }
    }

    @Override
    float costeSegundoCuatrimestre() {
        if(super.getMesDeAlta().getNumeroMes()>4 && super.getMesDeAlta().getNumeroMes()<9){
            return super.getMesDeAlta().getMensualidades()*super.getTipo().getCoste();
        }else{
            return 0;
        }
    }

    @Override
    float costeTercerCuatrimestre() {
        if(super.getMesDeAlta().getNumeroMes() > 8 && super.getMesDeAlta().getNumeroMes() < 12){
            return super.getMesDeAlta().getMensualidades()*super.getTipo().getCoste();
        }else{
            return 0;
        }
    }
    
}
