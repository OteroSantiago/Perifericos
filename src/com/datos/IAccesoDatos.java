/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.datos;
import com.excepciones.*;
import com.productos.Productos;
import java.util.List;

/**
 *
 * @author Alumno Mañana
 */
public interface IAccesoDatos {
    void crear (String nombreProducto) throws Excepciones;
   
   boolean existe(String nombreProducto);
   
   List<Productos> listar (String nombreProducto) throws ExLectura;
   
   void escribir (Productos productos, String nombreProducto, boolean anexar)throws ExEscritura;
   
   String buscar(String nombreArchivo, String buscar) throws Excepciones;
   
   void borrar(String nombreProducto);
}
