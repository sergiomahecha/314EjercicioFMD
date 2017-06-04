
import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author sergio
 */
public class Ciudadano {
    
    private String nombre;
    
    private String dni;
    
    private Date fechaDeNacimiento;
    
    private boolean empadronado;

    public Ciudadano(String nombre, String dni, Date fechaDeNacimiento, boolean empadronado) {
        this.nombre = nombre;
        this.dni = dni;
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.empadronado = empadronado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Date getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public void setFechaDeNacimiento(Date fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public boolean isEmpadronado() {
        return empadronado;
    }

    public void setEmpadronado(boolean empadronado) {
        this.empadronado = empadronado;
    }
    
}
