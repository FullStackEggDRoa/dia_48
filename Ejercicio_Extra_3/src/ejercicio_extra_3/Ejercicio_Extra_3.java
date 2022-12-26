/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_extra_3;

import ejercicio_extra_3.Entiedades.Raices;
import java.util.Scanner;

/**
 *
 * @author droa
 */
public class Ejercicio_Extra_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Resolución Ecuación de 2do Grado [ax^2+bx+c]");
        
        String a_aux="";
        String b_aux="";
        String c_aux="";
        String[] coeficientesAux;
        boolean flag_c=false;
        
        do {
            
            System.out.print("Ingrese los coeficientes [a,b,c]: ");            
            String coeficientes=leer.next();
            coeficientesAux=coeficientes.split(",", 5);
            if(coeficientesAux.length>=3){
                a_aux=coeficientesAux[0];
                b_aux=coeficientesAux[1];
                c_aux=coeficientesAux[2];
            }
            
        } while (a_aux.equals("") || b_aux.equals("") || c_aux.equals(""));
        
        Raices r1= new Raices((float)Integer.parseInt(a_aux),(float)Integer.parseInt(b_aux),(float)Integer.parseInt(c_aux));
        System.out.println(r1.toString());
        System.out.println("Calculando Raíces.....");
        r1.calcular();
        
    }
    
}
