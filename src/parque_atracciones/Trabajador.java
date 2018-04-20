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
public class Trabajador extends Persona{
    
    private double sueldo;
    private double antiguedad;
    private boolean baja;
    private int horasSemana;

  

    public Trabajador(double sueldo, double antiguedad, boolean baja, int horasSemana, String nombre, String apellidos, String dni, Calendar FechaNac) {
        super(nombre, apellidos, dni, FechaNac);
        this.sueldo = sueldo;
        this.antiguedad = antiguedad;
        this.baja = baja;
        this.horasSemana = horasSemana;
    }

    @Override
    public String toString() {
        return "Trabajador{" + "sueldo=" + sueldo + ", antiguedad=" + antiguedad + ", baja=" + baja + ", horasSemana=" + horasSemana + '}';
    }
    
    
    
    
    
}
