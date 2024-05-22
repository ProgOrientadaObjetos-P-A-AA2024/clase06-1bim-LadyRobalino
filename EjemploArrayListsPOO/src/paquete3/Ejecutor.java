/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author utpl
 */
public class Ejecutor {

    public static void main(String[] args) {
        Scanner lady = new Scanner(System.in);
        String marca, marcaMemoria, marcaProcesador;
        Procesador procesador;
        Memoria memoria;
        double costo, costoMemoria, costoProcesador;
        int numCompu;
        ArrayList<Computador> computadoras = new ArrayList<>();

        System.out.println("Ingrese el numero de computadoras: ");
        numCompu = lady.nextInt();

        for (int i = 0; i < numCompu; i++) {
            lady.nextLine();

            System.out.println("Ingrese las caracteristicas del computador "
                    + (i + 1) + " :");

            System.out.print("-Ingrese la marca del computador: ");
            marca = lady.nextLine();

            System.out.print("-Ingrese la marca de la memoria: ");
            marcaMemoria = lady.nextLine();
            System.out.print("-Ingrese el costo de la memoria: ");
            costoMemoria = lady.nextDouble();
            lady.nextLine();

            System.out.print("-Ingrese la marca del procesador: ");
            marcaProcesador = lady.nextLine();
            System.out.print("-Ingrese el costo del procesador: ");
            costoProcesador = lady.nextDouble();

            Memoria memoria1 = new Memoria(marcaMemoria, costoMemoria);

            Procesador procesador1 = new Procesador(marcaProcesador, costoProcesador);

            Computador computador1 = new Computador(marca, memoria1, procesador1);

            computador1.establecerCostoComputador();

            computadoras.add(computador1);
        }

        Venta venta1 = new Venta();
        venta1.establecerComputadoras(computadoras);
        venta1.establecerValorVenta();

        System.out.printf("%s\n", venta1);

    }

}
