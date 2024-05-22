/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete3;

import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class Venta {
    private double valorVenta;
    private ArrayList<Computador> computadoras; 
    
   public Venta() {
        computadoras = new ArrayList<Computador>();
    }
    
    public void establecerValorVenta(){
        for (int i = 0; i < computadoras.size(); i++) {
            valorVenta += computadoras.get(i).obtenerCostoComputador();
        }
    }
    
    public void establecerComputadoras(ArrayList<Computador> n){
        computadoras = n;
    }
    
    public double obtenerValorVenta (){
        return valorVenta;
    }
    
    public ArrayList<Computador> obtenerComputadoras (){
        return computadoras;
    }
    
     @Override
    public String toString() {
        String cadena = "\nCARACTERISTICAS DE VENTAS\n";
        cadena = String.format("%sComputadoras:\n", cadena);

        for (Computador l : computadoras) {
            cadena = String.format("%s\n"
                    + "\tMarca: %s"
                    + "\n\tMarca del Procesador: %s"
                    + "\n\tCosto del Procesador: $ %.2f"
                    + "\n\tMarca de la Memoria: %s"
                    + "\n\tCosto de la Memoria: $ %.2f"
                    + "\n\tCosto Total: $ %.2f\n\n", 
                    cadena, 
                    l.obtenerMarca(), 
                    l.obtenerProcesador().obtenerMarca(),
                    l.obtenerProcesador().obtenerCosto(),
                    l.obtenerMemoria().obtenerMarca(),
                    l.obtenerMemoria().obtenerCosto(),
                    l.obtenerCostoComputador());
        }

        cadena = String.format("%s===============================================\n"
                + "Valor Total de la Venta: %.2f\n", 
                cadena, 
                obtenerValorVenta());
        return cadena;
    }
}
