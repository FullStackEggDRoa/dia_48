/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_14;

import ejercicio_14.Entidades.Movil;
import ejercicio_14.Servicios.serviciosMovil;

/**
 *
 * @author droa
 */
public class Ejercicio_14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Datos del Teléfono (Equipo Celular)... ");
        serviciosMovil sM = new serviciosMovil();
        Movil m1=sM.cargarCelular();
        System.out.println(m1.toString());
    }
    
}
