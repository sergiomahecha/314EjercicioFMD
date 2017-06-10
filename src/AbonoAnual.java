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

    @Override
    float costePrimerCuatrimestre() {
        return super.getTipo().getCoste();
    }

    @Override
    float costeSegundoCuatrimestre() {
        return 0;
    }

    @Override
    float costeTercerCuatrimestre() {
        return 0;
    }
    
}
