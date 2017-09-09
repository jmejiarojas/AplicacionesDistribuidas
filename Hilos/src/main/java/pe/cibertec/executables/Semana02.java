/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.cibertec.executables;

import pe.cibertec.hilos.Hilo2;

/**
 *
 * @author SUITE
 */
public class Semana02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  
   Hilo2 h1= new  Hilo2("Juana",5);
   h1.start();
 
    Hilo2 h2=new Hilo2("Pedro",5);
     h2.start();

    
    
    }
    
}
