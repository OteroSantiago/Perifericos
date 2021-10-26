/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.productos;

/**
 *
 * @author Alumno Mañana
 */
public class Productos {
    //atributos
    private String tipo;
    private String nombre;
    private int cantidad;
    private double precioUnitario;
    //constructores
    //vacio
    public Productos() {
        
    }

    public Productos(String nombre) {
        this.nombre = nombre;
    }
    
    //con parametros
     public Productos(String tipo, String nombre,int cantidad, double precioUnitario) {
        this(); 
        this.tipo = tipo;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precioUnitario = precioUnitario;
    }
    //getters and setter
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public double getPrecioUnitario() {
        return precioUnitario;
    }
    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }
    //toString
    @Override
    public String toString() {
        return "Productos{" + "tipo=" + tipo + ", nombre=" + nombre + ", cantidad=" + cantidad + ", precioUnitario=" + precioUnitario + '}';
    }
    

   
   
    
    
}
