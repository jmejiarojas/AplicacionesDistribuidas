/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.cibertec.executables;

import pe.cibertec.hilos.Hilo1;

/**
 *
 * @author SUITE
 */
public class Semana01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  
   Hilo1 h1= new  Hilo1();
   h1.Genera("Juana", 5);
 
    Hilo1 h2=new Hilo1();
    h2.Genera("Pedro", 5);

    
    
    }
    
}
