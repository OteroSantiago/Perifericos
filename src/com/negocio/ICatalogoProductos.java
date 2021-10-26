/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.negocio;
import com.datos.*;
import com.productos.*;
import com.excepciones.*;
/**
 *
 * @author Alumno Mañana
 */
public interface ICatalogoProductos { //futuros métodos de el menu que estara en el main del proyecto
    public void inicializarCatalogo(String nombreCatalogo);//opcion 1 en el futuro menú
    public void agregarProducto(String tipo, String nombre, Integer cantidad, double precioUnitario, String nombreCatalogo);//opcion 2//escribir
    public void listarProducto(String nombreCatalogo);//opcion 3 //leer
    public void buscarProducto(String nombreCatalogo, String buscar);//opcion 4 //leer
    public void calcularTotalPrecio();//opcion 5 //leer y contar
    public void borrarProducto(); //opcion 6 //leer yescribir
    public void mayorNumerodeProductos();//opcion 7 , aqui tengo que separarme los productos por tipos y contar cuantos hay de cada uno y que me diga cual es del que mas hay //leer
    public void borrar();//opcion 8
}
