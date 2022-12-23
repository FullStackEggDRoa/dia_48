/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio_14.Entidades;

import java.util.Arrays;
/**
 *
 * @author droa
 */
public class Movil {
    // Atributos
    
    private String marca;
    private float precio;
    private String modelo;
    private long memoriaRam;
    private long almacenamiento;
    private int[] codigo;  
    
    //Contrusctores
    
    public Movil() {
    }

    public Movil(String marca, float precio, String modelo, long memoriaRam, long almacenamiento, int[] codigo) {
        this.marca = marca;
        this.precio = precio;
        this.modelo = modelo;
        this.memoriaRam = memoriaRam;
        this.almacenamiento = almacenamiento;
        this.codigo = codigo;
    }
    
    //Métodos

    public String getMarca() {
        return marca;
    }

    public float getPrecio() {
        return precio;
    }

    public String getModelo() {
        return modelo;
    }

    public long getMemoriaRam() {
        return memoriaRam;
    }

    public long getAlmacenamiento() {
        return almacenamiento;
    }

    public int[] getCodigo() {
        return codigo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMemoriaRam(long memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public void setAlmacenamiento(long almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public void setCodigo(int[] codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Movil{" + "marca=" + marca + ", precio=" + precio + ", modelo=" + modelo + ", memoriaRam=" + memoriaRam + ", almacenamiento=" + almacenamiento + ", codigo=" + Arrays.toString(codigo) + '}';
    }
    
    
}
