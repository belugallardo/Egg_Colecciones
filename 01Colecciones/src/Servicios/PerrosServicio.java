/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
/*
Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.

Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.
*/
/**
 *
 * @author belugallardo
 */
public class PerrosServicio {
    ArrayList <String> razas = new ArrayList();
    Scanner leer = new Scanner(System.in);
    
    public void cargarRaza(){
       boolean seguir = false;
        do {
        System.out.println("Ingrese la raza");
        String raza = leer.nextLine();
        razas.add(raza);
        
            System.out.println("¿Desea guardar otro perro? S/N");
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
    }
    
    public void mostrarRazas(){
        
        razas.forEach((raza) -> {
            System.out.println(raza);
        });
    }
    
    public void eliminarPerro(){
        System.out.println("Que perro desea eliminar");
        String eliminar = leer.nextLine();
        boolean flag = false;
        
        Iterator <String> it = razas.iterator();
        while (it.hasNext()){
            if(it.next().equalsIgnoreCase(eliminar)){
                it.remove();
                flag = true;
                
            }
        }
        Collections.sort(razas);
        if(flag){
            razas.forEach(raza -> {
            System.out.println(raza);    
            });
       }else{
            System.out.println("No se encuentra esa raza para eliminar");
            razas.forEach(raza -> {
            System.out.println(raza);    
            });
        }
    }
    
}
