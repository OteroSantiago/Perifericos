/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.negocio;

/**
 *
 * @author Alumno Mañana
 */
public interface ICatalogoProductos { //futuros métodos de el menu que estara en el main del proyecto
    public void inicializarCatalogo(String nombreCatalogo);//opcion 1 en el futuro menú
    public void agregarProducto();//opcion 2//escribir
    public void listarProducto();//opcion 3 //leer
    public void buscarProducto();//opcion 4 //leer
    public void calcularTotalPrecio();//opcion 5 //leer y contar
    public void borrar(); //opcion 6 //leer yescribir
    public void mayorNumerodeProductos();//opcion 7 , aqui tengo que separarme los productos por tipos y contar cuantos hay de cada uno y que me diga cual es del que mas hay //leer
    
}
