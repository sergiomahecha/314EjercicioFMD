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
        if(super.getMesDeAlta().getNumeroMes()<=4 && super.getElAbonado().isEmpadronado()){
            return super.getMesDeAlta().getMensualidades()*TipoAbono.PY.getCoste();
        }
        else if(super.getMesDeAlta().getNumeroMes()<=4 && !super.getElAbonado().isEmpadronado()){
            return super.getMesDeAlta().getMensualidades()*TipoAbono.PN.getCoste();
        }
        else{
            return 0;
        }
    }

    @Override
    float costeSegundoCuatrimestre() {
        if(super.getMesDeAlta().getNumeroMes()>4 && super.getMesDeAlta().getNumeroMes()<9 && super.getElAbonado().isEmpadronado()){
            return super.getMesDeAlta().getMensualidades()*TipoAbono.PY.getCoste();
        }
        else if(super.getMesDeAlta().getNumeroMes()>4 && super.getMesDeAlta().getNumeroMes()<9 && !super.getElAbonado().isEmpadronado()){
            return super.getMesDeAlta().getMensualidades()*TipoAbono.PN.getCoste();
        }
        else{
            return 0;
        }
    }

    @Override
    float costeTercerCuatrimestre() {
        if(super.getMesDeAlta().getNumeroMes() > 8 && super.getMesDeAlta().getNumeroMes() < 12 && super.getElAbonado().isEmpadronado()){
            return super.getMesDeAlta().getMensualidades()*TipoAbono.PY.getCoste();
        }
        else if(super.getMesDeAlta().getNumeroMes() > 8 && super.getMesDeAlta().getNumeroMes() < 12 && !super.getElAbonado().isEmpadronado()){
            return super.getMesDeAlta().getMensualidades()*TipoAbono.PN.getCoste();
        }
        else{
            return 0;
        }
    }
    
}
