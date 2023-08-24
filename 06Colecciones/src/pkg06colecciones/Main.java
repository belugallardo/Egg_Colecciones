/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg06colecciones;

import Servicio.ProductoServicio;
import java.util.Scanner;

/**
 *
 * @author belugallardo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ProductoServicio ps = new ProductoServicio();
        Scanner leer = new Scanner(System.in);
        int opcion;
      
        do {
            menu();
            opcion = leer.nextInt();
            leer.nextLine();

            switch (opcion) {
                case 1:
                    ps.crearProducto();
                    break;
                case 2:
                    ps.modificarPrecio();
                    break;
                case 3:
                    ps.mostrarListaProductos();
                    break;
                case 4:
                    ps.eliminarProducto();
                    break;
                case 5:
                    System.out.println("Salida exitosa");
                    break;
                default:
                    System.out.println("La opcion no es correcta, intente nuevamente");
                    break;
            }

        } while (opcion != 5);
    
    }

    private static void menu() {
        System.out.println("Eliga una opcion: \n"
                + "1 - Cargar un producto \n"
                + "2 - Modificar precio \n"
                + "3 - Mostrar lista producto \n"
                + "4 - Eliminar un producto \n"
                + "5 - Salir \n ");

    }
}
