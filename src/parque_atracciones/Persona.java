/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parque_atracciones;

import java.util.Calendar;

/**
 *
 * @author DAW122
 */
public class Persona {
    
    
    private String nombre;
    private String apellidos;
    private String dni;  
    private Calendar FechaNac;

    public Persona(String nombre, String apellidos, String dni, Calendar FechaNac) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.FechaNac = FechaNac;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Calendar getFechaNac() {
        return FechaNac;
    }

    public void setFechaNac(Calendar FechaNac) {
        this.FechaNac = FechaNac;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni + ", FechaNac=" + FechaNac + '}';
    }
    
    
    
    
    
}
