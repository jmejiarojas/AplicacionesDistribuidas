package pe.cibertec.beans;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Trabajador {
    
    private String dni;
    private String nombre;
    private double sueldo;

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    } 

    @Override
    public String toString() {
        return "Trabajador{" + "dni=" + dni + ", nombre=" + nombre + ", sueldo=" + sueldo + '}';
    }

    
}
