/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sergio
 */
public abstract class Abono {
    
    private Ciudadano elAbonado;
    
    private Meses mesDeAlta;
    
    private TipoAbono tipo;

    public Ciudadano getElAbonado() {
        return elAbonado;
    }

    public void setElAbonado(Ciudadano elAbonado) {
        this.elAbonado = elAbonado;
    }

    public Meses getMesDeAlta() {
        return mesDeAlta;
    }

    public void setMesDeAlta(Meses mesDeAlta) {
        this.mesDeAlta = mesDeAlta;
    }

    public TipoAbono getTipo() {
        return tipo;
    }

    public void setTipo(TipoAbono tipo) {
        this.tipo = tipo;
    }
    
    abstract float costePrimerCuatrimestre();
    
    abstract float costeSegundoCuatrimestre();
    
    abstract float costeTercerCuatrimestre();
    
}
