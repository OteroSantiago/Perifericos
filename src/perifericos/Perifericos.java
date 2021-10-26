/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package perifericos;

import java.util.Scanner;
import com.negocio.*;
/**
 *
 * @author Alumno Mañana
 */
public class Perifericos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         var opcion = -1;
        var nombrePeli = "";
        var lectura = new Scanner(System.in);
        var nombreCatalogo = "Periféricos";
        ICatalogoProductos catalogo = new CatalogoProductos();
        
        while (opcion != 0) {
            System.out.println("Elige una de las opciones: \n"
                    + "1.- Iniciar catálogo de películas. \n"
                    + "2.- Agregar película. \n"
                    + "3.- Listar películas. \n"
                    + "4.- Buscar película. \n"
                    + "0.- Salir \n");
            // Leemos la opción del la consola
            opcion = Integer.parseInt(lectura.nextLine());
            
            switch (opcion){
                case 1: 
                    catalogo.inicializarCatalogo(nombreCatalogo);
                    System.out.println("Catálogo iniciado...");
                    break;
                case 2:
                    System.out.println("Introduce el nombre de la película a agregar: ");
                    nombrePeli = lectura.nextLine();
                    catalogo.agregarProducto(nombrePeli, nombreCatalogo);
                    System.out.println("Se ha agregado la " + nombrePeli + " al catálogo "
                            + nombreCatalogo);
                    break;
                case 3: 
                    catalogo.listarPelicula(nombreCatalogo);
                    break;
                case 4: 
                    System.out.println("Introduce el nombre de la película que quieres buscar: ");
                    nombrePeli = lectura.nextLine();
                    catalogo.buscarPelicula(nombreCatalogo, nombrePeli);
                    break;
                case 0:
                    System.out.println("Adios y hasta pronto!!! :(");
                    break;
                default: 
                    System.out.println("Opción desconocida.");
                    
            }
    }
    
}
