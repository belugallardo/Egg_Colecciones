/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

//import Entidad.Producto;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author belugallardo
 */
public class ProductoServicio {

    HashMap<String, Double> lista = new HashMap();
    Scanner leer = new Scanner(System.in);

    public void crearProducto() {

        System.out.println("Ingrese el producto");
        String producto = leer.nextLine();

        System.out.println("Ingrese el precio del producto");
        Double precio = leer.nextDouble();
        leer.nextLine();

        lista.put(producto, precio);
    }

    public void modificarPrecio() {
        System.out.println("Ingrese el producto al que quiera modificar el precio");
        String prod = leer.nextLine();

        if (lista.containsKey(prod)) {
            System.out.println("Ingrese el nuevo precio");
            Double precio = leer.nextDouble();
            leer.nextLine();
            lista.put(prod, precio);
            System.out.println("Se ha modificado exitosamente");
        } else {
            System.out.println("Ese producto no existe");
        }

    }

    public void mostrarListaProductos() {
        System.out.println("Lista de productos");
        for (Map.Entry<String, Double> entry : lista.entrySet()) {
            System.out.println("Producto: " + entry.getKey() + " $" + entry.getValue());

        }
        System.out.println("");
    }

    public void eliminarProducto() {
        System.out.println("Que producto desea eliminar");
        String eliminar = leer.nextLine();

        Double removedValue = lista.remove(eliminar);
        if (removedValue != null) {
            System.out.println("El producto se eliminó correctamente");
        } else {
            System.out.println("El producto no se encuentra");
        }

    }

}
