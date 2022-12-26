/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_extra_4.Entidades;

/**
 *
 * @author droa
 */
public class NIF {
   // Atributos
    private long DNI;
    private char letra;
    
    //private static final char[] chars_NFI = {'T','R','W','A','G','M','Y','F','P','D','X','B','N','J','Z','S','Q','V','H','L','C','K','E'};
    private static final CharSequence chars_NFI = "TRWAGMYFPDXBNJZSQVHLCKE";
   // Constructores

    public NIF() {
    }
        
    public NIF(long DNI, char letra) {
        this.DNI = DNI;
        this.letra = letra;
    }
    
    // Métodos

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }
    
    
    
}
