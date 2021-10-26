/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.datos;

import com.excepciones.ExEscritura;
import com.excepciones.ExLectura;
import com.excepciones.Excepciones;
import com.productos.Productos;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alumno Mañana
 */
public class AccesoDatos implements IAccesoDatos {

    @Override
    public void crear(String nombreArchivo) throws Excepciones {
        var archivo = new File(nombreArchivo);
        try {
            var salida = new PrintWriter(new FileWriter(archivo));
            salida.close();
        } catch (Exception e) {
            e.printStackTrace();
            throw new Excepciones("Error al crear el archivo");
        }
    }

    @Override
    public boolean existe(String nombreArchivo) {
        File archivo = new File(nombreArchivo);
        return archivo.exists();
    }

    @Override
    public List<Productos> listar(String nombreArchivo) throws ExLectura {
        var archivo = new File(nombreArchivo);
        List<Productos> productos = new ArrayList<>();
        
        try {
            var entrada = new BufferedReader(new FileReader(archivo));
            var lectura = entrada.readLine();
            while(lectura != null){
                productos.add(new Productos(lectura));
                lectura = entrada.readLine();
                
            }
            entrada.close();
        }catch (FileNotFoundException e) {//tenemos que hacer un while para que el descriptor vaya leyendo mientras hay contenido y lineas
             e.printStackTrace(System.out);
             throw new ExLectura("Error de lectura listando productos");
        }catch(IOException e){
             e.printStackTrace(System.out);
             throw new ExLectura("Error de lectura listando productos");
        }
        return productos;
        
    }

    @Override
    public void escribir(Productos productos, String nombreArchivo, boolean anexar) throws ExEscritura {
        File archivo = new File(nombreArchivo);
        
        try {
            PrintWriter salida = new PrintWriter(new FileWriter(archivo, anexar));
            salida.println(productos.getTipo()+";"+productos.getNombre()+";"+productos.getCantidad()+""+productos.getPrecioUnitario());
            salida.close();
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
            throw new ExEscritura("Excepción al escribir en el archivo");
        }
    }

    @Override
    public String buscar(String nombreArchivo, String buscar) throws Excepciones {
          var archivo = new File(nombreArchivo);
        int cont = 1;
        String mensaje = "";
        try {
            // entrada es el descriptor de lectura
            var entrada = new BufferedReader(new FileReader(archivo));
            // nos devuelve una línea de nuestro archivo
            var lectura = entrada.readLine();
            while(lectura != null){ // 
                if (lectura.equalsIgnoreCase(buscar)){
                    mensaje = "El producto " + buscar + " se encuentra en la "
                            + "línea " + cont + " del catálogo de periféricos";
                    break;
                }
                lectura = entrada.readLine();
                cont++;
            }
            if (lectura == null) 
                mensaje = "El producto " + buscar + " no está "
                    + "en el catálogo de periféricos.";
            
            entrada.close();
        
        } catch (FileNotFoundException e) {
            e.printStackTrace(System.out);
            throw new ExLectura("Error de lectura listando las productos");
        } catch (IOException e){
            e.printStackTrace(System.out);
            throw new ExLectura("Error de lectura listando las productos");
        }
        return mensaje;
    }

   
    
    @Override
    public void borrar(String nombreArchivo)  {
       File archivo = new File(nombreArchivo);
        if (archivo.exists()){
            archivo.delete();
        }
        System.out.println("Se ha borrado el archivo"); 
    }
    
}
