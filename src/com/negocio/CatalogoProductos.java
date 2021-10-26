/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.negocio;
import com.excepciones.*;
import com.productos.*;
import com.datos.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Alumno Mañana
 */
public class CatalogoProductos implements ICatalogoProductos{
    
    private final IAccesoDatos datos;
    
    public CatalogoProductos(){
        this.datos = new AccesoDatos();
    }

    @Override
    public void inicializarCatalogo(String nombreCatalogo) {
      try {
        if (this.datos.existe(nombreCatalogo)){
            this.datos.borrar(nombreCatalogo);
            this.datos.crear(nombreCatalogo);
        } else{
            this.datos.crear(nombreCatalogo);
        }
        } catch (Excepciones ex){
            ex.printStackTrace(System.out);
            System.out.println("Error al inicializar el catálogo de películas");
        }

    }

    @Override
    public void agregarProducto(String tipo, String nombre, Integer cantidad, double precioUnitario, String nombreCatalogo) {
            try {
            if (this.datos.existe(nombreCatalogo)) {
                this.datos.escribir(new Productos(nombre,tipo,cantidad,precioUnitario), nombreCatalogo, true);
            } else {
                System.out.println("Catálogo no inicilizado");
            }
        } catch (Excepciones ex) {
            System.out.println("Error al escribir en el catálogo");
            ex.printStackTrace(System.out);
        }
    }

    @Override
    public void listarProducto(String nombreCatalogo) {
        List<Productos> peliculas = new ArrayList<>();

        try {
            peliculas = this.datos.listar(nombreCatalogo);
            peliculas.forEach(producto -> {
                System.out.println(producto.getTipo()+";"+producto.getNombre()+";"+producto.getCantidad()+""+producto.getPrecioUnitario());
            });
        } catch (Excepciones ex) {
            System.out.println("Error leyendo el catálogo");
            ex.printStackTrace(System.out);
        }
    }

    @Override
    public void buscarProducto(String nombreCatalogo, String buscar) {
        try {
            System.out.println(this.datos.buscar(nombreCatalogo, buscar));
        } catch (Excepciones ex) {
           ex.printStackTrace(System.out);
        }
    }

    @Override
    public void calcularTotalPrecio() {
        
    }

    @Override
    public void borrarProducto() {
        
    }

    @Override
    public void mayorNumerodeProductos() {
        
    }

    @Override
    public void borrar() {

    }
    
}
