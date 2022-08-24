/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author BorkowsA
 */
public class Frutas {
    String nombre;
    String pais_de_origen;
    Float precio;

    public Frutas(String nombre, String pais_de_origen, Float precio) {
        this.nombre = nombre;
        this.pais_de_origen = pais_de_origen;
        this.precio = precio;
    
}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais_de_origen() {
        return pais_de_origen;
    }

    public void setPais_de_origen(String pais_de_origen) {
        this.pais_de_origen = pais_de_origen;
    }

    public Float getPrecio() {
        return precio;
    }

    public void setPrecio(Float precio) {
        this.precio = precio;
    }
}
