/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_extra_4;

import ejercicio_extra_4.Entidades.NIF;
import ejercicio_extra_4.Servicios.serviciosNIF;

/**
 *
 * @author droa
 */
public class Ejercicio_Extra_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Creación Dígito Verificador");
        serviciosNIF sN = new serviciosNIF();
        NIF n1 = sN.crearNif();
        n1.mostrar();
    }   
    
}
