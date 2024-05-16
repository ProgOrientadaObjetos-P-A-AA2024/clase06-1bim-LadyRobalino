/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete3;

/**
 *
 * @author reroes
 */
public class Computador {
   private String marca;
   private Procesador procesador;
   private Memoria memoria;
   private double costoComputador;
   
    
    public Computador(String n, Procesador p, Memoria m){
        marca = n;
        procesador = p;
        memoria = m;
    }
    
    public void establecerMarca(String n){
        marca = n;
    }
    public void establecerProcesador(Procesador n){
        procesador = n;
    }
    public void establecerMemoria(Memoria n){
        memoria = n;
    }
    public void establecerCostoComputador(){
        costoComputador = (procesador.obtenerCosto() + memoria.obtenerCosto());
    }
    
     public String obtenerMarca (){
        return marca;
    }
     
     public Procesador obtenerProcesador (){
        return procesador;
    }
     
      public Memoria obtenerMemoria (){
        return memoria;
    }
      
     public double obtenerCostoComputador (){
        return costoComputador;
    }
    
     @Override
    public String toString() {
        String cadena = String.format("%s - %s - %.2f - %s - %.2f - %.2f\n",
                                     obtenerMarca(),
                                     obtenerProcesador().obtenerMarca(),
                                     obtenerProcesador().obtenerCosto(),
                                     obtenerMemoria().obtenerMarca(),
                                     obtenerMemoria().obtenerCosto(),
                                     obtenerCostoComputador());
        return cadena;

    }

}
