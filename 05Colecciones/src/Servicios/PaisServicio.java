/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

/*
Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
los servicios en la clase correspondiente)
Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
cómo se ordena un conjunto.
Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
al usuario.
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
//import java.util.TreeSet;


/**
 *
 * @author belugallardo
 */
public class PaisServicio {

    HashSet<String> setPais = new HashSet();
    Scanner leer = new Scanner(System.in);

    public void crearPais() {

        boolean seguir = false;

        do {
            System.out.println("Ingrese un pais");
            String pais = leer.nextLine();

            setPais.add(pais);

            System.out.println("¿Desea cargar otro país? S/N");
            String respuesta;

            do {
                respuesta = leer.nextLine();
                if (respuesta.equalsIgnoreCase("S") || respuesta.equalsIgnoreCase("N")) {
                    seguir = respuesta.equalsIgnoreCase("S");
                } else {
                    System.out.println("Respuesta inválida. Ingrese S o N.");
                }
            } while (!respuesta.equalsIgnoreCase("S") && !respuesta.equalsIgnoreCase("N"));

        } while (seguir);

        mostrarPaises();
    }

    private void mostrarPaises() {
        System.out.println("Listados de países");
        setPais.forEach((paises) -> {
            System.out.println(paises);
        });
        System.out.println("");
    }

    public void ordenarPaises() {
        System.out.println("Lista de países ordenados alfabeticamente");
        ArrayList<String> listaPaises = new ArrayList(setPais);
        Collections.sort(listaPaises);

        listaPaises.forEach((paises) -> {
            System.out.println(paises);
        });
        System.out.println("");
    }
    
    public void eliminarPais(){
        boolean flag = false;
        System.out.println("¿Qué país desea eliminar?");
        String eliminar = leer.nextLine();
        
        Iterator <String> it = setPais.iterator();
        while (it.hasNext()){
            if(it.next().equalsIgnoreCase(eliminar)){
                it.remove();
                flag = true;
            }
        }
        
        if(flag){
            System.out.println("El pais se ha eliminado de la lista");
        }else{
            System.out.println("El país no se encuentra en la lista");
        }
    }
}
