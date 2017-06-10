
import java.util.ArrayList;
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sergiohurtado
 */
public class GestoraAbonos extends ArrayList<Abono>{

    public GestoraAbonos() {
    }
    
    private void cargarDatosIniciales(){
        
    }
    
    public boolean agregarAbono(Abono a){
        if(!existeDni(a.getElAbonado().getDni())){
            this.add(a);
            return true;
        }
        return false;
    }
    
    private boolean existeDni(String dni){
        for(Abono a:this){
            if(a.getElAbonado().getDni().equals(dni)){
                return true;
            }
        }
        return false;
    }
    
    public Abono[] devolverAbonosPorDni(){
        Abono[] losAbonos=new Abono[this.size()];
        this.toArray(losAbonos);
        Arrays.sort(losAbonos, new ComparadorDni());
        return losAbonos;
    }
    
    public Abono[] devolverAbonosPorNombre(){
        Abono[] losAbonos=new Abono[this.size()];
        this.toArray(losAbonos);
        Arrays.sort(losAbonos, new ComparadorNombre());
        return losAbonos;
    }
    
    public Abono devuelveAbono(String dni){
        for(Abono uno:this){
            if(uno.getElAbonado().getDni().equals(dni)){
                return uno;
            }
        }
        return null;
    }
    
    public String[] devuelveDniOrdenados(){
        String[] losDni=new String[this.size()];
        int i=0;
        for(Abono uno:devolverAbonosPorDni()){
            losDni[i]=uno.getElAbonado().getDni();
            i++;
        }
        return losDni;
    }
    
}
