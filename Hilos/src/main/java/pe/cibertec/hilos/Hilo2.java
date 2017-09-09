/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.cibertec.hilos;


import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author SUITE
 */
public class Hilo2 extends Thread{
    
    String nombre;
    int cantidad;

    public Hilo2(String nombre, int cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;

    
    }
    public void run(){
        System.out.println("Inicia"+nombre+"a las"+new Date());
        for(int i=1;i<=cantidad;i++){
            System.out.println("Procesando"+i);
           try {
            Thread.sleep(10000);
                 
            } catch (InterruptedException e) {
               Logger.getLogger(Hilo2.class.getName()).log(Level.SEVERE,null,e);
            }
            
        }
        System.out.println("Termina" +nombre+"a las"+ new Date());
    }
    
    
}
