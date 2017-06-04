/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sergio
 */
public enum TipoAbono {
    
    AY("Anual Empadronado",171f),AN("Anual No Empadronado",262.2f),
    PY("Parcial Empadronado",14.25f),PN("Parcial No Empadronado",21.85f);
    
    public static float matricula;
    
    private String texto;
    
    private float coste;

    private TipoAbono(String texto, float coste) {
        this.texto = texto;
        this.coste = coste;
    }

    public String getTexto() {
        return texto;
    }

    public float getCoste() {
        return coste;
    }
    
}
