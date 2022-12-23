/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_14.Servicios;

import ejercicio_14.Entidades.Movil;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author droa
 */
public class serviciosMovil {
   Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Scanner leerCodigos = new Scanner(System.in);
    
    public int[] ingresarCodigo(){
        int[] codigoAux= new int[7];
        for(int i=0;i<7;i++){
            System.out.print("Ingrese el digito #"+(i+1));
            Arrays.fill(codigoAux,i,i+1,leerCodigos.nextInt());
            //codigoAux[i]=leerCodigos.nextInt();
        }
        return codigoAux;
    }
    
    public Movil cargarCelular(){
        System.out.print("Ingrese la Marca del Teléfono: ");
        String marca=leer.next();
        System.out.print("Ingrese el Modelo del Telefono: ");
        String modelo=leer.next();
        System.out.print("Ingrese el Precio del Teléfono: ");
        float precio = leer.nextFloat();
        System.out.print("Ingrese el Tamaño Memoria RAM (GB): ");
        long memoriaRam= leer.nextLong();
        System.out.print("Ingrese el Tamaño de Alamacenamiento (GB): ");
        long almacenamiento=leer.nextLong();
        return new Movil(marca,precio,modelo,memoriaRam,almacenamiento,ingresarCodigo());
        
    } 
}
