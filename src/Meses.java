/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sergio
 */
public enum Meses {
    
    ENERO(1,4),FEBRERO(2,3),MARZO(3,2),ABRIL(4,5),MAYO(5,4),JUNIO(6,3),
    JULIO(7,2),AGOSTO(8,5),SEPTIEMBRE(9,4),OCTUBRE(10,3),NOVIEMBRE(11,2);
    
    private int numeroMes;
    
    private int mensualidades;

    private Meses(int numeroMes, int mensualidades) {
        this.numeroMes = numeroMes;
        this.mensualidades = mensualidades;
    }

    public int getNumeroMes() {
        return numeroMes;
    }

    public int getMensualidades() {
        return mensualidades;
    }
    
}
